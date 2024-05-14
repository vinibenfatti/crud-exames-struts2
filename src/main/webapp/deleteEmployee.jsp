<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>Jive Test - Enter OS Information</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            margin: 0;
            padding: 0;
            background-color: #f4f4f4;
            margin-left: 20px; /* Adiciona uma margem à esquerda */
        }

        h1 {
            margin-top: 20px; /* Adiciona um espaçamento superior ao título */
        }

        p {
            margin-bottom: 20px; /* Adiciona um espaçamento inferior ao parágrafo */
        }

        form {
            background-color: #fff;
            padding: 20px;
            border-radius: 5px;
            box-shadow: 0 2px 5px rgba(0,0,0,0.1);
            margin-top: 20px;
        }

        input[type="text"], input[type="submit"] {
            margin-bottom: 10px; /* Adiciona um espaçamento inferior aos campos de texto e ao botão */
            padding: 8px;
            width: 100%;
            box-sizing: border-box; /* Garante que o padding não altere a largura do input */
        }

        input[type="submit"] {
            background-color: #333;
            color: #fff;
            border: none;
            cursor: pointer;
        }

        input[type="submit"]:hover {
            background-color: #555;
        }
    </style>
</head>

<body>
<h1>Deletar um funcionário</h1>

<p>Complete as informaçõds:</p>

<s:form action="deleteConfirmEmployee" method="post">
    <s:textfield key="employee.cd_funcionario" label="Código do Funcionário" placeholder="Código do Funcionário"/>
    <s:submit key="submit" value="Submit"/>
</s:form>
</body>

</html>
