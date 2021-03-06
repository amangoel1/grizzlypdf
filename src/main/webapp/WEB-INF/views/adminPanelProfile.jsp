<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Admin Profile</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
    <link href="https://cdnjs.cloudflare.com/ajax/libs/mdbootstrap/4.7.5/css/mdb.min.css" rel="stylesheet">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
    <link rel="stylesheet" href="resources/css/styles.css"/>
    <link rel="stylesheet" href="resources/css/adminStyles.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
    <script src="resources/js/adminPanel.js"></script>

</head>

<body class="admin-body">
    <div>
      
            <nav class="navbar  navbar-dark navbar-custom  navbar-expand-lg  fixed-top "  >
            <div class="logo">
                    <a href="adminpanel.html">
                <img  src="resources/images/admin-logo.png" />
                </a>
            </div>
                <button class="navbar-toggler navbar-toggler-right" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                  <span class="navbar-toggler-icon"></span>
                </button>
              
                <div class="collapse navbar-collapse" id="navbarSupportedContent">
                  <ul class="navbar-nav mr-auto">
                    <li>
                                <h1 class="text-white align-bottom mx-3 my-2">Home Service</h1>
                    </li>
                        
                    <li class="nav-item ">
                      <input class=" search " type="search" placeholder="Search" aria-label="Search"><a><i id="nav_search_icon" class="fa fa-search" href="search.html"></i></a>
                    </li>

                 

                  </ul>
                  
                    <form class="form-inline my-2 my-lg-0 ">

                        <div class="btn-group show-on-hover mr-1"   >
                            <button type="button" class="btn btn-Dark " data-toggle="dropdown" >
                                    <a href="#" class="notification mg-35 ">
                                            <span><i class="fa fa-bell"></i></span>
                                            <span class="badge">0</span>
                                    </a>
                                <span class="caret"></span>
                            </button>
                            <ul class="dropdown-menu" style="padding: 25px; background-color: rgb(88, 103, 133);max-height:350px;overflow-y: auto;"  role="menu">
                                <li style="width:200px;"><a href="#" style="color: white" >Irfan has accept your request</a></li>
                                <hr>
                                <li style="width:200px;"><a href="#" style="color: white" >Irfan has accept your request</a></li>
                                 <hr>
                                 <li style="width:200px;"><a href="#" style="color:white" >Irfan has accept your request</a></li>
                                 <hr>
                                 <li style="width:200px;"><a href="#" style="color: white" >Irfan has accept your request</a></li>
                                 <hr>
                                 <li style="width:200px;"><a href="#" style="color: white" >Irfan has accept your request</a></li>
                        </ul>
                        </div>
                        
                        <a href="#" class="btn btn-primary logout-btn btn-sm">
                            <span class="fa fa-sign-out my-2 mr-3"></span> Log out
                        </a>
                            
                    </form>
                 
                </div>
              </nav>
        </div>
              
              <button class="toggle_btn hide-large" onclick="openSidebar()" >&#9776;</button>
              <div class="sidenav sidenav-collapse  "  id="mySidenav">
                
                  <a href="javascript:void(0)" class="closebtn hide-large" onclick="closeSidebar()" >&times;</a>
                  <div class="d-inline-flex  "> 
                  <img src="resources/images/profile.png"  class="profile_pic"> <label class="p-2">Mandeep <br><small>Admin</small> </label>
                  </div>

                  <a href="adminpanel.html" active>Dashboard</a>
                  <a href="#" class="active">Profile</a>
                  <a href="adminPanelService.html">Services</a>
                  <a href="adminPanelRequest.html">Requests</a>
                  
              </div> 

              <div class="content " >
                <div class=" container col-sm-12 details border">
                    
                    <h2 > Update Details</h2>
                    <div class"container">
                        <form action = "updateAdmin.html" method = "post">
                            <div class="row m-3 ">
                              <div class="col">
                                <input type="text" class="form-control border-bottom" placeholder="First name" name = "firstName">
                              </div>
                              <div class="col">
                                <input type="text" class="form-control border-bottom" placeholder="Last name" name = "lastName">
                              </div>
                            </div>
                            <div class="row mx-3">
                                <div class="col">
                                  <input type="text" class="form-control border-bottom" placeholder="Contact" name = "contactNumber">
                                </div>
                                <div class="col">
                                  <input type="text" class="form-control border-bottom" placeholder="Email" name = "email">
                                </div>
                            </div >
                            <div class="row m-3">
                                <div class="col">
                                        <input type="password" class="form-control border-bottom" placeholder="Current Password" name= "pwd">
                                </div>
                            </div>

                            <div class="row mx-3">
                                <div class="col ">
                                   <button type="submit" class="btn btn-primary update-profile ">Update Profile</button>
                                </div>
                            </div>
                          </form>
                            
                    </div>
                
                </div>
                  
                <div class="card">
                            <img src="resources/images/cover_image.jfif" alt="John" style="width:100%">
                            <img src="images/profile.png" class="profile">
                            <h1>Mandeep</h1>
                            <p class="title">Admin and Developer, </p>
                            <p>Lovely Professional University</p>
                            <div style="margin: 24px 0;">
                              
                              <a href="#"><i class="fa fa-twitter"></i></a>  
                              <a href="#"><i class="fa fa-linkedin"></i></a>  
                              <a href="#"><i class="fa fa-facebook"></i></a> 
                            </div>
                            <p><button class="bottom-btn">Contact</button></p>
                          </div>
              </div> 
             
            

              </body>
</html>