/*
Paiva Ltda.
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int temperatura, soma = 0, cont = 1;
        double media;

        do{
            System.out.printf("Digite a temperatura %d (entre 4 e 10): ", cont);
            temperatura = sc.nextInt();
            if(temperatura >= 4 && temperatura <= 10){
                soma += temperatura;
                cont++;
            }

        }while(cont != 13);
        System.out.println("Soma:" + soma);
        media = (double) soma / 12;
        System.out.printf("A média de hoje das temperaturas é: %.1f° C", media );

    }
}
