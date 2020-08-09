/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package current;

/**
 *
 * @author Admin
 */
import java.util.Scanner;
 class electricity
{
     int connum;
     String name;
     int prevnum;
     int curnum;
     double u;
     public double domestic(double unit)
     {
          if (unit<=100)
          {
               unit=unit*1.50;
               return unit;
               
          }
          else if(unit>101 && unit<=200)
          {
                unit=unit*3;
                return unit;
          }
          else if(unit >201 && unit<=500)
          {
               unit=unit*4.50;
               return unit;
               
                       
          }
          else
          {
               unit=unit*7;
               return unit;
               
          }
     }
     public double commercial(double unit)
     {
      
          
          if (unit<=100)
          {
               unit=unit*2.50;
               return unit;
               
          }
          else if(unit>101 && unit<=200)
          {
                unit=unit*5;
                return unit;
          }
          else if(unit >201 && unit<=500)
          {
               unit=unit*6.50;
               return unit;
               
                       
          }
          else
          {
               unit=unit*9;
               return unit;
               
          }
     }

     
 }

public class Current {

    /**
     * @param args the command line arguments
     */
   
    public static void main(String[] args) {
        // TODO code application logic here
        electricity obj1=new electricity();
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter Consumer name and number:");
        obj1.name=obj.next();
        obj1.connum=obj.nextInt();
        System.out.println("Enter previous month reading :");
        obj1.prevnum=obj.nextInt();
        System.out.println("Enter current  month reading :");
        obj1.curnum=obj.nextInt();
        System.out.println("The consumer details are:.........");
        System.out.println("Name="+obj1.name);
        System.out.println("Consumer No."+obj1.connum);
        obj1.u=obj1.curnum-obj1.prevnum;
        System.out.println("Actual Current Reading"+obj1.u);
      
        System.out.println("Enter type of EB connection:");
       char type=obj.next().charAt(0);
        if(type=='d')
        {
              double d= obj1.domestic( obj1.u);
              System.out.println("Your Current Tariff ="+d);
        }
        else if(type=='c')
          {
                     double c= obj1.commercial(obj1.u);
                     System.out.println("Your Current Tariff ="+c);
                     
           }
         
        
        
        
        
        
        
        
        
        
        
    }
    
}
