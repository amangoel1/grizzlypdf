<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Registration Form</title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css">
    </head>
    <body>
        <div class="container-fluid bg-light">
            
            <br><br><br>
            <div class="row">
                <div class="col-md-4"></div>
                <div class="col-md-4">
                       <center><h3>Add Product</h3></center>
                    <form action="addProduct.html" method="POST">
                <div class="form-group">
                  <label for="employeeid">Product ID:</label>
                  <input type="text" class= "form-control" name="productId" maxlength="10">
                </div>
                <div class="form-group">
                  <label for="password">Product Name:</label>
                  <input type="text" class="form-control" name="name" minlength="8" maxlength="20">
                </div>

                <div class="form-group">
                    <label for="price">Price:</label>
                    <input type="number" class="form-control" name="price" >
                </div>

                <div class="form-group">
                        <label for="quantity">Quantity:</label>
                        <input type="number" class="form-control" name="quantity">
                </div>
             
                <center><button type="submit" class="btn btn-success">Submit</button>&nbsp;&nbsp;&nbsp;<button type="reset" class="btn btn-danger ">Reset</button></center>
              </form>
            </div>
            </div>
            </div>
        
    </body>
</html>
