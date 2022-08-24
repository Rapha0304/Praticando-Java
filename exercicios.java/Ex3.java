import java.util.Scanner;
import java.util.ArrayList;

public class Ex3 {
    public static void main(String[] args) {
        int n, x, y;
        Scanner lerTeclado = new Scanner(System.in);
        System.out.print("Digite N: ");
        n = lerTeclado.nextInt();
        if ((n < 10000) || (n > 99999)) {
            while ((n < 10000) || (n > 99999)) {
                System.out.println("Entrada Inválida");
                System.out.print("Digite N: ");
                n = lerTeclado.nextInt();
            }
        }
        lerTeclado.close();
        ArrayList<Integer> v = new ArrayList<Integer>();
        y = 10000;
        while (y > 0) {
            x = n / y;
            n = n % y;
            y = y / 10;
            v.add(x);
        }
        int p = 2;
        int soma = 0;
        for (int i = 0; p < 7; i++) {
            soma = soma + (v.get(i)) * p;
            p++;
        }
        System.out.println("Dígito verificador = " + soma % 7);
    }
}
/* ILP506-Turma: Manhã -Nome:Raphaela Tuissi Ramos */