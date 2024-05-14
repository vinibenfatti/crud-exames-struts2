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

<s:form action="insertConfirmExamDone" method="post">

    <s:select label="Nome do exame"
    name="examDone.exam.cd_exame"
    list="exams"
    listKey="cd_exame"
    listValue="%{cd_exame + ' - ' + nm_exame}"
    headerKey=""
    headerValue="Selecione um Exame"/>

    <s:select label="Nome do funcionario"
    name="examDone.employee.cd_funcionario"
    list="employees"
    listKey="cd_funcionario"
    listValue="%{cd_funcionario + ' - ' + nm_funcionario}"
    headerKey=""
    headerValue="Selecione um Funcionario"/>
    <s:submit key="submit"/>
</s:form>
       </body>

       </html>