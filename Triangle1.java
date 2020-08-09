/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package triangle1;

/**
 *
 * @author Admin
 */
import java.util.Scanner;
class trianglecheck
{
     static double  base,slantheight1,slantheight2;
     static double triangular(double a,double b,double c)
     {
          if(a<b+c && b<a+c && c<a+b)
          {
                return 1;
          }
          else
          {
               return 0;
          }
     }
}
public class Triangle1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("Enter the base value");
        Scanner obj=new Scanner(System.in);
        trianglecheck.base=obj.nextDouble();
        System.out.println("Enter the Slantheight1 value");
        trianglecheck.slantheight1=obj.nextDouble();
        System.out.println("Enter the Slantheight2 value");
        trianglecheck.slantheight2=obj.nextDouble();
        double  t= trianglecheck.triangular(trianglecheck. base,trianglecheck. slantheight1,trianglecheck. slantheight2);
        if(t==1)
        {
             System.out.println("It forms a triangle");
             
        }
        else
                {
                     System.out.println("It does not forms a triangle");
                     
                }
        
        }
    
}
