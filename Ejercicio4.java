import java.util.Scanner;
import java.text.DecimalFormat;
import java.util.Locale;

public class Ejercicio4
{
    public static void main(String[] args) 
   {
     double valor_bruto, impuesto, valor_neto;
    
     Scanner teclado = new Scanner(System.in);
     
     // 1. Solicitar los datos de entrada
     System.out.println("Valor Impuesto");
     
     System.out.print("Digite Valor Bruto: ");
     valor_bruto = teclado.nextDouble();
     
     // 2. Hallar los datos 
          
     // 3. Mostrar los datos de salida en pantalla

        System.out.println("Digite 'C' si es camioneta o 'A' o automovil");
        String str;
        str = teclado.next();
        switch(str)
        {
 
            case "C":
            impuesto =0;
            valor_neto = 0;
            if (valor_bruto < 80) {
                impuesto = 0;
                valor_neto = valor_bruto+impuesto;
            } else if (valor_bruto >= 80) {
                impuesto = (valor_bruto/2);
                valor_neto = valor_bruto+impuesto;
              } 
                System.out.println("Valor Impuesto: " + convertir(impuesto));
                System.out.println("Valor Neto: " + convertir(valor_neto));
            break;
            case "A":
                 impuesto =0;
                  valor_neto = 0;
             if (valor_bruto < 20) {
                impuesto = 5;
                valor_neto = valor_bruto+impuesto;
             } else if (valor_bruto >= 20 && valor_bruto <= 40) {
                impuesto = (valor_bruto/5);
                valor_neto = valor_bruto+impuesto;
               } else if (valor_bruto > 40) {
                 impuesto = 9;
                 valor_neto = valor_bruto+impuesto;
                }
                System.out.println("Valor Impuesto: " + convertir(impuesto));
                System.out.println("Valor Neto: " + convertir(valor_neto));

                  break;
            default:
                System.out.println("no match");
        }
    }
    public static String convertir(double val){
    Locale.setDefault(Locale.US);
    DecimalFormat num = new DecimalFormat("#,###.00");
    return num.format(val);
    }
}