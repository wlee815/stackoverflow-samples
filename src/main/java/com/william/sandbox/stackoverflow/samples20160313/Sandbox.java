package com.william.sandbox.stackoverflow.samples20160313;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Sandbox {

    private static Set<String> allCountries = new HashSet();

    private static void distinctAdd(String country, List<String> targetList){
        if(!allCountries.contains(country)){
            allCountries.add(country);
            targetList.add(country);
        }
        //else
        //don't add duplicates!
    }

    public static void main(String args[]) {

        List<String> one = new ArrayList();
        List<String> two = new ArrayList();
        List<String> three = new ArrayList();

        distinctAdd("United States", one);
        distinctAdd("United Kingdom", one);
        distinctAdd("Italy", one);
        distinctAdd("France", one);
        distinctAdd("Russia", one);
        distinctAdd("Japan", one);
        distinctAdd("China", one);
        distinctAdd("Mexico", one);

        distinctAdd("Philippines", two);
        distinctAdd("Austria", two);
        distinctAdd("Canada", two);
        distinctAdd("Sweden", two);
        distinctAdd("Iceland", two);
        distinctAdd("India", two);
        distinctAdd("Australia", two);
        distinctAdd("Deutschland", two);
        distinctAdd("United States", two);

        distinctAdd("Norway", three);
        distinctAdd("Kosovo", three);
        distinctAdd("North Korea", three);
        distinctAdd("Sudan", three);
        distinctAdd("United Arab Emirates", three);
        distinctAdd("Bahrain", three);
        distinctAdd("Haiti", three);

        System.out.println("Country Categories: ");
        System.out.println("#1 Countries = " + one);
        System.out.println("#2 Countries = " + two);
        System.out.println("#3 Countries = " + three);
        System.out.println("\n");

    }
}
