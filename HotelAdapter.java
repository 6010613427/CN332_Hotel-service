
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
    
	Hotel theHotel;

	public HotelAdapter(Hotel newRobot){
		
		theHotel = newRobot;
		
	}
	
	public void hotelPlace() {
		
		theHotel.place();
		
	}

	public void availableRooms() {
		
		theHotel.roomleft();
		
	}

	public void bookroom(String customerName) {
		
		theHotel.bookName(customerName);
		
	}
		
	}
    

