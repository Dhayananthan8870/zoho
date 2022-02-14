<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<h1>Fpassword</h1>
       <form:form method="post" action="forgotpassword">
      	<table >
         <tr>
          <td>Email : </td>
          <td><input type="text" path="email"></td>
         </tr>
         <tr>
          <td>secret :</td>
          <td><input type="text" path="secret"></td>
         </tr>
         <tr>
          <td> </td>
          <td><input type="submit" value="Save" /></td>
         </tr>
        </table>
        <a href="login">sign-in</a>
       </form:form>