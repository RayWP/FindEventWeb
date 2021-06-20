<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>FindEvent</title>
</head>
<body>
<header style="height: 5%; padding-bottom: 0px">
    <nav class="navbar navbar-dark navbar-expand-md navigation-clean-search">
        <div class="container-fluid"><a class="navbar-brand" href="index.jsp">FindEventHeader</a>
            <div class="collapse navbar-collapse" id="navcol-1">
                <ul class="navbar-nav mr-auto">
                    <li class="nav-item"><a class="nav-link active" href="EventAll">Events</a></li>
                    <li class="nav-item"><a class="nav-link active" href="#">Tech Stack</a></li>
                </ul>
                <span class="navbar-text actions"> 
                	<c:if test="${not empty sessionScope.user }">
                		<ul class="navbar-nav" style="margin-right: 50px;">
	                      <li class="nav-item dropdown border rounded-pill" style="text-align: center;">
	                      	<a class="dropdown-toggle nav-link" aria-expanded="false" data-toggle="dropdown" href="#" style="width: 15%;color: rgb(255,255,255);font-family: 'Source Sans Pro', sans-serif;">${sessionScope.user.username } </a>
	                          <div class="dropdown-menu" style="color: black;">
	                          	<a class="dropdown-item" style="color: black;" href="UserProfile">My Profile</a>
	                          	<a class="dropdown-item" style="color: black;" href="UserEventServ">My Events</a>
	                          	<a class="dropdown-item" style="color: black;" href="UserLogout">Log out</a>
	                          </div>
	                      </li>
	                  </ul>
                	</c:if>
                	
                	<c:if test="${empty sessionScope.user }">
                    		<span class="navbar-text actions"> 
                    		<a class="btn login" href="login.jsp">Log In</a>
                    		<a class="btn btn-outline-light action-button" role="button" href="register_user.jsp">Sign Up</a></span>
                    </c:if>
                </span>
            </div>
        </div>
    </nav>
</header>
</body>
</html>