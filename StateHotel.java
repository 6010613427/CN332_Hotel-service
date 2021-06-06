
import java.util.Scanner;


public class StateHotel {
    
    private String nameHotel;
    
    public String StateNameHotel(String numCountry) {
        
        switch (numCountry) {
            case "1":
                nameHotel = "Japan Hotel";
                break;
            case "2":
                nameHotel = "China";
                break;
            case "3":
                nameHotel = "Hongkong";
                break;
            case "4":
                nameHotel = "Bali";
                break;
            case "5":
                nameHotel = "Canada";
                break;
            default:
                System.out.println("Please try again.");
        }
        
        return nameHotel;
    }
    
    public void StateFood (String choice) {
        
        int l;
        HotelKeeper keeper = new HotelKeeper();
        Scanner sc = new Scanner(System.in);
        
        switch (choice) {
                case "N":
                    keeper.getNonVegMenu();
                    System.out.print("Select your food from number : ");
                    l = sc.nextInt();
                    keeper.getNonVegFood(l, nameHotel);
                    break;
                case "V":
                    keeper.getVegMenu();
                    System.out.print("Select your food from number : ");
                    l = sc.nextInt();
                    keeper.getVegFood(l, nameHotel);
                    break;
                case "B":
                    keeper.getBothMenu();
                    System.out.print("Select your food from number : ");
                    l = sc.nextInt();
                    keeper.getBothFood(l, nameHotel);
                    break;
            }
    }
    
}
