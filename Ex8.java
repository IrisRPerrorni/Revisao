import java.util.ArrayList;
import java.util.Scanner;

public class Ex8 {
    //Leia um conjunto de salários, sendo que para terminar a entrada será fornecido o valor -1.
    //Após toda a entrada ter sido realizada, leia o valor de um reajuste.
    // Em seguida exiba todos os salários já reajustados.

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        ArrayList<Double> salarios = new ArrayList();
        ArrayList<Double> reajustados = new ArrayList();

        int i = 0;
        double salario = 0;

        System.out.println("Para encerrar o ciclo digite -1");

        do {
            i++;
            System.out.println("Digite o " + i + "º salario");
            salario = entrada.nextDouble();
            salarios.add(salario);


        } while (salario > -1);
        salarios.remove(salarios.size() - 1);
        System.out.println("Qual foi o valor do reajuste?");
        double valor = entrada.nextDouble();

        for (double sal : salarios) {
            double reajuste = sal + valor;
            reajustados.add(reajuste);
        }
        System.out.println(salarios);
        System.out.println(reajustados);


    }


}

