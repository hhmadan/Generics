package com.generics;

public class FloatMaximum {
    public static void main(String[] args) {

        Float fl = FloatMaximum(31.2f, 62.2f, 3.2f);
        System.out.println("Maximum Float is: "+fl);
    }
    public static Float FloatMaximum(Float firstElement, Float secondElement, Float thirdElement) {

        if (firstElement.compareTo(secondElement) >= 0 && firstElement.compareTo(thirdElement) >= 0) {
            return firstElement;
        }

        if (secondElement.compareTo(firstElement) >= 0 && secondElement.compareTo(thirdElement) >= 0) {
            return secondElement;
        }

        if (thirdElement.compareTo(firstElement) >= 0 && thirdElement.compareTo(secondElement) >= 0) {
            return thirdElement;
        }
        return 0.0f;
    }
//    public static void main(String[] args) {
//        Float [] arr = new Float[3];
//        arr[0]=3.2f;
//        arr[1]=11.1f;
//        arr[2]=2.9f;
//        printArray(arr);
//        getMax(arr);
//    }
//    public static void printArray(Float[]arr){
//        System.out.println("Array is: ");
//        for (float a:
//                arr) {
//            System.out.print(a+" ");
//        }
//    }
//    public static void getMax(Float []arr){
//        float max = arr[0];
//        for(int i=0;i<arr.length;i++){
//            Float compare = (float) arr[i].compareTo(max);
//            if(compare>0)
//                max = arr[i];
//        }
//        System.out.println("\nMaximum Integer is: "+max);
//    }
}
