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
<h1>Inserir um novo exame realizado</h1>

<p>Preencha as informações abaixo:</p>

<s:form action="returnConfirmExamDoneReport" method="post">

    <s:textfield label="Data de Início" name="examDoneReportInput.startDate" type="date"/>

    <s:textfield label="Data de Término" name="examDoneReportInput.endDate" type="date"/>

    <s:submit key="submit"/>
</s:form>
</body>

</html>