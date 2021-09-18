<!DOCTYPE html>
<html xmlns:th="http://www.thymeleaf.org">
<head>
	<meta charset="ISO-8859-1">
	<title>Home Page</title>
	<link rel="stylesheet" type="text/css" href="/webjars/bootstrap/css/bootstrap.min.css" />
	<script type="text/javascript" src="/webjars/jquery/jquery.min.js"></script>
	<script type="text/javascript" src="/webjars/bootstrap/js/bootstrap.min.js"></script>
</head>
<body>
 
    <div class="mx-auto" style="margin-left: 200px;" width="700" height="350" >
        <img src="file:///Users/aashmansrivastava/Desktop/Screenshot%202021-07-07%20at%2011.25.11%20AM.png" class="img-fluid" >
          </div>

     <!-- header ends -->
 
 
     <!-- hero section start -->
     <div class="container givespace">
		<div class="row">
			<div class="col">
				<img src="https://i.ibb.co/yY8V74S/Screenshot-2021-06-29-at-1-02-05-PM.png" class="img-fluid">
			</div>

            
            <div class="col">
                <h1>Enter User Details</h1>
                <form method = "POST" action = "/users" enctype="multipart/form-data">
  
                    <div class="mb-3">
                        <label for="exampleInputEmail1" class="form-label">Name</label>
                        <input type="text" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp">
                        <div id="emailHelp" class="form-text"></div>
                    </div>

                   

                    <div class="mb-3">
                       <label for="exampleInputPassword1" class="form-label">Email Address</label>
                       <input type="email" class="form-control" id="exampleInputPassword1">
                   </div>

                   <div class="mb-3">
                       <label for="exampleInputPassword1" class="form-label">Password</label>
                       <input type="password" class="form-control" id="exampleInputPassword1">
                   </div>

                   <div class="mb-3">
                       <select class="form-select" aria-label="Default select example">
                           <option selected>Student or Parent?</option>
                           <option value="1">Student</option>
                           <option value="2">Parent</option>
                         </select>
                        </div>
               
                    <input type="Submit" class="form-control" id="Submit">
                </form>

            </div>

        </div>
    </div>
	
</body>
</html>