<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Products</title>
</head>
<body>


<div>
    <c:forEach var="p" items="${products}">
        <h3>Product name <c:out value="${p.name}"/></h3>
        <h4>Product description <c:out value="${p.description}"/></h4>
        <h4>Product price <c:out value="${p.price}"/></h4>
    </c:forEach>
</div>



</body>
</html>
