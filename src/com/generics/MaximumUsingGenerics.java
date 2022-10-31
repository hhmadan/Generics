package com.generics;

public class MaximumUsingGenerics {

    public static void main(String[] args) {
            Integer integer = getMaximum(31, 67, 32);
            System.out.println("Maximum Integer is: "+integer);

            Float fl = getMaximum(31.2f, 62.2f, 3.2f);
            System.out.println("Maximum Float is: "+fl);

            String string = getMaximum("Apple", "Peach", "Banana");
            System.out.println("Maximum String is: "+string);
    }
        public static <T extends Comparable<T>> T getMaximum(T firstElement, T secondElement, T thirdElement) {

            if (firstElement.compareTo(secondElement) >= 0 && firstElement.compareTo(thirdElement) >= 0) {
                return firstElement;
            }

            if (secondElement.compareTo(firstElement) >= 0 && secondElement.compareTo(thirdElement) >= 0) {
                return secondElement;
            }

            if (thirdElement.compareTo(firstElement) >= 0 && thirdElement.compareTo(secondElement) >= 0) {
                return thirdElement;
            }
            return null;
     }
}