import java.util.Scanner;
public class ex4 {
    public static float somaVetor(float[] vetor) {
        float soma = 0; 
        for (int i = 0; i < vetor.length; i++) {
            soma += vetor[i];
        }
        
        return soma;
    }

        public static void main(String[] args) {
            float[] vetor = {3.5f, 2.7f, 9.1f, 4.2f};
            System.out.println("A soma dos elementos é: " + somaVetor(vetor));
        }
}

