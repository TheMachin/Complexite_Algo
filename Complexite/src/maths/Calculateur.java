package maths;

import algorithmes.Balayage_x;
import java.util.ArrayList;
import algorithmes.ToutesLesPaires;

    //=====================================================
    //=====================================================
    //                  CLASSE CALCULATEUR
    //=====================================================
    //=====================================================

/* classe regroupant les methodes applicables aux deux algorithmes*/

public class Calculateur {
    
    /*--déclarations des variables--*/
    public static String TOUTESLESPAIRES = "toutesLesPaires";
    public static String BALAYAGE = "balayage";
    
    

    /**
     * permet de calculer le determinant d'une matrice 3x3
     * @param matrice
     * @return 
     */
    public static double determinant(float[][] matrice){
        double sum=0; 
        
        sum= matrice[0][0]*(matrice[1][1]-matrice[2][1])-
                matrice[0][1]*(matrice[1][0]-matrice[2][0])+
                (matrice[1][0]*matrice[2][1]-matrice[1][1]*matrice[2][0]);
       
              return(sum);
	}
    
    

    /**
     * fonction qui defini si deux segments se coupent grace au determinant
     * @param s1
     * @param s2
     * @return 
     * retourne un booleen qui est VRAI ou FAUX, si les 2 segments se coupent
     */
    public static boolean se_coupe(Segment s1, Segment s2){
        
        // On instancie 4 matrices 
        float A[][] = new  float[3][3]; 
        float B[][] = new  float[3][3];    
        float Ap[][] = new  float[3][3]; 
        float Bp[][] = new  float[3][3]; 
        
        /*Matrice de la droite formée par les points (S1) coupe le segments formé par les point de [S2]  */
        
        // la ligne 1 de la matrice A contient les cordonnées X, Y , 1
        // du point Gauche du segment S1 
        A[0][0] = s1.getP1().getX(); 
        A[0][1] = s1.getP1().getY();
        A[0][2] = 1;
        // la ligne 2 de la matrice A contient les cordonnées X, Y , 1 
        // du point Droit du segment S1
        A[1][0] = s1.getP2().getX(); 
        A[1][1] = s1.getP2().getY();
        A[1][2] = 1;
        // la ligne 3 de la matrice A contient les cordonnées X, Y , 1
        // du point Gauche du segment S2 
        A[2][0] = s2.getP1().getX(); 
        A[2][1] = s2.getP1().getY();
        A[2][2] = 1;
        
        // la ligne 1 de la matrice B contient les cordonnées X, Y , 1  
        // du point Gauche du segment S1 
        B[0][0] = s1.getP1().getX(); 
        B[0][1] = s1.getP1().getY();
        B[0][2] = 1;
        // la ligne 2 de la matrice B contient les cordonnées X, Y , 1  
        // du point Droit du segment S1 
        B[1][0] = s1.getP2().getX(); 
        B[1][1] = s1.getP2().getY();
        B[1][2] = 1;
        // la ligne 3 de la matrice B contient les cordonnées X, Y , 1  
        // du point Droit du segment S2 
        B[2][0] = s2.getP2().getX(); 
        B[2][1] = s2.getP2().getY();
        B[2][2] = 1;
        
        
        
        
        /*Matrice de la droite formée par les points (S2) coupe le segments formé par les point de [S1]  */
        
        // la ligne 1 de la matrice Ap contient les cordonnées X, Y , 1
        // du point Gauche du segment S2 
        Ap[0][0] = s2.getP1().getX(); 
        Ap[0][1] = s2.getP1().getY();
        Ap[0][2] = 1;
        // la ligne 2 de la matrice Ap contient les cordonnées X, Y , 1
        // du point Droit du segment S2 
        Ap[1][0] = s2.getP2().getX(); 
        Ap[1][1] = s2.getP2().getY();
        Ap[1][2] = 1;
        // la ligne 3 de la matrice Ap contient les cordonnées X, Y , 1
        // du point Gauche du segment S1 
        Ap[2][0] = s1.getP1().getX(); 
        Ap[2][1] = s1.getP1().getY();
        Ap[2][2] = 1;
        
        // la ligne 1 de la matrice Bp contient les cordonnées X, Y , 1
        // du point Gauche du segment S2
        Bp[0][0] = s2.getP1().getX(); 
        Bp[0][1] = s2.getP1().getY();
        Bp[0][2] = 1;
        // la ligne 2 de la matrice Bp contient les cordonnées X, Y , 1
        // du point Droit du segment S2
        Bp[1][0] = s2.getP2().getX(); 
        Bp[1][1] = s2.getP2().getY();
        Bp[1][2] = 1; 
        // la ligne 3 de la matrice Bp contient les cordonnées X, Y , 1
        // du point Droit du segment S1
        Bp[2][0] = s1.getP2().getX(); 
        Bp[2][1] = s1.getP2().getY();
        Bp[2][2] = 1;
        
        double detA  = determinant(A);
        double detB  = determinant(B);
        double detAp;
        double detBp;
     
         
        // On verifier si la (droite) formée par le segment (S1) coupe le segment [S2]
        if ( detA * detB < 0  ) {
            detAp = determinant(Ap);
            detBp = determinant(Bp);
            
            // On verifier si la (droite) formée par le segment (S2) coupe le segment [S1]
            if (detAp * detBp < 0 ) {
                // Si les 2 conditions sont respectées, alors les 2 segments se coupent
                return true;
            }
        }
        // Si les 2 conditions ne sont pas respectées, 
        // alors les 2 segments ne se coupent pas ! 
        return false;
    }
    

 

        
    /**
     * permet d'afficher le contenu de la matrice
     * @param matrice 
     */
    public static void afficher(float[][] matrice){
        for (int i = 0; i < matrice.length; i++) {
            for (int j = 0; j < matrice[0].length; j++) {
                System.out.print(matrice[i][j]+"  ");
            }
            System.out.println("");
        }
    }
 
    
    /**
     *  fonction qui calcul le temps d'execution des deux algorithmes 
     *  et donne les princiales informations comme le nombre de segment (n) 
     *  et le nombre de segments qui se coupent (k)   
     * @param nomMethode
     * @param listSeg
     * @return 
     * retourne un tableau qui contient le nombre segment, nombre d'intersection, et le temps d'execution
     */
    public static int[] tempsCalcul(String  nomMethode, ArrayList<Segment> listSeg){
        long startTime, endTime;
        int nb[] = new int[3];   
        int nbseg=listSeg.size();
        int nbinters=0;
      
                
        System.out.println("---------"+nomMethode+" ------------------");
        // On calcule le temps de debut d'execution du programme
        startTime = System.currentTimeMillis();
        if (nomMethode.equalsIgnoreCase(TOUTESLESPAIRES)) {
            // calcul du nombre d'intersection de segment et du temps d'execution par l'algorithme ToutesLesPaires
            nbinters = ToutesLesPaires.calculer(listSeg);
        }
        if (nomMethode.equalsIgnoreCase(BALAYAGE)) {
            // calcul du nombre d'intersection de segment par l'algorithme Balayage
            nbinters = Balayage_x.calculer(listSeg);
        }
        // On calcule le temps de fin d'execution du programme
        endTime = System.currentTimeMillis();  
        // On calcule le temps d'execution FINAL du programme qui est 
        // la difference entre le temps de fin et de debut du programme 
        System.out.println("Temps calcul = "+(endTime-startTime)+" ms ");
        System.out.println("nombre total de segment : "+listSeg.size());
        System.out.println("Nombre d'intersections : "+nbinters+"\n");
       
        nb[0]=nbseg;    // nombre segments
        nb[1]=nbinters; // nombre d'intersections
        nb[2]=(int)(endTime-startTime); // temps d'execution du programme
        
        return nb;
    }
    
 
   
}