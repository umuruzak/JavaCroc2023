package ru.croc.wjs.umurzakov.task11;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        Dish dish1 = new Dish("Паста", new HashSet<>(Arrays.asList("Паста", "Томатный соус", "Сыр")), "Основное блюдо", 95, 85);
        Dish dish2 = new Dish("Греческий салат", new HashSet<>(Arrays.asList("Салат", "Сыр", "Огурцы", "Помидоры")), "Дополнительное блюдо", 90, 75);
        Dish dish3 = new Dish("Наполеон", new HashSet<>(Arrays.asList("Мука", "Сахар", "Яйца", "Молоко")), "Десерт", 95, 90);

        Chef chef1 = new Chef("Поль Бокюз");
        Chef chef2 = new Chef("Гордон Рамзи");
        Chef chef3 = new Chef("Женя");

        MenuPlanner menuPlanner = new MenuPlanner();

        menuPlanner.addChef(chef1, new HashSet<>(Arrays.asList(dish1)));
        menuPlanner.addChef(chef2, new HashSet<>(Arrays.asList(dish2, dish3)));
        menuPlanner.addChef(chef3, new HashSet<>());

        List<Chef> workingChefs = Arrays.asList(chef1, chef2);
        Set<String> missingIngredients = new HashSet<>(Arrays.asList("Сахар"));

        int numOfDishes = 2;
        List<Dish> menu = menuPlanner.generateMenu(workingChefs, missingIngredients, numOfDishes);

        System.out.println("Generated Menu:");
        for (Dish dish : menu) {
            System.out.println(dish.getName());
        }

        Predicate<Dish> saladCondition = dish -> dish.getCategory().equals("Дополнительное блюдо");

        List<Dish> specialMenu = menuPlanner.generateSpecialMenu(workingChefs, missingIngredients, numOfDishes, saladCondition);

        System.out.println("\nGenerated Special Menu:");
        for (Dish dish : specialMenu) {
            System.out.println(dish.getName());
        }
    }
}
