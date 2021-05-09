public class Balance {
    
    public void textBalance(double balance, String country) {
        CalcBalance c = new CalcBalance();
        c.balanceAmount(balance, country);
        c.getCalcTax();
    }
    
}
