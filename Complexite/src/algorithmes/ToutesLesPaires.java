package algorithmes;

import maths.Calculateur;
import maths.Segment;
import java.util.ArrayList;


/*****************************************
 *    ALGORITHME TOUTESLESPAIRES         *
 *****************************************/
public class ToutesLesPaires {
    
    /**
     * permet de caluler le nombre de segment qui se coupent avec l'algorithme ToutesLesPaires
     * @param listSegment
     * @return k
     * retourne le nombre de segments qui se coupent
     */
    public static int calculer(ArrayList<Segment> listSegment){
        int k = 0;
        // Nous parcourons la liste des segments, en recuperant un segment S1.
        for (int i = 0; i < listSegment.size(); i++) {
                Segment s1 = listSegment.get(i);
                // on compare tous les autres segments segments (S1 exclu)
                for (int j = i+1; j < listSegment.size(); j++) {
                    Segment s2 = listSegment.get(j);
                    // On verifie si le projété X du point gauche du segment S1 
                    // est inferieur au projeté X du point gauche du segment S2
                    if (s1.getP1().getX() < s2.getP1().getX() ) {  
                        // Si Oui, On verifie si le projété X du point gauche du segment S2 
                        // est inferieur au projeté X du point droit du segment S1
                        if (s2.getP1().getX() < s1.getP2().getX() ){
                            // Si oui, on teste si les segments S1 et S2 se coupent
                            boolean b = Calculateur.se_coupe(s1, s2);
                            // Si ils se coupent, alors on incrémente le nombre de segments qui se coupent
                            if (b) {
                                k++;
                            }
                        }
                    }else{ // Si le projété X du point gauche du segment S1 
                           // n'est pas inferieur au projeté X du point gauche du segment S2
                        
                        // On verifie si le projété X du point droit du segment S1 
                        // est inferieur au projété X du point droite du segment S2
                        if (s1.getP1().getX()<s2.getP2().getX() ){
                            // Si oui, on teste si les segments S1 et S2 se coupent
                            boolean b = Calculateur.se_coupe(s1, s2);   
                            // Si ils se coupent, alors on incrémente le nombre de segments qui se coupent
                            if (b) {
                                k++;
                            }
                        }
                    }
                }
            }    
        return k;
    }
    

    
    
   
}
