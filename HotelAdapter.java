
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HP
 */
public class HotelAdapter implements HotelTarget{
    
	Hotel theRobot;

	public HotelAdapter(Hotel newRobot){
		
		theRobot = newRobot;
		
	}
	
	public void hotelPlace() {
		
		theRobot.place();
		
	}

	public void availableRooms() {
		
		theRobot.roomleft();
		
	}

	public void bookroom(String customerName) {
		
		theRobot.bookName(customerName);
		
	}
		
	}
    

