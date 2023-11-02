import java.util.InputMismatchException;
import java.util.Scanner;
public class Menu {

    public void mostrarMenu(){
        System.out.println("Bienvenido al sistema de gestión de empresa transportista");
        System.out.println("1. Agregar sucursal");
        System.out.println("2. Eliminar sucursal");
        System.out.println("3. Agregar camión");
        System.out.println("4. Eliminar camión");
        System.out.println("5. Modificar estado de camión");
        System.out.println("6. Agregar productos a un pack");
        System.out.println("7. Eliminar productos a un pack");
        System.out.println("8. Calcular valor total de un flete");
        System.out.println("9. Salir");
    }
    public void leerOpcion(){
        int opcion = ;
        System.out.println("Ingrese una opción");
    }

    public int validarInt(){
        Scanner scanner = new Scanner(System.in);
        try{
            return scanner.nextInt();
        }catch(InputMismatchException e){
            System.out.println("Ingrese un número válido");
        }

    }

}
