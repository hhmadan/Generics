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

                T max = firstElement;
                if(secondElement.compareTo(max)>0){
                    max = secondElement;
                }
                if(thirdElement.compareTo(max)>0){
                    max = thirdElement;
                }
                if(fourthElement.compareTo(max)>0){
                    max = fourthElement;
                }
                printMax(firstElement,secondElement,thirdElement,fourthElement,max);
                return max;
            }
            public static <T> void printMax(T firstElement, T secondElement, T thirdElement, T fourthElement, T max){
                System.out.println("Maximum of "+firstElement+", "+secondElement+", "+thirdElement+", "+fourthElement+" is: "+max);
            }
        }
