<%@ page import="com.gestion.Gestion_Etudiant.Etudiant" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: eloua
  Date: 4/28/2021
  Time: 12:33 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Etudiants !! </title>
</head>
<body>

    <h3>Liste des Etudiants !</h3>
    <table border="1">
        <tr>
            <th>CIN</th>
            <th>NOM</th>
            <th>PRENOM</th>
            <th>DELETE</th>
        </tr>
        <%
            ArrayList<Etudiant> list = (ArrayList<Etudiant>) request.getAttribute("data");
            for (Etudiant it : list) {%>

        <tr>
            <td><%=it.getCin()%>
            </td>
            <td><%=it.getNom()%>
            </td>
            <td><%=it.getPrenom()%>
            </td>
            <td>
                <a href="/Gestion_Etudiant_war_exploded/DeleteEtudiant?cin=<%=it.getCin()%>">Supprimer</a>
            </td>
        </tr>
        <%}%>
    </table>
</body>
</html>
