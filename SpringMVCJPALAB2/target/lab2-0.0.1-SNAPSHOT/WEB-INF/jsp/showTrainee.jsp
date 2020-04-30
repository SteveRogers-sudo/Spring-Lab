<%@page  isELIgnored="false"%>
<%@taglib  uri="http://java.sun.com/jsp/jstl/core"      prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
 <h1>Trainee Details</h1>
      <table border=1>
         <tr>
            <th>Trainee Id</th>
            <th>Trainee Name</th>
            <th>Trainee Location</th>
            <th>Trainee Domain</th>
         </tr>
         <c:forEach  var="t"  items="${tList}">
            <tr>
               <td>${t.traineeId }</td>
               <td>${t.traineeName }</td>
               <td>${t.traineeLocation }</td>
               <td>${t.traineeDomain }</td>
            </tr>
         </c:forEach>
      </table> 
</body>
</html>