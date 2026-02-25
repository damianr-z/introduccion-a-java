import java.util.Scanner;

public class portfolio {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        //Datos a ingresar
        System.out.print("Ingrese su nombre: ");
        String nombre = scanner.nextLine();
        
        System.out.print("Ingrese el capital inicial: ");
        double capitalInicial = scanner.nextDouble();
        
        System.out.print("Ingrese el retorno que desea obtener: ");
        double retorno = scanner.nextDouble();

        String perfil;
        final double COMISION = 0.2;

        if (retorno <= 5) {
            perfil = "conservador";
        } else if (retorno > 5 && retorno <= 7) {
            perfil = "moderado";
        }
        else {
            perfil = "arriesgado";
        }
        
        System.out.println("_________________________________________");
        System.out.println("Portfolio de Inversión para " + nombre);
        System.out.println("Usted tiene un perfil de inversor " + perfil+".");
        System.out.println("Capital Inicial: $" + capitalInicial);
        System.out.println("Un retorno del " + retorno + "% equivale a $" + (retorno * capitalInicial) / 100 + " de ganancia.");
        System.out.println("La tasa de comision es del " + (COMISION * 100) + "%");
        System.out.println("_________________________________________");

        scanner.close();
    }
}
