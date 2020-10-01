<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>

<head>
    <meta charset="ISO-8859-1">
    <title>Insert title here</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
        integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
</head>

<body>

    <div class="container">
        <h2>User Registration</h2>
        <div class="col-md-6 col-md-offset-3">
            <div class="alert alert-success center" role="alert"></div>
            <p>${NOTIFICATION}</p>
        </div>

        <form action="register" method="post">

            <div class="form-group">
                <label for="uid">User ID:</label><input type="number" class="from-control" id="uid"
                    placeholder="User ID" name="userID" required>

                <div class="form-group">
                    <label for="uid">User ID:</label><input type="text" class="from-control" id="ufname"
                        placeholder="First Name" name="firstName" required>
                </div>

                <div class="form-group">
                    <label for="uid">User ID:</label><input type="text" class="from-control" id="ulname"
                        placeholder="Last Name" name="lastName" required>
                </div>

                <div class="form-group">
                    <label for="uid">User ID:</label><input type="text" class="from-control" id="username"
                        placeholder="Username" name="username" required>
                </div>

                <div class="form-group">
                    <label for="uid">User ID:</label><input type="password" class="from-control" id="password"
                        placeholder="Password" name="password" required>
                </div>

                <button type="submit" class="btn btn-primary">Submit</button>
        </form>

    </div>

</body>

</html>