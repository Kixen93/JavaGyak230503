/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gyak230503;

import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author itsso
 */
public class Gyak230503 {

    /**
     * @param args the command line arguments
     */
    
    enum PartOfDay{
    MORNING, NOON, AFTERNOON, NIGHT;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        /*Integer i1 = 1;
        int i2=1;
        Integer i3 = 1;
        Integer i4 = new Integer(1);
        System.out.println(i1);
        System.out.println(i2);
        System.out.println(i3);
        System.out.println(i4);
        System.out.println(i1 == i3);
        System.out.println(i1 == i4.intValue());*/
        
        
        //ENUM használaszt
        /*
        Date d = Calendar.getInstance().getTime();
        System.out.println(d);
        int hour = d.getHours();
        System.out.println(hour);
        PartOfDay n;
        if (hour < 12)
        n= PartOfDay.MORNING;
        else if (hour < 13)
        n= PartOfDay.NOON;
        else if (hour < 19)
        n= PartOfDay.AFTERNOON;
        else
        n= PartOfDay.NIGHT;
        System.out.println("Napszak: " + n);*/
        //művelek
        int a = 5;
        int b = 3;
        double c = 3.0;
        System.out.println("a= " + a);
        System.out.println("b= " +b);
        System.out.println("c= " +c);
        System.out.println("a+b = " +(a+b));
        System.out.println("a-b = " + (a-b));
        System.out.println("a*b = " +(a*b));
        System.out.println("a/b = " +(a/b));
        System.out.println("(double)a/b = " +((double)a/b));
        System.out.println("a/c = " +(a/c));
        System.out.println("a%b = " + (a%b));
        System.out.println("a++ : " + (a++));
        System.out.println("a= " + a);
        System.out.println("++b : " + (++b));
        System.out.println("b= " +b);
        
    }
    
}
