import java.util.LinkedList;
import java.util.List;

public class Main{
    public static void main(String[] args) {
        
        



        /*



        //DiasSemana ds = DiasSemana.SEGUNDA;

        System.out.println(DiasSemana.SEGUNDA.dia);
        

        List<String> list = new LinkedList<>();

        list.add(0, "Pedro");
        list.add(0, "Ana");

        shout(list);
        */



        Dog dg = new Dog();

        dg.makeSound();

















    }

    public static <T> void shout(List<?> list){
        for(Object obj: list){
            System.out.println(obj);
        }
    }

}