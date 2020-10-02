package com.foo.covidstats.services;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonNode;
import com.foo.covidstats.util.JsonUtil;

public class DataService {
	private final String apiUrl = "https://api.covid19india.org/data.json";
	private List<State> stateWiseStats = new ArrayList<>();
	private List<DailyStats> dailyStats = new ArrayList<>();

	public List<State> getStateWiseList() {
		return this.stateWiseStats;
	}
	
	public List<DailyStats> getDailyStats() {
		return this.dailyStats;
	}

	public void fetchData() throws IOException {
		String payload = JsonUtil.getDataFromApi(this.apiUrl);
		JsonNode data = JsonUtil.MAPPER.readTree(payload);

		JsonNode statewiseData = data.get("statewise");
		JsonNode dailyData = data.get("cases_time_series");
		
		
		this.stateWiseStats = JsonUtil.MAPPER.
				convertValue(statewiseData, new TypeReference<List<State>>(){});

		this.dailyStats = JsonUtil.MAPPER.
				convertValue(dailyData, new TypeReference<List<DailyStats>>() {});
	}
}