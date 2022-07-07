import java.util.ArrayList;
import java.util.Scanner;

public class Contactos{
    public static void main(String[] args) {
        
        String nombre;
        String celular;

        boolean estado = true;
        Scanner leerOpcion = new Scanner(System.in);
        Scanner leerDato = new Scanner(System.in);
        ArrayList<ArrayList> listaContactos = new ArrayList<>();
        
        do{
            System.out.println("LISTA CONTACTOS\n 1.Ver contactos\n 2.Agregar\n 3.Eliminar\n 4.Modificar\n 5.Salir");
            System.out.println("Digite la Opcion: ");
            int opcion = leerOpcion.nextInt();
            switch(opcion){

                case 1:
                    if(listaContactos.isEmpty()){
                        System.out.println("No existen contactos");
                    } else {
                        System.out.println("Contactos existentes: ");
                    }
                    break;
                
                case 2: 
                    ArrayList<String> contactos = new ArrayList<>();
                    System.out.println("Nombre: ");
                    nombre = leerDato.nextLine();
                    System.out.println("Celular: ");
                    celular = leerDato.nextLine();
                    contactos.add(nombre);
                    contactos.add(celular);
                    listaContactos.add(contactos);
                    System.out.println(listaContactos);
                    System.out.println("Contacto guardado");
                    break;

                case 5:
                    estado = false;
                    System.out.println("Hasta pronto!!");
                break;
            }
        }while(estado);

    }
} 