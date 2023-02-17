<!DOCTYPE html>
<html>
<body>
<B>Today&nbsp;</B>${Today}
<B>Add Projects</b><br>

<form method="POST" action="/Project/addProject" >
	ProjectId  <input type="number" name="projectId" placeholder="Enter project Id"/><br>
	ProjectName  <input type="text" name="projectName" placeholder="Enter project name"/><br>
	StartDate  <input type="date" name="startDate" placeholder="Enter start date"/><br>
	EndDate  <input type="date" name="endDate" placeholder="Enter end date"/><br><br>
	<input type="submit" value="Add" />
</form>
</body></html>