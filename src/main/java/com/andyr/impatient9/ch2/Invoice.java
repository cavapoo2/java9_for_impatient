package com.andyr.impatient9.ch2;
import java.util.ArrayList;
public class Invoice {
    public static class Item {
        private String description;
        private int quantity;
        private double unitPrice;

        public Item(String description, int quantity, double unitPrice) {
            this.description = description;
            this.quantity = quantity;
            this.unitPrice = unitPrice;
        }
        public void show() {
            System.out.println(description + ",quantity:" + quantity + ",unitPrice=" + unitPrice + ",price=" + price());
        }
        public double price() { return quantity + unitPrice;}
    }
    public void addItem(String description, int quality, double unitPrice) {
        Item newItem = new Item(description,quality,unitPrice);
        items.add(newItem);
    }
    private ArrayList<Item> items = new ArrayList<>();
    public void add(Item item) { items.add(item);}
    public void show() {
        items.forEach(v -> v.show());
    }
}
