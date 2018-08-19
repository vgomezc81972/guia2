import java.util.Scanner;
import java.text.DecimalFormat;
import java.util.Locale;

public class Ejercicio3
{
    public static void main(String[] args) 
   {
     double personas, turistas;
     double valor_persona, valor_viaje, cantidad_viajes,total_valor_turistas ;
     double valor_propietario;
     
     Scanner teclado = new Scanner(System.in);
     
     // 1. Solicitar los datos de entrada
     System.out.println("Un Colectivo ");
     
     System.out.print("Digite # personas caben en colectivo: ");
     personas = teclado.nextDouble();
     
     System.out.print("Digite # turistas: ");
     turistas = teclado.nextDouble();
     
     // 2. Hallar los datos 
     valor_persona =  (10000);
     valor_viaje =  (2000);
     cantidad_viajes =  Math.round((turistas/personas));
     total_valor_turistas =  (valor_persona*turistas);
     valor_propietario = (valor_viaje*cantidad_viajes);
         
     // 3. Mostrar los datos de salida en pantalla
     System.out.println("Cuantos Viajes debe realizar colectivo: " + convertir(cantidad_viajes));
     System.out.println("cuánto dinero en total deberán pagar los turistas al colectivo : " + convertir(total_valor_turistas));
     System.out.println("cuánto dinero deberá pagar el conductor al propietario.: " + convertir(valor_propietario));

    }
    public static String convertir(double val){
    Locale.setDefault(Locale.US);
    DecimalFormat num = new DecimalFormat("#,###.00");
    return num.format(val);
    }
}
