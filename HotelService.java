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
    	public static void main(String[] args){
		
		HotelBooking bookhotel = new HotelBooking();
		
		Hotel eachhotel = new Hotel();
		
		HotelTarget robotAdapter = new HotelAdapter(eachhotel);
		
		System.out.println("The Hotel");
		
		eachhotel.bookName("Paul");
		eachhotel.roomleft();
		eachhotel.place();
		System.out.println();
		
		System.out.println("The Hotel Service");
		
		bookhotel.bookroom("Paul");
		bookhotel.availableRooms();
		bookhotel.hotelPlace();
		System.out.println();
		
		System.out.println("The Hotel with Adapter");
		
		robotAdapter.bookroom("Paul");
		robotAdapter.availableRooms();
		robotAdapter.hotelPlace();

                
                

	}
}
