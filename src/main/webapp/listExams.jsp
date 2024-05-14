<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Lista de Exames</title>
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
    <h1>Lista de Exames</h1>
   <table>
       <thead>
           <tr>
               <th>Código do Exame</th>
               <th>Nome do Exame</th>
               <th>Ativo</th>
               <th>Detalhe do Exame</th>
           </tr>
       </thead>
       <tbody>
           <s:iterator value="exams" var="exam">
               <tr>
                   <td><s:property value="cd_exame" /></td>
                   <td><s:property value="nm_exame" /></td>
                   <td><s:property value="ic_ativo" /></td>
                   <td><s:property value="ds_detalhe_exame" /></td>
               </tr>
           </s:iterator>
       </tbody>
   </table>
</body>
</html>