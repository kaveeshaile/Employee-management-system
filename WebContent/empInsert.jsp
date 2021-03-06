<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<script>
function validateForm() {
  var x = document.forms["myForm"]["name"].value;
  if (x == "") {
    alert("Name must be filled out");
    return false;
  }
  var y = document.forms["myForm"]["id"].value;
  if (y == "") {
    alert("employee ID must be filled out");
    return false;
  }
  
  var l = document.forms["myForm"]["department"].value;
  if (l == "") {
    alert("employee department must be filled out");
    return false;
  }
  
  var p = document.forms["myForm"]["BasicSalary"].value;
  if (p == "") {
    alert("basic salary must be filled out");
    return false;
  }
  var z = document.forms["myForm"]["deduction"].value;
  if (z == "") {
    alert("deduction must be filled out");
    return false;
  }
  var q = document.forms["myForm"]["overTime"].value;
  if (q == "") {
    alert("Over Time payment must be filled out");
    return false;
  }
}

</script>
<meta charset="ISO-8859-1">
<title>Insert</title>
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

<div class="wrapper fadeInDown">
<h2><center>Add New Employee<center></h2>
<div class="row">
  <div class="col-75">
    <div class="container">
      <form action="empII" method="post" name = "myForm" onsubmit="return validateForm()">
      
        <div class="row">
          <div class="col-50">
            <h3>Employee Detatails</h3>
            <label for="fname"> Employee Full Name</label>
            <input type="text" name="name">
            <label for="email">Employee ID Number</label>
            <input type="text" name="id">
            <label for="adr">Department</label>
            <input type="text" name="department">
            
          </div>

          <div class="col-50">
            <h3>Payment</h3>
            <label for="Basic Salary">Basic Salary </label>
            <input type="text" name="BasicSalary">
            <label for="Deductions">Deductions</label>
			 <input type="text" name="deduction">
            <label for="Over Time Payment">Over Time Payment</label>
			 <input type="text" name="overTime">
			 
			
           </div>
          
        </div>
        
		<input type="submit" name="submit" value="add employee" class="btn">
      </form>
    </div>
  </div>
 
</div>
</div>

</body>
</html>