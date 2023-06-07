import java.util.Scanner;

public class Ex7 {
    // Leia o nome do usuário e um número N, após isso escreva o nome dele na tela N vezes.
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o seu nome: ");
        String nome = entrada.next();

        System.out.println("Digite quantas vezes você quer seu nome impresso na tela: ");
        int n = entrada.nextInt();

        for (int i = 0 ; i < n ; i++ ){
            System.out.println(nome);
        }
    }
}
