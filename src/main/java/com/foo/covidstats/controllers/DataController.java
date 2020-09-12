package com.foo.covidstats.controllers;

import java.io.IOException;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.foo.covidstats.services.DataService;

public class DataController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		DataService dataService = new DataService();
		final ScheduledExecutorService updateShcedule =
				Executors.newScheduledThreadPool(1);
		
		final Runnable updateTask = () -> {
			try {
				dataService.fetchData();
			} catch (IOException e) {
				e.printStackTrace();
			}
		};
		
		final ScheduledFuture<?> updateHandle =
				updateShcedule.scheduleWithFixedDelay(updateTask, 0, 5, TimeUnit.SECONDS);
		
		updateShcedule.schedule((Runnable) updateHandle, 0, TimeUnit.SECONDS);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
