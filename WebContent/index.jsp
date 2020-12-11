<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Apply leave Application</title>
<script> 
function validate()
{ 
 var Employee Name = document.form.Employee Name.value;
 var Employee ID = document.form.Employee ID.value;
 var Reason for Leave = document.form.username.value; 
 
 if (Employee Name==null || Employee Name=="")
 { 
 alert("Employee Name can't be blank"); 
 return false; 
 }
 else if (Employee ID ==null || Employee ID =="")
 { 
 alert("Employee ID  can't be blank"); 
 return false; 
 }
 else if (Reason for Leave==null ||Reason for Leave =="")
 { 
 alert("Reason for Leave can't be blank"); 
 return false; 
 }
 
 } 
</script> 


<style>



body {background-color:rgb(88, 91, 94);}
    h1 {
  border: 1px solid rgb(14, 72, 199);
  padding: 30px;
    }
    
    p    {font-size:120%;padding: 35px;
    }
    p1 {font-size:120%;}
    p2 {font-size:120%;}
    p3 {font-size:120%;}
    p4 {font-size:120%;}
    input { font-size: 120%}
    select{font-size:80%}
    










</style>


  







</head>
<body>
 




<form method="post" action="LeaveServlet">
    <center>
<body text="white">

    <h1 style="color:white;background-color:DodgerBlue;">Apply Leave Application</h1>
 </center>
<br></br>
    Employee Name:
    <input type="text" placeholder= "name" name="EmployeeName"style="width:400px"required>
    <br>
    <br>
    <br>
     Employee Id:
    <input type="number" placeholder= "ID" name ="EmployeeId"style="width:400px"required>
    
    
    
    <br>
    
    
    
<br>
 
    <p>
       Leave Type 
       <select name = "LeaveType">
        <option value = "1">Leaves</option>
         <option value = "2">Casual Leave</option>
         <option value = "3">Annual Leave</option>
         <option value = "4">Forced Leave</option>
         <option value = "5">Sick Leave</option>
         
       </select>
    </p>
 

   
    <br></br>
    
    <p3>Leave Duration </p3>
    <br>
    
    <input type="text" placeholder= "Days/hours" name= "Duration"style="width:400px"required>
    <br>
   
    <br></br>
    

  <p4>Reason</p4> <br></br>
  <input type="text" name="Reason"style="width:900px; height:200px;"required>
  <br>
    <br>
    
        
        <div style="text-align:center">
        
            
            
            <center>
            <input type="Reset"  value="Reset " style="font-size:10pt;color:white;
            background-color:red;border:2px solid #FF0000;padding:3px;[COLOR="Red"]margin-bottom:30px[/COLOR]">
             <br> <br><input type="submit"  value=" submit" style="font-size:10pt;color:white;
             background-color:green;border:2px solid #336600;padding:3px;[COLOR="Red"]margin-bottom:30px[/COLOR]">
             </div>
             <button type="button" style=" background-color:red;border: none;color: white;padding: 10px;
text-align: center;text-decoration:none;display: inline-block;font-size: 10px;margin: 4px 2px;cursor: pointer;
height:30px;width:50px;"
onclick="window.location='EmployeeMainInterface.jsp'">Back</button>
           
        </center>
    

   






</form>





 <form action="DisplayleaveServlet" method="get">
<input type="submit" style=" background-color:blue;border: none;color: white;padding: 10px;
text-align: center;text-decoration:none;display: inline-block;font-size: 10px;margin: 4px 2px;cursor: pointer;
height:30px;width:90px;"
value="Display leave">
</form>
</body>
</html>