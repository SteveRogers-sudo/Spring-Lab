<%@page isELIgnored="false"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core"    prefix="c" %>
<html>
<body>
<h1>Retrieve a Trainee</h1>
 <form action="searchtrainee">
  <table border=1>
    <tr>
      <th>Trainee Id to retrieve</th>
      <td><input type="text" name="traineeId"></td>
      <td><input type="submit" value="Search"></td>
    </tr>
   </table>
  </form>
   <c:if test ="${trainee != null }">
     <h1>Trainee Info</h1>
   <form> 
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
      </table>
   </form>
  </c:if>
</body>
</html>