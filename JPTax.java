public class JPTax {
    
    private String result;
    private final double currency = 0.29;
    
    public String getJPTax(double x) {
        
        String s = Double.toString(x / currency);
        
        result = s + " JPY";

        return result;
    }
}
