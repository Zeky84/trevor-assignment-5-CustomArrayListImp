package com.coderscampus.arraylist;


    public class CustomArrayList<T> implements CustomList<T> {
        Object[] items = new Object[10];
        int listSize = 0;
        int index = 0;

        @Override
        public boolean add(T item) {
            if (listSize == items.length) {
                int x = 0;
                Object[] newListItems = new Object[items.length + 1];
                for (Object element : items) {
                    newListItems[x] = element;
                    x++;
                }
                items = newListItems;
            }
            if (listSize < items.length) {
                items[index] = item;
                index++;
            }
            return true;
        }

            @Override
            public int getSize() {
                return index;
            }

            @Override
            public T get(int index){
                return (T)items[index];
            }

        }

