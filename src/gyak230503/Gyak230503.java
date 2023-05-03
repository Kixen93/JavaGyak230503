/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gyak230503;

import java.io.File;
import java.io.IOException;
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
    public static void main(String[] args) throws IOException {
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
        /*
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
        System.out.println("b= " +b);*/
        /*
        int x = 0xff;
        System.out.println(x);
        //Integer y = x;
        System.out.println(Integer.toHexString(x));*/
        
        /*
        System.out.println("3 > 5 : " + (3 > 5));
        System.out.println("3 < 5 : " + (3 < 5));
        System.out.println("3 >= 5 : " + (3 >= 5));
        System.out.println("3 <= 5 : " + (3 <= 5));
        System.out.println("3 == 5 : " + (3 == 5));
        System.out.println("3 != 5 : " + (3 != 5));
        System.out.println("3 == 3.0f : " + (3 == 3.0f));
        System.out.println("3 == 3.0 : " + (3 == 3.0));

        System.out.println("+0.0 != -0.0 : " + (+0.0 != -0.0));
        System.out.println("+0.0 == -0.0 : " + (+0.0 == -0.0));
        System.out.println("Double.POSITIVE_INFINITY == Double.NEGATIVE_INFINITY : " + (Double.POSITIVE_INFINITY == Double.NEGATIVE_INFINITY));
        System.out.println("Double.NaN == Double.NaN : " + (Double.NaN == Double.NaN));
        System.out.println("Double.isNaN(Double.NaN) : " + (Double.isNaN(Double.NaN)));



        String a = "Hello";
        String b = "Hello";
        System.out.println("a == b : " + (a == b));
        System.out.println("a == new String(\"Hello\") : " + (a == new String("Hello")));
        System.out.println("a.equals(new String(\"Hello\") :" + (a.equals(new String("Hello"))));
        
        File elso = new File("fajlnev");
        File masodik = new File("fajlnev");
        System.out.println("elso == masodik : " + (elso == masodik));*/
        
        int i1 = 0b11110000;
        int i2 = 0b11001100;
		
        int es = i1 & i2;
        int vagy = i1 | i2;
        int kvagy = i1 ^ i2;
        int neg = ~i1;


	/*	
        System.out.println("i1:    " + Integer.toBinaryString(i1));
        System.out.println("i2:    " + Integer.toBinaryString(i2));
		
        // 11000000
        System.out.println("es:    " + Integer.toBinaryString(es));
        // 11111100
        System.out.println("vagy:  " + Integer.toBinaryString(vagy));
        // 111100
        System.out.println("kvagy: " + Integer.toBinaryString(kvagy));
        // 11111111111111111111111100001111
        System.out.println("neg:   " + Integer.toBinaryString(neg));
        
        int i3 = -55;
        int i4 = i3 << 1;
        int i5 = i3 >> 1;
        int i6 = i3 >>> 1;
		
        // 11111111111111111111111111001001
        System.out.println("i3 :  " + Integer.toBinaryString(i3));
        // 11111111111111111111111110010010
        System.out.println("<< :  " + Integer.toBinaryString(i4));
        // 11111111111111111111111111100100
        System.out.println(">> :  " + Integer.toBinaryString(i5));
        // 1111111111111111111111111100100
        System.out.println(">>>:  " + Integer.toBinaryString(i6));
        // 1111111111111111111111111100100
        // 11111111111111111111111110010010*/
        /*
        boolean igaz = true;
        boolean hamis = false;
		
        System.out.println("igaz & hamis: " + (igaz & hamis));
        System.out.println("igaz | hamis: " + (igaz | hamis));
        System.out.println("igaz ^ hamis: " + (igaz ^ hamis));
        System.out.println("igaz & igaz: " + (igaz & igaz));
        System.out.println("hamis ^ hamis: " + (hamis ^ hamis));*/
        /*
        int i = 4;
        boolean b = true || (i++ >= 5);
        System.out.println("b: " + b); // true
        System.out.println("i: " + i); // 4

        b = true | (i++ >= 5);
        System.out.println("b: " + b); // true
        System.out.println("i: " + i); // 5

        System.out.println(!true); // false
        System.out.println(!false); // true*/
        /*
        Date d = Calendar.getInstance().getTime();
        System.out.println(d);
        System.out.println("Jó " + (d.getHours() > 11 ? "napot":"reggelt") + "!");*/
        
        
        /*
        File f = new File("teszt.txt");

        // ha nem létezik fájl, akkor létrehozunk egy üreset
        if (!f.exists())
            f.createNewFile();
        // beállítjuk, hogy írható legyen
        f.setWritable(true);
        

        // statikus tagváltozó
        System.out.println("elérésiút-elválasztó karakter: " + File.pathSeparator);
        // példányon keresztül is elérhető, de figyelmeztetést kapunk
        System.out.println("Példányon keresztül is elérhető: " + f.pathSeparator);
        
        
        
        new NewClass().teszt();
        
        // szintén true
        System.out.println("null instanceof File: " + (null instanceof File));*/
        
        
        
    }
    
}
