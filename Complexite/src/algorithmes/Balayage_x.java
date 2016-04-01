package algorithmes;

import maths.Segment;
import java.util.ArrayList;
import java.util.Collections;
import maths.Calculateur;



/*****************************************
 * ALGORITHME BALAYAGE_X test
 ****************************************/
public class Balayage_x {

    
    
    /**
     * permet de calculer le nombre de segment qui se coupe avec l'algorithme de Balayage
     * @param listSegment
     * @return 
     * retourne le nombre de segments qui se coupe dans la liste des segments
     */
    public static int calculer(ArrayList<Segment> listSegment){
        // on trie l'ensemble des segments (avec un algorithme de complexité (n log n)
        Collections.sort(listSegment); 
        int k=0;
        int j;
        // Nous parcourons la liste des segments et pointons avec i le segment S.
        for (int i = 0; i < listSegment.size(); i++) {
                Segment S = listSegment.get(i);
                j=i+1;
                // Tant que le point droit du segment S et inférieur au point gauche du segment D 
                while ((j< listSegment.size())&&(S.getP2().getX() > listSegment.get(j).getP1().getX())) {
                    // Test pour voir si deux segments se coupent
                    boolean b = Calculateur.se_coupe(S, listSegment.get(j));
                    if (b) {
                        k++;
                    } 
                    j++;
                }
            }
        return k;
    }

    
    
    
    /**
     * Permet d'afficher les coordonnées des points des segments.
     * Nous l'avions utilisé pour les premiers tests.
     * @param listeDesSegments 
     */
    public static void afficherListeDesSegments(ArrayList<Segment> listeDesSegments){
        for (Segment seg : listeDesSegments){
            System.out.println(seg.toString());
	}
    }

}


