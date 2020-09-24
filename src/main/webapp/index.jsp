<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<html>

<head>
<title>Coronavirus Tracker</title>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<link rel="stylesheet" href="style1.css">
</head>

<div>
	<h1>Covid-19 India Statistics</h1>
</div>

<jsp:useBean id="dailyStats"
	class="com.foo.covidstats.services.DailyStats" scope="request">
</jsp:useBean>

<p>${dailyStats.date}</p>

<div id="card1">
	<div>Total Cases : ${dailyStats.totalConfirmed}</div>
	<div>Total Recovered : ${dailyStats.totalRecovered}</div>
	<div>Total Deaths : ${dailyStats.totalDeceased}</div>
</div>

<div id="card2">
	<div>Daily Reported : ${dailyStats.dailyConfirmed}</div>
	<div>Daily Deaths : ${dailyStats.dailyDeceased}</div>
	<div>Daily Recovered : ${dailyStats.dailyRecovered}</div>
</div>

<body>
	<div class="table">
		<table class="sortable">
			<thead>
				<tr>
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