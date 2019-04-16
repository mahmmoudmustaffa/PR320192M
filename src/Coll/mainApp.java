/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Coll;

import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

/**
 *
 * @author aashgar
 */
public class mainApp {
    public static void main(String[] args) {
        String[] names = {"Alhasan","Zakiria","Maher","Ali"};
        ArrayList<String> namesList = 
                new ArrayList<String>(Arrays.asList(names));
        System.out.println(namesList);
        Collections.sort(namesList);
        System.out.println(namesList);
        Iterator<String> it = namesList.iterator();
        while(it.hasNext())
            System.out.print(it.next() + " - ");
        
    }
}
