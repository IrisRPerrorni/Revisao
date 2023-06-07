import java.util.ArrayList;
import java.util.Scanner;

public class Ex5 {
    //Faça um algoritmo que leia 20 números e, ao final, escreva quantos estão entre 0 e 100.

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        ArrayList<Integer> numeros = new ArrayList<>();
        ArrayList<Integer>lista = new ArrayList<>();

        int num = 0;

        for (int i = 0 ; i < 20 ; i++) {
            System.out.println("Digite o " + (i + 1) + "º número");
            num = entrada.nextInt();
            numeros.add(num);
        }
        for (int cont : numeros){
            if (cont >= 0 && cont <=100){
                lista.add(cont);
            }
        }
        System.out.println("Os números digitados foram: " + numeros);
        System.out.println("Os números que estão entre 0 e 100: " + lista);


    }
}
