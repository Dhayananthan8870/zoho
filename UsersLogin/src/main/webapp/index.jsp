<style>
h4{
 text-align:center;
}
form
{
text-align:center;
border-width:50px;
border-color:blue;
}
a{
text-align:right;
}
.forgot{
border-width:50px;
text-align:center;
}
</style>

<h4>Sign in</h4>

	<form action="Login" method="post">
	<div>
	Dont have  an Account?<a href="signup">signup</a>
	</div>
	<div>
	Email

	</div>
	<div>
		<input type="text" name="email" />
		</div>
<div>
	Password

	</div>
		<div><input type="password" name="passwords" /></div>
<div class="forgot">
		<a href="forgotpassword">          forgotpassword</a>
		</div>
		<input type="submit" value="Login" />

	</form>
</body>
</html>