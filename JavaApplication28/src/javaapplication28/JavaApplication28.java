/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication28;
import java.util.Scanner;
/**
 *
 * @author hekimcanaktas
 */
public class JavaApplication28 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

Scanner scanner = new Scanner(System.in);
       

double boy,bki;


int kilo;

        System.out.println("Kilonuzu kg cinsinden giriniz: ");
        
        kilo = scanner.nextInt();
        
        System.out.println("Boyunuzu metre cinsiden giriniz: ");
        boy = scanner.nextDouble();
        bki = (kilo *(boy*boy));
        
        if (bki<18.5){
            System.out.println("Zayıf");
        }
        else if(bki>= 18.5 && bki<25){
            System.out.println("Normal");
        }
        else if(bki >=25 && bki<30){
            System.out.println("Fazla kilolu");
        }
        
        
        else{
            System.out.println("Obez");
        }
        
        }
    
}
