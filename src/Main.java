import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double gastos;
        double sumaGastos = 0;

        while (true) {
            System.out.println("Ingrese gasto diario: s/");
            gastos = scan.nextDouble();
            if (gastos < 0) {
                break;
            }
            sumaGastos = sumaGastos + gastos;
        }
        System.out.println("El total de gastos es: s/ "+sumaGastos);
    }
}
