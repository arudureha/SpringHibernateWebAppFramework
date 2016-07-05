<!DOCTYPE html>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
<head>
	<meta charset="utf-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<title>CMS</title>
	
	<!-- Latest compiled and minified CSS -->
	<link rel="stylesheet"
		href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
	
	<!-- Optional theme -->
	<link rel="stylesheet"
		href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap-theme.min.css">
	
	<script src="https://code.jquery.com/jquery-2.2.4.js"></script>
	
	<!-- Latest compiled and minified JavaScript -->
	<script
		src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
	
	<!-- Custom styles for this template -->
	<link rel="stylesheet" type="text/css" href="resources/css/dashboard.css">
	
	<style>
		li:hover {
			background-color:#D3D3D3
		}
	</style>
</head>

<body>

	<nav class="navbar navbar-inverse navbar-fixed-top">
		<div class="container-fluid">
			<div class="navbar-header">
				<button type="button" class="navbar-toggle collapsed"
					data-toggle="collapse" data-target="#navbar" aria-expanded="false"
					aria-controls="navbar">
					<span class="sr-only">Toggle navigation</span> <span
						class="icon-bar"></span> <span class="icon-bar"></span> <span
						class="icon-bar"></span>
				</button>
				<a class="navbar-brand" href="#">Project name</a>
			</div>
			<div id="navbar" class="navbar-collapse collapse">
				<ul class="nav navbar-nav navbar-right">
					<li><a href="#">Dashboard</a></li>
					<li><a href="#">Settings</a></li>
					<li><a href="#">Profile</a></li>
					<li><a href="#">Help</a></li>
				</ul>
				<form class="navbar-form navbar-right">
					<input type="text" class="form-control" placeholder="Search...">
				</form>
			</div>
		</div>
	</nav>

	<div class="container-fluid">
		<div class="row">
			<div class="col-sm-3 col-md-2 sidebar">
				<ul class="nav nav-sidebar">
					<li class="active"><a href="#">Overview<span
							class="sr-only">(current)</span>
					</a></li>
					<li><a href="#collapseTeacher" data-toggle="collapse">Teachers</a>
						<div id="collapseTeacher" class="panel-collapse collapse">
					      <ul class="list-group">
					        <li class="list-group-item" onclick="location.href = '/contentManagementSystem/CMS/addTeacher'">Add</li>
					        <li class="list-group-item" onclick="location.href = '/contentManagementSystem/CMS/updateTeacher'">Update</li>
					        <li class="list-group-item" onclick="location.href = '/contentManagementSystem/CMS/deleteTeacher'">Delete</li>
					      </ul>
					    </div>
					</li>
					<li><a href="#collapseStudent" data-toggle="collapse">Students</a>
						<div id="collapseStudent" class="panel-collapse collapse">
					      <ul class="list-group">
					        <li class="list-group-item" onclick="location.href = '/contentManagementSystem/CMS/addStudent'">Add</li>
					        <li class="list-group-item" onclick="location.href = '/contentManagementSystem/CMS/updateStudent'">Update</li>
					        <li class="list-group-item" onclick="location.href = '/contentManagementSystem/CMS/deleteStudent'">Delete</li>
					      </ul>
					    </div>
					</li>
					<li><a href="#collapseSubject" data-toggle="collapse">Subjects</a>
						<div id="collapseSubject" class="panel-collapse collapse">
					      <ul class="list-group">
					        <li class="list-group-item" onclick="location.href = '/contentManagementSystem/CMS/addSubject'">Add</li>
					        <li class="list-group-item" onclick="location.href = '/contentManagementSystem/CMS/updateSubject'">Update</li>
					        <li class="list-group-item" onclick="location.href = '/contentManagementSystem/CMS/deleteSubject'">Delete</li>
					      </ul>
					    </div>
					</li>
				</ul>
				<ul class="nav nav-sidebar">
					<li><a href="">Nav item again</a></li>
					<li><a href="">One more nav</a></li>
					<li><a href="">Another nav item</a></li>
				</ul>
			</div>
		</div>
	</div>
</body>
</html>