/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package counter;

/**
 *
 * @author Admin
 */
import java.util.Scanner;
class counter1
{
     static int x;
     void nonstatic()
     {
            Scanner obj=new Scanner(System.in);
            int i=0,count=0,a;
            char ch;
            
        do{
              System.out.println("Enter the number  "+(i+1));
              a=obj.nextInt();
              System.out.println("The number entered by user"+a);
              count++;
              System.out.println("If you want to enter more number press y else press any character  ");
              ch=obj.next().charAt(0);
              i++;
             }while(ch=='y');
             System.out.println("Tolum numbers entered ="+count);
     }
    
   void  static1()
{
            Scanner obj=new Scanner(System.in);
            int i=0,count=0,a;
            char ch;
             do{
              System.out.println("Enter the number  "+(i+1));
              a=obj.nextInt();
              System.out.println("The number entered by user"+a);
              count++;
              System.out.println("If you want to enter more number press y else press any character  ");
              ch=obj.next().charAt(0);
              i++;
             }while(ch=='y');
             System.out.println("Tolum numbers entered ="+count);
  }
}
public class Counter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner obj=new Scanner(System.in);
        counter1 obj1=new counter1();
        char c;
        System.out.println("Enter s for static and n for non static ");
        c=obj.next().charAt(0);
        if(c=='s')
        {
             obj1.static1();
        }
        else if(c=='n')
        {
             obj1.nonstatic();
        }
 
        
          
    }
}
