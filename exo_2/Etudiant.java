package exo_2;

import java.util.*;

public class Etudiant {
    private String nom;
    private String prenom;
    Cours cours;

    public Etudiant(String nom, String prenom){
        this.nom=nom;
        this.prenom=prenom;
    }

    public void ajouterCours(String cours){
        this.cours.listcours.add(cours); 
    }
    
    class Cours{
        ArrayList<String> listcours = new ArrayList<String>();
        float note;
        ArrayList<Integer> listnote = new ArrayList<Integer>();
        
        public Cours(String nom){
            this.listcours.add(nom);
        }

        public void ajouterNote(int note){
            this.listnote.add(note);
        }
        public float moyenne(){
            float somme=0;
            for(int i=0;i<listnote.size();i++){
                somme+=listnote.get(i);
            }
            return somme/listnote.size();
        }
        public void afficher(){
            System.out.println(listnote);
        }
    }

    public static void main(String[] args) {
        Etudiant salem = new Etudiant("salem", "malick");
        salem.cours=salem.new Cours("sgbd");
        salem.ajouterCours("math");
        salem.ajouterCours("programmation");
        salem.cours.ajouterNote(15);
        salem.cours.ajouterNote(20);
        salem.cours.ajouterNote(12);
        System.out.println(salem.cours.listcours);
        salem.cours.afficher();
        System.out.println(salem.cours.moyenne());
    }
}
