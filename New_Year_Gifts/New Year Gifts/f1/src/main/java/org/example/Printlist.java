package org.example;

import java.util.ArrayList;

public class Printlist {

    public static void printthelist()
    {
        ArrayList<String> typesofchocolates=new ArrayList<String>();
        typesofchocolates.add("Traditionalsweets");
        typesofchocolates.add("Gulabjamun");
        typesofchocolates.add("Tossit");
        typesofchocolates.add("Chocolate");
        typesofchocolates.add("Wafers");
        typesofchocolates.add("Candy");

        for(int i=0;i<typesofchocolates.size();i++)
        {
            System.out.println(i+1+". "+typesofchocolates.get(i));
        }
    }
}
