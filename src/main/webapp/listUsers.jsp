<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Lista de Usuários</title>
    <style>
        table {
            width: 100%;
            border-collapse: collapse;
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
    <h1>Lista de Usuários</h1>
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
</body>
</html>