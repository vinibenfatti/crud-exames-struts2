<!DOCTYPE html>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>Sistema de exames</title>
</head>

<body>
<h1>Sistema de exames</h1>

<p><a href='<s:url action="returnExams" />'>Listar todos os exames</a></p>
<p><a href='<s:url action="insertExam" />'>Inserir um novo exame</a></p>
<p><a href='<s:url action="deleteExam" />'>Deletar um exame</a></p>
<p><a href='<s:url action="editExam" />'>Editar um exame</a></p>
<hr>
<p><a href='<s:url action="returnEmployees" />'>Listar todos os funcionários</a></p>
<p><a href='<s:url action="insertEmployee" />'>Inserir um novo funcionário</a></p>
<p><a href='<s:url action="deleteEmployee" />'>Deletar um funcionario</a></p>
<p><a href='<s:url action="editEmployee" />'>Editar um funcionario</a></p>
<hr>
<p><a href='<s:url action="returnExamDone" />'>Listar todos os exames realizados</a></p>
<p><a href='<s:url action="insertExamDone" />'>Inserir um exame realizado</a></p>
<hr>
<p><a href='<s:url action="returnExamDoneReport" />'>Relatório de exames realizados por período</a></p>
<hr>
<p><a href='<s:url action="returnUsers" />'>Listar todos os usuários</a></p>
<p><a href='<s:url action="insertUser" />'>Inserir novo usuário</a></p>
<p><a href='<s:url action="deleteUser" />'>Deletar usuário</a></p>
</body>
</html>
