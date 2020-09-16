<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<html>

<head>
<title>Coronavirus Tracker</title>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<link rel="stylesheet" href="side.css">
</head>

<div class="w3-container">
	<h1>Covid-19 India Statistics</h1>
</div>

<jsp:useBean id="dailyStats"
	class="com.foo.covidstats.services.DailyStats" scope="request">
</jsp:useBean>

<p>${dailyStats.date}</p>

<div id="row1" style="margin-top: 15px">
	<div id="column1">Total Cases</div>
	<span style="color: #aaa">${dailyStats.totalConfirmed}</span>
	<div id="column2">Daily Reported</div>
	<span>${dailyStats.dailyConfirmed}</span>
</div>

<div id="row1" style="margin-top: 15px">
	<div id="column1">Total Deaths</div>
	<span style="color: #aaa">${dailyStats.totalDeceased}</span>
	<div id="column2">Daily Deaths</div>
	<span>${dailyStats.dailyDeceased}</span>
</div>

<div id="row1" style="margin-top: 15px">
	<div id="column1">Total Recovered</div>
	<span style="color: #aaa">${dailyStats.totalRecovered}</span>
	<div id="column2">Daily Recovered</div>
	<span>${dailyStats.dailyRecovered}</span>
</div>

<body>
	<div>
		<table class="w3-table-all">
			<thead>
				<tr class="w3-green">
					<th>State</th>
					<th>State Code</th>
					<th>Active</th>
					<th>Confirmed</th>
					<th>Deaths</th>
					<th>Recovered</th>
					<th>Last Update</th>
				</tr>
			</thead>

			<c:forEach items="${stateWiseStats}" var="state">
				<tr>
					<td>${state.state}</td>
					<td>${state.stateCode}</td>
					<td>${state.active }</td>
					<td>${state.confirmed}</td>
					<td>${state.deaths}</td>
					<td>${state.recovered}</td>
					<td>${state.lastUpdatedTime}</td>
				</tr>
			</c:forEach>
		</table>

	</div>
</body>
</html>