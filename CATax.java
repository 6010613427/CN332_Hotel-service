public class CATax {
    
    private String result;
    private final double currency = 25.58;
    
    public String getCATax(double x) {
        
        String s = Double.toString(x / currency);
        
        result = s + " CAD";

        return result;
    }

}
