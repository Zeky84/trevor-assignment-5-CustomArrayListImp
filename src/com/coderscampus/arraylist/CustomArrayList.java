package com.coderscampus.arraylist;

    public class CustomArrayList<T> implements CustomList<T> {
        Object[] items = new Object[3];

        //Counting the items adding to the Array
        int indexCount = 0;

        @Override
        public boolean add(T item) {
            //Adding item if Array.length > quantity of items
            if (indexCount < items.length) {
                addingElement(item);
            }
            //Overwriting Array size if quantity of items == to Array size
            //Creating new Array 1.8 bigger than the original and copying the old one values to the new one
            //Assigning the new Array values to the original one and adding and item to the Array
            else{
                int x = 0;
                Object[] newListItems = new Object[(int) Math.round(items.length *1.8)];
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

