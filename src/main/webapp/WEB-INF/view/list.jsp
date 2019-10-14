<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>商品列表</title>
</head>
<body>
	<table>
		<tr>
			<td>商品编号</td>
			<td>商品名称</td>
			<td>商品价格</td>
			<td>出售百分比</td>
		</tr>
		<c:forEach items="${goods}" var="g">
		<tr>
			<td>${g.id}</td>
			<td>${g.name}</td>
			<td>${g.price}</td>
			<td>${g.baifen}</td>
		</tr>
		</c:forEach>
	</table>
	<button><a href="findList?page=${pageNum}">上一页</a></button>
	<button><a href="findList?pageNum=${pageSize}">下一页</a></button>
</body>
</html>