<%@page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" session="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core" %>
<%@ taglib prefix="portlet" uri="http://java.sun.com/portlet" %>
<portlet:defineObjects/>

<p>Hello from Spring Portlet MVC Framework - View Mode</p>

<h3>Below is the message that was passed from the ModelandView object:</h3>
    <p><c:out value="${injectedMessage}"/></p>
    
<h3><a href="#">Portal Persons(s)</a></h3>
    <c:forEach items="${listOfPersons}" var="portalPerson">
    	<div>
        	<p>
				Spriden ID: <c:out value="${portalPerson.spridenId}"/>, Full name: 
				<c:out value="${portalPerson.fullName}"/><br/>
			   
			 </p>
		</div>
	</c:forEach> 