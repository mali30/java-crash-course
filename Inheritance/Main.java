package company.mohamedali.Inheritance;

import company.mohamedali.Interfaces.TaxCalculator2018;
import company.mohamedali.Interfaces.TaxCalculator2019;
import company.mohamedali.Interfaces.TaxReport;
import company.mohamedali.Inheritance.Polymorphism.CheckBox;

public class Main {


    public static void main(String[] args) {

        /*
            Upcast and downcasting was the last section I did. Go back
            over it.

         */

//        var controller = new UIControl();
        // has access to it's parent class
        var controller2 = new TextBox();
        System.out.println(controller2.toString());

//        controller.setDisabled();
//        System.out.println(controller.status());

        // comparing objects
        var point1 = new Point(1,2);
        var point2  = new Point(1,2);
        var point3 = point2;
        System.out.println(point1.equals(new TextBox()));
        System.out.println(point1.equals(point2));
        System.out.println(point1.equals(point3));

        // will return same hash value
        System.out.println(point1.hashCode());
        System.out.println(point2.hashCode());

        // polymorphism
        // each object has it's own control(). It's taking many forms
        UIControl [] controls = {new TextBox(), new CheckBox()};
        for(var control : controls)
            control.render();


        // dependency injection doing poor man injection
        var calculator = new TaxCalculator2019(20_000);
//        var report = new TaxReport(calculator);
        var report = new TaxReport();

        report.show(calculator);

//        report.setCalculator(new TaxCalculator2018());
        // method injection
        report.show(new TaxCalculator2018());




    }


    public static void showUI( UIControl uiControl){
        System.out.println(uiControl);
    }


}
