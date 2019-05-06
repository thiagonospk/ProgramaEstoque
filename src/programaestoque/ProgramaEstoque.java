/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programaestoque;

import java.util.Locale;

import java.util.Scanner;

import entities.Product;

public class ProgramaEstoque {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner ent = new Scanner(System.in);
     
     
        System.out.println("enter product data");
        System.out.println("name:");
        String name=ent.nextLine();
        System.out.println("Price: ");
        double price=ent.nextDouble();
        System.out.println("Quantity in stock:");
        
        Product product = new Product (name, price);
        
        System.out.println(product);
        
        System.out.println();
        System.out.println("Enter the number of products to be added instock:");
        int quantity = ent.nextInt();
        product.addProducts(quantity);
        
        System.out.println();
        System.out.println("Update data :" + product);
        
        System.out.println();
        System.out.println(" Enter the number of products to be remove from stok:");
        quantity =  ent.nextInt();
        product.removeProducts(quantity);
        
        System.out.println();
        System.out.println(" Updated date " + product);
        
        
        
        
      ent.close();
  }
    
}
