<%--
  Created by IntelliJ IDEA.
  User: Aubrey
  Date: 2020/4/8
  Time: 16:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
    <title>上传文件</title>
</head>
<body>
<form:form method="post" modelAttribute="fileUpload" enctype="multipart/form-data">
    请选择一个文件上传 :
    <input type="file" name="file" />
    <input type="submit" value="提交上传" />
</form:form>
</body>
</html>
