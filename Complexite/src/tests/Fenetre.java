package tests;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.util.ArrayList;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import maths.Segment;


public class Fenetre  extends JFrame{
    
    public Fenetre(String title) {
        super(title);
        this.setLayout(new BorderLayout());
        this.setBounds(300, 300, 500, 500);
        //this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    
     
    
    public void ajouterSegment(Segment s){
        this.getContentPane().add(s);
        this.setVisible(true);
    }
    

    
    
    
}
