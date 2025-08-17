/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase7;

import java.util.Comparator;

/**
 *
 * @author Tulio Ruesjas Martin
 */
public class AlumnoLegajoComparator implements Comparator<AlumnoUnsta>{

    @Override
    public int compare(AlumnoUnsta o1, AlumnoUnsta o2) {
//       return o2.getLegajo().compareTo(o1.getLegajo());
        return o1.getLegajo().compareTo(o2.getLegajo());
    }
    
}
