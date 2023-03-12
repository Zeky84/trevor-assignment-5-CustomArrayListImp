package com.coderscampus.arraylist;

public class CustomArrayListApp {
    public static void main(String[] args) {
        CustomArrayList<String> myStringListTest = new CustomArrayList<>();

        myStringListTest.add("zero");
        myStringListTest.add("one");
        myStringListTest.add("two");
        myStringListTest.add("three");
        myStringListTest.add("four");
        myStringListTest.add("five");
        myStringListTest.add("six");
        myStringListTest.add("seven");
        myStringListTest.add("eight");
        myStringListTest.add("nine");
        myStringListTest.add("ten");

        for(int x=0; x < myStringListTest.getSize(); x++){
            System.out.println(myStringListTest.get(x));
        }
        }
        }

