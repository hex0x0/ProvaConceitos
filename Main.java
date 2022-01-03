import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        
        
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int pseudoAleatorio = rand.nextInt(100) + 1;
        int num;
        //boolean flag = true;
        while(true){
            System.out.println("Digite um número (1 - 100):");
            num = sc.nextInt();    

            if(num == pseudoAleatorio){
                System.out.println("Você acertou: " + pseudoAleatorio);
                break;
            }else if(pseudoAleatorio > num){
                //System.out.println("Quase!!!!");
                System.out.println("Numero eh maior!");
                
            }else{
                System.out.println("Numero eh menor!");
            }

            //if(num < 1 || num > 100){
            //      flag = false;
            //}
        }
        

        




        /*



        //DiasSemana ds = DiasSemana.SEGUNDA;

        System.out.println(DiasSemana.SEGUNDA.dia);
        

        List<String> list = new LinkedList<>();

        list.add(0, "Pedro");
        list.add(0, "Ana");

        shout(list);

        
        Dog dg = new Dog();

        dg.makeSound();














        */




















    }

    public static <T> void shout(List<?> list){
        for(Object obj: list){
            System.out.println(obj);
        }
    }

}