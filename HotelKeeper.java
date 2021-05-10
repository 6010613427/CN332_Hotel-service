
public class HotelKeeper {

    public void getVegMenu() {
        VegRestaurant v = new VegRestaurant();
        v.getMenu();
    }

    public void getNonVegMenu() {
        NonVegRestaurant nv = new NonVegRestaurant();
        nv.getMenu();
    }

    public void getBothMenu() {
        BothRestaurant b = new BothRestaurant();
        b.getMenu();
    }
    
    public void getVegFood(int num, String country) {
        VegRestaurant v = new VegRestaurant();
        v.getFood(num, country);
    }

    public void getNonVegFood(int num, String country) {
        NonVegRestaurant nv = new NonVegRestaurant();
        nv.getFood(num, country);
    }

    public void getBothFood(int num, String country) {
        BothRestaurant b = new BothRestaurant();
        b.getFood(num, country);
    }
    
}
