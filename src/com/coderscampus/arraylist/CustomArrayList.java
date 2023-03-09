package com.coderscampus.arraylist;

    public class CustomArrayList<T> implements CustomList<T> {
        Object[] items = new Object[3];
        int indexCount = 0;

        @Override
        public boolean add(T item) {
            if (indexCount < items.length) {
                items[indexCount] = item;
                indexCount++;
            }
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
                return indexCount;
            }

            @Override
            public T get(int index){
                return (T)items[index];
            }
        }

