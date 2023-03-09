package com.coderscampus.arraylist;

public class CustomArrayListApp {
    public static void main(String[] args) {
        CustomArrayList<String> myStringListTest = new CustomArrayList<>();
        CustomArrayList<Integer> myIntegerListTest = new CustomArrayList<>();

        myStringListTest.add("zero");
        myStringListTest.add("one");
        myStringListTest.add("two");
        myStringListTest.add("three");
        myStringListTest.add("four");
        myStringListTest.add("five");
        myStringListTest.add("six");
        myStringListTest.add("seven");
        for(int x=0; x < myStringListTest.getSize(); x++){
            System.out.println(myStringListTest.get(x));
        }
        System.out.println("--------------------");

        for(int i =0; i <=15; i++){
            myIntegerListTest.add(i);
        }
        myIntegerListTest.add(1111111111);
        myIntegerListTest.add(23);
        myIntegerListTest.add(34);
        myIntegerListTest.add(14);
        myIntegerListTest.add(37);
        myIntegerListTest.add(33);
        for (int x = 0; x < myIntegerListTest.getSize(); x++){
            System.out.println(myIntegerListTest.get(x));
        }


        }
        }

