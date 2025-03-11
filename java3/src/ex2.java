import java.util.Scanner;
public class ex2 {
    public void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);
        fatorial();
        }
          public void fatorial(){
            int i,fact=1;
            int number=7;
            for(i=1;i<=number;i++){
                fact=fact*i;
            }
            System.out.println("Factorial de "+number+" é: "+fact);
           }
          
}
