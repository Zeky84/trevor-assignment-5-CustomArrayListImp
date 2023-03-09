package com.coderscampus.arraylist;

    public class CustomArrayList<T> implements CustomList<T> {
        Object[] items = new Object[3];
        //Counting every time is adding an element to the list
        int indexCount = 0;

        @Override
        public boolean add(T item) {
            //adding elements to the list if indexCount < Array.length
            if (indexCount < items.length) {
                items[indexCount] = item;
                indexCount++;
            }
            //over writing the Array length if indexCount == Array.length
            //copying the elements to the new Array
            //Assigning the new Array to the old one
            if (indexCount == items.length) {
                int x = 0;
                Object[] newListItems = new Object[items.length +1];
                for (Object element : items) {
                    newListItems[x] = element;
                    x++;
                }
                items = newListItems;
            }
            return true;
        }

            @Override
            public int getSize() {
            //the length of the array after adding all the elements
                return indexCount;
            }

            @Override
            public T get(int index){
            //Casting to the data type use and returning specific element by index
                return (T)items[index];
            }
        }

