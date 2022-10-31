package com.generics;

public class GenericClass<T extends Comparable<T>>{
    public T firstElement, secondElement, thirdElement, fourthElement;

    public GenericClass(T firstElement, T secondElement, T thirdElement, T fourthElement)
    {
        this.firstElement = firstElement;
        this.secondElement = secondElement;
        this.thirdElement = thirdElement;
        this.fourthElement = fourthElement;
    }

    public static <T extends Comparable<T>> T getMaximum(T firstElement, T secondElement, T thirdElement, T fourthElement) {

        if (firstElement.compareTo(secondElement) >= 0 && firstElement.compareTo(thirdElement) >= 0 && firstElement.compareTo(fourthElement)>=0){
            return firstElement;
        }

        if (secondElement.compareTo(firstElement) >= 0 && secondElement.compareTo(thirdElement) >= 0 && secondElement.compareTo(fourthElement)>=0) {
            return secondElement;
        }

        if (thirdElement.compareTo(firstElement) >= 0 && thirdElement.compareTo(secondElement) >= 0 && thirdElement.compareTo(fourthElement)>=0) {
            return thirdElement;
        }
        if (fourthElement.compareTo(firstElement) >= 0 && fourthElement.compareTo(secondElement) >= 0 && fourthElement.compareTo(thirdElement)>=0) {
            return fourthElement;
        }
        return null;
    }

}
