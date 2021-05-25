/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridan.klemmerw.cardgameexample;

import java.util.Scanner;
/**
 *
 * @author klemm
 */
public class CardGameExample {
    
    public static void main(String[] args) {
        
        Card[] deck = new Card[4];
        
        Scanner input = new Scanner (System.in);
        System.out.println("Enter your card details :");
        
        for(int i=0; i<deck.length; i++)
        {
            //Card c1 = new Card();
            //deck[0]=c1;
            deck[i]= new Card(input.next(), input.nextInt());
        }
        
        for(int i=0; i<deck.length; i++)
        {
            System.out.println(deck[i].getSuit);
        }
    }
}
