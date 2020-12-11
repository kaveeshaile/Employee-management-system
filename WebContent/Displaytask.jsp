

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Display Task</title>
<style>
body{background-color:lightgray;}

.button {background-color: #e7e7e7; color: black;}
</style>
</head>
<body>


<table>
    <tr>
        <th colspan="5" style="background-color:#7c2f97;">Tasks records</th>
    </tr>
    <tr style="background-color:#f0a64e;">
        <th class="border">TaskId</th>
        <th class="border">Title</th>
        <th class="border">DueDate</th>
        <th class="border">Description</th>
       
    </tr>
    <c:forEach var="task" items="${tasks}">
    	
    	<c:set var="taskId" value="${task.taskId}"/>
    <c:set var="title" value="${task.title}"/>
    <c:set var="dueDate" value="${task.dueDate}"/>
    <c:set var="description" value="${task.description}"/>
    
    
    
    
        <tr>
        <c:url value="/UpdateTask.jsp" var="taskupdate">

<c:param name="taskId" value="${ taskId}"/>
<c:param name="title" value="${ title}"/>
<c:param name="dueDate" value="${ dueDate}"/>
<c:param name="description" value="${ description}"/>
</c:url>

 <c:url value="/DeleteTask.jsp" var="taskdelete">

<c:param name="taskId" value="${ taskId}"/>
<c:param name="title" value="${ title}"/>
<c:param name="dueDate" value="${ dueDate}"/>
<c:param name="description" value="${ description}"/>
</c:url>







         	<td><c:out value="${task.taskId}"></c:out></td> 
            <td><c:out value="${task.title}"></c:out></td>
            <td><c:out value="${task.dueDate}"></c:out></td>
            <td><c:out value="${task.description}"></c:out></td>
<td><a href="${taskupdate}"><input type = "button" button class="button update" id="update" name="update" value="Update"></a></td>
<td><a href="${taskdelete}"><input type = "button" button class="button delete" id="btn2" name="deletee" value="Delete"></a></td> 
        </tr>
    </c:forEach>  
   

<button type="button" style=" background-color:red;border: none;color: white;padding: 10px;
text-align: center;text-decoration:none;display: inline-block;font-size: 10px;margin: 4px 2px;cursor: pointer;
height:30px;width:50px;"
onclick="window.location='emp inetrface.jsp'">Back</button>



</table>

</body>
</html>
 