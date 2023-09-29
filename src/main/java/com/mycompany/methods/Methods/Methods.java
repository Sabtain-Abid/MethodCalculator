/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */


//    
//   public static int add( int a ,int b)  //created a method to do addition
//   {
//       return a + b;          // return value when called
//   }
//   
//   public static int sub( int a ,int b)   //created a method to do subtraction
//   {
//       return a - b;           // return value when called
//   }
//    
//   
//   public static int mul( int a ,int b)   //created a method to do Multiplication
//   {
//       return a * b;          // return value when called
//   }
//    
//   public static int div( int a ,int b)    //created a method to do Division
//   {
//       if(b == 0){
//           return 0;
//       }
//       else
//       return a / b;            // return value when called
//   }
//    
//   
//    public static void main(String[] args) {     // Main to run all the Methods
//        Scanner input = new Scanner(System.in);
//        System.out.print("Enter the first number to perform operation:- ");
//        int x= input.nextInt();
//        
//         System.out.print("Enter the second number to perform operation:- ");
//        int y= input.nextInt();
//        
//         System.out.println("Enter the operator to perform operation");
//         
//          System.out.println("Enter the 1 to perform addition operation:- ");
//          
//          System.out.println("Enter the 2 to perform subtration operation:- ");
//          
//          System.out.println("Enter the 3 to perform Multiplication operation:- ");
//          
//          System.out.println("Enter the 4 to perform division operation:- ");
//        int z = 0;
//        int choice =input.nextInt();
//        switch(choice)          //Choose one operator to perform operation 
//        {
//            case 1:
//            
//                z=add(x,y);
//                break;
//        
//            case 2:
//             
//                z=sub(x,y);
//                break;
//        
//          
//            case 3:
//            
//                z=mul(x,y);
//                break;
//       
//           
//            case 4:
//            
//            z=div(x ,y);
//                break;
//            default:
//                System.out.println("Invalid choice.");
//                return; // Exit the program if an invalid choice is provided
//        }
//
//      System.out.print("Result is:- " +z);


package com.mycompany.methods.Methods;

import java.lang.reflect.Method;
import java.util.Scanner;
import javax.naming.spi.DirStateFactory.Result;

/**
 *
 * @author Hp
 */
public class Methods {   //built a class name as Method
//
    
    public static int add(int a, int b)
    {
       return a + b; 
    }
    
    public static int sub(int a, int b)
    {
       return a - b; 
    }
    
      public static int mul(int a, int b)
    {
       return a * b; 
    }
    
    public static int div(int a, int b)
    {
        if(b == 0){
            return 0;
        }
        else
       return a / b; 
    }
    
    public void displayresult(int result)
    {
        System.out.println("Result is :-  " +result);
    }
    
      public static void main(String[] args) {

      Methods op = new Methods();
          int x=5 , y = 2 ;
          System.out.println("Enter the operator to perform operation");
         
          System.out.println("Enter the 1 to perform addition operation:- ");
          
          System.out.println("Enter the 2 to perform subtration operation:- ");
          
          System.out.println("Enter the 3 to perform Multiplication operation:- ");
          
          System.out.println("Enter the 4 to perform division operation:- ");
        int z = 0;
        Scanner ch = new Scanner(System.in);
        int choice =ch.nextInt();
        switch(choice)          //Choose one operator to perform operation 
        {
            case 1:
            
                z=op.add(x,y);
            op.displayresult(z);
                break;
        
            case 2:
             
                z=op.sub(x,y);
            op.displayresult(z);
                break;
        
          
            case 3:
            
                z=op.mul(x,y);
            op.displayresult(z);
                break;
       
           
            case 4:
            
            z=op.div(x ,y);
            op.displayresult(z);
                break;
            default:
                System.out.println("Invalid choice.");
                return;
        }
        }}