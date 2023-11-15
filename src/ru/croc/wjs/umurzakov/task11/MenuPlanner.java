package ru.croc.wjs.umurzakov.task11;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class MenuPlanner {
    Map<Chef, Set<Dish>> chefDishesMap;

    public MenuPlanner() {
        this.chefDishesMap = new HashMap<>();
    }

    public void addChef(Chef chef, Set<Dish> dishes) {
        chefDishesMap.put(chef, dishes);
    }

    public List<Dish> generateMenu(List<Chef> workingChefs, Set<String> missingIngredients, int numOfDishes) {
        List<Dish> possibleDishes = new ArrayList<>();

        for (Chef chef : workingChefs) {
            Set<Dish> chefDishes = chefDishesMap.get(chef);
            if (chefDishes != null) {
                for (Dish dish : chefDishes) {
                    if (Collections.disjoint(missingIngredients, dish.getIngredients())) {
                        possibleDishes.add(dish);
                    }
                }
            }
        }

        possibleDishes.sort((dish1, dish2) -> {
            if (dish1.getKingRating() != dish2.getKingRating()) {
                return Integer.compare(dish2.getKingRating(), dish1.getKingRating());
            } else {
                return Integer.compare(dish2.getCourtRating(), dish1.getCourtRating());
            }
        });

        return possibleDishes.subList(0, Math.min(numOfDishes, possibleDishes.size()));
    }

    public List<Dish> generateSpecialMenu(List<Chef> workingChefs, Set<String> missingIngredients, int numOfDishes, Predicate<Dish> specialCondition) {
        List<Dish> possibleDishes = generateMenu(workingChefs, missingIngredients, numOfDishes);

        return possibleDishes.stream().filter(specialCondition).collect(Collectors.toList());
    }
}
