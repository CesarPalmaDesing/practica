/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica2;

import java.util.Scanner;


public class Practica2 {

    public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);

                    System.out.println("***********Cotizar pizza******************");
                   System.out.println("Ingrese cantidad de ingredientes");
                   int numingredientes = sc.nextInt();
                   Pizza pizza = new Pizza();
                   Object ingredientes[] = new Object[numingredientes];
                   Ingredientes ingredients = new Ingredientes();
                   String nomingrediente;
                   double costo;
                   double valortotal=0.0;
                   Object precio[] = new Object[numingredientes];
                   for (int i = 0; i < numingredientes; i++) {
                  System.out.println("*****ingrediente*********");
                       System.out.println("Ingrese un ingrediente");
                          nomingrediente = sc.next();
                          ingredients.setDescripcion(nomingrediente);
                          
                          System.out.println("Ingrese el costo");
                            costo = sc.nextDouble();
                            ingredients.setCosto(costo);
                         
                           ingredientes[i] = ingredients.getDescripcion();
                           precio[i] = ingredients.getCosto();                     
            
                    }

                        System.out.println("*************Informacion de la pizza************");
                        System.out.println("ingrediente         Precio");
                        for (int j = 0; j < numingredientes; j++) {
                        System.out.println(ingredientes[j]+"            "+precio[j]);
                        valortotal= valortotal + (double)precio[j];
                    }
                         pizza.setPreciopizza(valortotal);
                         System.out.println("________________________________________");
                         System.out.println("valor total:"+pizza.getPreciopizza());
                                
                                
                 
    }
    
}
