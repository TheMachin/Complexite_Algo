package tests;


import java.util.ArrayList;
import java.util.Random;
import maths.Calculateur;
import maths.Point;
import maths.Segment;


public class Exemples {

    /***********************************
     *           EXEMPLE 1             *
     ***********************************/
    /**
     * Nous testons si deux segments qui sont confondus sont sécants.
     */
    public static  void exemple1(){
        Fenetre frame =  new Fenetre("Exemple 1: 2 segments confondus");
        ArrayList<Segment> listSeg = new ArrayList();
        Point p1 = new Point(10,10);
        Point p2 = new Point(30,30);
        Point p3 = new Point(20,20);
        Point p4 = new Point(40,40);              
        Segment s1 = new Segment(p1,p2);
        Segment s2 = new Segment(p3,p4);
        listSeg.add(s1);
        listSeg.add(s2);
        for (Segment segment : listSeg) {
            frame.ajouterSegment(segment);
        }   
        Calculateur.tempsCalcul(Calculateur.TOUTESLESPAIRES, listSeg);
        Calculateur.tempsCalcul(Calculateur.BALAYAGE, listSeg);
    }
    
    
    
   

    /******************************
     *          EXEMPLE 2         *
     *****************************/

    /**
     * Nous testons si deux segments sont sécants lorsque une de leur extrémité 
     * est confondus entre les deux segments.
     */
    public static  void exemple2(){
        Fenetre frame = new Fenetre("Exemple 2: segments avec sommets confondus"); // creation de la fenetre
        ArrayList<Segment> listSeg = new ArrayList();
        Point p1 = new Point(10,10);
        Point p2 = new Point(20,30);
        Point p3 = new Point(20,30);
        Point p4 = new Point(30,40);              
        Segment s1 = new Segment(p1,p2);
        Segment s2 = new Segment(p3,p4);
        listSeg.add(s1);
        listSeg.add(s2);

        for (Segment segment : listSeg) {
            frame.ajouterSegment(segment);
        }   
       
        Calculateur.tempsCalcul(Calculateur.TOUTESLESPAIRES, listSeg);
        Calculateur.tempsCalcul(Calculateur.BALAYAGE, listSeg);    
    }
    
  
    
    
    /**************************
     *    EXEMPLE 3           *
     **************************/
    
    /**
     * Nous testons si deux segments sont sécants lorsque une des extrémités 
     * d'un segment appartient à l'autre.
     */
    public static  void exemple3(){
        Fenetre frame = new Fenetre("Exemple 3: une des extrémités du segment appartient à l'autre "); // creation de la fenetre
        ArrayList<Segment> listSeg = new ArrayList();
        Point p1 = new Point(10,10);
        Point p2 = new Point(40,40);
        Point p3 = new Point(20,20);
        Point p4 = new Point(40,20);              
        Segment s1 = new Segment(p1,p2);
        Segment s2 = new Segment(p3,p4);
        listSeg.add(s1);
        listSeg.add(s2);
        for (Segment segment : listSeg) {
            frame.ajouterSegment(segment);
        }           
        Calculateur.tempsCalcul(Calculateur.TOUTESLESPAIRES, listSeg);
        Calculateur.tempsCalcul(Calculateur.BALAYAGE, listSeg); 
    }
    

    /*****************************
     *     EXEMPLE 4             *
     *****************************/
    
    /**
     * Nous testons simplement deux segments sécants pour voir si les deux 
     * algorithmes trouve le même k.
     */
    public static  void exemple4(){
        Fenetre frame = new Fenetre("Exemple 4: les segment se coupent "); // creation de la fenetre
        ArrayList<Segment> listSeg = new ArrayList();
        Point p1 = new Point(10,10);
        Point p2 = new Point(30,30);
        Point p3 = new Point(20,10);
        Point p4 = new Point(20,30);              
        Segment s1 = new Segment(p1,p2);
        Segment s2 = new Segment(p3,p4);
        listSeg.add(s1);
        listSeg.add(s2);
        for (Segment segment : listSeg) {
            frame.ajouterSegment(segment);
        }           
        Calculateur.tempsCalcul(Calculateur.TOUTESLESPAIRES, listSeg);
        Calculateur.tempsCalcul(Calculateur.BALAYAGE, listSeg); 
    }
    
    
    
   //===========================================================================
   //===========================================================================
   //                                Exemple 5
   //===========================================================================
   //===========================================================================
    
     /*
     * Nous testons si des segments générés aléatoirement sont sécants pour voir
     * si les deux algorithmes trouve le même k.
     */
    public static  void exemple5(){
        Fenetre frame = new Fenetre("Exemple 5: Exemple aléatoire de 5 segments "); // creation de la fenetre
        ArrayList<Segment> listSeg = new ArrayList();
        Random r = new Random();      
        float x1, y1, x2, y2;
        Point p1,p2;
        for (int i = 0; i < 5; i++) {
            x1 = r.nextInt(50);
            y1 = r.nextInt(50);
            x2 = r.nextInt(50);
            y2 = r.nextInt(50);
            
            p1 = new Point(x1,y1);
            p2 = new Point(x2,y2);
            
            Segment seg = new Segment(p1,p2);
            listSeg.add(seg);
            
             
            frame.ajouterSegment(seg);
        }
        Calculateur.tempsCalcul(Calculateur.TOUTESLESPAIRES, listSeg);
        Calculateur.tempsCalcul(Calculateur.BALAYAGE, listSeg); 
    }
    

   
    //===========================================================================
   //===========================================================================
   //                                Exemple 6
   //===========================================================================
   //===========================================================================
    
     /*
     * Nous testons si des segments générés aléatoirement sont sécants pour voir
     * si les deux algorithmes trouve le même k.
     */
    public static  void exemple6(){
        Fenetre frame = new Fenetre("Exemple 6: Exemple aléatoire de 8 segments "); // creation de la fenetre
        ArrayList<Segment> listSeg = new ArrayList();
        Random r = new Random();      
        float x1, y1, x2, y2;
        Point p1,p2;
        for (int i = 0; i < 8; i++) {
            x1 = r.nextInt(50);
            y1 = r.nextInt(50);
            x2 = r.nextInt(50);
            y2 = r.nextInt(50);
            
            p1 = new Point(x1,y1);
            p2 = new Point(x2,y2);
            
            Segment seg = new Segment(p1,p2);
            listSeg.add(seg);
            
             
            frame.ajouterSegment(seg);
        }
        Calculateur.tempsCalcul(Calculateur.TOUTESLESPAIRES, listSeg);
        Calculateur.tempsCalcul(Calculateur.BALAYAGE, listSeg); 
    }
    
}
