public class BLTax {
    
    private String result;
    private final double currency = 0.0022;
    
    public String getBLTax(double x) {
        
        String s = Double.toString(x / currency);
        
        result = s + " IDR";

        return result;
    }
}
