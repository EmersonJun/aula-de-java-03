import java.util.Scanner;

public class ex3 {    
    public static int maiorNumero(int[] vetor) {
    int maior = vetor[0];
    
    for (int i = 1; i < vetor.length; i++) {
        if (vetor[i] > maior) {
            maior = vetor[i];
        }
    }
    
    return maior;
    }
    public static void main(String[] args) {
        int[] vetor = {3, 7, 2, 9, 4};
        System.out.println("O maior número é: " + maiorNumero(vetor));
    }
}
