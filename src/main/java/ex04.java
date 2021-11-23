import java.util.Scanner;

public class ex04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int horasaida = sc.nextInt();
        int tempoviagem = sc.nextInt();
        int fuso = sc.nextInt();

        int ajuste;
        int horas = horasaida + tempoviagem + (fuso);
        if (horas == 24){
            ajuste = 0;
        }else if (horas > 24){
            ajuste = horas - 24;
        }else{
            ajuste = horas;
        }

        System.out.println(ajuste);

        sc.close();
    }
}
