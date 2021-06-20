<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html class="text-right" lang="en">

<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, shrink-to-fit=no">
    <title>index</title>
    <link rel="stylesheet" href="assets/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Lora">
    <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Source+Sans+Pro:300,400,700">
    <link rel="stylesheet" href="assets/fonts/font-awesome.min.css">
    <link rel="stylesheet" href="assets/fonts/ionicons.min.css">
    <link rel="stylesheet" href="assets/css/Article-Clean.css">
    <link rel="stylesheet" href="assets/css/Features-Boxed.css">
    <link rel="stylesheet" href="assets/css/Footer-Basic.css">
    <link rel="stylesheet" href="assets/css/Header-Blue.css">
    <link rel="stylesheet" href="assets/css/Highlight-Clean.css">
    <link rel="stylesheet" href="assets/css/Highlight-Phone.css">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/Swiper/3.3.1/css/swiper.min.css">
    <link rel="stylesheet" href="assets/css/Navigation-Clean.css">
    <link rel="stylesheet" href="assets/css/Navigation-with-Button.css">
    <link rel="stylesheet" href="assets/css/Simple-Slider.css">
    <link rel="stylesheet" href="assets/css/styles.css">
</head>

<body>

    <header class="header-blue" style="height: 700.594px;">
        <nav class="navbar navbar-dark navbar-expand-md navigation-clean-search">
            <div class="container-fluid"><a class="navbar-brand" href="index.jsp">FindEvent</a>
                <div class="collapse navbar-collapse" id="navcol-1">
                    <ul class="navbar-nav mr-auto">
                        <li class="nav-item"><a class="nav-link active" href="#">Events</a></li>
                        <li class="nav-item"><a class="nav-link active" href="#">Tech Stack</a></li>
                    </ul>
                    <span class="navbar-text actions"> 
                    	<c:if test="${not empty sessionScope.user }">
	                		<ul class="navbar-nav" style="margin-right: 50px;">
		                      <li class="nav-item dropdown border rounded-pill" style="text-align: center;">
		                      	<a class="dropdown-toggle nav-link" aria-expanded="false" data-toggle="dropdown" href="#" style="width: 15%;color: rgb(255,255,255);font-family: 'Source Sans Pro', sans-serif;">${sessionScope.user.username } </a>
		                          <div class="dropdown-menu">
		                          	<a class="dropdown-item" href="UserProfile">My Profile</a>
		                          	<a class="dropdown-item" href="UserEventServ">My Events</a>
		                          	<a class="dropdown-item" href="LogoutServ">Log out</a>
		                          </div>
		                      </li>
		                  </ul>
	                	</c:if>
	                	
	                	<c:if test="${empty sessionScope.user }">
	                    		<span class="navbar-text actions"> 
	                    		<a class="login" href="login.jsp">Log In</a>
	                    		<a class="btn btn-light action-button" role="button" href="register_user.jsp">Sign Up</a></span>
	                    </c:if>
                    </span>
                </div>
            </div>
        </nav>
        
        <div class="container hero">
            <h1 style="text-align: center;">Want to share your events?</h1>
            <p style="text-align: center;">The biggest place to promote your <strong>events</strong>&nbsp;and find events</p>
    	</div>
    </header>
    
    
    <section class="highlight-clean" style="padding-top: 80px;padding-bottom: 80px;">
        <div class="container">
            <div class="intro">
                <h1 style="text-align: center;width: 550px;padding: 0px;margin-bottom: 50px;"><strong>What people think about us?</strong><br></h1>
            </div>
        </div>
        <div class="container">
            <div class="row">
                <div class="col-md-4">
                    <div class="card" style="box-shadow: 2px 0px 9px 0px var(--blue);height: 254px;">
                        <div class="card-body d-flex flex-column justify-content-between" style="height: 285px;transform: perspective(0px);color: var(--purple);">
                            <p class="card-text">"By posting my event here, I can gain many more attendees"<br><br><br></p>
                            <p class="text-left" style="filter: brightness(41%);"><br>- Kevin James, CEO of Macrohard&nbsp;<br><br></p>
                        </div>
                    </div>
                </div>
                <div class="col-md-4" style="height: 290px;">
                    <div class="card" style="box-shadow: 2px 0px 9px 0px var(--blue);height: 254px;">
                        <div class="card-body d-flex flex-column flex-grow-0 justify-content-between" style="height: 285px;">
                            <p class="card-text">"I fill my holiday by attending the event here, with this website, i can find many events"<br></p>
                            <p class="text-left" style="filter: brightness(41%);"><br>- Giannis Harden, Student<br><br></p>
                        </div>
                    </div>
                </div>
                <div class="col-md-4">
                    <div class="card" style="box-shadow: 2px 0px 9px 0px var(--blue);height: 254px;">
                        <div class="card-body d-flex flex-column flex-fill justify-content-between" style="height: 285px;">
                            <p class="card-text">"Easy to use, great experience using this to promote my events"</p>
                            <p class="text-left" style="filter: brightness(41%);"><br>- Kobe Irving, CEO of MambaMem<br><br></p>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </section>
    <section class="features-boxed">
        <div class="container">
            <div class="intro">
                <h2 class="text-center">Find variety of events here!</h2>
            </div>
            <div class="row justify-content-center visible features">
                <div class="col-sm-6 col-md-5 col-lg-4 item">
                    <div class="box"><i class="fa fa-map-marker icon"></i>
                        <h3 class="name">Works everywhere</h3>
                        <p class="description">Aenean tortor est, vulputate quis leo in, vehicula rhoncus lacus. Praesent aliquam in tellus eu.</p><a class="learn-more" href="#">Learn more »</a>
                    </div>
                </div>
                <div class="col-sm-6 col-md-5 col-lg-4 item">
                    <div class="box"><i class="fa fa-clock-o icon"></i>
                        <h3 class="name">Always available</h3>
                        <p class="description">Aenean tortor est, vulputate quis leo in, vehicula rhoncus lacus. Praesent aliquam in tellus eu.</p><a class="learn-more" href="#">Learn more »</a>
                    </div>
                </div>
                <div class="col-sm-6 col-md-5 col-lg-4 item">
                    <div class="box"><i class="fa fa-list-alt icon"></i>
                        <h3 class="name">Customizable </h3>
                        <p class="description">Aenean tortor est, vulputate quis leo in, vehicula rhoncus lacus. Praesent aliquam in tellus eu.</p><a class="learn-more" href="#">Learn more »</a>
                    </div>
                </div>
                <div class="col-sm-6 col-md-5 col-lg-4 item">
                    <div class="box"><i class="fa fa-leaf icon"></i>
                        <h3 class="name">Organic </h3>
                        <p class="description">Aenean tortor est, vulputate quis leo in, vehicula rhoncus lacus. Praesent aliquam in tellus eu.</p><a class="learn-more" href="#">Learn more »</a>
                    </div>
                </div>
                <div class="col-sm-6 col-md-5 col-lg-4 item">
                    <div class="box"><i class="fa fa-plane icon"></i>
                        <h3 class="name">Fast </h3>
                        <p class="description">Aenean tortor est, vulputate quis leo in, vehicula rhoncus lacus. Praesent aliquam in tellus eu.</p><a class="learn-more" href="#">Learn more »</a>
                    </div>
                </div>
                <div class="col-sm-6 col-md-5 col-lg-4 item">
                    <div class="box"><i class="fa fa-phone icon"></i>
                        <h3 class="name">Mobile-first</h3>
                        <p class="description">Aenean tortor est, vulputate quis leo in, vehicula rhoncus lacus. Praesent aliquam in tellus eu.</p><a class="learn-more" href="#">Learn more »</a>
                    </div>
                </div>
            </div>
        </div>
    </section>
    <footer class="footer-basic">
        <div class="social"><a href="#"><i class="icon ion-social-instagram"></i></a><a href="#"><i class="icon ion-social-snapchat"></i></a><a href="#"><i class="icon ion-social-twitter"></i></a><a href="#"><i class="icon ion-social-facebook"></i></a></div>
        <ul class="list-inline">
            <li class="list-inline-item"><a href="#">Home</a></li>
            <li class="list-inline-item"><a href="#">Services</a></li>
            <li class="list-inline-item"><a href="#">About</a></li>
            <li class="list-inline-item"><a href="#">Terms</a></li>
            <li class="list-inline-item"><a href="#">Privacy Policy</a></li>
        </ul>
        <p class="copyright">Raymond WP © 2021</p>
    </footer>
    <script src="assets/js/jquery.min.js"></script>
    <script src="assets/bootstrap/js/bootstrap.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/Swiper/3.3.1/js/swiper.jquery.min.js"></script>
    <script src="assets/js/Simple-Slider.js"></script>
</body>

</html>