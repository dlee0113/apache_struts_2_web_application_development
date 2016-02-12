package com.packt.s2wad.ch14.models;

public class RecipeIngredient {

    private Long id;
    private Integer index;
    private String quantity; // TODO Should be type.
    private Ingredient ingredient;

    public RecipeIngredient() {
        // Does nothing.
    }

    public RecipeIngredient(Long id, Integer index, String quantity, Ingredient ingredient) {
        this.id = id;
        this.index = index;
        this.quantity = quantity;
        this.ingredient = ingredient;
    }

    @Override
    public String toString() {
        return "RecipeIngredient{" +
               "id=" + id +
               ", index=" + index +
               ", quantity='" + quantity + '\'' +
               ", ingredient=" + ingredient +
               '}';
    }

    //~ Accessors.

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getIndex() {
        return index;
    }

    public void setIndex(Integer index) {
        this.index = index;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public Ingredient getIngredient() {
        return ingredient;
    }

    public void setIngredient(Ingredient ingredient) {
        this.ingredient = ingredient;
    }

}
