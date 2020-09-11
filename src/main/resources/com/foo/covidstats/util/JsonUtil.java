package com.foo.covidstats.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonUtil {
	public static final ObjectMapper MAPPER = new ObjectMapper();

	public static String getDataFromApi(String apiUrl) throws IOException {
		URL url = new URL(apiUrl);
		HttpURLConnection connection = (HttpURLConnection) url.openConnection();
		connection.setRequestMethod("GET");
		BufferedReader readData = new BufferedReader(
				new InputStreamReader(connection.getInputStream()));

		StringBuffer response = new StringBuffer();
		String responseLine;

		while ((responseLine = readData.readLine()) != null) {
			response.append(responseLine);
		}
		readData.close();
		return response.toString();
	}
}
