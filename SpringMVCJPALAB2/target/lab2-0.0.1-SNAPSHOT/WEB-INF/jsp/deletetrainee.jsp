<%@page isELIgnored="false"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core"    prefix="c" %>
<html>
<body>
<h1>Delete a Trainee</h1>
 <form action="deltrainee">
  <table border=1>
    <tr>
      <th>Trainee Id to Delete</th>
      <td><input type="text" name="traineeId"></td>
      <td><input type="submit" value="Delete"></td>
    </tr>
   </table>
  </form>
  
  <c:if test ="${trainee != null }">
     <h1>Trainee Info</h1>
   <form action=delete> 
      <table border=1>
         <tr>
            <th>Trainee Id</th>
           <th>Trainee Name</th>
           <th>Trainee Location</th>
           <th>Trainee Domain</th>
         </tr>
         <tr>
            <td><input type=text name="traineeId" value=${trainee.traineeId}></td>
            <td>${trainee.traineeName }</td>
            <td>${trainee.traineeLocation }</td>
            <td>${trainee.traineeDomain}</td>
         </tr>
         <tr>
           <td colspan=4><input type=submit value=Delete></td>
         </tr>
      </table>
   </form>
  </c:if>
</body>
</html>