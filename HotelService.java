
import com.javaskool.facade.HotelFacade;
import com.javaskool.model.RoomType;
import java.util.Scanner;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author HP
 */
public class HotelService {

    public static void main(String[] args) {

//        Scanner reader = new Scanner(System.in);
        String country;
        country = JOptionPane.showInputDialog("Welcome to Hotel-Service: \nPlease select number: \n 1. Japan Hotel, \n 2. China Hotel, \n 3. Hongkong Hotel, \n 4. Bali Hotel, \n 5. Canada Hotel \n Which\'s hotel do you want to booking: ");
//        System.out.println("Welcome to Hotel-Service: ");
//        System.out.println("Please select number => 1 Japan Hotel, 2 China Hotel, 3 Hongkong Hotel, 4 Bali Hotel, 5 Canada Hotel");
//        System.out.print("Which\'s hotel do you want to booking: ");
//        char country = reader.next().charAt(0);
        String numCountry = country;
        
        StateHotel h = new StateHotel();
        
        String nameHotel = h.StateNameHotel(numCountry);
        /*switch (numCountry) {
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
        }*/
        System.out.println("------Welcome to " + nameHotel + " Hotel------");

        //HotelBooking bookhotel = new HotelBooking();
        Hotel eachhotel = new Hotel();

        //HotelTarget hotelAdapter = new HotelAdapter(eachhotel);
//		System.out.println("The Hotel");
//        Scanner customername = new Scanner(System.in);
        String cname;
        cname = JOptionPane.showInputDialog("Please fill in your name: ");
//        System.out.print("Please fill in your name: ");
//        String name = customername.nextLine();
        eachhotel.bookName(cname);
        eachhotel.roomleft();
        eachhotel.place(nameHotel);
        
        System.out.println();
        HotelFacade facade=new HotelFacade();
		facade.displayAvailableRooms();
		
		//Automatically from facade
		//System.out.println(facade.reserve(RoomType.DOUBLE));

		//For Customer Choice
		Scanner room=new Scanner(System.in);
		System.out.print("Enter Room No : ");
		int numroom=room.nextInt();
		System.out.println(facade.reserve(RoomType.SINGLE,numroom));
		
		//System.out.println(facade.reserve(RoomType.DOUBLE));
		//System.out.println(facade.reserve(RoomType.SINGLE));		
		facade.displayAvailableRooms();		

        Scanner sc = new Scanner(System.in);
        
        int i = 0;
        String choice = null;
        System.out.println("Want some food?");
        while (i == 0) {
            System.out.print("[Y/N] : ");
            String schoice = sc.nextLine();
            if ("Y".equals(schoice) || "N".equals(schoice)) {
                choice = schoice;
                i = 1;
            } else {
                System.out.println("Please try again.");
            }
        }

        if ("Y".equals(choice)) {

            i = 0;

            System.out.println("Welcome to the restaurant please select your restaurant type");
            System.out.println("=> N = NonVegRestaurant V = VegRestaurant B = BothRestaurant");
            while (i == 0) {
                System.out.print("Enter Restaurant : ");
                String s = sc.nextLine();
                if ("N".equals(s) || "V".equals(s) || "B".equals(s)) {
                    choice = s;
                    i = 1;
                } else {
                    System.out.println("Please try again.");
                }
            }
            
            h.StateFood(choice);
            /*switch (choice) {
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
            }*/
        }

        /*System.out.println("The Hotel Service");
		
		bookhotel.bookroom("Paul");
		bookhotel.availableRooms();
		bookhotel.hotelPlace();
		System.out.println();
		
		/*System.out.println("The Hotel with Adapter");
		
		hotelAdapter.bookroom("Paul");
		hotelAdapter.availableRooms();
		hotelAdapter.hotelPlace();*/
    }
}
