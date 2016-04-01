package tests;

import java.util.ArrayList;
import java.util.Random;
import maths.Calculateur;
import maths.Point;
import maths.Segment;


public class JeuxTests {
    

    /************************************
     *        Jeu i                     *
     ************************************/
    
    /**
     * Les deux sommets de chaque segment sont tirés aléatoirement dans 
     * l’intervalle [0,n].
     * @param n 
     */
    public static void jeuTest_i(int n){
        Fenetre frame = new Fenetre("JEU-TEST I  avec ("+n+") segments"); // creation de la fenetre
        
        ArrayList<Segment> listSeg = new ArrayList();
        Random r = new Random();
        float x1, y1, x2, y2;
        Point p1,p2;
        for (int i = 0; i < n; i++) {
            x1 = r.nextInt(n+1);
            y1 = r.nextInt(n+1);
            x2 = r.nextInt(n+1);
            y2 = r.nextInt(n+1);
            
            p1 = new Point(x1,y1);
            p2 = new Point(x2,y2);
            
            Segment seg = new Segment(p1,p2);
            listSeg.add(seg);
            frame.ajouterSegment(seg);
        }
        Calculateur.tempsCalcul(Calculateur.TOUTESLESPAIRES, listSeg);
        Calculateur.tempsCalcul(Calculateur.BALAYAGE, listSeg);
    }
    

    

    /************************************
     *      Jeu ii                      *
     ************************************/
    /**
     * Le sommet gauche est tiré aléatoirement dans l’intervalle [0,n] et le 
     * segment a une hauteur et largeur égale à 1.
     * @param n 
     */
    public static void jeuTest_ii(int n){
        Fenetre frame = new Fenetre("JEU-TEST II  avec ("+n+") segments"); // creation de la fenetre
        
        ArrayList<Segment> listSeg = new ArrayList();
        Random r = new Random();
        float x1, y1, x2, y2;
        Point p1,p2;
        Segment seg;
        
        for (int i = 0; i < n; i++) {
            x1 = r.nextInt(n);
            y1 = r.nextInt(n);
            p1 = new Point(x1,y1);
            
            int choix = new Random().nextInt(2);
            if (choix == 0) {
                p2 = new Point(x1+1,y1+1);
                seg = new Segment(p1,p2);
            }else{
                p2 = new Point(x1+1,y1-1);
                seg = new Segment(p1,p2);
            }
            listSeg.add(seg);
            frame.ajouterSegment(seg);
        }
        Calculateur.tempsCalcul(Calculateur.TOUTESLESPAIRES, listSeg);
        Calculateur.tempsCalcul(Calculateur.BALAYAGE, listSeg);
    }
    
    
    
    /******************************
     *     Jeu iii                *
     ******************************/

    /**
     * Le sommet gauche est également tiré aléatoirement dans l’intervalle [0,n] 
     * et la largeur et la hauteur du segment sont tirées aléatoirement et 
     * indépendamment dans l’intervalle [1, √n].
     * @param n
     */
    public static void jeuTest_iii(int n){
        Fenetre frame = new Fenetre("JEU-TEST III  avec ("+n+") segments"); // creation de la fenetre
        
        ArrayList<Segment> listSeg = new ArrayList();
        Random r = new Random();
        float x1, y1, x2, y2;
        Point p1,p2;
        Segment seg;     
        for (int i = 0; i < n; i++) {
            x1 = r.nextInt(n);
            y1 = r.nextInt(n);
            p1 = new Point(x1,y1);
            
            double racine = Math.sqrt(n);
            float rFloat = (float)racine;
            int valEntiereRacine = Math.round(rFloat);
            int val = r.nextInt(valEntiereRacine)+1;
            
            int alea = new Random().nextInt(2);
            if (alea == 0) {
                p2 = new Point(x1+val,y1+val);
            }else{
                p2 = new Point(x1+val,y1-val);
            }
            seg = new Segment(p1,p2);           
            listSeg.add(seg);
            frame.ajouterSegment(seg);
        }
        Calculateur.tempsCalcul(Calculateur.TOUTESLESPAIRES, listSeg);
        Calculateur.tempsCalcul(Calculateur.BALAYAGE, listSeg);
    }
    
}
