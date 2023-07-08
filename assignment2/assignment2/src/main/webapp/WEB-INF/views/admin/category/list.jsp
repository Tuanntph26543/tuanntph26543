<%@ page pageEncoding="utf-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

Danh sách nhóm SP
<table>
    <tr>
        <th>ID</th>
        <th>Name</th>
        <th></th>
        <th></th>
    </tr>
    <c:forEach items="${items}" var="item">
        <tr>
            <td>${item.id}</td>
            <td>${item.name}</td>
            <td><a href="/admin/category/edit/${item.id}">Edit</a></td>
            <td><a href="/admin/category/delete">Delete</a></td>
        </tr>
    </c:forEach>
</table>