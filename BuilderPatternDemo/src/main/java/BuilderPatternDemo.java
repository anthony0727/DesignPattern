public class BuilderPatternDemo {
    public static void main(String[] args) {
        MealBuilder mealBuilder = new MealBuilder();

        Meal vegMeal = mealBuilder.prepareVegMeal();
        System.out.println("veg");
        vegMeal.showItems();
        System.out.println(vegMeal.getCost());

        Meal nonVegMeal = mealBuilder.prepareNonVegMeal();
        System.out.println("non veg");
        nonVegMeal.showItems();
        System.out.println(nonVegMeal.getCost());
    }
}
