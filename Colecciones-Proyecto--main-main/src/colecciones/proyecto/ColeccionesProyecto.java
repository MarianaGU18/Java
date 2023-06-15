
package colecciones.proyecto;

/**
 *
 * @author yizus, peters, Joselogod,
 */
import java.util.Scanner;
public class ColeccionesProyecto {
//hola <3
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Bienvenido al sistema de inscripcciones");
        System.out.println("Menu");
        System.out.println("1)Registrar Alumnos");
        System.out.println("2)Registrar Asignatura");
        System.out.println("3)Registrar Profesor");
        System.out.println("4)Abrir un grupo");
        System.out.println("5)Inscribir alumno");
        System.out.println("6)Mostrar elementos");
        Scanner sc = new Scanner(System.in);
        int c;
          System.out.println("Dame la opcion");
      c = sc.nextInt();
        
         switch (c){
             case 1:
                 System.out.println("Entraste en la opción 1");
             break;
             case 2:
                 System.out.println("Entraste en la opción 2");
             break;
             case 3:
                 System.out.println("Entraste en la opción 3");
             break;
             case 4:
                 System.out.println("Entraste en la opción 4");
             break;
             case 5:
                 System.out.println("Entraste en la opción 5");
             break;
             case 6:
                 System.out.println("Entraste en la opción 6");
             break;
             default:
                 System.out.println("No es posible elegir esta opción vuelve a intentarlo");
         }
    }
    
}

