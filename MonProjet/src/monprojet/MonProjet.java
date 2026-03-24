/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monprojet;

/**
 *
 * @author HHADDOU
 */
public class MonProjet {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 
        System.out.println("Hello World");    
        System.out.println("monprojet.MonProjet.main()");
        // exercice 1
        char caractere = 'a';
        int entier = 25;
        long entierlong = 809999;
        float nombreAvirgule = 5.7F;
        boolean vraieFaux = true;
        String chaineCaractere = "Bonjour";
        
        System.out.println(caractere);
        System.out.println(entier);
        System.out.println(entierlong);
        System.out.println(nombreAvirgule);
        System.out.println(vraieFaux);
        System.out.println(chaineCaractere);
        
        // exercice 2
        String nom = "Dupont";
        String prenom = "Pierre";
        int dateDeNaissance = 2002;
        
        int age = 2026-2002;
        
        String nomComplet = prenom +" "+ nom;
        
        System.out.println(nomComplet + " est né en " + dateDeNaissance + " il a donc " + age);
        
        
       
        
    }
    
}
