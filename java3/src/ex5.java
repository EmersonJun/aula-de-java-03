import java.util.Scanner;

public class ex5 {
    String nome, sobrenome;
    int ddd, telefone;
    public void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        ex5 exemplo = new ex5();
        exemplo.info(); 
        exemplo.exibir();
    }
    
    public void info() {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Insira o nome:");
        nome = entrada.nextLine(); 

        System.out.println("Insira o sobrenome:");
        sobrenome = entrada.nextLine();

        System.out.println("insira o ddd:");
        ddd = entrada.nextInt();

        System.out.println("insira o telefone:");
        telefone = entrada.nextInt();

        
    }
    public void exibir() {
        System.out.println("nome:" +nome);
        System.out.println("sobrenome:" +sobrenome);
        System.out.println("ddd:" +ddd);
        System.out.println("telefone:" +telefone);
    }
}
