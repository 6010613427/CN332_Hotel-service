public class HKTax {
    
    private String result;
    private final double currency = 4;
    
    public String getHKTax(double x) {
        
        String s = Double.toString(x / currency);
        
        result = s + " HKD";

        return result;
    }

}
