/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package constructor1;

/**
 *
 * @author Admin
 */
import java.util.Scanner;
class circle
{
      double r=1.5;
      double radius;
      String colour="RED";
      circle(double r )
      {
           radius=r;
            
      }
      circle()
      {
           radius=1.0;
           colour="RED";
      }
      public double getradius()
      {
            double r;
            Scanner obj=new Scanner(System.in);
            System.out.println("Enter radius");
            r=obj.nextDouble();
            return r;
      }
      public double getarea(double r)
      {
           return r*r*3.14;
           
       }
}
public class Constructor1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        circle obj1=new circle();
        System.out.println("The values of default constructor is . . . .");
        System.out.println("The radius is "+obj1.radius);
        System.out.println("The colour is "+obj1.colour);
        
        double a;
        a=obj1.getradius();
        circle obj2=new circle(a);
        System.out.println("The values of paramatrized constructor is . . . .");
        System.out.println("....................");
        System.out.println("The radius is "+obj2.radius);
        System.out.println("The area is "+obj2.getarea(a));
        
        
        
       
        
        
        
    }
    
}
