import java.util.Scanner;

public class Ex2 {
   //Faça um algoritmo que leia uma variável e some 5 caso seja par ou
    // some 8 caso seja ímpar, imprimir o resultado desta operação.
   public static void main(String[] args) {

       Scanner leitor = new Scanner(System.in);

       System.out.println("Digite um número : ");
       double num = leitor.nextInt();
       double resultado = 0;

       if( (num % 2) == 0){
           resultado = num + 5 ;
           System.out.println("O resultado foi: " + resultado);

       } else if ((num%2) !=0){
           resultado = num + 8 ;
           System.out.println("O resultado foi: " + resultado);
       }
   }

}
