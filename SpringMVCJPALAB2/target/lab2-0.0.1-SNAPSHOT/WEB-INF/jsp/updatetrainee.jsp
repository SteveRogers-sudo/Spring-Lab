<%@page isELIgnored="false"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core"    prefix="c" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
 <form action="modtrainee">
  <table border=1>
    <tr>
      <th>Trainee Id to update</th>
      <td><input type="text" name="traineeId"></td>
      <td><input type="submit" value="update"></td>
    </tr>
   </table>
  </form>
   <c:if test ="${trainee != null }">
     <h1>Trainee Update</h1>
   <form  action="modifyTrainee"> 
      <table border=1>
         <tr>
            <th>Trainee Id</th><th><input type="number" value=${trainee.traineeId} name="traineeId"></th>
          </tr>
          <tr>  
           <th>Trainee Name</th><th><input type="text" value=${trainee.traineeName} name="traineeName"></th>
          </tr>
          <tr>  
           <th>Trainee Location</th><th><input type="text" value=${trainee.traineeLocation} name="traineeLocation"></th>
          </tr>
          <tr> 
           <th>Trainee Domain</th><th><input type="text" value=${trainee.traineeDomain} name="traineeDomain"></th>
           </tr>
           <tr><th><input type="submit" value="modify"></th></tr>
      </table>
   </form>
  </c:if>

</body>
</html>