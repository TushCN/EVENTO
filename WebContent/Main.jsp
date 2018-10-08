<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.sql.*,java.io.*,javax.servlet.*,com.connect.DBConnection"%>
<!DOCTYPE html>
<html>
<head>
  <!-- ========== Meta Tags ========== -->
    <meta charset="UTF-8">
    <meta name="description" content="Evento -Event Html Template">
    <meta name="keywords" content="Evento , Event , Html, Template">
    <meta name="author" content="ColorLib">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <!-- ========== Title ========== -->
    <title> Evento - Event Html Template</title>
    <!-- ========== Favicon Ico ========== -->
    <!--<link rel="icon" href="fav.ico">-->
    <!-- ========== STYLESHEETS ========== -->
    <!-- Bootstrap CSS -->
    <link href="assets/css/bootstrap.min.css" rel="stylesheet">
    <!-- Fonts Icon CSS -->
    <link href="assets/css/font-awesome.min.css" rel="stylesheet">
    <link href="assets/css/et-line.css" rel="stylesheet">
       <link href="assets/css/ionicons.min.css" rel="stylesheet">
    <!-- Carousel CSS -->
    <link href="assets/css/owl.carousel.min.css" rel="stylesheet">
    <link href="assets/css/owl.theme.default.min.css" rel="stylesheet">
    <!-- Animate CSS -->
    <link rel="stylesheet" href="assets/css/animate.min.css">
    <!-- Custom styles for this template -->
    <link href="assets/css/main.css" rel="stylesheet">
</head>
<body>
<body>
<div class="loader">
    <div class="loader-outter"></div>
    <div class="loader-inner"></div>
</div>

<!--header start here -->
<header class="header navbar fixed-top navbar-expand-md">
    <div class="container">
        <a class="navbar-brand logo" href="#">
            <img src="assets/img/logo.png" alt="Evento"/>
        </a>
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#headernav" aria-expanded="false" aria-label="Toggle navigation">
            <span class="lnr lnr-text-align-right"></span>
        </button>
        <div class="collapse navbar-collapse flex-sm-row-reverse" id="headernav">
            <ul class=" nav navbar-nav menu">
                <li class="nav-item">
                    <a class="nav-link active" href="#">Home</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link " href="#event_section">Events</a>
                </li>                
                <li class="nav-item">
                    <a class="nav-link " href="#Aboutus_section">About Us</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link " href="#contact_section">Contact</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link " href="AdminLogin.jsp">Admin</a>
                </li>   
                 <li class="nav-item">
                    <a class="nav-link " href="StuLogin.jsp">Student</a>
                </li>               
             
            </ul>
    </div>
  </div>
</header>
<!--header end here-->

<style>
    .event_slider_section{
        position: absolute;
    z-index: 9;
    background-color: rgba(0, 0, 0, 0.57);
    right: 10%;
    top: 20%;
    }
    .event_slider_section h2{
            font-size: 22px;
    background-color: red;
    padding: 13px;
    color: #fff;
    text-transform: uppercase;
    letter-spacing: 2px;
    text-shadow: 1px 4px 4px rgba(0,0,0,.5);
        margin: 0px;
    }
    .event_slider_section ul{
                min-height: 400px;
                max-height: 400px;

    list-style: none;
    width: 340px;
        padding: 25px;
    margin: 0px;
    overflow-y: auto;
    }
    .event_slider_section ul li{
            font-size: 14px;
    color: #fff;
    padding-bottom: 15px;
    line-height: 21px;
    text-shadow: 1px 4px 4px rgba(0,0,0,.5);
    position: relative;
    display: inline-block;
    }
    
    .event_slider_section h2 i{
    padding-right: 10px;
    color: aquamarine;
    }
.event_slider_section ul li i{    color: red;
  color: red;
    font-size: 20px;
    float: left;
    display: inline-block;
    position: absolute;}
.event_slider_section ul li span{
        float: right;
    display: inline-block;
    padding-left: 30px;
}


/*Contact section*/
.content-header{
  font-family: 'Oleo Script', cursive;
  color:#fcc500;
  font-size: 45px;
}

.section-content{
  text-align: center; 

}
#contact{
    
    font-family: 'Teko', sans-serif;
  padding-top: 60px;
  width: 100%;
  width: 100vw;
  height: 550px;
  background: #3a6186; /* fallback for old browsers */
  background: -webkit-linear-gradient(to left, #3a6186 , #89253e); /* Chrome 10-25, Safari 5.1-6 */
  background: linear-gradient(to left, #3a6186 , #89253e); /* W3C, IE 10+/ Edge, Firefox 16+, Chrome 26+, Opera 12+, Safari 7+ */
    color : #fff;    
}
.contact-section{
  padding-top: 40px;
}
.contact-section .col-md-6{
  width: 50%;
}

.contact-section .form-line{
  border-right: 1px solid #B29999;
}

.contact-sectionc .form-group{
  margin-top: 10px;
}
.contact-section label{
  font-size: 1.3em;
  line-height: 1em;
  font-weight: normal;
}
.contact-section .form-control{
  font-size: 1.3em;
  color: #080808;
}
.contact-section textarea.form-control {
    height: 135px;
   /* margin-top: px;*/
}

.submit{
    font-size: 1.1em;
    background-color: #89263f;
    color: #fff;
}


    ::-webkit-scrollbar {
    width: 12px;
}
 
::-webkit-scrollbar-track {
    -webkit-box-shadow: inset 0 0 6px rgba(247, 247, 247, 0.5);
    border-radius: 10px;
    background-color: #fff;
}
 
::-webkit-scrollbar-thumb {
    border-radius: 10px;
        -webkit-box-shadow: inset 0 0 6px rgba(247, 247, 247, 0.5);
    background-color: #000;

}
</style>

<!--cover section slider -->
<section>
    <div class="cover_slider owl-carousel owl-theme">
        <div class="cover_item" style="background: url('assets/img/bg/slider.png');">
             <div class="slider_content">
                <div class="slider-content-inner">
                    <div class="container">
                        <div class="slider-content-leftr">
                            <h2 class="cover-title">
                                GET READY FOR
                            </h2>
                            <strong class="cover-xl-text">Exhilaration</strong>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <div class="cover_item" style="background: url('assets/img/bg/bg-img.png');">
            <div class="slider_content">
                <div class="slider-content-inner">
                    <div class="container">
                        <div class="slider-content-left">
                            <h2 class="cover-title">
                                GET READY FOR
                            </h2>
                            <strong class="cover-xl-text">FUN</strong>
                        </div>
                    </div>
                </div>
            </div>
        </div>  
         <div class="cover_item" style="background: url('assets/img/bg/slider.png');">
            <div class="slider_content">
                <div class="slider-content-inner">
                    <div class="container">
                        <div class="slider-content-left">
                            <h2 class="cover-title">
                                GET READY FOR
                            </h2>
                            <strong class="cover-xl-text">EXCITEMENT</strong>
                        </div>
                    </div>
                </div>
            </div>
        </div>     
    </div>
    <div class="cover_nav">
        <ul class="cover_dots">
            <li class="active" data="0"><span>1</span></li>
            <li  data="1"><span>2</span></li>
            <li  data="2"><span>3</span></li>
        </ul>
    </div>
   
</section>



<!--event calender-->
<section class="pt100 pb100" id="event_section">
    
    <div class="container">
        <div class="table-responsive">
            <table class="event_calender table">
                <thead class="event_title">
                <tr>
                    <th>
                        <i class="ion-ios-calendar-outline"></i>
                        <span>next events calendar</span>
                    </th>
                    <th></th>
                    <th></th>
                    <th></th>
                    <th></th>
                </tr>
                </thead>
                <tbody>
<%
String sql2= "select * from ROHAN.events where dt > sysdate";
PreparedStatement st= DBConnection.getCon().prepareStatement(sql2);
ResultSet rs= st.executeQuery();
ResultSetMetaData col= rs.getMetaData();
int t= col.getColumnCount(); 
for(int i=1; i<=t; ++i)
{
	col.getColumnName(i);
}
while(rs.next())  
{  
	%>
                <tr>
                <td class="event_date">
                      <%=rs.getDate(2) %>
                    </td>
                    <td>
                        <div class="event_place">
                            <h5 style="text-transform:uppercase;"><%=rs.getString(1) %></h5>
                        </div>
                    </td>
                    <td class="event_date">
                    <h5 style="text-transform:uppercase;"><%=rs.getString(3) %></h5>
                    </td>
                    <td class="buy_link">
                       
                    </td>
                </tr>
           
                <%
}
%>
                </tbody>
            </table>
        </div>
    </div>
</section>
<section class="bg-img pt100 pb100" id="Aboutus_section" style="background-image: url('assets/img/bg/tickets.png');">
    <div class="container">
        <div class="section_title mb30" >
            <h3 class="title color-light">
                About Us
            </h3>
        </div>
        <div class="row justify-content-center align-items-center">
            <div class="col-md-6 text-md-left text-center color-light">
              The motive behind the project is to develop an application which will dedicated for the purpose, Event organizers create schedules for events using android app interface and assign student coordinators at the time of creation of schedule. The students can register on the application and some of them register as coordinators. Only events organizers and coordinators can upload event related information on the application. The participants can view events on application and they can apply online.

            </div>
           
        </div>
    </div>
</section>

<section id="contact">
            <div class="section-content">
                <h1 class="section-header">Get in <span class="content-header wow fadeIn " data-wow-delay="0.2s" data-wow-duration="2s"> Touch with us</span></h1>
            </div>
            <div class="contact-section">
            <div class="container">
                <form>
                   <div class="row">
                        <div class="col-md-6 form-line">
                        <div class="form-group">
                            <label for="exampleInputUsername">Your name</label>
                            <input type="text" class="form-control" id="" placeholder=" Enter Name">
                        </div>
                        <div class="form-group">
                            <label for="exampleInputEmail">Email Address</label>
                            <input type="email" class="form-control" id="exampleInputEmail" placeholder=" Enter Email id">
                        </div>  
                        <div class="form-group">
                            <label for="telephone">Mobile No.</label>
                            <input type="tel" class="form-control" id="telephone" placeholder=" Enter 10-digit mobile no.">
                        </div>
                    </div>
                    <div class="col-md-6">
                        <div class="form-group">
                            <label for ="description"> Message</label>
                            <textarea  class="form-control" id="description" placeholder="Enter Your Message"></textarea>
                        </div>
                        <div>
                            <button type="button" class="btn btn-default submit"><i class="fa fa-paper-plane" aria-hidden="true"></i>  Send Message</button>
                        </div>
                        
                    </div>
                   </div>
                </form>
            </div>
        </div>
        </section>


<!--event calender end -->

<!--brands section -->

<!--brands section end-->

<!--get tickets section -->
<section class="bg-img pt100 pb100" style="background-image: url('assets/img/bg/tickets.png');">
    <div class="container">
        <div class="section_title mb30">
            <h3 class="title color-light">
                GEt your tikets
            </h3>
        </div>
        <div class="row justify-content-center align-items-center">
            <div class="col-md-9 text-md-left text-center color-light">
              <p style="font: italic bold 25px/30px Georgia, serif;"> We provide a hassle free booking of all the college events and our team thrives for the best customer support.</p> 
               </div>
            <div class="col-md-3 text-md-right text-center">
                <a href="/EventManagement/SignUp.jsp" class="btn btn-primary btn-rounded mt30">Register Now</a>
            </div>
        </div>
    </div>
</section>
<!--get tickets section end-->

<!--footer start -->
<footer>
    <div class="container">
        <div class="row justify-content-center">

            <div class="col-md-4 col-12">
                <div class="footer_box">
                    <div class="footer_header">
                        <div class="footer_logo">
                            <img src="assets/img/logo.png" alt="evento">
                        </div>
                    </div>
                    <div class="footer_box_body">
         
                        <ul class="footer_social">
                            <li>
                                <a href="#"><i class="ion-social-pinterest"></i></a>
                            </li>
                            <li>
                                <a href="#"><i class="ion-social-facebook"></i></a>
                            </li>
                            <li>
                                <a href="#"><i class="ion-social-twitter"></i></a>
                            </li>
                            <li>
                                <a href="#"><i class="ion-social-dribbble"></i></a>
                            </li>
                            <li>
                                <a href="#"><i class="ion-social-instagram"></i></a>
                            </li>
                        </ul>
                    </div>
                </div>
            </div>

            <div class="col-12 col-md-4">
                <div class="footer_box">
                    
                    <div class="footer_box_body">
                        <ul class="instagram_list">
                            <li>
                                <a href="#">
                                    <img src="assets/img/cleander/c1.png" alt="instagram">
                                </a>
                            </li>
                            <li>
                                <a href="#">
                                    <img src="assets/img/cleander/c2.png" alt="instagram">
                                </a>
                            </li>
                            <li>
                                <a href="#">
                                    <img src="assets/img/cleander/c3.png" alt="instagram">
                                </a>
                            </li>
                            <li>
                                <a href="#">
                                    <img src="assets/img/cleander/c3.png" alt="instagram">
                                </a>
                            </li>
                            <li>
                                <a href="#">
                                    <img src="assets/img/cleander/c2.png" alt="instagram">
                                </a>
                            </li>
                            <li>
                                <a href="#">
                                    <img src="assets/img/cleander/c1.png" alt="instagram">
                                </a>
                            </li>
                        </ul>
                    </div>
                </div>
            </div>

            <div class="col-12 col-md-4" id="contact_section">
                <div class="footer_box">
                    <div class="footer_header">
                        <h4 class="footer_title">
                            Contact Us
                        </h4>
                    </div>
                    <div class="footer_box_body">
                        <div class="newsletter_form">
                            <input type="text" class="form-control" placeholder="Full Name">
                            <input type="email" class="form-control" placeholder="E-Mail here">
                            <textarea name="" class="form-control" id="" cols="30" rows="3" style="min-height: 90px;"  placeholder="Message"></textarea>

                            <button class="btn btn-rounded btn-block btn-primary">SUBMIT</button>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</footer>
<div class="copyright_footer">
    <div class="container">
        <div class="row justify-content-center">
            <div class="col-md-6 col-12">
                <p><!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. -->
Copyright &copy;<script>document.write(new Date().getFullYear());</script> All rights reserved | Evento 
<!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. --></p>
            </div>
            <div class="col-12 col-md-6 ">
                <ul class="footer_menu">
                    <li>
                        <a href="#">Home</a>
                    </li>
                   
                    <li>
                        <a href="#Aboutus_section">About Us</a>
                    </li>
                     <li>
                        <a href="#contact_section">Contact</a>
                    </li>
                </ul>
            </div>
        </div>
    </div>
</div>
<!--footer end -->

<!-- jquery -->
<script src="assets/js/jquery.min.js"></script>
<!-- bootstrap -->
<script src="assets/js/popper.js"></script>
<script src="assets/js/bootstrap.min.js"></script>
<script src="assets/js/waypoints.min.js"></script>
<!--slick carousel -->
<script src="assets/js/owl.carousel.min.js"></script>
<!--parallax -->
<script src="assets/js/parallax.min.js"></script>
<!--Counter up -->
<script src="assets/js/jquery.counterup.min.js"></script>
<!--Counter down -->
<script src="assets/js/jquery.countdown.min.js"></script>
<!-- WOW JS -->
<script src="assets/js/wow.min.js"></script>
<!-- Custom js -->
<script src="assets/js/main.js"></script>
</body>
</html>
