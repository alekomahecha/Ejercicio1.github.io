
/**
 * Write a description of class VentaVehiculo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class VentaVehiculo
{
    public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);     
    String[] ventas = new String[50];
    String[] vehiculos = new String[4];
    int opcion,numeroventa=0,opcionVenta,retorno=0;
    
    do{
    System.out.print("Bienvenido al sistema de Gestiòn de Vehiculos\n");
    System.out.print("---------------------------------------------\n");
    System.out.print("Seleccione la opciòn que desee\n");
    System.out.print("---------------------------------------------\n");
    System.out.print("1.Venta Vehiculos F1\n");
    System.out.print("2.Listar ventas\n");
    System.out.print("3.Lista de Vehiculos\n");
    System.out.print("4.Salir\n");
    opcion = sc.nextInt();    
    if(opcion >= 1 && opcion <=4){
    
        switch(opcion){
        
        case 1:
                System.out.print("Selecione el carro de la venta\n");
                System.out.print("---------------------------------------------\n");
                System.out.print("1.Red Bull-Max Verstapen\n");
                System.out.print("2.Aston Matin-Fernando Alonso\n");
                System.out.print("3.Mercedes-Lewis Hamilton\n");
                System.out.print("4.Ferrari-Charles Leclerc\n");
                opcionVenta = sc.nextInt();                
                switch(opcionVenta){
                case 1:
                    ventas[numeroventa] = "Red Bull-Max Verstapen";
                    break;
                case 2:
                    ventas[numeroventa] = "Aston Matin-Fernando Alonso";
                    break;
                case 3:
                    ventas[numeroventa] = "Mercedes-Lewis Hamilton";
                    break;
                case 4:
                    ventas[numeroventa] = "Ferrari-Charles Leclerc";
                    break;                    
                }                
                System.out.print("Venta Registrada con exito\n");
                numeroventa++;
                System.out.print("1.Regresar al menú\n");
                System.out.print("2.Salir\n");
                retorno = sc.nextInt();
            break;
        case 2:
                System.out.print("Ventas a la fecha\n");
                System.out.print("---------------------------------------------\n");
                for(int i=0;i < numeroventa;i++){                               
                    System.out.print(i+"."+ventas[i]+"\n");
                } 
                System.out.print("1.Regresar al menú\n");
                System.out.print("2.Salir\n");
                retorno = sc.nextInt();
            break;
        case 3:
                vehiculos[0] = "Red Bull-Max Verstapen";
                vehiculos[1] = "Aston Matin-Fernando Alonso";
                vehiculos[2] = "Mercedes-Lewis Hamilton";
                vehiculos[3] = "Ferrari-Charles Leclerc";                
                for(int i=0;i < vehiculos.length;i++){                               
                    System.out.print(i+1+"."+vehiculos[i]+"\n");
                } 
                System.out.print("-----------------------------\n");
                System.out.print("1.Regresar al menú\n");
                System.out.print("2.Salir\n");
                retorno = sc.nextInt();
            break;
        case 4:
            System.exit(0);
            break;        
        }
    }else{    
    System.out.println("Menú Incorrecto intente nuevamente");
    retorno = 1;
    }   
    }while(retorno == 1);
    }

}
