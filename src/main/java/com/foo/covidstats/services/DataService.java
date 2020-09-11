package com.foo.covidstats.services;

import java.io.IOException;
import java.util.ArrayList;

import com.fasterxml.jackson.databind.JsonNode;
import com.foo.covidstats.util.JsonUtil;

public class DataService {
	private String apiUrl = "https://api.covid19india.org/data.json";
	private ArrayList<States> stateWiseStats = new ArrayList<>();
	private ArrayList<DailyStats> dailyStats = new ArrayList<>();

	public ArrayList<States> getStateWiseList() {
		return this.stateWiseStats;
	}
	
	public ArrayList<DailyStats> getDailyStats() {
		return this.dailyStats;
	}

	public void fetchData() throws IOException {
		String payload = JsonUtil.getDataFromApi(apiUrl);
		JsonNode data = JsonUtil.MAPPER.readTree(payload);

		JsonNode statewiseData = data.get("statewise");
		JsonNode dailyData = data.get("cases_time_series");
		
		for (JsonNode jsonNode : statewiseData) {
//			States state = new States();
//			state.setActive(jsonNode.get("active").asInt());
			States state = JsonUtil.MAPPER.readValue(jsonNode.traverse(), States.class);
			this.stateWiseStats.add(state);
			
		}

		for (JsonNode jsonNode : dailyData) {
			DailyStats daily = JsonUtil.MAPPER.readValue(jsonNode.traverse(), DailyStats.class);
			this.dailyStats.add(daily);
		}
	}
}