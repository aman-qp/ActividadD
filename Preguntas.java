import java.util.Scanner;

public class Preguntas {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del teclado
        Scanner scanner = new Scanner(System.in);
        
        // Solicitar al usuario que ingrese su nombre
        System.out.print("Por favor, ingresa tu nombre: ");
        String nombre = scanner.nextLine();
        
        // Solicitar al usuario que ingrese su edad
        System.out.print("Por favor, ingresa tu edad: ");
        int edad = scanner.nextInt();
        // Limpiar el búfer de entrada después de leer un entero
        scanner.nextLine();
        
        // Solicitar al usuario que ingrese su color favorito
        System.out.print("Por favor, ingresa tu color favorito: ");
        String colorFavorito = scanner.nextLine();

        //Solicitar al usuario que ingrese su animal favorito
        System.out.print("Por favor, ingresa tu animal favorito: ");
        String animalFavorito = scanner.nextLine();
        
        // Solicitar al usuario que ingrese su nacionalidad
        System.out.print("Por favor, ingresa tu nacionalidad: ");
        String nacionalidad = scanner.nextLine();

        // Solicitar al usuario que ingrese su SerieFav
        System.out.print("Por favor, ingresa tu serie favorita: ");
        String serie = scanner.nextLine();

        // Solicitar al usuario que ingrese su PeliculaFav
        System.out.print("Por favor, ingresa tu pelicula favorita: ");
        String pelicula = scanner.nextLine();
        
        // Mostrar la información ingresada por el usuario
        System.out.println("\n¡Hola " + nombre + "!");
        System.out.println("Tu edad es: " + edad + " años");
        System.out.println("Tu color favorito es: " + colorFavorito);
        System.out.println("Tu animal favorito es: " + animalFavorito);
        System.out.println("Tu nacionalidad es: " + nacionalidad);
        System.out.println("Tu serie favorita es: " + serie);
        System.out.println("Tu serie favorita es: " + pelicula);
        
        // Cerrar el Scanner para liberar recursos
        scanner.close();
    }
}

//Linea para probar la creación del branch 