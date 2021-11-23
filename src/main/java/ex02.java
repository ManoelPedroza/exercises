import java.util.Scanner;

public class ex02 {
    public static void main(String[] args) {
        Scanner leTeclado = new Scanner(System.in);

        int n = leTeclado.nextInt();
        for(int i =0; i < n; i++){
            int x = leTeclado.nextInt();
            double kg =  Math.pow(2,x)/12/1000;

            System.out.println( (long) kg + " kg");
        }
    }
}
