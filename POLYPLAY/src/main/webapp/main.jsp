<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
  

<html lang="en">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
<!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
<meta name="description" content="">
<meta name="author" content="">
<link rel="icon" href=" ">
<title>Poly Play</title>

<!-- Bootstrap core CSS -->
<link href="resources/plugins/css/bootstrap.min.css" rel="stylesheet">
<!-- Custom styles for this template -->
<link href="resources/plugins/css/custom.css" rel="stylesheet">

<!-- Helper Styles -->
<link href="resources/plugins/css/loaders.css" rel="stylesheet">
<link href="resources/plugins/css/swiper.min.css" rel="stylesheet">
<link rel="stylesheet" href="resources/plugins/css/animate.min.css">
<link rel="stylesheet" href="resources/plugins/css/nivo-lightbox.css">
<link rel="stylesheet" href="resources/plugins/css/nivo_themes/default/default.css">
<script src="http://code.jquery.com/jquery-1.10.2.js"></script>
<!-- Font Awesome Style -->
<link href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" rel="stylesheet" integrity="sha384-wvfXpqpZZVQGK6TAh5PVlGOfQNHSoD2xbE+QkPxCAFlNEevoEH3Sl0sibVcOQVnN" crossorigin="anonymous">
</head>
<body>
<div class="loader loader-bg">
  <div class="loader-inner ball-clip-rotate-pulse">
    <div></div>
    <div></div>
  </div>
</div>

<!-- Top Navigation -->
    <nav class="navbar navbar-toggleable-md mb-4 top-bar navbar-static-top sps sps--abv">
        <div class="container">
      <button class="navbar-toggler navbar-toggler-right" type="button" data-toggle="collapse" data-target="#navbarCollapse1" aria-controls="navbarCollapse" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
      </button>
      <a class="navbar-brand1" href="#">Poly<span>Play</span></a>
      <div class="collapse navbar-collapse" id="navbarCollapse1">
        <ul class="navbar-nav ml-auto">
         <li class="nav-item active"> <a class="nav-link1" href="#myCarousel">Home<span class="sr-only">(current)</span></a> </li>
        <li class="dropdown nav-item">
                      <a href="#pablo" class="dropdown-toggle nav-link1" data-toggle="dropdown">Dropdown</a>
                      <div class="dropdown-menu">
                        <h6 class="dropdown-header">Dropdown header</h6>
                        <a href="#pablo" class="dropdown-item">Action</a>
                        <a href="#pablo" class="dropdown-item">Another action</a>
                        <a href="#pablo" class="dropdown-item">Something else here</a>
                        <div class="dropdown-divider"></div>
                        <a href="#pablo" class="dropdown-item">Separated link</a>
                        <div class="dropdown-divider"></div>
                        <a href="#pablo" class="dropdown-item">One more separated link</a>
                      </div>
                    </li>
        <li class="nav-item"> <a class="nav-link1" href="${pageContext.request.contextPath}/ContentsList?gidx=1">액션</a> </li>
        <li class="nav-item"> <a class="nav-link1" href="${pageContext.request.contextPath}/ContentsList?gidx=2">스릴러</a> </li>
        <li class="nav-item"> <a class="nav-link1" href="${pageContext.request.contextPath}/ContentsList?gidx=3">SF판타지</a> </li>
        <li class="nav-item"> <a class="nav-link1" href="#gallery">Image Gallery</a> </li>
        <li class="nav-item"> <a class="nav-link1" href="#contact">Contact</a> </li>
        </ul>
      </div>
            </div>
    </nav>

    
<!-- Swiper Silder
    ================================================== --> 
<!-- Slider main container -->
<!--배너 파트  -->
<div class="swiper-container main-slider" id="myCarousel">
  <div class="swiper-wrapper">
    <div class="swiper-slide slider-bg-position" style="background:url('resources/image/test1.jpg')" data-hash="slide1">
      <h2>배너</h2>
    </div>
    <div class="swiper-slide slider-bg-position" style="background:url('resources/image/test2.png')" data-hash="slide2">
      <h2>배너</h2>
    </div>
  </div>
  <!-- Add Pagination -->
  <div class="swiper-pagination"></div>
  <!-- Add Navigation -->
  <div class="swiper-button-prev"><i class="fa fa-chevron-left"></i></div>
  <div class="swiper-button-next"><i class="fa fa-chevron-right"></i></div>
</div>

<!-- Benefits
    ================================================== -->
<section class="service-sec" id="benefits">
  <div class="container">
    <div class="row">
        <div class="col-md-12">
            <div class="heading text-md-center text-xs-center">
      <h2><small>최근 업데이트 된 작품</small>지금 구매하세요</h2>
    </div>
        </div>
      <div class="col-md-8">
        <div class="row">
            <div class="col-md-6 text-sm-center service-block"> <i class="fa fa-plus" aria-hidden="true"></i>
          <h3>Better Sleep</h3>
          <p>Never in all their history have men been able truly to conceive of the world as one: a single sphere, a globe, having the qualities of a globe.</p>
        	<p>
        
        </div>
        <div class="col-md-6 text-sm-center service-block"> <i class="fa fa-leaf" aria-hidden="true"></i>
          <h3>Reduces Weight</h3>
          <p>Never in all their history have men been able truly to conceive of the world as one: a single sphere, a globe, having the qualities of a globe.</p>
        </div>
        <div class="col-md-6 text-sm-center service-block"> <i class="fa fa-leaf" aria-hidden="true"></i>
          <h3>Improves Mood</h3>
          <p>Never in all their history have men been able truly to conceive of the world as one: a single sphere, a globe, having the qualities of a globe.</p>
        </div>
        <div class="col-md-6 text-sm-center service-block"> <i class="fa fa-bell" aria-hidden="true"></i>
          <h3>Boosts Energy</h3>
          <p>Never in all their history have men been able truly to conceive of the world as one: a single sphere, a globe, having the qualities of a globe.</p>
        </div>
        </div>
      </div>
      <div class="col-md-4"> <img src="img/side-01.jpg" class="img-fluid" /> </div>
    </div>
    <!-- /.row --> 
  </div>
</section>

<!-- About 
    ================================================== -->
<section class="about-sec parallax-section" id="about">
  <div class="container">
    <div class="row">
      <div class="col-md-3">
        <h2><small>Who We Are</small>About<br>
          Our Blog</h2>
      </div>
      <div class="col-md-4">
        <p>To enjoy good health, to bring true happiness to one's family, to bring peace to all, one must first discipline and control one's own mind. If a man can control his mind he can find the way to Enlightenment, and all wisdom and virtue will naturally come to him.</p>
        <p>Saving our planet, lifting people out of poverty, advancing economic growth... these are one and the same fight. We must connect the dots between climate change, water scarcity, energy shortages, global health, food security and women's empowerment. Solutions to one problem must be solutions for all.</p>
      </div>
      <div class="col-md-4">
        <p>Our greatest happiness does not depend on the condition of life in which chance has placed us, but is always the result of a good conscience, good health, occupation, and freedom in all just pursuits.</p>
        <p>Being in control of your life and having realistic expectations about your day-to-day challenges are the keys to stress management, which is perhaps the most important ingredient to living a happy, healthy and rewarding life.</p>
        <p><a href="#" class="btn btn-transparent-white btn-capsul">Explore More</a></p>
      </div>
    </div>
  </div>
</section>

<!-- BLOG
    ================================================== -->

<section class="blog-sec" id="blog">
  <div class="container">
      <div class="row">
          <div class="col-md-12">
    <div class="heading text-md-center text-xs-center">
      <h2><small>Get Tips and Tricks</small>Our Blog</h2>
    </div>
    </div>
      <div class="col-md-4 blog-box">
        <div class="blog-image-block"> <img src="img/blog-01.jpg" alt="" class="img-fluid"> </div>
        <h3 class="blog-title"><small>Tips</small><a href="#">Calm mind brings inner strength</a></h3>
        <p class="blog-content">Our greatest happiness does not depend on the condition of life</p>
      </div>
      <div class="col-md-4 blog-box">
        <div class="blog-image-block"> <img src="img/blog-02.jpg" alt="" class="img-fluid"> </div>
        <h3 class="blog-title"><small>Benefits</small><a href="#">Happiness is nothing more than good health</a></h3>
        <p class="blog-content">Our greatest happiness does not depend on the condition of life</p>
      </div>
      <div class="col-md-4 blog-box">
        <div class="blog-image-block"> <img src="img/blog-03.jpg" alt="" class="img-fluid"> </div>
        <h3 class="blog-title"><small>Products</small><a href="#">Being all equal and independent</a></h3>
        <p class="blog-content">Our greatest happiness does not depend on the condition of life</p>
      </div>
    </div>
  </div>
</section>

<!-- VIDEO
    ================================================== -->
<section class="video-sec parallax-section">
  <div class="overlay"></div>
  <div class="container">
    <div class="row">
      <div class="col-md-12">
        <h2 class="wow fadeInUp" data-wow-delay="0.5s">Watch the video<small>Without health life is not life; it is only a state of langour and suffering - an image of death.</small></h2>
        <a href="#" ><i class="fa fa-play"></i></a> <small><em>Video by: Health Tips</em></small> </div>
    </div>
  </div>
</section>
<section class="gallery-sec" id="gallery">
  <div class="container">
      <div class="row">
          <div class="col-md-12">
    <div class="heading text-md-center text-xs-center">
      <h2><small>Stroy Through Images</small>Fitness Image Gallery</h2>
    </div>
    </div>
      <div class="col-md-12"> 
        <!-- iso section -->
        <div class="iso-section text-md-center text-xs-center" data-wow-delay="0.5">
          <ul class="filter-wrapper clearfix">
            <li><a href="#" data-filter="*" class="selected opc-main-bg">All</a></li>
            <li><a href="#" class="opc-main-bg" data-filter=".london">London</a></li>
            <li><a href="#" class="opc-main-bg" data-filter=".paris">Paris</a></li>
            <li><a href="#" class="opc-main-bg" data-filter=".ny">New York</a></li>
            <li><a href="#" class="opc-main-bg" data-filter=".hn">Hong Kong</a></li>
          </ul>
          
          <!-- iso box section -->
          <div class="iso-box-section wow fadeInUp" data-wow-delay="0.9s">
            <div class="iso-box-wrapper col4-iso-box">
              <div class="iso-box london paris ny col-md-4 col-sm-6">
                <div class="gallery-thumb"> <a href="img/photo-gallery-01.jpg" data-lightbox-gallery="food-gallery"> <img src="img/photo-gallery-01.jpg" class="fluid-img" alt="Gallery">
                  <div class="gallery-overlay">
                    <div class="gallery-item"> <i class="fa fa-search"></i> </div>
                  </div>
                  </a> </div>
              </div>
              <div class="iso-box london ny hn col-md-4 col-sm-6">
                <div class="gallery-thumb"> <a href="img/photo-gallery-02.jpg" data-lightbox-gallery="food-gallery"> <img src="img/photo-gallery-02.jpg" class="fluid-img" alt="Gallery">
                  <div class="gallery-overlay">
                    <div class="gallery-item"> <i class="fa fa-search"></i> </div>
                  </div>
                  </a> </div>
              </div>
              <div class="iso-box hn col-md-4 col-sm-6">
                <div class="gallery-thumb"> <a href="img/photo-gallery-03.jpg" data-lightbox-gallery="food-gallery"> <img src="img/photo-gallery-03.jpg" class="fluid-img" alt="Gallery">
                  <div class="gallery-overlay">
                    <div class="gallery-item"> <i class="fa fa-search"></i> </div>
                  </div>
                  </a> </div>
              </div>
              <div class="iso-box london col-md-4 col-sm-6">
                <div class="gallery-thumb"> <a href="img/photo-gallery-04.jpg" data-lightbox-gallery="food-gallery"> <img src="img/photo-gallery-04.jpg" class="fluid-img" alt="Gallery">
                  <div class="gallery-overlay">
                    <div class="gallery-item"> <i class="fa fa-search"></i> </div>
                  </div>
                  </a> </div>
              </div>
              <div class="iso-box ny col-md-4 col-sm-6">
                <div class="gallery-thumb"> <a href="img/photo-gallery-05.jpg" data-lightbox-gallery="food-gallery"> <img src="img/photo-gallery-05.jpg" class="fluid-img" alt="Gallery">
                  <div class="gallery-overlay">
                    <div class="gallery-item"> <i class="fa fa-search"></i> </div>
                  </div>
                  </a> </div>
              </div>
              <div class="iso-box paris lunch col-md-4 col-sm-6">
                <div class="gallery-thumb"> <a href="img/photo-gallery-06.jpg" data-lightbox-gallery="food-gallery"> <img src="img/photo-gallery-06.jpg" class="fluid-img" alt="Gallery">
                  <div class="gallery-overlay">
                    <div class="gallery-item"> <i class="fa fa-search"></i> </div>
                  </div>
                  </a> </div>
              </div>
            </div>
          </div>
        </div>
      </div>
    </div>
  </div>
</section>
<section class="contact-sec" id="contact">
  <div class="container">
    <h2>Get in Touch <small>Our work is the presentation of our capabilities.</small> </h2>
    <div class="row">
      <div class="col-md-4">
        <div class="form-group">
          <label for="exampleName">Name</label>
          <input type="text" class="form-control" id="exampleName" aria-describedby="emailHelp">
        </div>
      </div>
      <div class="col-md-4">
        <div class="form-group">
          <label for="examplePhone">Phone Number</label>
          <input type="text" class="form-control" id="examplePhone" aria-describedby="emailHelp">
        </div>
      </div>
      <div class="col-md-4">
        <div class="form-group">
          <label for="exampleInputEmail1">Email address</label>
          <input type="email" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp">
          <small id="emailHelp" class="form-text text-muted">We'll never share your email with anyone else.</small> </div>
      </div>
      <div class="col-md-12">
        <label for="exampleTextarea">Enter your Message</label>
        <textarea class="form-control" id="exampleTextarea" rows="3"></textarea>
      </div>
      <div class="col-md-12 text-xs-center action-block"> <a href="#" class="btn btn-capsul btn-aqua">Submit</a> </div>
    </div>
  </div>
</section>
<footer>
  <div class="container">
    <div class="row">
      <div class="col-md-2 col-sm-4">
        <ul>
          <li><a href="#">Home</a></li>
          <li><a href="#">Benefits</a></li>
          <li><a href="#">About</a></li>
        </ul>
      </div>
      <div class="col-md-2 col-sm-4">
        <ul>
          <li><a href="#">Blog</a></li>
          <li><a href="#">Image Gallery</a></li>
          <li><a href="#">Contact</a></li>
        </ul>
      </div>
      <div class="col-md-2 col-sm-4">
        <ul>
          <li><a href="#">Privacy Policy</a></li>
          <li><a href="#">Term and Services</a></li>
          <li><a href="#">About Burnout</a></li>
        </ul>
      </div>
      <div class="col-md-6 col-sm-12">
        <h2>About our Blog</h2>
        <p>To enjoy good health, to bring true happiness to one's family, to bring peace to all, one must first discipline and control one's own mind. If a man can control his mind he can find the way to Enlightenment.</p>
      </div>
    </div>
    <div class="row copy-footer">
      <div class="col-sm-6 col-md-3"> &copy;<script type="text/javascript">document.write(new Date().getFullYear());</script> <a target="_blank" rel="nofollow" href="https://grafreez.com/"></a> Grafreez.com </div>
      <div class="col-sm-6 col-md-3 pull-right text-xs-right">Created with <i class="fa fa-heart"></i></div>
    </div>
  </div>
</footer>

<!-- Bootstrap core JavaScript
    ================================================== --> 
<!-- Placed at the end of the document so the pages load faster --> 
<script src="resources/plugins/js/jquery.min.js" ></script> 
<script src="resources/plugins/js/bootstrap.min.js"></script> 
<script src="resources/plugins/js/scrollPosStyler.js"></script> 
<script src="resources/plugins/js/swiper.min.js"></script> 
<script src="resources/plugins/js/isotope.min.js"></script> 
<script src="resources/plugins/js/nivo-lightbox.min.js"></script> 
<script src="resources/plugins/js/wow.min.js"></script> 
<script src="resources/plugins/js/core.js"></script> 

<!-- IE10 viewport hack for Surface/desktop Windows 8 bug --> 
<script src="../../assets/js/ie10-viewport-bug-workaround.js"></script>
</body>
</html>
