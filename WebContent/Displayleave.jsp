<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Display Leave</title>
<style>


body{background-color:lightgray;}
.button {background-color: #e7e7e7; color: black;}
</style>


</head>
<body>


<table>
    <tr>
        <th colspan="5" style="background-color:#7c2f97;">leave records</th>
    </tr>
    <tr style="background-color:#f0a64e;">
        <th class="border">EmployeeId</th>
        <th class="border">EmployeeName</th>
        <th class="border">LeaveType</th>
        <th class="border">Duration</th>
        <th class="border">Reason</th>
       
    </tr>
    <c:forEach var="leave" items="${leave}">
    
    <c:set var="employeeId" value="${leave.employeeId}"/>
    <c:set var="employeeName" value="${leave.employeeName}"/>
    <c:set var="leaveType" value="${leave.leaveType}"/>
    <c:set var="duration" value="${leave.duration}"/>
    <c:set var="reason" value="${leave.reason}"/>
    
            
        <tr>
        <c:url value="/UpdateLeave.jsp" var="leaveupdate">

<c:param name="employeeId" value="${ employeeId}"/>
<c:param name="employeeName" value="${employeeName}"/>
<c:param name="leaveType" value="${leaveType}"/>
<c:param name="duration" value="${ duration}"/>
<c:param name="reason" value="${reason}"/>
</c:url>

<c:url value="/DeleteLeave.jsp" var="leavedelete">

<c:param name="employeeId" value="${ employeeId}"/>
<c:param name="employeeName" value="${employeeName}"/>
<c:param name="leaveType" value="${leaveType}"/>
<c:param name="duration" value="${ duration}"/>
<c:param name="reason" value="${reason}"/>
</c:url>
        
         	<td><c:out value="${leave.employeeId}"></c:out></td> 
            <td><c:out value="${leave.employeeName}"></c:out></td>
            <td><c:out value="${leave.leaveType}"></c:out></td>
            <td><c:out value="${leave.duration}"></c:out></td>
            <td><c:out value="${leave.reason}"></c:out></td>
            
            
            
<td><a href="${leaveupdate}"><input type = "button" button class= "button update" id="update" name="update" value="UpdateData"></a></td>
<td><a href="${leavedelete}"><input type = "button" button class= "button delete" id="btn2" name="delete" value="DeleteData"></a></td>
        
            </tr>
    </c:forEach>  
   
 <button type="button" style=" background-color:red;border: none;color: white;padding: 10px;
text-align: center;text-decoration:none;display: inline-block;font-size: 10px;margin: 4px 2px;cursor: pointer;
height:30px;width:50px;"
onclick="window.location='emp inetrface.jsp'">Back</button>













</table>
</body>
</html>
 