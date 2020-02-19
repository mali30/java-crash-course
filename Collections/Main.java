package company.mohamedali.Collections;

public class Main {

    public static void main(String[] args) {


        var list = new GenericList<String>();
        list.addItems("Mohamed");
        list.addItems("Ali");
        // had to make myList public so not good.
        for(var items : list){
            System.out.println(items);
        }

//        var iterator = list.iterator();
//        while(iterator.hasNext()){
//            var current = iterator.next();
//            System.out.println(current);
//        }


    }



}
