<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">

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
	    <link rel="stylesheet" href="assets/css/Google-Style-Login.css">
	    <link rel="stylesheet" href="assets/css/Header-Blue.css">
	    <link rel="stylesheet" href="assets/css/Highlight-Clean.css">
	    <link rel="stylesheet" href="assets/css/Highlight-Phone.css">
	    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/animate.css/3.5.2/animate.min.css">
	    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/Swiper/3.3.1/css/swiper.min.css">
	    <link rel="stylesheet" href="assets/css/Login-Form-Clean.css">
	    <link rel="stylesheet" href="assets/css/Login-Form-Dark.css">
	    <link rel="stylesheet" href="assets/css/Navigation-Clean.css">
	    <link rel="stylesheet" href="assets/css/Navigation-with-Button.css">
	    <link rel="stylesheet" href="assets/css/Simple-Slider.css">
	    <link rel="stylesheet" href="assets/css/styles.css">
	    
	    <script>
			//to load image when uploaded
	    	var loadFile = function(event) {
				var image = document.getElementById('blah');
				image.src = URL.createObjectURL(event.target.files[0]);
			};
		</script>
	    
	</head>
	
	<body style="background: var(--blue);">
		
		<%@ include file="header_uni.jsp" %>
	    
	    <div class="form-group" style="padding: 0px;padding-top: 4%;">
	        <form class="d-flex flex-column justify-content-center align-items-center" method="post" action="RegisterUserServ" enctype="multipart/form-data" autocomplete="off">
	            <div class="container" style="width: 70%;padding-top: 15px;padding-bottom: 15px;background: var(--light);border-radius: 20px;box-shadow: 12px 10px 11px 0px;">
	                <h1>Registration</h1>
	                <div class="form-row">
	                    <div class="col-md-6 col-lg-6 col-xl-4 offset-xl-0" style="padding-top: 10px;padding-right: 10px;padding-bottom: 15px;">
	                    <img style="width: 175px;height: 280px;margin: 0px;border: 1px solid rgb(0,0,0) ;" name="image_show" id="blah" src="${book_image }">
	                    <input class="form-control-file" type="file" style="margin-top: 6px;" accept="image/*" name="user_image" id="imgInp" onchange="loadFile(event)"></div>
	                    <div class="col-md-6 col-xl-8 d-flex flex-column justify-content-center align-items-center align-content-center" style="padding-top: 28px;padding-right: 10px;padding-bottom: 15px;">
	                    <input class="form-control" type="text" style="margin-bottom: 2%;margin-left: 1px;width: 80%;" placeholder="My name" name="username" value="${username }" required>
	                    <input class="form-control" type="text" style="margin-bottom: 2%;margin-left: 1px;width: 80%;" placeholder="johndoe@email.com" name="email" value="${email }" required pattern="^([\w-]+(?:\.[\w-]+)*)@((?:[\w-]+\.)*\w[\w-]{0,66})\.([a-z]{2,6}(?:\.[a-z]{2})?)$">
	                    <input class="form-control" type="password" style="margin-bottom: 2%;margin-left: 1px;width: 80%;" placeholder="password (8-20 digits)" name="password" required="required" minlength="8" maxlength="20">
	                    <input class="form-control" type="password" style="margin-bottom: 2%;margin-left: 1px;width: 80%;" placeholder="re-type password (8-20 digits)" name="re_password" required="required" minlength="8" maxlength="20">
	                    <input class="form-control" type="text" style="margin-bottom: 2%;margin-left: 0px;width: 80%;height: 100px;" placeholder="description" value="${description }" name="description" required>
	                    <button class="btn btn-primary" data-bss-hover-animate="rubberBand" type="submit" style="width: 80%;margin-top: 14px;margin-bottom: 14px;">Button</button></div>
	                </div>
	            </div>
	        </form>
	    </div>
	    <script src="assets/js/jquery.min.js"></script>
	    <script src="assets/bootstrap/js/bootstrap.min.js"></script>
	    <script src="assets/js/bs-init.js"></script>
	    <script src="https://cdnjs.cloudflare.com/ajax/libs/Swiper/3.3.1/js/swiper.jquery.min.js"></script>
	    <script src="assets/js/Simple-Slider.js"></script>
	</body>

</html>