package com.coderscampus.arraylist;

public class CustomArrayListApp {
    public static void main(String[] args) {
        CustomArrayList<String> myStringListTest = new CustomArrayList<>();
        CustomArrayList<Integer> myIntegerListTest = new CustomArrayList<>();

        myStringListTest.add("donde");
        myStringListTest.add("habia");
        myStringListTest.add("carne");
        myStringListTest.add("que no vi");
        myStringListTest.add("fue en el pueblo");
        myStringListTest.add("seguro? no te creo");
        for(int x=0; x < myStringListTest.getSize(); x++){
            System.out.println(myStringListTest.get(x));
        }
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

