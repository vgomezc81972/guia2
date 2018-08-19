import java.util.Scanner;
import java.text.DecimalFormat;
import java.util.Locale;
import java.util.*;


public class arreglodes
{
   static double numero;
   static double media;
   static double varianza;
   static double desviacion;
   static int n;
    
    public static void main(String[] args) 
   {
     Scanner teclado = new Scanner(System.in);
     
     System.out.print("Digite la cantidad de numeros a calcular: ");
     n = teclado.nextInt();
     
     double numeros[] = new double[n];
     for (int i =0; i<n;i++)
     {
         System.out.print("Ingrese el numero: "); 
         numeros[i] = teclado.nextDouble();
     }
     
     // 2. Realizar los calculos de los datos 
     
     // calculo de media
     double suma = 0;
     for (double i: numeros)
     {
         suma = suma +i;
     }
     media = suma/n;
     
     // calculo varianza
     double sumatoria;
     for (int i=0; i<n; i++){
         sumatoria = Math.pow(numeros[i] - media,2);
         varianza= varianza + sumatoria;
     }
     varianza = varianza / (n-1);
     
     // calculo de la desviacion
     desviacion = Math.sqrt(varianza);
     double redondeo = Math.rint(desviacion*100)/100;
     
     // 3. Mostrar los datos de salida en pantalla
     System.out.println("La desviacion estandar es: " + convertir(redondeo));
        
    }
    public static String convertir(double val){
    Locale.setDefault(Locale.US);
    DecimalFormat num = new DecimalFormat("#,###.00");
    return num.format(val);
    }
}