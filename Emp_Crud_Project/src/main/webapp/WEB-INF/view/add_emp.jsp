<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
 <title>Welcome</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet"
    integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
    crossorigin="anonymous">
     <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
    <!-- Custom CSS -->
    <style>
        body {
            background-color: #f8f9fa;
        }
        .form-container {
            max-width: 600px;
            margin: 40px auto;
            padding: 30px;
            background: white;
            border-radius: 10px;
            box-shadow: 0 0 20px rgba(0,0,0,0.1);
        }
        .form-title {
            color: #2c3e50;
            margin-bottom: 30px;
            text-align: center;
            font-weight: 600;
        }
        .form-label {
            font-weight: 500;
            color: #495057;
        }
        .submit-btn {
            background-color: #3498db;
            border: none;
            padding: 10px 25px;
            font-weight: 500;
            width: 100%;
            margin-top: 10px;
        }
        .submit-btn:hover {
            background-color: #2980b9;
        }
        .form-control:focus {
            border-color: #3498db;
            box-shadow: 0 0 0 0.25rem rgba(52, 152, 219, 0.25);
        }
    </style>

</head>
<body>

<nav class="navbar navbar-expand-lg navbar-dark bg-primary">
    <div class="container-fluid">
        <a class="navbar-brand" href="front_view">Emp Management System</a>
        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarSupportedContent">
            <ul class="navbar-nav me-auto mb-2 mb-lg-0">
                <li class="nav-item">
                    <a class="nav-link active" aria-current="page" href="home">Home</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="add_emp">Add Employee</a>
                </li>
            </ul>
        </div>
    </div>
</nav>
<div class="container">
    <div class="row">
        <div class="col-md-6 offset-md-3">
            <div class="card">
                <div class="card-header text-center">
                    <h3> Add Employee</h3>
                    <c:if test="${not empty msg}">
                        <h5>${msg}</h5>
                        <c:remove var="msg"/>
                    </c:if>
                </div>
               <div class="card-body">
                  <%--  <form action="${pageContext.request.contextPath}/createEmp" method="post">
                        <div class="mb-3">
                           <label> Choose Department</label>
                            <select name="d_Id" class="form-control" >
                                <c:forEach items="${desiDetails}" var="details">
                                    <option value="${details.d_Id}"> ${details.designationName}</option>
                                </c:forEach>
                            </select>
                       </div>
                       
                        <div class="mb-3">
                           <label> Enter Full Name</label>
                           <input type="text" name="fullName" class="form-control" >
                       </div>
                       <div class="mb-3">
                           <label> Enter Address</label>
                           <input type="text" name="address" class="form-control" required>
                       </div>
                       <div class="mb-3">
                           <label> Enter Mail</label>
                           <input type="email" name="mail" class="form-control" required>
                       </div>
                       <div class="mb-3">
                       <label> Enter passwor</label>
                        <input type="text" name="fullName" class="form-control" >
                       
                       </div>
                       <div class="mb-3">
                       <label> Enter designation</label>
                        <input type="text" name="fullName" class="form-control" >
                       
                       </div>
                        <div class="mb-3">
                       <label> Enter Salary</label>
                        <input type="text" name="fullName" class="form-control" >
                       
                       </div>
                       <button class="btn btn-primary">Submit</button>
                       
                       
                      
                       
                   </form> --%>
                   
                <div class="container">
			        <div class="form-container">
			            <h2 class="form-title">Employee Registration</h2>
			            <form action="${pageContext.request.contextPath}/createEmp" method="post">
			                <div class="mb-3">
			                    <label for="fullName" class="form-label">Full Name</label>
			                    <input type="text" class="form-control" id="fullName" name="fullName" required placeholder="Enter full name">
			                </div>
			                
			                <div class="mb-3">
			                    <label for="address" class="form-label">Address</label>
			                    <input type="text" class="form-control" id="address" name="address" required placeholder="Enter address">
			                </div>
			                
			                <div class="mb-3">
			                    <label for="mail" class="form-label">Email</label>
			                    <input type="email" class="form-control" id="mail" name="mail" required placeholder="Enter email">
			                </div>
			                
			                <div class="mb-3">
			                    <label for="password" class="form-label">Password</label>
			                    <input type="password" class="form-control" id="password" name="password" required placeholder="Enter password">
			                </div>
			                
			                <div class="row">
			                    <div class="col-md-6 mb-3">
			                        <label for="designation" class="form-label">Designation</label>
			                        <input type="text" class="form-control" id="designation" name="designation" required placeholder="e.g. Manager">
			                    </div>
			                    
			                    <div class="col-md-6 mb-3">
			                        <label for="salary" class="form-label">Salary</label>
			                        <input type="text" class="form-control" id="salary" name="salary" required placeholder="Enter salary">
			                    </div>
			                </div>
			                
			                <button type="submit" class="btn btn-primary submit-btn">Register Employee</button>
			            </form>
			        </div>
			    </div>
               </div>

            </div>
        </div>
    </div>

</div>
 <!-- Bootstrap 5 JS Bundle with Popper -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js">


</body>
</html>