<%--
  Created by IntelliJ IDEA.
  User: 5CLASS-184
  Date: 2018-09-11
  Time: 오전 10:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%-- jsp 안에서 for문 돌릴수 있게 해주는 것 --%>
<%@ taglib  uri ="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1>Hello.jsp Page</h1>
    <h1>${msg}</h1>
    <h1>${tName}</h1>
    <h1>${list}</h1>
    <h1>${password}</h1>


    <c:forEach items="${list}" var="str">
        <h2>${str}</h2>
    </c:forEach>

<%
    out.write("<h2>" + Thread.currentThread().getName() + "</h2>");
%>

</body>
</html>
