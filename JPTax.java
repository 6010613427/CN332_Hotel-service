public class JPTax {
    
    private String result;
    private final double currency = 0.29;
    
    public String getJPTax(double x) {
        final double jpHotel = 3500; 
        String s = String.format("%.2f",(x + jpHotel) * currency );
        
        result = s + " JPY";

        return result;
    }
}
