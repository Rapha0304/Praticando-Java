import java.util.Scanner;
import java.util.ArrayList;

public class Ex2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero;
        int i;
        System.out.println("Digite um numero: ");
        numero = scan.nextInt();
ArrayList<Integer>numerosPrimos = new ArrayList<Integer>();
    if (numero > 1) {
        numerosPrimos.add(i);
        System.out.println(i);
    }

}    


 public static boolean ePrimo(int numero) {
    for (int i = 2; i < numero; i++) {
        if (numero % i == 0)
            return false;
    }
    return true;
/* ILP506-Turma: Manhã -Nome:Raphaela Tuissi Ramos */
