package com.generics;

public class StringMaximum {
    public static void main(String[] args) {

        String string = StringMaximum("Apple", "Peach", "Banana");
        System.out.println("Maximum String is: "+string);
    }
    public static String StringMaximum(String firstElement, String secondElement, String thirdElement) {

        if (firstElement.compareTo(secondElement) >= 0 && firstElement.compareTo(thirdElement) >= 0) {
            return firstElement;
        }

        if (secondElement.compareTo(firstElement) >= 0 && secondElement.compareTo(thirdElement) >= 0) {
            return secondElement;
        }

        if (thirdElement.compareTo(firstElement) >= 0 && thirdElement.compareTo(secondElement) >= 0) {
            return thirdElement;
        }
        return "";
    }
}

//public class StringMaximum {
//    public static void main(String[] args) {
//        String[] arr = {"Apple", "Peach", "Banana"};
//        printArray(arr);
//        getMax(arr);
//        }
//  public static void printArray(String[] arr){
//        System.out.println("Array is: ");
//        for (String a:
//                arr) {
//            System.out.print(a+" ");
//        }
//    }
//    public static void getMax(String[] arr){
//        String max = arr[0];
//        for(int i=0;i<arr.length;i++){
//            int compare = (arr[i].compareTo(max));
//            if(compare>0)
//                max = arr[i];
//        }
//        System.out.println("\nMaximum Integer is: "+max);
//   }