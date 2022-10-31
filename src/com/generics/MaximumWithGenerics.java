package com.generics;

public class MaximumWithGenerics {
    public static void main(String[] args) {

        Integer integer = GenericClass.getMaximum(31, 67, 32,89);
        System.out.println("Maximum Integer is: "+integer);

        Float fl = GenericClass.getMaximum(31.2f, 62.2f, 3.2f,0.2f);
        System.out.println("Maximum Float is: "+fl);

        String string = GenericClass.getMaximum("Apple", "Peach", "Banana","Mango");
        System.out.println("Maximum String is: "+string);
    }
}
