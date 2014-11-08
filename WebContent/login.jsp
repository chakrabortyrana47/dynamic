<%@taglib uri="http://java.sun.com/jsf/core" prefix="f"%><%@taglib
	uri="http://java.sun.com/jsf/html" prefix="h"%><%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
  <head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
</head>
<body><center>
<h1>Sign in</h1>


	<f:view>
	<h:form>
		<h:panelGrid border="0" columns="2">
			<h:outputText value="User Name"></h:outputText>
			<h:inputText value="#{userMB.userName }"></h:inputText>
			<h:outputText value="Pass Word"></h:outputText>
			<h:inputText value="#{userMB.passWd }"></h:inputText>
			
		</h:panelGrid><br>
		<h:commandButton value="Login" action="#{userMB.login }"></h:commandButton>
	</h:form>
	</f:view>
	</center>
</body>
</html>