package com.packt.s2wad.ch14.models;

public class ShoppingListItem {

    private String quantity;
    private String name;

    public ShoppingListItem() {
        // Does nothing.
    }

    public ShoppingListItem(String quantity, String name) {
        this.quantity = quantity;
        this.name = name;
    }

    @Override
    public String toString() {
        return String.format("%s [quantity=%s, item=%s]", super.toString(), quantity, name);
    }

    //~ Accessors '(exclude-from-snippets)

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
