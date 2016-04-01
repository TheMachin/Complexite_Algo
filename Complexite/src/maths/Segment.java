package maths;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

//=====================================================
//=====================================================
//                  CLASSE SEGMENT
//=====================================================
//=====================================================

/* classe qui permet de construire un segment en regroupant 2 points dans un objet*/

public class Segment extends JPanel implements Comparable{
   
    /*--déclarations des variables--*/
    private Point p1;
    private Point p2;

    
     /*--constructeur--*/
    public Segment(Point p1, Point p2) {
        // Si l'abscisse de p1 est inferieur ou egale à l'abscisse p2 
        // alors le point p1 est l'extrémité gauche
        if(p1.getX() <= p2.getX()){ 
            this.p1 = p1;
            this.p2 = p2;
        }else{
            // Si l'abscisse de p2 est inferieur ou egale à l'abscisse p1 
            // alors le point p2 est l'extrémité gauche
            this.p1 = p2;
            this.p2 = p1;
        }
    }

    
    /*--accesseurs--*/
    public Point getP1() {
        return p1;
    }

    public void setP1(Point p1) {
        this.p1 = p1;
    }

    public Point getP2() {
        return p2;
    }

    public void setP2(Point p2) {
        this.p2 = p2;
    }
    
    
    @Override
    public String toString(){
        return "Point gauche = "+this.p1.toString()+"\n"
                +"Point droit = "+this.p2.toString()+"\n";
    }
    

    /*--dessine un segment sur la sortie graphique--*/
    @Override
    public void paintComponent(Graphics graphics) {
        
        /* génération de couleurs de segments aléatoires */
        int r = (int)(Math.random()*256);
        int g = (int)(Math.random()*256);
        int b = (int)(Math.random()*256);
        Color randomColor = new Color(r,g,b);    
        graphics.setColor(randomColor);
       
        /* par défaut l'origine d'un graphe se situe sur le haut du coté gauche d'un écran
         * sur AWT pour obtenir une bonne orientation du graphe, on met 
         * toutes les coordonnées y en négatif.
         */
        
        /* pour centrer les segments dans l'interface graphique, on ajoute une valeur aux 
         * coordonnées des points.Pour garder une échelle correcte, on multiplie 
         * la valeur des coordonnées par un meme nombre.
         */
        graphics.drawLine((int)(this.p1.getX()*10)+150, (int)(this.p1.getY()*10)+150,
                (int)(this.p2.getX()*10)+150, (int)(this.p2.getY()*10)+150);
       
    }


    
    /**
     * fonction permettant de comparer deux segments par leur point Gauche
     * @param o
     * @return 
     */
    @Override
    public int compareTo(Object o) {
        Segment s = (Segment)o;
        if ( this.p1.getX() > s.getP1().getX() ) {
            return 1;
        }else if (this.p1.getX() == s.getP1().getX()) {
            return 0;
        }else{
            return -1;
        }
    }
}
