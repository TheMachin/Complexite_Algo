/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tests;

import java.util.Scanner;


/**
 *
 * @author macbook
 */
public class Main {
    
    public static void lancerLesExemples(){
        int choix=0;
        while(choix != 8){
            System.out.println("------EXEMPLES------");
            System.out.println(" 1 - Exemple 1      |");
            System.out.println(" 2 - Exemple 2      |");
            System.out.println(" 3 - Exemple 3      |");
            System.out.println(" 4 - Exemple 4      |");
            System.out.println(" 5 - Exemple 5      |");
            System.out.println(" 6 - Exemple 6      |");
            System.out.println(" 7 - Menu Précédent |");
            System.out.println(" 8 - Quitter        |");
            System.out.println("--------------------");
            System.out.println("Quelle est votre choix ? :");
            Scanner s = new Scanner(System.in);
            String strchoix = s.nextLine();
            choix = Integer.parseInt(strchoix);
            
            switch (choix){
                case 1: System.out.println("\n----Exemple 1---------");
                        System.out.println("--2 segments confondus--\n");
                        Exemples.exemple1();
                        break;   
                case 2: System.out.println("\n---------Exemple 2----------------");
                        System.out.println("--segments avec sommets confondus--\n");
                        Exemples.exemple2();
                        break; 
                case 3: System.out.println("\n----------Exemple 3------------------------------------");
                        System.out.println("--une des extrémités du segment appartient à l'autre--\n");
                        Exemples.exemple3();
                        break; 
                case 4: System.out.println("\n-------Exemple 4--------");
                        System.out.println("--les segment se coupent--\n");
                        Exemples.exemple4();
                        break; 
                case 5: System.out.println("\n------------Exemple 5--------------");
                        System.out.println("--exemple aléatoire de 5 segments--\n");
                        Exemples.exemple5();
                        break;
                case 6: System.out.println("\n-------------Exemple 6-------------");
                        System.out.println("----exemple aléatoire de 8 segments--\n");
                        Exemples.exemple6();
                        break; 
                case 7: menu();
                        break;
                default: menu();
                        break;
            }
        }
        
    }
    
    
    
    
    public static void lancerLesJeuxDeTest(){
        int choix=0;
        while(choix != 5){
            System.out.println("------JEUX DE TEST -----");
            System.out.println(" 1 - Jeu de Test 1      |");
            System.out.println(" 2 - Jeu de Test 2      |");
            System.out.println(" 3 - Jeu de Test 3      |");
            System.out.println(" 4 - Menu Précédent     |");
            System.out.println(" 5 - Quitter            |");
            System.out.println("------------------------");
            System.out.println("Quelle est votre choix ? :");
            Scanner s = new Scanner(System.in);
            String strchoix = s.nextLine();
            choix = Integer.parseInt(strchoix);
            
            int n;
            switch (choix){
                case 1: System.out.println("\n--Jeu de test 1--\n");
                        n = entrer_nbre_segment();
                        JeuxTests.jeuTest_i(n);
                        break;   
                case 2: System.out.println("\n--Jeu de test 2--\n");
                        n = entrer_nbre_segment();
                        JeuxTests.jeuTest_ii(n);
                        break; 
                case 3: System.out.println("\n--Jeu de test 3--\n");
                        n = entrer_nbre_segment();
                        JeuxTests.jeuTest_iii(n);
                        break; 
                case 4: menu();
                        break;
                default: menu();
                        break;
            }
        }
        
    }
    
    
    public static void menu(){
        int choix=0;
        while(choix != 3){
            System.out.println("----------MENU---------------");
            System.out.println(" 1 - Lancer les exemples     |");
            System.out.println(" 2 - Lancer les jeux de test |");
            System.out.println(" 3 - Quitter                 |");
            System.out.println("-----------------------------");
            System.out.println("Quelle est votre choix ? :");
            Scanner s = new Scanner(System.in);
            String strchoix = s.nextLine();
            choix = Integer.parseInt(strchoix);
            
            
            switch (choix){
                case 1: lancerLesExemples();
                        break;   
                case 2: lancerLesJeuxDeTest();
                        break; 
                default:break;
            }
        }
        
    }
    
    public static int entrer_nbre_segment(){
        System.out.println("Entrez le nombre de segment : ");
        Scanner s = new Scanner(System.in);
        int val = s.nextInt();
        return val;
    }
    
    
    public static void main(String[] args) {
        menu();
    }
    
}
