<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>

<head>
<title>Coronavirus Tracker</title>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
</head>

<div class="w3-container">
	<h1>Covid-19 Statistics</h1>
	<p>This application lists the current number of cases reported</p>
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
				</tr>
			</c:forEach>
		</table>

	</div>
</body>
</html>