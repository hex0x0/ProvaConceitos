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
            System.out.println("*********************");
            for(int i = 0; i < 15; i++){
                System.out.print("|");
               for(int j = 0; j < 20; j++){
                   if(i == 7 && j == 6){
                        System.out.print("ADIVINHA");
                        for(int k = 0; k < 6; k++){
                            System.out.print(" ");
                        }
                        break;
                        
                   }else{
                        
                        System.out.print(" ");
                   }
                   
               }
              
               System.out.print("|");
               System.out.println();
            }
            System.out.println("*********************");
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
        
        
        String[] moves = {"P", "R", "S"};

        String compMove = moves[rand.nextInt(moves.length)];

        String playerMove;

        System.out.println("compMove " +  compMove);
        
        while(true){
            System.out.println("Escolha seu movimento (R, P, S): ");
            playerMove = sc.nextLine();
            if(playerMove.equals("R") || playerMove.equals("P") || playerMove.equals("S")){
                break;
            }
        }

        if(compMove.equals(playerMove)){
            System.out.println("Empate!");
        }else if(compMove.equals("R") && playerMove.equals("S")){
            System.out.println("Pedra (Computador) x Tesoura (Usuário)");
            System.out.println("Computador venceu!");
        }else if(compMove.equals("P") && playerMove.equals("R")){
            System.out.println("Papel (Computador) x Pedra (Usuário)");
            System.out.println("Computador venceu!");
        }else if(compMove.equals("S") && playerMove.equals("P")){
            System.out.println("Tesoura (Computador) x Papel (Usuário)");
            System.out.println("Computador venceu!");
        }else{
            System.out.println(compMove + "(Computador) x" + playerMove + "(Usuario)");
            System.out.println("Você venceu!");
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