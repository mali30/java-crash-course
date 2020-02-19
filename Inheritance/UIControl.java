package company.mohamedali.Inheritance;

/*
    This class is an example of an abstract class. We use abstract
     when we create a class and we don't want to instantiate it. We don't really
    know what UIControl is. It's an abstract concept.
 */
public abstract class UIControl {

    private boolean isEnabled = true;
//    public UIControl(boolean isEnabled){
//        this.isEnabled = isEnabled;
//        System.out.println("Constructor called");
//    }

    // forces any classes that derive from UIControl to use it.
    public  abstract void render();


    public void setEnabled() {
        isEnabled = false;
    }

    public void setDisabled(){
        isEnabled = false;
    }

    public boolean status(){
        return isEnabled;
    }

    @Override
    public String toString() {
        return "Is Enabled " + isEnabled;
    }

}
