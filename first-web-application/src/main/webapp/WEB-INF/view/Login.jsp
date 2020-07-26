<%@ include file="../common/header.jspf"%>
<%@ include file="../common/navigation.jspf"%>

	<div class="container">
		<p>
			<font color="red">${errorMessage}</font>
		</p>
		<form action="/login.do" method="post">
			Enter your name : <input type="text" name="name" /> Password : <input
				type="password" name="password" /> <input type="submit"
				value="Login">
		</form>
	</div>

<%@ include file="../common/footer.jspf"%>

