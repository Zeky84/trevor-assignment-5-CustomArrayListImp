package com.coderscampus.arraylist;

    public class CustomArrayList<T> implements CustomList<T> {
        Object[] items = new Object[10];

        int indexCount = 0;

        @Override
        public boolean add(T item) {
            if (indexCount < items.length) {
                addingElement(item);
            }
            else{
                int x = 0;
                Object[] newListItems = new Object[items.length*2];
                for (Object element : items) {
                    newListItems[x] = element;
                    x++;
                }
                items = newListItems;
                addingElement(item);
            }
            return true;
        }

        private void addingElement(T item) {
            //Add element to the Array
            items[indexCount] = item;
            indexCount++;
        }

        @Override
            public int getSize() {
            //Returning the resultant array size
                return indexCount;
            }

            @Override
            public T get(int index){
            //Casting to the data type use and returning the specific item by index
                return (T)items[index];
            }
        }

