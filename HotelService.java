
import java.util.Scanner;

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

        Scanner reader = new Scanner(System.in);
        System.out.println("Welcome to Hotel-Service: ");
        System.out.println("Please select number => 1 Japan Hotel, 2 China Hotel, 3 Hongkong Hotel, 4 Bali Hotel, 5 Canada Hotel");
        System.out.print("Which\'s hotel do you want to booking: ");
        char country = reader.next().charAt(0);
        String nameHotel = "";
        switch (country) {
            case '1':
                nameHotel = "Japan Hotel";
                break;
            case '2':
                nameHotel = "China";
                break;
            case '3':
                nameHotel = "Hongkong";
                break;
            case '4':
                nameHotel = "Bali";
                break;
            case '5':
                nameHotel = "Canada";
                break;
            default:
                System.out.println("Please try again.");
        }
        System.out.println("Welcome to " + nameHotel + " Hotel");

        //HotelBooking bookhotel = new HotelBooking();
        Hotel eachhotel = new Hotel();

        //HotelTarget hotelAdapter = new HotelAdapter(eachhotel);
//		System.out.println("The Hotel");
        Scanner customername = new Scanner(System.in);
        System.out.print("Please fill in your name: ");
        String name = customername.nextLine();
        eachhotel.bookName(name);
        eachhotel.roomleft();
        eachhotel.place(nameHotel);
        System.out.println();

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
