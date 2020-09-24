package com.foo.covidstats.controllers;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.foo.covidstats.services.DailyStats;
import com.foo.covidstats.services.DataService;
import com.foo.covidstats.services.State;

public class DataController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		DataService dataService = new DataService();
		
		dataService.fetchData();
		List<DailyStats> dailyStatsList = dataService.getDailyStats();
		List<State> stateWiseStats = dataService.getStateWiseList();
		DailyStats dailyStats = dailyStatsList.get(dailyStatsList.size() - 1);

		request.setAttribute("dailyStats", dailyStats);
		request.setAttribute("stateWiseStats", stateWiseStats);
		request.getRequestDispatcher("index.jsp").forward(request, response);
		return;
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
