<!DOCTYPE html>
       <%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
       <%@ taglib prefix="s" uri="/struts-tags" %>
       <html>
       <head>
           <meta charset="UTF-8">
           <title>Jive Test - Enter OS Information</title>
           <link href="<s:url value='/styles/styles.css' encode='false' includeParams='none'/>" rel="stylesheet"
                 type="text/css" media="all"/>
       </head>

       <body>
       <h1>Deletar um funcionário</h1>

       <p>Use the form below to enter exam informations.</p>

       <s:form action="deleteConfirmEmployee" method="post">
           <%
           /**
           <s:textfield key="employee.cd_funcionario"/>
           **/
           %>
           <s:textfield key="employee.cd_funcionario"/>
           <s:submit key="submit"/>

       </s:form>
       </body>

       </html>