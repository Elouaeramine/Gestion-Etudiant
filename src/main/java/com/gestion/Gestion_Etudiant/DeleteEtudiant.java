package com.gestion.Gestion_Etudiant;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "DeleteEtudiant", value = "/DeleteEtudiant")
public class DeleteEtudiant extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String cin = request.getParameter("cin");
        int k =0;
        for (int i =0; i<GestionEtudiant.getListEtudiant().size() ;i++){
            if(GestionEtudiant.getListEtudiant().get(i).getCin().equals(cin)){
                k=i;
                break;
            }
        }
        GestionEtudiant.getListEtudiant().remove(k);
        request.setAttribute("data", GestionEtudiant.getListEtudiant());
        request.getRequestDispatcher("AffichageEtudiant.jsp").forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
