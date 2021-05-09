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


	Random generator = new Random();
	
	public void place() {
		
//		int attackDamage = generator.nextInt(10) + 1;
                String hotelplace = "Bali"; 
		
		System.out.println("Thank for choose " + hotelplace + " we are welcome!");
		
	}

	public void roomleft() {
		
		int roomLeft = generator.nextInt(100) + 1;
		
		System.out.println("Available Rooms " + roomLeft + " rooms");
		
	}

	public void bookName(String customerName) {
		
		System.out.println("Customer name: " + customerName);
		
	}
	
	
}
