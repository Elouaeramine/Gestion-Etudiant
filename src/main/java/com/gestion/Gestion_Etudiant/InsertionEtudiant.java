package com.gestion.Gestion_Etudiant;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "InsertionEtudiant", value = "/InsertionEtudiant")
public class InsertionEtudiant extends HttpServlet {

    private final GestionEtudiant listEtudiants = new GestionEtudiant();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String cin = request.getParameter("cin");
        String nom = request.getParameter("nom");
        String prenom = request.getParameter("prenom");

        Etudiant etudiant = new Etudiant(nom,prenom,cin);
        listEtudiants.addEtudiant(etudiant);

        request.setAttribute("data" , listEtudiants.getListEtudiant());
        request.getRequestDispatcher("AffichageEtudiant.jsp").forward(request,response);
    }
}
