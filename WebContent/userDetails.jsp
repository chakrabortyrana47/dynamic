<%@taglib uri="http://java.sun.com/jsf/core" prefix="f"%><%@taglib
	uri="http://java.sun.com/jsf/html" prefix="h"%><%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body><center>
<h1>user Details</h1>
		<f:view>
		<h:form>
			<h:panelGrid border="" columns="2">
				<h:outputText value="Name:   "></h:outputText>
				<h:outputText value="#{userDetailsMB.name}"></h:outputText>
				<h:outputText value="Address:   "></h:outputText>
				<h:outputText value="#{userDetailsMB.address}"></h:outputText>
				<h:outputText value="Phone Number"></h:outputText>
				<h:outputText value="#{userDetailsMB.phoneNo }"></h:outputText>
				<h:outputText value="Relationship"></h:outputText>
				<h:outputText value="#{userDetailsMB.relation }"></h:outputText>
			</h:panelGrid>
			</h:form>
		</f:view>
	</center>

</body>
</html>