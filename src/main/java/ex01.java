import java.util.Scanner;

public class ex01 {
    public static void main(String[] args) {
        Scanner leTeclado = new Scanner(System.in);

        int L = leTeclado.nextInt();
        int C = leTeclado.nextInt();
        if ((L + C) % 2 ==0)
            System.out.println("1");
        else                                               //complete o código nos espaços em branco
            System.out.println("0");
        leTeclado.close();

    }
}
