/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Tulio Ruesjas Martin
 */
public class TestProductContain {
    public static void main(String args[]){
      List<Product> products = new ArrayList<Product>();
      
      products.add(new Product("Jugo", 100));
      products.add(new Product("Fideos", 20));
      products.add(new Product("Yerba", 25));
      
//      Product productToSearch = new Product("Yerba", 10);
//      
//      if(products.contains(productToSearch)){
//          System.out.println("Producto Encontrado en el lugar: "+ products.indexOf(productToSearch)
//                                +" de la Lista de Productos");
//      }else{
//          System.out.println("Producto No Encontrado");
//      }
        Collections.sort(products, new ProductoStockComparator());
        for(Product product: products){
            System.out.println("Producto:"+product.getName()+" Stock:"+ product.getStock());
        }
    }   
}
