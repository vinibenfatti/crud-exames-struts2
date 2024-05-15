<!DOCTYPE html>
       <%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
       <%@ taglib prefix="s" uri="/struts-tags" %>
       <html>
       <head>
           <meta charset="UTF-8">
           <title>Jive Test - Enter OS Information</title>
           <link href="<s:url value='/styles/styles.css' encode='false' includeParams='none'/>" rel="stylesheet"
                 type="text/css" media="all"/>
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

               p {
                   margin-bottom: 20px;
               }

               form {
                   background-color: #fff;
                   padding: 20px;
                   border-radius: 5px;
                   box-shadow: 0 2px 5px rgba(0,0,0,0.1);
                   margin-top: 20px;
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
           </style>
       </head>


       <body>
       <header>
       <h1>Deletar um usuário</h1>
       </header>

<div class="container">
       <s:form action="deleteConfirmUser" method="post">
           <%
           /**
           <s:textfield key="user.nm_login" label="Login do Usuário" placeholder="Login do Usuário"/>
           **/
           %>
           <s:textfield key="user.nm_login" label="Login do Usuário" placeholder="Login do Usuário"/>
           <s:submit key="submit"/>

       </s:form>
       </div>
       </body>

       </html>