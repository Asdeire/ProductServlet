<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <title>Request Info</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
</head>
<body>
<div class="container">
    <h1>Request Information</h1>
    <ul>
        <li><strong>Context Path:</strong> ${contextPath}</li>
        <li><strong>Servlet Path:</strong> ${servletPath}</li>
        <li><strong>Path Info:</strong> ${pathInfo}</li>
        <li><strong>Query String:</strong> ${queryString}</li>
        <li><strong>Param1:</strong> ${param1}</li>
        <li><strong>Param2:</strong> ${param2}</li>
        <li><strong>User-Agent:</strong> ${userAgent}</li>
        <li><strong>Page Counter:</strong> ${counter}</li>
    </ul>
</div>
</body>
</html>

