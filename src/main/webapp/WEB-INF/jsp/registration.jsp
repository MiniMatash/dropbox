<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
    <script type="text/javascript" src="/resources/js/jquery/jquery-2.1.3.js"></script>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap.min.css">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap-theme.min.css">
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/js/bootstrap.min.js"></script>
</head>
<body>
<form method="post">
    <table class="table">
        <tr><th><h3>Login</h3></th>
            <th><h3>Password</h3></th>
        </tr>
        <tr>
            <c:choose>
                <c:when test="${empty failedLogin}">
                    <td><input class="input" type="text" name="registerLogin" value='' maxlength="30" required></td>
                </c:when>
                <c:otherwise>
                    <td><input type="text" name="registerLogin" value="${failedLogin}" maxlength="30" required><span style="color: red">wrong login</span></td>
                </c:otherwise>
            </c:choose>
            <td><input class="input" type="password" name="registerPassword" value='' maxlength="30" required></td>
        </tr>
    </table>
    <input type="submit" value="Register">
</form>
<button onclick="window.location.href ='/'">Back to login page</button>
</body>
</html>

<script type="text/javascript" src="/resources/js/jquery/jquery-2.1.3.js"></script>
<script>
    $(document).ready(function() {
        jQuery('.input').removeAttr('value');
    })
</script>
