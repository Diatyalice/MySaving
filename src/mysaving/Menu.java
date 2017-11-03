/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mysaving;

/**
 *
 * @author zhche5293
 */
public class Menu {
 double total=0;
 
public void add(double money){
    
    total += money;
   
}
 
 public double getTotal(){
     
     return total;
     
 }

public void take(double money){
    
    total -= money;
   
}


}
