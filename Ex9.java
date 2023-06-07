import java.util.ArrayList;
import java.util.List;

public class Ex9 {
    //Crie um vetor capaz de armazenar 50 números inteiros.
    // Em seguida faça o seu preenchimento automático com os números de 101 a 150,
    // ou seja, na posição número 0 ponha 101, na posição 1 ponha o número 102, e assim sucessivamente.
    // Em seguida exiba os valores deste vetor.

    public static void main(String[] args) {
        List<Integer> vetor = new ArrayList<>(50);
        int num = 0;
        int posicao = 0;

        for(int i=0 ; i < 50 ; i++){
           num = 101 + i;
            vetor.add(num);

        }
        
        }




    }
}


