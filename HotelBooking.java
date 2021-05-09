/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HP
 */
import java.util.Random;
public class HotelBooking implements HotelTarget{

	Random generator = new Random();

	public void hotelPlace() {
		
//		int attackDamage = generator.nextInt(10) + 1;
		
		System.out.println("Hotel place: Bali" );
		
	}

	public void availableRooms() {
		
//		int movement = generator.nextInt(5) + 1;
		int roomLeft = generator.nextInt(100) + 1;
		
		System.out.println("Available Rooms now: " + roomLeft + " rooms");
		
	}

	public void bookroom(String costomerName) {
		
		System.out.println(costomerName + " is booking this hotel");
		
	}
	
}

