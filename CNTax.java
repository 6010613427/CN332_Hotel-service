public class CNTax {
    
    private String result;
    private final double currency = 4.83;
            
    public String getCNTax(double x) {
        
        String s = String.format("%.2f", (x / currency));
        
        result = s + " CNY";

        return result;
    }
    
}
