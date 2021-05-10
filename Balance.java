public class Balance {
    
    public String textBalance(double balance, String country) {
        CalcBalance c = new CalcBalance();
        c.balanceAmount(balance, country);
        return c.getCalcTax();
    }
    
}
