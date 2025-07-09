<jsp:include page="include/header.jsp"/>
<%@page import="java.util.List" %>
<%@page import="org.studyeasy.entity.User" %>
	<h1>List Users</h1>
	<table style="color: white;background: black" border="1">
		<thead>
		<th>USER ID</th>
		<th>USERNAME</th>
		<th>EMAIL</th>
		<th>Operations</th>
		</thead>
		
		<%
		List<User> listusers=(List)request.getAttribute("listusers");
		for(User user:listusers){
			out.print("<tr>");
			out.print("<td>"+user.getUser_id()+"</td>");
			out.print("<td>"+user.getUsername()+"</td>");
			out.print("<td>"+user.getEmail()+"</td>");
			out.print("<td><a href="+request.getContextPath()+"/site?page=updateuser&user_id="+user.getUser_id()+
					"&username="+user.getUsername()+"&email="+user.getEmail()+">Update</a>");
			out.print("		|	");
			out.print("<a href="+request.getContextPath()+"/site?page=deleteuser&user_id="+user.getUser_id()+">Delete</a></td>");
			out.print("<tr>");
		}
		%>
		</table>
<jsp:include page="include/footer.jsp"></jsp:include>