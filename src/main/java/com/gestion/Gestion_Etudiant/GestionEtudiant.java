package com.gestion.Gestion_Etudiant;

import java.util.ArrayList;
import java.util.List;

public class GestionEtudiant {

    private static List<Etudiant>  listEtudiant = new ArrayList<Etudiant>();

    public static List<Etudiant> getListEtudiant(){
        return listEtudiant;
    }

    public void setListEtudiant(List<Etudiant> listEtudiant) {
        this.listEtudiant = listEtudiant;
    }

    public void addEtudiant(Etudiant etudiant){
        listEtudiant.add(etudiant);
    }
}
