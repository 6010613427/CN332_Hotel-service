
public class BothRestaurant implements HotelMenu {

    private final String[] food = {"Paneer Makhani Biryani", "Salad", "Gobhi Aloo", "Matar Paneer Lababdaar", "Burgar", "Fired Chicken", "Curry rice", "Pizza"};
    private final int[] price = {200, 100, 510, 400, 200, 100, 510, 400};

    @Override
    public void getMenu() {

        System.out.println("Menu for BothRestaurant");
        for (int i = 0; i < food.length; i++) {
            System.out.println((i + 1) + ". " + food[i]);
        }
    }

    @Override
    public void getFood(int num, String country) {
        Balance b = new Balance();
        String p = b.textBalance(num, country);
        System.out.println("Your menu is " + food[num - 1] + " " + p);
    }
}
