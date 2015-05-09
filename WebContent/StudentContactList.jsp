<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>SpringHibernateSMSApplication</title>
</head>
<body>
<h3> Student Management System</h3>

<c:if test="${! empty ContactList}">
  <table class="data">
  <tr>
  
     <th>Name</th> 
     <th>Name_On_Certificate</th> 
     <th>Date_Of_Birth</th>
     <th>Gender</th> 
     <th>Mobile_No_Student</th>
     <th>Mobile_No_Parent</th>
     <th>Alt_Tel_No</th>
     <th>IC_No_Student</th>
     <th>IC_No_Parent</th>
      <th>Email</th>
      <th>Address</th> 
      <th>Postal_Code</th>
      <th>Course_Title</th>
      <th>How_Did_You_Find_Out_About_Us</th>  
      <th>Register New Student</th>
      <th>Cancel</th>
  
 </tr>
 
 <c:forEach items="${ContactList}" var="contact">
 
 
     <tr>
         <td>${contact.firstname},${contact.lastname}</td>
         <td>${contact.name_on_certificate}</td>
         <td>${contact.date_of_birth}</td>
         <td>${contact.gender}</td> 
         <td>${contact.mobile_no_student}</td>
         <td>${contact.mobile_no_parent}</td>
         <td>${contact.alt_tel_no}</td>
         <td>${contact.ic_no_student}</td>
         <td>${contact.ic_no_parent}</td>
         <td>${contact.email}</td>
         <td>${contact.postal_code}</td>
         <td>${contact.course_title}</td>
         <td>${contact.find_out}</td>
         <td>${contact.addContact}</td>
         <td>${contact.cancel}</td>
         
         
     </tr>
  
    </c:forEach>
 </table>
 </c:if>
 <br>
    <a href="index.jsp">Home</a>
 </body>
</html>