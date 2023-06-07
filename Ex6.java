import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Ex6 {
    //Escreva um algoritmo que leia uma sequência de números do usuário e realize a soma desses números.
    // Encerre a execução quando um número negativo for digitado.

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList();

        int i = 0;
        int num = 0;
        int somar = 0;
        System.out.println("Para encerrar o ciclo digite um número negativo");

        do {
            i++;
            System.out.println("Digite o " + i + "º número");
            num = entrada.nextInt();
            numeros.add(num);

        } while (num > 0);
        numeros.remove(numeros.size() - 1);
        System.out.println("Os numeros digitados são: " + numeros);
        Collections.sort(numeros);
        System.out.println("A sequência em ordem crescente desses número são" + numeros);

        for (int soma : numeros) {
            somar += soma;

        }
        System.out.println("A soma dos números são: " + somar);
    }

}
