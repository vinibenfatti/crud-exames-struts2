<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Lista de Usuários</title>
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

        .container {
            margin: 20px;
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
<header>
    <h1>Lista de Usuários</h1>
    </header>
     <div class="container">
   <table>
       <thead>
           <tr>
               <th>Login</th>
               <th>Senha</th>
               <th>Tempo de inativade (min)</th>
           </tr>
       </thead>
       <tbody>
           <s:iterator value="users" var="user">
               <tr>
                   <td><s:property value="nm_login" /></td>
                   <td><s:property value="ds_senha" /></td>
                   <td><s:property value="qt_tempo_inatividade" /></td>
               </tr>
           </s:iterator>
       </tbody>
   </table>
    </div>
</body>
</html>