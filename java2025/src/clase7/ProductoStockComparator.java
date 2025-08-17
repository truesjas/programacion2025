/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase7;

import java.util.Comparator;

/**
 *
 * @author TRM
 */
public class ProductoStockComparator  implements Comparator<Product>{

    @Override
    public int compare(Product o1, Product o2) {
//        return o1.getStock().compareTo(o2.getStock());
        return o2.getStock().compareTo(o1.getStock());
    }
    
}
