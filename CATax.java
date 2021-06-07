public class CATax {
    
    private String result;
    private final double currency = 25.58;
    
    public String getCATax(double x) {
        final double caHotel = 5000;
        String s = String.format("%.2f",(x + caHotel) * currency);
        
        result = s + " CAD";

        return result;
    }

}
