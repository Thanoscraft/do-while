/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javadowhile3;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Javadowhile3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner scanner = new Scanner (System.in);
     
     int senhacorreta = 12345;
     int senha;
     int i = 0;
    do { 
      System.out.println("Digite um senha");
      senha = scanner.nextInt();
        if(senha == senhacorreta){
 
        }
     i++;
  } while(senha != senhacorreta);
     System.out.println("correto");
     }
   
         
}

 
