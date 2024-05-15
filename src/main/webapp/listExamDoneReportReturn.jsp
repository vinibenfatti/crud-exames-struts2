<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
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
                                max-width: 700px;
                                padding: 20px;
                                background-color: #fff;
                                border-radius: 5px;
                                box-shadow: 0 50px 50px rgba(0,0,0,0.1);
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
    <h1>Lista de Exames Realizados</h1>
</header>
<div class="container">
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
</div>
</body>
</html>