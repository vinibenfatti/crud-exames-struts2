<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Lista de Funcionários</title>
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