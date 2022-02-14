<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
<style>
h1{
 text-align:center;
}
form
{
text-align:center;
}

table{
text-align:center;
}
</style>
		<h1>signup</h1>
       <form:form method="post" action="save">  
      	<table>
         <tr>  
          <td>email : </td> 
          <td><form:input path="email"  /></td>
         </tr>  
         <tr>  
          <td>password :</td>  
          <td><form:input path="passwords" /></td>
         </tr> 
         <tr>  
          <td>secret :</td>  
          <td><form:input path="secret" /></td>
         </tr> 
         <tr>  
          <td> </td>  
          <td><input type="submit" value="Save" /></td>  
         </tr>  
        </table>  
       </form:form>  
