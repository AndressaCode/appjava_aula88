/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import entities.Product;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Andressa Silva
 */
public class Program {
    
    public static void main(String[] args){
    
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter number of products: ");
        int n = sc.nextInt();
        
        Product[] vect = new Product[n];
        
        for(int i=0; i<vect.length; i++){
            sc.nextLine();
            System.out.printf("Name of product [%d]:  ", i);
            String name = sc.nextLine();
            System.out.printf("Price of product [%d]:  ", i);
            double price = sc.nextDouble();
            vect[i] = new Product(name, price);
        }
        
        double sum = 0.0;
        for(int i=0; i<vect.length; i++){
            sum+= vect[i].getPrice();
        }
        double avg = sum / n;
        System.out.printf("AVERAGE PRICE = $ %.2f ", avg);
        sc.close();
    }
}
