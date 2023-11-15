package ru.croc.wjs.umurzakov.task11;

import java.util.Set;

public class Dish {
    private String name;
    private Set<String> ingredients;
    private String category;
    private int kingRating;
    private int courtRating;

    public Dish(String name, Set<String> ingredients, String category, int kingRating, int courtRating) {
        this.name = name;
        this.ingredients = ingredients;
        this.category = category;
        this.kingRating = kingRating;
        this.courtRating = courtRating;
    }

    public String getName() {
        return name;
    }

    public Set<String> getIngredients() {
        return ingredients;
    }

    public String getCategory() {
        return category;
    }

    public int getKingRating() {
        return kingRating;
    }

    public int getCourtRating() {
        return courtRating;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setIngredients(Set<String> ingredients) {
        this.ingredients = ingredients;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setKingRating(int kingRating) {
        this.kingRating = kingRating;
    }

    public void setCourtRating(int courtRating) {
        this.courtRating = courtRating;
    }
}
