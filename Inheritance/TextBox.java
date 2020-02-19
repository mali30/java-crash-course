package company.mohamedali.Inheritance;

public class TextBox extends UIControl {

private String text = "";

public TextBox(){
//    super(true);
    System.out.println("Constructor for Text Box");
}

    @Override
    public void render() {
        System.out.println("Render Textbox");
    }

    private void setText(String text ){
    this.text = text;
}

public void clear(){
    text = "";
}

    @Override
    public String toString() {
        return "text" + text;
    }
}
