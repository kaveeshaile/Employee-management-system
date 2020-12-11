<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>payment</title>

<style>

body {
  font-family: Arial;
  font-size: 17px;
  padding: 8px;
  background-color: #537AA4 ;
}

* {
  box-sizing: border-box;
}

.row {
  display: -ms-flexbox; /* IE10 */
  display: flex;
  -ms-flex-wrap: wrap; /* IE10 */
  flex-wrap: wrap;
  margin: 0 -16px;
}

.col-25 {
  -ms-flex: 25%; /* IE10 */
  flex: 25%;
}

.col-50 {
  -ms-flex: 50%; /* IE10 */
  flex: 50%;
}

.col-75 {
  -ms-flex: 75%; /* IE10 */
  flex: 75%;
}

.col-25,
.col-50,
.col-75 {
  padding: 0 16px;
}

.container {
  background-color: #f2f2f2;
  padding: 5px 20px 15px 20px;
  border: 1px solid lightgrey;
  border-radius: 3px;
}

input[type=text] {
  width: 100%;
  margin-bottom: 20px;
  padding: 12px;
  border: 1px solid #ccc;
  border-radius: 3px;
}

label {
  margin-bottom: 10px;
  display: block;
}

.icon-container {
  margin-bottom: 20px;
  padding: 7px 0;
  font-size: 24px;
}

.btn {
  background-color: #34495E ;
  color: white;
  padding: 10px;
  margin: 10px 0;
  border: none;
  width: 100%;
  border-radius: 3px;
  cursor: pointer;
  font-size: 17px;
}


.btn:hover {
  background-color:#7F8C8D;
}

a {
  color: #2196F3;
}

hr {
  border: 1px solid lightgrey;
}

span.price {
  float: right;
  color: grey;
}

 {
  .row {
    flex-direction: column-reverse;
  }
  .col-25 {
    margin-bottom: 20px;
  }
}
/* Simple CSS3 Fade-in-down Animation */
.fadeInDown {
  -webkit-animation-name: fadeInDown;
  animation-name: fadeInDown;
  -webkit-animation-duration: 1s;
  animation-duration: 1s;
  -webkit-animation-fill-mode: both;
  animation-fill-mode: both;
}

@-webkit-keyframes fadeInDown {
  0% {
    opacity: 0;
    -webkit-transform: translate3d(0, -100%, 0);
    transform: translate3d(0, -100%, 0);
  }
  100% {
    opacity: 1;
    -webkit-transform: none;
    transform: none;
  }
}
@keyframes fadeInDown {
  0% {
    opacity: 0;
    -webkit-transform: translate3d(0, -100%, 0);
    transform: translate3d(0, -100%, 0);
  }
  100% {
    opacity: 1;
    -webkit-transform: none;
    transform: none;
  }
}


</style>

</head>
<body>
<c:forEach var="emp" items ="${empDetails}">
<div class="wrapper fadeInDown">
<h2><center>Employee Payment Details</center></h2>
<div class="row">
  <div class="col-75">
    <div class="container">
      <form action="">
      
        <div class="row">
          <div class="col-50">
            <h3>Employee Details</h3>
			
	        <c:set var="id" value="${emp.id}"/>
            <c:set var="name" value="${emp.name}"/>
            <c:set var="department" value="${emp.department}"/>
            <c:set var="basicSalary" value="${emp.basicSalary}"/>
            <c:set var="deduction" value="${emp.deduction}"/>
            <c:set var="overTime" value="${emp.overTime}"/>
	        
	        
            <label for="fname"> Employee Full Name</label>
            <input type="text"  name="firstname" value="${emp.name}">
            <label for="id">Employee ID Number</label>
            <input type="text"  name="id" value="${emp.id}" >
            <label for="adr">Department</label>
            <input type="text"  name="address" value="${emp.department}">
            
          </div>
		  <div class="col-50">
        
          
            <h3>Payment</h3>
            <label for="Basic Salary">Basic Salary </label>
            <input type="text" id="Basic Salary" name="Basic Salary"  value="${emp.basicSalary}">
            <label for="Deductions">Deductions</label>
            <input type="text"  id="Deductions" name="Deductions" value="${emp.deduction}" >
            <label for="Over Time Payment">Over Time Payment</label>
            <input type="text" id="Over Time Payment" name="Over Time Payment" value="${emp.overTime}" >
			
			
           </div>
          </div>
        </form>
      </div>
      </div>
      </div>
      
</c:forEach>

<c:url value = "updateEmploye.jsp" var="empupdate">
<c:param name="id" value="${id}"/>
<c:param name="name" value="${name}"/>
<c:param name="department" value="${department}"/>
<c:param name="basicSalary" value="${basicSalary}"/>
<c:param name="deduction" value="${deduction}"/>
<c:param name="overTime" value="${overTime}"/>



</c:url>

<a href = "${empupdate}">
<input type="submit" name="update" value="update employee Details" class="btn">
</a>
<c:url value = "DeleteEmploye.jsp" var="emDelete">
<c:param name="id" value="${id}"/>
<c:param name="name" value="${name}"/>
<c:param name="department" value="${department}"/>
<c:param name="basicSalary" value="${basicSalary}"/>
<c:param name="deduction" value="${deduction}"/>
<c:param name="overTime" value="${overTime}"/>


</c:url>
<a href = "${emDelete}">
<input type="submit" name="update" value="Delete" class="btn">
</a>

</body>
</html>