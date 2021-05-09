
public class HotelKeeper {

    public void getVegMenu() {
        VegRestaurant v = new VegRestaurant();
        v.getMenu();
    }

    public void getNonVegMenu() {
        NonVegRestaurant nv = new NonVegRestaurant();
        nv.getMenu();
    }

    public void getVegNonMenu() {
        BothRestaurant b = new BothRestaurant();
        b.getMenu();
    }
    
}
