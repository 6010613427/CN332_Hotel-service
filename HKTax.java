public class HKTax {
    
    private String result;
    private final double currency = 4;
    
    public String getHKTax(double x) {
        final double HKhotel = 3000;
        String s = String.format("%.2f",(x+HKhotel) * currency);
        
        result = s + " HKD";

        return result;
    }

}
