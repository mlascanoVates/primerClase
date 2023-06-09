import java.io.*;
import java.util.Scanner;

import static java.lang.Math.max;


public class Main {
    public static void main(String[] args) throws IOException {

        //HOLA MUNDO
        System.out.println("¡Hola mundo!");
        System.out.println();

        //SALUDO
        Scanner ingresoNombre = new Scanner(System.in);
        String nombre;
        System.out.print("Por favor ingrese su nombre: ");
        nombre= ingresoNombre.nextLine();
        System.out.println("Gracias por ingresar nombre " + nombre);
        System.out.println();


        //CALCULADORA
        Scanner ingresoNumero = new Scanner(System.in);
        int numero1,numero2;
        int suma, diferencia, producto;
        double cociente;

        System.out.print("Ingrese un número entero: ");
        numero1 = ingresoNumero.nextInt();

        System.out.print("Ingrese un segundo número entero: ");
        numero2 = ingresoNumero.nextInt();

        suma= numero1 + numero2;
        diferencia= numero1 - numero2;
        producto= numero1* numero2;
        cociente= (double)numero1 / numero2;

        System.out.println("El resultado de su suma es: " + suma);
        System.out.println("El resultado de su diferencia es: " + diferencia);
        System.out.println("El resultado de su producto es: " + producto);
        System.out.println("El resultado de su cociente es: " + cociente);
        System.out.println();


        //CALCULADORA 2
        System.out.println("Se lee dos números desde archivo y se muestra el resultado de la suma, diferencia, producto y división: ");
        File archivo = new File ("Leer.txt");
        FileReader leerArchivo = new FileReader (archivo);
        BufferedReader buffer = new BufferedReader(leerArchivo);

        int linea, linea2;
        linea = Integer.parseInt(buffer.readLine());
        linea2= Integer.parseInt(buffer.readLine());
        System.out.println("Primer número es: " + linea);
        System.out.println("Segundo número es: " + linea2);

        suma= linea + linea2;
        diferencia=linea - linea2 ;
        producto= linea * linea2;
        cociente= (double)linea / linea2;

        System.out.println("El resultado de su suma es: " + suma);
        System.out.println("El resultado de su diferencia es: " + diferencia);
        System.out.println("El resultado de su producto es: " + producto);
        System.out.println("El resultado de su cociente es: " + cociente);
        System.out.println();

        System.out.println("TODO");
        
        //CALCULADORA OP2
        System.out.println("Lee con Scanner dos números desde archivo y se muestra el resultado de la suma, diferencia, producto y división: ");
        File archivo2 = new File("Leer.txt");
        Scanner leerArchivo2 = new Scanner(archivo2);

        int linea3, linea4;

        linea3 = Integer.parseInt(leerArchivo2.nextLine());
        linea4 = Integer.parseInt(leerArchivo2.nextLine());
        System.out.println("Primer número es: " + linea3);
        System.out.println("Segundo número es: " + linea4);

        suma= linea3 + linea4;
        diferencia=linea3 - linea4 ;
        producto= linea3 * linea4;
        cociente= (double)linea3 / linea4;

        System.out.println("El resultado de su suma es: " + suma);
        System.out.println("El resultado de su diferencia es: " + diferencia);
        System.out.println("El resultado de su producto es: " + producto);
        System.out.println("El resultado de su cociente es: " + cociente);
        System.out.println();

        //MAYOR DE 2
        Scanner escanearNumero= new Scanner(System.in);
        int  mayor;
        int numeroEscaneado1, numeroEscaneado2;

        System.out.print("Ingrese un número por teclado: ");
        numeroEscaneado1 = Integer.parseInt(escanearNumero.nextLine());

        System.out.print("Ingrese otro número por teclado: ");
        numeroEscaneado2 = Integer.parseInt(escanearNumero.nextLine());

        //uso clase max de la biblioteca Math
        mayor=  max(numeroEscaneado1,numeroEscaneado2);

        System.out.println("El número mayor es: " + mayor);

        //OTRA FORMA DE HACER
        //Solo recibe números positivos
        System.out.println();
        mayor = ( abs(numeroEscaneado1 + numeroEscaneado2) + abs( numeroEscaneado1 - numeroEscaneado2 ) ) / 2;

        System.out.println("Otra manera de imprimir mayor 1: " + mayor);

        System.out.println("Otra manera de imprimir mayor 2: " + mayor(numeroEscaneado1,numeroEscaneado2));

    }
    
    public static int mayor(int n, int m){
        int a,b,c;
        a= abs(n+m);
        b =abs(n-m);
        c= (a+b)/2;
        return c;
    }

}

