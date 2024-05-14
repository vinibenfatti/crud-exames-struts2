<!DOCTYPE html>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>Menu</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            margin: 0;
            padding: 0;
            background-color: #f4f4f4;
        }

        header {
            background-color: #333;
            color: white;
            padding: 10px 20px;
            text-align: center;
        }

        h1, h2, p {
            margin: 10px 0;
        }

        ul {
            list-style-type: none;
            padding: 0;
        }

        li {
            margin-bottom: 5px;
        }

        .btn {
            display: inline-block;
            padding: 8px 16px;
            text-align: center;
            text-decoration: none;
            color: #fff;
            background-color: #333;
            border-radius: 5px;
            cursor: pointer;
        }

        .btn:hover {
            background-color: #555;
        }

        hr {
            border: 1px solid #ccc;
            margin: 20px 0;
        }

        footer {
            background-color: #333;
            color: white;
            text-align: center;
            padding: 10px 20px;
            position: fixed;
            bottom: 0;
            width: 100%;
        }
        .container {
            margin-left: 20px;
        }
    </style>
</head>

<body>
<header>
    <h1>Menu</h1>
</header>

<div class="container">
    <h2>Exames</h2>
    <ul>
        <li><a href='<s:url action="returnExams" />' class="btn">Listar todos os exames</a></li>
        <li><a href='<s:url action="insertExam" />' class="btn">Inserir um novo exame</a></li>
        <li><a href='<s:url action="deleteExam" />' class="btn">Deletar um exame</a></li>
        <li><a href='<s:url action="editExam" />' class="btn">Editar um exame</a></li>
    </ul>

    <hr>

    <h2>Funcionários</h2>
    <ul>
        <li><a href='<s:url action="returnEmployees" />' class="btn">Listar todos os funcionários</a></li>
        <li><a href='<s:url action="insertEmployee" />' class="btn">Inserir um novo funcionário</a></li>
        <li><a href='<s:url action="deleteEmployee" />' class="btn">Deletar um funcionario</a></li>
        <li><a href='<s:url action="editEmployee" />' class="btn">Editar um funcionario</a></li>
    </ul>

    <hr>

    <h2>Exames Realizados</h2>
    <ul>
        <li><a href='<s:url action="returnExamDone" />' class="btn">Listar todos os exames realizados</a></li>
        <li><a href='<s:url action="insertExamDone" />' class="btn">Inserir um exame realizado</a></li>
        <li><a href='<s:url action="returnExamDoneReport" />' class="btn">Relatório de exames realizados por período</a></li>
    </ul>

    <hr>

    <h2>Usuários</h2>
    <ul>
        <li><a href='<s:url action="returnUsers" />' class="btn">Listar todos os usuários</a></li>
        <li><a href='<s:url action="insertUser" />' class="btn">Inserir novo usuário</a></li>
        <li><a href='<s:url action="deleteUser" />' class="btn">Deletar usuário</a></li>
        <li><a href='<s:url action="editUser" />' class="btn">Editar senha de usuário</a></li>
    </ul>

    <hr>
    <hr>
    <hr>

</div>

<footer>
    <p>&copy; 2024 - Todos os direitos reservados</p>
</footer>
</body>
</html>
