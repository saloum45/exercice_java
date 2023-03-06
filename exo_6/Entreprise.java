package exo_6;

import java.util.ArrayList;

public class Entreprise {
    Employe employe;
    public void ajouterEmploye(String nom, float salaire){
        employe.listemploye.add(nom);
    }


    class Employe{
        String nom;
        float salaire;
        ArrayList<String> listemploye = new ArrayList<String>(); 
        public Employe(String nom, float salaire){
            listemploye.add(nom);
            
        }
    

    }
}
