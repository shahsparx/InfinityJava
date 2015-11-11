package com.company;

import java.util.PriorityQueue;
import java.util.Queue;

/**
 * Created by Lenovo on 10-11-2015.
 */
public class PriorityQueueIntro{
    public static void main(String a[]) {
        Queue<Item> items = new PriorityQueue<Item>();
        items.add(new Item("iPhone", 900));
        items.add(new Item("iPad", 1200));
        items.add(new Item("iPod", 300));
        items.add(new Item("iWatch", 200));

        System.out.println("Order of items in Priority Queue");
        System.out.println(items);

        System.out.println("Elements consumed from the head of the Priority Queue:" + items.poll());
        System.out.println(items);

        System.out.println("Element consumed from head of the PriorityQueue : " + items.poll());
        System.out.println(items);

        System.out.println("Element consumed from head of the PriorityQueue : " + items.poll());
        System.out.println(items);


    }

    private static class Item implements Comparable<Item>
    {
        private String name;
        private int price;

        public Item (String name, int price){
            this.name=name;
            this.price=price;

        }

        public String getName()
        {
            return name;

        }

        public int getPrice()
        {
            return price;

        }

        @Override
        public boolean equals(Object obj) {
            if(obj==null){
            return false;}

            if (getClass()!=obj.getClass())
            {
                return false;
            }

            final Item other = (Item) obj;

            if ((this.name == null) ? (other.name != null) : !this.name.equals(other.name)) {
                return false;
            }

            if(this.price!=other.price)
            {
                return false;
            }
            return true;

        }

        @Override
        public int hashCode() {
            int hash = 5;
            hash = 97*hash + (this.name != null ? this.name.hashCode() : 0);
            hash = 97*hash + this.price;
            return hash;

        }

        @Override
        public int compareTo(Item i) {
            if(this.price == i.price)
            {
                return this.name.compareTo(i.name);
            }

            return this.price - i.price;
        }

        @Override
        public String toString() {
            return String.format("%s: $%d",name,price);
        }
    }
}