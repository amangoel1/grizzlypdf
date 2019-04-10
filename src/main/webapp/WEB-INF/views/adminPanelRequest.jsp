<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
          <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Request</title>
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
        <nav class="navbar  navbar-custom navbar-dark navbar-expand-lg  fixed-top "  >
            <div class="logo">
                <a href="adminpanel.html">
                    <img  src="resources/images/admin-logo.png" />
                    </a>
            </div>
                <button class="navbar-toggler navbar-toggler-right" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                  <span class="navbar-toggler-icon"></span>
                </button>
              
                <div class="collapse navbar-collapse " id="navbarSupportedContent">
                  <ul class="navbar-nav mr-auto">
                    <li class="nav-item">
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
                        <a href="#" class="btn btn-primary  logout-btn btn-sm">
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

                  <a href="adminpanel.html" >Dashboard</a>
                  <a href="adminPanelProfile.html" > Profile</a>
                  <a href="adminPanelService.html">Services</a>
                  <a href="#" class="active">Requests</a>
                  
              </div> 
              

                

              
                    
                
               <div class="content " >
                    <div class="table-responsive scroll">
                    
                          
                    <div class="table-responsive">
                    <div class="top-head-table border"> Requests </div>
                   
                    <table class="table w-75">
                       <thead  >
                         <tr>
                           <th scope="col">User Id</th>
                           <th scope="col">Service Type</th>
                           <th scope="col">Description</th>
                           <th scope="col">Time</th>
                           <th scope="col">Date</th>
                           <th scope="col">Action</th>
                         </tr>
                       </thead>
                       <tbody>
                       <c:forEach  var="request"  items= "${requestList}">
                         <tr>
                           <td >${request.userId}</td>
                            <td ><c:if test="${request.serviceType == 'E'}">
 								Electrical
								</c:if>
								<c:if test="${request.serviceType == 'P'}">
 								Plumbing
								</c:if>
								<c:if test="${request.serviceType == 'M'}">
 								Mechanical
								</c:if>
                           <td>${request.description}</td>
                           <td>${request.time}</td>
                           <td>${request.date}</td>
                           <td><a href="adminAssignTask.html?requestId=${request.requestId }">Assign Worker</a></td>
                           
                         </tr>
                         </c:forEach>
                                          </tbody>
                     </table>
                    </div> 
</div>
                     <div class="modal fade" id="electrician" role="dialog">
                            <div class="modal-dialog">
                            
                              <!-- Modal content-->
                              <div class="modal-content">
                                <div class="modal-header">
                                        <h4 class="modal-title">Electrician list</h4>
                                  <button type="button" class="close" data-dismiss="modal">&times;</button>
                                  
                                </div>
                                <div class="modal-body">
                                    <div class="scroll">
                                        <table class="modal-table">
                                                <thead >
                                                  <tr >
                                                    <th colspan="2" >Available Workers</th>
                                                  </tr>
                                                </thead>
                                                <tbody>
                                                  <tr>
                                                    <td ><input type="radio" name="gender" value="male">Kailash</td>
                                                    <td><input type="radio" name="gender" value="male">Manish</td>
                                                    
                                                  </tr>
                                                  <tr>
                                                      <td ><input type="radio" name="gender" value="male">Aakash</td>
                                                      <td><input type="radio" name="gender" value="male">Manpreet</td>
                                                      
                                                  </tr>

                                                  <tr>
                                                        <td ><input type="radio" name="gender" value="male">Aakash</td>
                                                        <td><input type="radio" name="gender" value="male">Manpreet</td>
                                                        
                                                    </tr>
                                                    <tr>
                                                        <td ><input type="radio" name="gender" value="male">Aakash</td>
                                                        <td><input type="radio" name="gender" value="male">Manpreet</td>
                                                        
                                                    </tr>
                                                    <tr>
                                                        <td ><input type="radio" name="gender" value="male">Aakash</td>
                                                        <td><input type="radio" name="gender" value="male">Manpreet</td>
                                                        
                                                    </tr>
                                                    <tr>
                                                        <td ><input type="radio" name="gender" value="male">Aakash</td>
                                                        <td><input type="radio" name="gender" value="male">Manpreet</td>
                                                        
                                                    </tr>
                                                    <tr>
                                                        <td ><input type="radio" name="gender" value="male">Aakash</td>
                                                        <td><input type="radio" name="gender" value="male">Manpreet</td>
                                                        
                                                    </tr>
                                                    <tr>
                                                        <td ><input type="radio" name="gender" value="male">Aakash</td>
                                                        <td><input type="radio" name="gender" value="male">Manpreet</td>
                                                        
                                                    </tr>
                                                  
                                                    
                                                  
                                            </tbody>
                                            </table>
                                            </div>
                                            <button class="asign-btn">Asssign Worker</button>
                                </div>
                                
                              </div>
                              
                            </div>
                          </div>

                          <div class="modal fade" id="plumber" role="dialog">
                                <div class="modal-dialog">
                                
                                  <!-- Modal content-->
                                  <div class="modal-content">
                                    <div class="modal-header">
                                            <h4 class="modal-title">Plumbers List</h4>
                                      <button type="button" class="close" data-dismiss="modal">&times;</button>
                                      
                                    </div>
                                    <div class="modal-body">
                                            <table class="modal-table">
                                                    <thead >
                                                      <tr >
                                                        <th colspan="2" >Available Workers</th>
                                                      </tr>
                                                    </thead>
                                                    <tbody>
                                                      <tr>
                                                        <td ><input type="radio" name="gender" value="male">Kailash</td>
                                                        <td><input type="radio" name="gender" value="male">Manish</td>
                                                        
                                                      </tr>
                                                      <tr>
                                                          <td ><input type="radio" name="gender" value="male">Aakash</td>
                                                          <td><input type="radio" name="gender" value="male">Manpreet</td>
                                                          
                                                      </tr>
                                                      
                                                </tbody>
                                                </table>
                                                <button class="asign-btn">Asssign Worker</button>
                                    </div>
                                    
                                  </div>
                                  
                                </div>
                              </div>

                              <div class="modal fade" id="mechanic" role="dialog">
                                    <div class="modal-dialog">
                                    
                                      <!-- Modal content-->
                                      <div class="modal-content">
                                        <div class="modal-header">
                                                <h4 class="modal-title">Mechanic List</h4>
                                          <button type="button" class="close" data-dismiss="modal">&times;</button>
                                          
                                        </div>
                                        <div class="modal-body">
                                                <table class="modal-table">
                                                        <thead >
                                                          <tr >
                                                            <th colspan="2" >Available Workers</th>
                                                          </tr>
                                                        </thead>
                                                        <tbody>
                                                          <tr>
                                                            <td ><input type="radio" name="gender" value="male">Kailash</td>
                                                            <td><input type="radio" name="gender" value="male">Manish</td>
                                                            
                                                          </tr>
                                                          <tr>
                                                              <td ><input type="radio" name="gender" value="male">Aakash</td>
                                                              <td><input type="radio" name="gender" value="male">Manpreet</td>
                                                              
                                                          </tr>


                                                          
                                                          
                                                    </tbody>
                                                    </table>
                                                    <button class="asign-btn">Asssign Worker</button>
                                        </div>
                                        
                                      </div>
                                      
                                    </div>
                                  </div>
                 
               </div>
            

              </body>
</html>