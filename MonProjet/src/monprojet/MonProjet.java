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
        
        // exercice 3
        
        int a = 8;
        int b = 2;
        
        if(a==b){
            System.out.println(a+ " = " +b);
        }else{
            System.out.println("a et b sont différents");
            
        }
       
        // exercice 4
        /*
         1)faux
         2)vraie              
         3)faux
         4)vraie                
         5)faux
         6)vraie
        */ 
        
        // exercice 5
        
         a = 2;
         b = 8;
        int c = 4;
        
        if (a == b && b == c){
            System.out.println("les trois variable sont egales");
        }else{
            System.out.println("les trois variable ne sont pas identiques");
        }
        
        
        
         // exercice 6
         
        for (int i=0; i < 11; i++){
            System.out.println(i);
        }
         
         // exercice 7
         
         int i=0;
         while(i<11){
             System.out.println(i);
             i++;
             
         }
        
         
         
         
         
         
         
         
         
         
         
         
         
        
        
        
     
              
                 
         
         
        
       
        
    }
    
}
