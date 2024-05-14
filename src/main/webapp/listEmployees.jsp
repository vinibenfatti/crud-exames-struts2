<!DOCTYPE html>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
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
    </style>
</head>
<body>
<h1>Lista de Funcionários</h1>
<table>
    <thead>
    <tr>
        <th>Código do Funcionário</th>
        <th>Nome do Funcionário</th>
    </tr>
    </thead>
    <tbody>
    <s:iterator value="employees" var="employee">
        <tr>
            <td><s:property value="cd_funcionario" /></td>
            <td><s:property value="nm_funcionario" /></td>
        </tr>
    </s:iterator>
    </tbody>
</table>
</body>
</html>
