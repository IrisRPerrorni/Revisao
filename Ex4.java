import java.util.ArrayList;
import java.util.Scanner;

public class Ex4 {
    //Leia a idade de 20 pessoas e exiba a média das idades.

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        ArrayList<Integer> idades = new ArrayList<>();

        int idade = 0;
        double somar = 0;
        double media = 0;

        for (int i = 0 ; i < 20 ; i++){
            System.out.println("Digite a " + (i+1) + "º idade");
            idade = entrada.nextInt();
            idades.add(idade);
        }
        for (int soma : idades){
            somar += soma ;
        }
        media = somar/20;

        System.out.printf("A média das idade é %.2f: " , media);


    }

}
