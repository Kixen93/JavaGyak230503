/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gyak230503;

import java.io.File;

/**
 *
 * @author itsso
 */
public class NewClass {
    
    
    String str = "Példányváltozó";

    
    
    public void teszt() {
        String str = "Lokális változó";
        // lokális változó
        System.out.println("this nélkül: " + str);
        // példányváltozó
        System.out.println("thisszel: " + this.str);
        
        // mindhárom true
        System.out.println("str instanceof Object: " + (str instanceof Object));
        System.out.println("str instanceof CharSequence: " + (str instanceof CharSequence));
        System.out.println("str instanceof String: " + (str instanceof String));
        // le sem fordul; File nem leszármazott osztálya a Stringnek
        // System.out.println("str instanceof File: " + (str instanceof File));
        // szintén true
        System.out.println("null instanceof File: " + (null instanceof File));
    }
    
    

    
   
}
