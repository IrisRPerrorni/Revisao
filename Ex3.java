import java.util.Scanner;

public class Ex3 {
    //
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o número de matrícula do aluno: ");
        int matricula = leitor.nextInt();


        System.out.println("Digite a 1° nota: ");
        double nota1 = leitor.nextDouble();

        System.out.println("Digite a 2° nota: ");
        double nota2 = leitor.nextDouble();

        System.out.println("Digite a 3° nota: ");
        double nota3 = leitor.nextDouble();

        System.out.println("Digite a média dos exercícios: ");
        double media = leitor.nextDouble();

        double mediaaprov = (nota1 * 1 + nota2 * 2 + nota3 * 3 + media) / 7;


        System.out.println("A matricula do aluno é: " + matricula);
        System.out.println("As notas foram : " + "\n1°: " + nota1 + "\n2º: " + nota2 + "\n3°: " + nota3);
        System.out.printf("A média de aproveitamento foi %.2f ", mediaaprov);


        if (mediaaprov >= 90) {
            System.out.println("O aluno é conceito A !!!");
            System.out.println("Aprovado");

        } else if (mediaaprov >= 75 && mediaaprov < 90) {
            System.out.println("O aluno é conceito B !!!");
            System.out.println("Aprovado");

        } else if (mediaaprov >= 60 && mediaaprov < 75) {
            System.out.println("O aluno é conceito C !!!");
            System.out.println("Aprovado!!");

        } else if (mediaaprov >= 40 && mediaaprov < 60) {
            System.out.println("O aluno é conceito D !!!");
            System.out.println("Reprovado!!");

        } else if (mediaaprov < 40) {
            System.out.println("O aluno é conceito D !!!");
            System.out.println("Reprovado!!");

        }
    }
}
