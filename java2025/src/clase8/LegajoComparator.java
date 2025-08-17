/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase8;

import java.util.Comparator;

/**
 *
 * @author TRM
 */
public class LegajoComparator implements Comparator<AlumnoUnsta>{
    
    @Override
    public int compare(AlumnoUnsta o1, AlumnoUnsta o2) {
        return o2.getLegajo().compareTo(o1.getLegajo());
    }
}