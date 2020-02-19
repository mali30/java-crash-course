package company.mohamedali.Exceptions;

public class ExceptionsDemo {
    public static void show(){
        sayHello(null);
    }

    public static void sayHello(String name){
        System.out.println(name.toUpperCase());
    }

    public static void withDrawMoney(){
        var account = new Account();
        try {
            account.withDraw(100);
        } catch (AccountException e) {
            System.out.println(e.getMessage());

            }
    }

}
