public class HKTax {
    
    private String result;
    private final double currency = 4;
    
    public String getHKTax(double x) {
        
        String s = String.format("%.2f", (x / currency));
        
        result = s + " HKD";

        return result;
    }

}
