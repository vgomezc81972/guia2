import java.util.Scanner;
import java.text.DecimalFormat;
import java.util.Locale;

public class Ejercicio1
{
    public static void main(String[] args) 
   {
     double numero, pie, centimetro, legua, yarda;
    
     Scanner teclado = new Scanner(System.in);
     
     // 1. Solicitar los datos de entrada
     System.out.println("Conversion de Unidades");
     
     System.out.print("Digite Numero a convertir: ");
     numero = teclado.nextInt();
     
     // 2. Hallar los datos 
     pie =  (0.0833*numero);
     centimetro =  (2.54*numero);
     legua =  (190080.02*numero);
     yarda =  (36*numero);
          
     // 3. Mostrar los datos de salida en pantalla

        System.out.println("Digite 'P' o 'C' o 'L' o 'Y'");
        String str;
        str = teclado.next();
        switch(str)
        {
            case "P":
                   System.out.println("Valor Convertido a pies: " + convertir(pie));
                   break;
            case "C":
                   System.out.println("Valor Convertido a centimetros: " + convertir(centimetro));
                   break;
            case "L":
                   System.out.println("Valor Convertido a leguas: " + convertir(legua));
                   break;
            case "Y":
                   System.out.println("Valor Convertido a yardas: " + convertir(yarda));
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
