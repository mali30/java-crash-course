package company.mohamedali.Interfaces;

public class TaxReport {


    private TaxCalculator calculator;

    /*
     gonna refactor this to dependency injection
     public TaxReport(){
        calculator = new TaxCalculator2019(10000);
   }
     */

    // comented out for method injection
//    public TaxReport(TaxCalculator taxCalculator) {
//        calculator = taxCalculator;
//    }

    // method injection
    public void show(TaxCalculator calculator){
        var tax = calculator.calculateTax();
        System.out.println(tax);
    }

    // setter injection
    // benefit - change through lifetime of program
    public void setCalculator(TaxCalculator calculator) {
        this.calculator = calculator;
    }
}
