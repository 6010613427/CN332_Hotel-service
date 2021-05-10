
public class NonVegRestaurant implements HotelMenu {

    private final String[] food = {"Burgar", "Fired Chicken", "Curry rice", "Pizza"};
    private final int[] price = {200, 100, 510, 400};

    @Override
    public void getMenu() {

        System.out.println("Menu for NonVegRestaurant");
        for (int i = 0; i < food.length; i++) {
            System.out.println((i + 1) + ". " + food[i]);
        }
    }

    @Override
    public void getFood(int num, String country) {
        Balance b = new Balance();
        String price = b.textBalance(num, country);
        System.out.println("Your menu is " + food[num] + price);
    }
}
