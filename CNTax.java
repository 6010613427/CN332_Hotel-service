public class CNTax {
    
    private String result;
    private final double currency = 4.83;
            
    public String getCNTax(double x) {
        final double cnHotel = 4500;
        String s = String.format("%.2f",(x+cnHotel) * currency);
        
        result = s + " CNY";

        return result;
    }
    
}
