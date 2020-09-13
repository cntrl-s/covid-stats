package com.foo.covidstats.services;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DailyStats {

	@JsonProperty("dailyconfirmed")
	private int dailyConfirmed;
	@JsonProperty("dailydeceased")
	private int dailyDeceased;
	@JsonProperty("dailyrecovered")
	private int dailyRecovered;
	private String date;
	@JsonProperty("totalconfirmed")
	private int totalConfirmed;
	@JsonProperty("totaldeceased")
	private int totalDeceased;
	@JsonProperty("totalrecovered")
	private int totalRecovered;

	public int getDailyConfirmed() {
		return dailyConfirmed;
	}
	public int getDailyDeceased() {
		return dailyDeceased;
	}
	public int getDailyRecovered() {
		return dailyRecovered;
	}
	public String getDate() {
		return date;
	}
	public int getTotalConfirmed() {
		return totalConfirmed;
	}
	public int getTotalDeceased() {
		return totalDeceased;
	}
	public int getTotalRecovered() {
		return totalRecovered;
	}
	public void setDailyConfirmed(int dailyConfirmed) {
		this.dailyConfirmed = dailyConfirmed;
	}
	public void setDailyDeceased(int dailyDeceased) {
		this.dailyDeceased = dailyDeceased;
	}
	public void setDailyRecovered(int dailyRecovered) {
		this.dailyRecovered = dailyRecovered;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public void setTotalConfirmed(int totalConfirmed) {
		this.totalConfirmed = totalConfirmed;
	}
	public void setTotalDeceased(int totalDeceased) {
		this.totalDeceased = totalDeceased;
	}
	public void setTotalRecovered(int totalRecovered) {
		this.totalRecovered = totalRecovered;
	}

	public String toString() {
		return String.format(
				"[dailyConfirmed=%s, dailyDeceased=%s, dailyRecovered=%s, date=%s, totalConfirmed=%s, totalDeceased=%s, totalRecovered=%s]",
				dailyConfirmed, dailyDeceased, dailyRecovered, date, totalConfirmed, totalDeceased, totalRecovered);
	}
}
