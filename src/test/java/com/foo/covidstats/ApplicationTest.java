package com.foo.covidstats;

import java.io.IOException;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.foo.covidstats.services.DailyStats;
import com.foo.covidstats.services.StateWiseDataService;
import com.foo.covidstats.services.States;

public class ApplicationTest {

	private StateWiseDataService app;

	public static void printStatewiseData(List<States> allStates) {
		for (States states : allStates) {
			System.out.println(states + "\n");
		}
	}
	
	@Before
	public void init() {
		app = new StateWiseDataService();
	}
	
	@Test
	public void fetchDataTest() {
		try {
			app.fetchData();
		} catch (IOException e) {
			e.printStackTrace();
		}

		List<States> allStates = app.getStateWiseList();
		System.out.println(allStates.get(0));//latest allStates
		
		List<DailyStats> dailyStats = app.getDailyStats();
		System.out.println(dailyStats.get(dailyStats.size() - 1)); // latest daily
	}

}
