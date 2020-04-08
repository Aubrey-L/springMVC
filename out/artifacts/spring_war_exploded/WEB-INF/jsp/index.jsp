<%--
  Created by IntelliJ IDEA.
  User: Aubrey
  Date: 2020/4/7
  Time: 14:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html; charset=UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
    <title>Spring Landing Page</title>
</head>
<body>
<h2>${mes}</h2>
<p>点击下面的按钮获得一个简单的HTML页面</p>
<form:form method="GET" action="/sring">
    <table>
        <tr>
            <td>
                <input type="submit" value="获取HTML页面"/>
            </td>
        </tr>
    </table>
</form:form>
</body>
</html>

