/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author palmj
 */
public class CalcBalance {
    
private String result;

    public String balanceAmount(double balance, String country) {       

        switch (country) {
            case "Hongkong":
                HKTax h = new HKTax();
                result = h.getHKTax(balance);
                break;
            case "Canada":
                CATax ca = new CATax();
                result = ca.getCATax(balance);
                break;
            case "Japan Hotel":
                JPTax j = new JPTax();
                result = j.getJPTax(balance);
                break;
            case "China":
                CNTax cn = new CNTax();
                result = cn.getCNTax(balance);
                break;
            case "Bali":
                BLTax b = new BLTax();
                result = b.getBLTax(balance);
                break;
        }

        return result;
    }
    
    public String getCalcTax() {
        
        return result;
        
    }

}
