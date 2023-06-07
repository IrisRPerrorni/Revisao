import java.util.ArrayList;
import java.util.Scanner;

public class Ex1 {
    //Faça um algoritmo que leia dois valores inteiros A e B
    // se os valores forem iguais deverá se somar os dois, caso contrário multiplique A por B.
    // Ao final de qualquer um dos cálculos deve-se atribuir o resultado para uma variável C e mostrar seu conteúdo na tela.

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o primeiro número inteiro: ");
        int a = leitor.nextInt();

        System.out.println("Digite o segundo número inteiro:");
        int b = leitor.nextInt();

        int c = 0 ;


        if (a == b){
            c = a + b ;
            System.out.println("O resultado é: " + c);

        } else if (a != b) {
            c = a * b;
            System.out.println("O resultado é: " + c);
        }

    }
}
