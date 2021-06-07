public class BLTax {
    
    private String result;
    private final double currency = 0.0022;
    
    public String getBLTax(double x) {
        final double blHotel = 2500;
        String s = String.format("%.2f",(x + blHotel) * currency);
        
        result = s + " IDR";

        return result;
    }
}
