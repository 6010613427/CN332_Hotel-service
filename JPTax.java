public class JPTax {
    
    private String result;
    private final double currency = 0.29;
    
    public String getJPTax(double x) {
        
        String s = String.format("%.2f", (x / currency));
        
        result = s + " JPY";

        return result;
    }
}
