/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication17;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class JavaApplication17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner obj= new Scanner(System.in);
        System.out.println("enter your numbers");
        int num=obj.nextInt();
         
        switch(num)
        {
            case 1:System.out.println("check balance");
            break;
            case 2:System.out.println("fast cash");
            break;
            case 3 :System.out.println("other amount");
            break;
            case 4:System.out.println("modelus cash");
            break;
            
            default:System.out.println("invalid"); 5
                    5
           
        }


    }
    
}
