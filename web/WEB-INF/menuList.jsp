<%--
  Created by IntelliJ IDEA.
  User: 5CLASS-184
  Date: 2018-09-11
  Time: 오후 12:04
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
    <h1>메뉴 리스트입니다</h1>

    <form method="post">
    <ul>
        <c:forEach items="${menuList}" var="menu">
        <li>
            <div>
                    ${menu.name} ${menu.price}
                <select name="ord">
                    <option value="0">0</option>
                    <option value="${menu.mno}_1">1</option>
                    <option value="${menu.mno}_2">2</option>
                    <option value="${menu.mno}_3">3</option>
                    <option value="${menu.mno}_4">4</option>
                </select>
            </div>
        </li>
        </c:forEach>
    </ul>
        <button>영수증 출력</button>
    </form>
<form action="/index.jsp" method="get">
    <button>로그아웃</button>
    <% session.removeAttribute("member"); %>
</form>
</body>
</html>
