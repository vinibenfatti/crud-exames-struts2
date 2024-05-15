<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>Lista de Funcionários</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            margin: 0;
            padding: 0;
            background-color: #f4f4f4;
            margin-left: 20px;
        }

        h1 {
            margin-top: 20px;
        }

        table {
            width: 100%;
            border-collapse: collapse;
            background-color: #fff;
            border-radius: 5px;
            box-shadow: 0 2px 5px rgba(0,0,0,0.1);
            margin-top: 20px;
        }

        th, td {
            border: 1px solid #ddd;
            padding: 8px;
            text-align: left;
        }

        th {
            background-color: #f2f2f2;
        }

                        header {
                            background-color: #333;
                            color: white;
                            padding: 10px 20px;
                            text-align: center;
                        }
                            .container {
                                margin: 50px auto;
                                max-width: 400px;
                                padding: 20px;
                                background-color: #fff;
                                border-radius: 5px;
                                box-shadow: 0 2px 5px rgba(0,0,0,0.1);
                            }
        input[type="text"], input[type="submit"] {
            margin-bottom: 10px;
            padding: 8px;
            width: 100%;
            box-sizing: border-box;
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
<header>
<h1>Inserir um novo exame realizado</h1>
</header>

<div class="container">
<p>Preencha as informações abaixo:</p>

<s:form action="returnConfirmExamDoneReport" method="post">

    <s:textfield label="Data de Início" name="examDoneReportInput.startDate" type="date"/>

    <s:textfield label="Data de Término" name="examDoneReportInput.endDate" type="date"/>

    <s:submit key="submit"/>
</s:form>
</div>
</body>

</html>