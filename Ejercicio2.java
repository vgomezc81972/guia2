import java.util.Scanner;
import java.text.DecimalFormat;
import java.util.Locale;

public class Ejercicio2
{
    public static void main(String[] args) 
   {
     double radio, lado, area_cuadrado, area_circulo, area_sombreada;
    
     Scanner teclado = new Scanner(System.in);
     
     // 1. Solicitar los datos de entrada
     System.out.println("Area Sombreada");
     
     System.out.print("Digite el radio: ");
     radio = teclado.nextDouble();
     
     // 2. Hallar los datos 
     lado =  (radio+radio);
     area_cuadrado =  (lado*lado);
     area_circulo =  (Math.PI*(radio*radio));
     area_sombreada =  (area_cuadrado-area_circulo);
          
     // 3. Mostrar los datos de salida en pantalla
     System.out.println("El Area Sombreada es: " + convertir(area_sombreada));
        
    }
    public static String convertir(double val){
    Locale.setDefault(Locale.US);
    DecimalFormat num = new DecimalFormat("#,###.00");
    return num.format(val);
    }
}
