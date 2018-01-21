/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guessgame;

/**
 *
 * @author asus
 */
public class GuessGame {
    
    Player p1;
    Player p2;  /* Guess the games instance variable */
    Player p3;
    
    
    public void startGame(){
        
        p1 = new Player();
        p2 = new Player();  /* Create three players */
        p3 = new Player();
        
        int guessp1 = 0;
        int guessp2 = 0;    /* Declare three variables to hold number player guesses */
        int guessp3 = 0;
        
        boolean p1isRight = false;
        boolean p2isRight = false;
        boolean p3isRight = false;
        
        int targetNumber = (int) (Math.random()*10); //tebak angka random
        System.out.println("Angka dari 0 sampai 9");
        
        while(true){ //Cek tebakan sampe ketemu
            
            System.out.println("Tebakan angka adalah "+targetNumber);
            
            p1.guess();
            p2.guess();
            p3.guess(); 
            
            guessp1 = p1.number;
            System.out.println("Pemain 1 menebak angka "+guessp1);
            
            guessp2 = p2.number;
            System.out.println("Pemain 2 menebak angka "+guessp2);
            
            guessp3 = p3.number;
            System.out.println("Pemain 3 menebak angka "+guessp3);
            
            System.out.println();
            
            if(guessp1==targetNumber) p1isRight = true;
            
            if(guessp2==targetNumber) p2isRight = true;
            
            if(guessp3==targetNumber) p3isRight = true;
            
            if(p1isRight || p2isRight || p3isRight){
                
                System.out.println("Yey, terdapat pemenangg!!!");
                System.out.println("Apakah pemain 1 berhasil? " + p1isRight);
                System.out.println("Apakah pemain 2 berhasil? " + p2isRight);
                System.out.println("Apakah pemain 3 berhasil? " + p3isRight);
                System.out.println("Game selesai.");
                break; //
            }
            else{
                
                System.out.println("Ulang, tidak ada yang menang.");
            }
        }
        
    }
    
}
