<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
		<h1>Comment</h1>
       <form:form method="post" action="Comment">
      	<table>
      	<tr>What would you like to share with World?</tr>
         <tr>
          <td><textarea rows="4" cols="50" name="comment" path="Comment"></textarea></td>
          <td><input type="submit" value="Submit" /></td>
           </tr>
        </table>
          </form:form>


