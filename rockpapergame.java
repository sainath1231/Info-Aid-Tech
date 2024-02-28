//package technonohacks;
import java.util.*;
import java.util.random.*;

public class rockpapergame {
    public static void main(String[] args) {
        Random r=new Random();
        int i=r.nextInt(3);
       System.out.println(i + " is the computer's choice");
            if (i==0) {
                System.out.println( "The computer chose Rock."); 
            } else if (i==1) {
                System.out.print("The computer chose Paper."); 
            } else {
                System.out.println("The computer chose Scissors."); 
                
            }





       
        System.out.println("Enter your choice");
        System.out.println("0.rock \n1.paper\n2.scissors");
        Scanner sc = new Scanner(System.in);
        int j = sc.nextInt();
        while(true){

        
        if (j == 1 && i==1 || j == 0 && i==0|| j == 2 && i==2 ) {
            System.out.println("It's a draw!");
            break;
        } else if ((j == 0 && i==2) || (j ==  1 && i==0)  || (j == 2 && i==1)) {
            System.out.println("You win! The computer chose " + i );
           // System.out.println("You win! Computer chose Scissors.");
           break;
        } else {
            System.out.println("Computer wins! You chose ."+j);
            break;
        }
       
    }
    }
    }

