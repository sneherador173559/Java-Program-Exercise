package asssignment1;

import java.util.Scanner;

public class GradingSystem {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
        int number, n;
        
        System.out.print("How many Time You want take Input : ");
        n = sc.nextInt();
        
        for(int i = 10; i >= 1; i--){    
            number = sc.nextInt();
            
            switch(number/10){
                case 0:
                    if(number < 0){
                        System.out.println("You Input is Wrong !");
                        break;
                    }            
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                    System.out.println("You Got F");
                    break;
                case 6:
                    System.out.println("You Got D");
                    break;
                case 7:
                    System.out.println("You Got C");
                    break;
                case 8:
                    System.out.println("You Got B");
                    break;
                case 9:
                case 10:
                    if(number >=90 && number <=100){
                        System.out.println("You Got A");
                        break; 
                    }             
                default:
                    System.out.println("Your Input is Wrong !");
                    break;
            }
        }
	}
}
