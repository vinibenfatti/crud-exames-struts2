<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Lista de Exames Realizados</title>
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
    <h1>Lista de Exames Realizados</h1>
   <table>
       <thead>
           <tr>
               <th>Código do Exame</th>
               <th>Nome do Exame</th>
               <th>Código do Funcionário</th>
               <th>Nome do Funcionário</th>
               <th>Data da realização</th>
           </tr>
       </thead>
       <tbody>
           <s:iterator value="examsDone" var="examDone">
               <tr>
                   <td><s:property value="exam.cd_exame" /></td>
                   <td><s:property value="exam.nm_exame" /></td>
                   <td><s:property value="employee.cd_funcionario" /></td>
                   <td><s:property value="employee.nm_funcionario" /></td>
                   <td><s:property value="dt_realizacao" /></td>
               </tr>
           </s:iterator>
       </tbody>
   </table>
</body>
</html>