
/**
 * Write a description of class VentaVehiculoPOO here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class VentaVehiculoPOO
{
    public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);  
    ventasPOO[] ventas = new ventasPOO[50];
    VehiculosPOO[] vehiculos = new VehiculosPOO[4];
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
                ventasPOO venta = new ventasPOO();
                switch(opcionVenta){
                case 1:
                    venta.venta = "Red Bull-Max Verstapen";
                    break;
                case 2:
                    venta.venta = "Aston Matin-Fernando Alonso";
                    break;
                case 3:
                    venta.venta = "Mercedes-Lewis Hamilton";
                    break;
                case 4:
                    venta.venta = "Ferrari-Charles Leclerc";
                    break;                    
                }          
                ventas[numeroventa] = venta;
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
                    System.out.print(i+"."+ventas[i].venta+"\n");
                } 
                System.out.print("1.Regresar al menú\n");
                System.out.print("2.Salir\n");
                retorno = sc.nextInt();
            break;
        case 3:
                VehiculosPOO vehiculo = new VehiculosPOO();
                vehiculo.vehiculos = "Red Bull-Max Verstapen";
                vehiculos[0] = vehiculo;
                vehiculo.vehiculos = "Aston Matin-Fernando Alonso";
                vehiculos[1] = vehiculo;
                vehiculo.vehiculos = "Mercedes-Lewis Hamilton";
                vehiculos[2] = vehiculo;
                vehiculo.vehiculos = "Ferrari-Charles Leclerc";
                vehiculos[3] = vehiculo;                
                for(int i=0;i < vehiculos.length;i++){                               
                    System.out.print(i+1+"."+vehiculos[i].vehiculos+"\n");
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
