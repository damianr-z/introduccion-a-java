package clase5;

public class Operadores {
    public static void main(String[] args) {
        int resultado = 0;
        int operando1 = 7;
        final int OPERANDO2 = 5;
        int descuento = 15;

        int operando3 = 5;
        int operando4 = 4;
        
        // the sum at the end will calculate the previus value first before adding a number.
        boolean result; 
        result = operando3 == operando4++;
        System.out.print(result);
        


        resultado = operando1 + OPERANDO2 + 2;
        System.out.println("El resultado es: " + resultado);
        System.out.println("El descuento corresponde al: " + descuento + "%");
        System.out.printf("Score: %d", 95);   
    }
    

}
