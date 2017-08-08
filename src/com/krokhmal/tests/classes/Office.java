package com.krokhmal.tests.classes;

import com.sun.corba.se.impl.orbutil.ObjectUtility;
import org.omg.PortableInterceptor.ObjectReferenceTemplate;

import javax.xml.bind.SchemaOutputResolver;
import java.lang.ref.Reference;
import java.util.Arrays;

/**
 * Created by User on 11.07.2017.
 */
public class Office {
    Worker worker;
    private String worker2 = write(2);
    private static String x1 = write(1);

    Office(){
        System.out.println("Constructor Office");
        worker = new Worker("Kolya","Krokhmal",34, "boss");
    }

    public static void main(String[] args) {
        System.out.println("Start of main Office");
        Office cabinet = new Office();
        Object x = x1;
        System.out.println(x.toString());
        System.out.println(cabinet.worker);

    }

    private static String write(int x){
        System.out.println("X1 Office" + x);
        return "X1 " + x;
    }
}
