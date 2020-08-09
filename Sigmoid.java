/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sigmoid;

/**
 *
 * @author Admin
 */
import java.util.Scanner;
class staticdemo
        {
             static double x;
             static double sigmoid(double a)
             {
                   return (1/(1-Math.exp(-x)));
             }
        }
public class Sigmoid {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
        System.out.println("Enter X value to perform Sigmoid Function");
        Scanner obj=new Scanner(System.in);
        double b;
        staticdemo.x=obj.nextDouble();
        b=staticdemo.sigmoid(staticdemo.x);
        System.out.println(b);
        
        
    }
    
}
