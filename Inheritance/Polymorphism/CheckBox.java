package company.mohamedali.Inheritance.Polymorphism;

import company.mohamedali.Inheritance.UIControl;

public final class CheckBox extends UIControl {

    @Override
    public void render() {
        System.out.println("Render CheckBox");
    }
}

/*
if we have a class that is final, we cannot extend
from it


public final class CheckBox extends UIControl {

public class MyCheckBox extends  CheckBox {

}
*/


