<!DOCTYPE html>
<html>
<head>
    <title>Login</title>
    <script src="https://code.jquery.com/jquery-3.6.0.min.js">
       let lastInteractionTime = Date.now();

        $(document).on('mousemove keypress', function() {
            lastInteractionTime = Date.now();
        });

        setInterval(function() {
            let currentTime = Date.now();
            let inactiveTime = (currentTime - lastInteractionTime) / 1000 / 60; // minutes
            if (inactiveTime > 90) {
                window.location.href = "logoutAction"; // Redirect to logout action
            }
        }, 60000); // Check every minute
    </script>
</head>
<body>
    <h2>Login</h2>
    <form id="loginForm" action="login" method="post">
        <label for="username">Username:</label><br>
        <input type="text" id="username" name="username"><br>
        <label for="password">Password:</label><br>
        <input type="password" id="password" name="password"><br>
        <input type="submit" value="Login">
    </form>
</body>
</html>