package com.generics;
public class IntegerMaximum {
    public static void main(String[] args) {

        Integer integer = IntegerMaximum(31, 67, 32);
        System.out.println("Maximum Integer is: "+integer);
    }
    public static Integer IntegerMaximum(Integer firstElement, Integer secondElement, Integer thirdElement) {

        if (firstElement.compareTo(secondElement) >= 0 && firstElement.compareTo(thirdElement) >= 0) {
            return firstElement;
        }

        if (secondElement.compareTo(firstElement) >= 0 && secondElement.compareTo(thirdElement) >= 0) {
            return secondElement;
        }

        if (thirdElement.compareTo(firstElement) >= 0 && thirdElement.compareTo(secondElement) >= 0) {
            return thirdElement;
        }
        return 0;
    }

//    public static void main(String[] args) {
//        Integer[]arr={11,2,3};
//        // Integer[]arr={1,41,9};
//        // Integer[]arr={10,4,91};
//        printArray(arr);
//        getMax(arr);
//    }
//    public static void printArray(Integer[]arr){
//        System.out.println("Array is: ");
//        for (int a:
//             arr) {
//            System.out.print(a+" ");
//        }
//    }
//    public static void getMax(Integer []arr){
//        int max = arr[0];
//        for(int i=0;i<arr.length;i++){
//                Integer compare = arr[i].compareTo(max);
//                if(compare>0)
//                    max = arr[i];
//        }
//        System.out.println("\nMaximum Integer is: "+max);
//    }
}
