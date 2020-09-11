package com.foo.covidstats.services;

import com.fasterxml.jackson.annotation.JsonProperty;

public class States {
	private int active;
	private int confirmed;
	private int deaths;
	@JsonProperty("deltaconfirmed")
	private int deltaConfirmed;
	@JsonProperty("deltadeaths")
	private int deltaDeaths;
	@JsonProperty("deltarecovered")
	private int deltaRecovered;
	@JsonProperty("lastupdatedtime")
	private String lastUpdatedTime;
	@JsonProperty("migratedother")
	private int migratedOther;
	private int recovered;
	private String state;
	@JsonProperty("statecode")
	private String stateCode;
	@JsonProperty("statenotes")
	private String stateNotes;

	public int getActive() {
		return active;
	}
	public void setActive(int active) {
		this.active = active;
	}
	public int getConfirmed() {
		return confirmed;
	}
	public void setConfirmed(int confirmed) {
		this.confirmed = confirmed;
	}
	public int getDeaths() {
		return deaths;
	}
	public void setDeaths(int deaths) {
		this.deaths = deaths;
	}
	public int getDeltaConfirmed() {
		return deltaConfirmed;
	}
	public void setDeltaConfirmed(int deltaConfirmed) {
		this.deltaConfirmed = deltaConfirmed;
	}
	public int getDeltaDeaths() {
		return deltaDeaths;
	}
	public void setDeltaDeaths(int deltaDeaths) {
		this.deltaDeaths = deltaDeaths;
	}
	public int getDeltaRecovered() {
		return deltaRecovered;
	}
	public void setDeltaRecovered(int deltaRecovered) {
		this.deltaRecovered = deltaRecovered;
	}
	public String getLastUpdateTime() {
		return lastUpdatedTime;
	}
	public void setLastUpdateTime(String lastUpdatedTime) {
		this.lastUpdatedTime = lastUpdatedTime;
	}
	public int getMigratedOther() {
		return migratedOther;
	}
	public void setMigratedOther(int migratedOther) {
		this.migratedOther = migratedOther;
	}
	public int getRecovered() {
		return recovered;
	}
	public void setRecovered(int recovered) {
		this.recovered = recovered;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getStateCode() {
		return stateCode;
	}
	public void setStateCode(String stateCode) {
		this.stateCode = stateCode;
	}
	public String getStateNotes() {
		return stateNotes;
	}
	public void setStateNotes(String stateNotes) {
		this.stateNotes = stateNotes;
	}

	public String toString() {
		return String.format(
				"[active=%s, confirmed=%s, deaths=%s, deltaConfirmed=%s, deltaDeaths=%s, deltaRecovered=%s, lastUpdateTime=%s, migratedOther=%s, recovered=%s, state=%s, stateCode=%s]",
				active, confirmed, deaths, deltaConfirmed, deltaDeaths, deltaRecovered, lastUpdatedTime, migratedOther, recovered, state, stateCode);
	}
}
