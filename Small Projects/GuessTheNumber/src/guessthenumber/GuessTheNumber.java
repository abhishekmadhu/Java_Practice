package guessthenumber;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author abhishek
 */
public class GuessTheNumber {

    int theNumber;
    int max;
    Scanner scanner = new Scanner(System.in);
    
    public GuessTheNumber() {
        Random rand = new Random();
        max=100;
        theNumber = Math.abs(rand.nextInt()) % (max + 1);
    }
    
    public void play(){
        while(true){
            int move = scanner.nextInt();
            if (move < theNumber){
            System.out.println("Your number is too small");
            } else if(move > theNumber){
                System.out.println("Your number is too big");
            } else{
                System.out.println("You got it bro!");
            break;
            }
        }   
    }
    
    
    
    
    
    public static void howBigIsMyNumber(int x){
       if(x >= 0 && x <=100){
           System.out.println("Our number is pretty small");
       } else if(x>=11 && x<=100){
           System.out.println("Our number is pretty big");
       } else{
           System.out.println("Out of range");
       }
    }
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        GuessTheNumber guessgame = new GuessTheNumber();
        System.out.println("Welcome");
        guessgame.play();
    }
    
}
