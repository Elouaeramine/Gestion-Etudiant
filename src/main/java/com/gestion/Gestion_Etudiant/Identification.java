package com.gestion.Gestion_Etudiant;

import java.io.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "identification", value = "/identification")
public class Identification extends HttpServlet {

    public void init() {

    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String login = request.getParameter("login");
        String password = request.getParameter("password");
        if (login.equals(password)){
            response.sendRedirect("valid.html");
        }
        else {
            response.sendRedirect("echec.html");
        }
    }

    public void destroy() {
    }
}