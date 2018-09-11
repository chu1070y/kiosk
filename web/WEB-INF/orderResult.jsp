<%--
  Created by IntelliJ IDEA.
  User: 5CLASS-184
  Date: 2018-09-11
  Time: 오후 2:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<ul>
    <c:forEach items="${orderList}" var="order">
        <li>${order}  ${menuMap.get(order.mno).name }
                ${menuMap.get(order.mno).price * order.qty }
        </li>
    </c:forEach>
</ul>
</body>
</html>
