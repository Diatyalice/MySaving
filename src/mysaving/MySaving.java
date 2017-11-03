
package mysaving;

import java.util.Scanner;
public class MySaving {

   
    public static void main(String[] args) {
        
        Menu bank = new Menu();
        
        System.out.println("1.Show total in bank."); 
        System.out.println("2.Add a peny.");
        System.out.println("3.Add a nickel.");
        System.out.println("4.Add a dime. ");
        System.out.println("5.Add a quarter.");
        System.out.println("6. Take money out of bank.");
        System.out.println("Enter 0 to quit.");
        System.out.println("Enter your choice:");
        Scanner choice = new Scanner(System.in);
        
        
        while(true){
            
        int x = choice.nextInt();
            
        if(x==1){
            double total = bank.getTotal();
            System.out.println("Your total is: "+total);
        }else if(x==2){
            bank.add(0.01);
            double total = bank.getTotal();
            System.out.println("Your total is: "+total);
        }else if(x==3){
            bank.add(0.05);
            double total = bank.getTotal();
            System.out.println("Your total is: "+total);
        }else if(x==4){
            bank.add(0.10);
            double total = bank.getTotal();
            System.out.println("Your total is: "+total);
        }else if(x==5){
            bank.add(0.25);
            double total = bank.getTotal();
            System.out.println("Your total is: "+total);
        }else if(x==6){
            Scanner amount = new Scanner(System.in);
            System.out.println("Enter money tjay you want take out.");
            double out=amount.nextDouble();
            bank.take(out);
            double total = bank.getTotal();
            System.out.println("Your total is: "+total);
        }else if (x == 0){
            
            double total = bank.getTotal();
            System.out.println("Your total is: "+total);
            
            break;
            
        }    
        
        
        
        
        
        
        
        }
    
    
    
    
    
    }
    
}
