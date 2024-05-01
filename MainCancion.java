import java.util.Scanner;

public class MainCancion {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese el titulo de la cancion");
        String titulo = leer.nextLine();
        System.out.println("Ingrese el autor");
        String autor = leer.nextLine();
        Cancion micancion = new Cancion();
        micancion.setTitulo(titulo);
        micancion.setAutor(autor);
        System.out.println(micancion.toString());
    }
}
