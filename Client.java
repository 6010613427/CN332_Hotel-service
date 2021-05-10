
import java.util.Scanner;

public class Client {

    public static void main(String[] args) {
        final String c = "JP";
        HotelKeeper keeper = new HotelKeeper();

        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the restaurant please select your restaurant type");
        System.out.println("N = NonVegRestaurant V = VegRestaurant B = BothRestaurant");
        System.out.print("Enter Restaurant : ");
        String s = sc.nextLine();
        int l;
        
        switch (s) {
            case "N":
                keeper.getNonVegMenu();
                System.out.print("Select your food from number : ");
                l = sc.nextInt();
                keeper.getNonVegFood(l, c);
                break;
            case "V":
                keeper.getVegMenu();
                System.out.print("Select your food from number : ");
                l = sc.nextInt();
                keeper.getVegFood(l, c);
                break;
            case "B":
                keeper.getBothMenu();
                System.out.print("Select your food from number : ");
                l = sc.nextInt();
                keeper.getBothFood(l, c);
                break;
        }
        
    }
}
