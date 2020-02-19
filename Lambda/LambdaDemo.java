package company.mohamedali.Lambda;

public class  LambdaDemo {

    public static String prefix = "-";

    public static void main(String[] args) {


        // this is called anonymous inner classes
        greet(new Printer() {
            @Override
            public void printMessage(String message) {
                System.out.println(message);
            }
        });

        // Lambda version
        greet(message -> System.out.println(prefix + message));
        greet(System.out::println);

        greet((message) -> {
            System.out.println(prefix + message);
        });

        // Store lambda in variable
        Printer printer = message -> System.out.println(message);

        greet(message -> {
            String var = "hello";
            System.out.println(var + message);
        });

        greet(new ConsolePrinter());


        /*
            The printMe has the same signature as the printMessage()
            in the ConsolePrinter
         */
        greet(message -> printMe(message));
        greet(LambdaDemo::printMe);



    }



    public static void greet(Printer printer){
        printer.printMessage("Hello world");

        // you can get local variables in lambda

    }

    public static void printMe(String message){}
}

