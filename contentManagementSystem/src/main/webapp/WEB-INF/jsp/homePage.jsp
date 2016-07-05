<!DOCTYPE html>
<%@include file="template.jsp"%>

<html>
<head>
	<script>
		$(document).ready(function() {
			$('.dropdown-toggle').dropdown();
			$("#teacherInfoList").hide();
		});
	
		function showStudentInfoList() {
			$("#studentInfoList").show();
			$("#teacherInfoList").hide();
		}
	
		function showTeacherInfoList() {
			$("#studentInfoList").hide();
			$("#teacherInfoList").show();
		}
	</script>
</head>

<body>
	<form:form method="POST" action="/CMS" modelAttribute="studentForm">
		<div class="col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2 main">
			<h1 class="page-header">Overview</h1>
			<div class="row placeholders">
				<div class="col-xs-6 col-sm-3 placeholder">
					<img src="resources/images/Teacher.png" width="200" height="200"
						class="img-responsive" alt="Generic placeholder thumbnail"
						onclick="showTeacherInfoList();">
					<h4>Teachers</h4>
					<span class="text-muted">Info about teachers</span>
				</div>
				<div class="col-xs-6 col-sm-3 placeholder">
					<img src="resources/images/Student.png" width="200" height="200"
						class="img-responsive" alt="Generic placeholder thumbnail"
						onclick="showStudentInfoList();">
					<h4>Students</h4>
					<span class="text-muted">Info about students</span>
				</div>
				<div class="col-xs-6 col-sm-3 placeholder">
					<img src="resources/images/Books.png" width="200" height="200"
						class="img-responsive" alt="Generic placeholder thumbnail">
					<h4>Subjects</h4>
					<span class="text-muted">Info about Subjects</span>
				</div>
			</div>

			<h2 class="sub-header">Information</h2>
			<div id="studentInfoList" class="table-responsive">
				<table class="table table-striped">
					<thead>
						<tr>
							<th>ID</th>
							<th>Name</th>
							<th>Address</th>
							<th>Branch</th>
							<th>Class</th>
						</tr>
					</thead>

					<c:forEach var="studList" items="${allStudents}">
						<tbody>
							<tr>
								<td><c:out value="${studList.studentId}"></c:out></td>
								<td><c:out value="${studList.studentName}"></c:out></td>
								<td><c:out value="${studList.studentAddress}"></c:out></td>
								<td><c:out value="${studList.studentBranch}"></c:out></td>
								<td><c:out value="${studList.studentClass}"></c:out></td>
							</tr>
						</tbody>
					</c:forEach>
				</table>
			</div>

			<div id="teacherInfoList" class="table-responsive">
				<table class="table table-striped">
					<thead>
						<tr>
							<th>ID</th>
							<th>Name</th>
							<th>Address</th>
							<th>Branch</th>
						</tr>
					</thead>

					<c:forEach var="teacherList" items="${allTeachers}">
						<tbody>
							<tr>
								<td><c:out value="${teacherList.teacherId}"></c:out></td>
								<td><c:out value="${teacherList.teacherName}"></c:out></td>
								<td><c:out value="${teacherList.teacherAddress}"></c:out></td>
								<td><c:out value="${teacherList.teacherBranch}"></c:out></td>
							</tr>
						</tbody>
					</c:forEach>
				</table>
			</div>
		</div>
	</form:form>
</body>
</html>