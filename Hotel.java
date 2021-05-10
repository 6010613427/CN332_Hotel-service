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
public class Hotel{


//	Random generator = new Random();
	
	public String place(String hotelplace) {
		
//		int attackDamage = generator.nextInt(10) + 1;
//                String hotelplace = "Bali"; 
		
		System.out.println("Thank for choose " + hotelplace + " Hotel, we are welcome!");
		return  hotelplace;
	}

	public void roomleft() {
		
		int roomLeft = 20;
		
		System.out.println("Available Rooms " + roomLeft + " rooms");
		
	}

	public String bookName(String customerName) {
		
		System.out.println("Customer name: " + customerName);
                return customerName;
		
	}
	
	
}
