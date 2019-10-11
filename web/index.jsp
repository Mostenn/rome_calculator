<%--
  Created by IntelliJ IDEA.
  User: mostenn
  Date: 10.10.19
  Time: 20:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Arab numbers to Rome</title>
  </head>
  <body>

  <style>
    .box{
      display: flex;
      align-items: center;
      justify-content: center;
      height: 100%;
    }
    .box .form{
      display: flex;
      align-items: center;
      justify-content: center;
      width: 400px;
      height: 300px;
      padding: 20px;
      text-align: center;
      background: #eee;
      border: 1px solid #ff5a00;
      border-radius: 3px;
    }
    input{
      text-decoration: underline;
    }
    button{
      padding: 4px;
    }
  </style>

  <div class="box">
    <div class="form">
      <form action="" method="post">
        <input type="text" name="arab" required pattern="^[0-9]+$">
        <input type="hidden" name="action" value="convert">
        <button type="submit"> CONVERT </button>
        <p>Calculator can convert only positive numbers from <b>1</b> to <b>3999</b> include</p>
        <p>Arabic number: ${arab}</p>
        <p>Rome number: ${rome}</p>
        <p><b>${message}</b></p>
        <a href="https://planetcalc.ru/378/" target="_blank">Site to check</a>
      </form>
    </div>
  </div>
  </body>
</html>
