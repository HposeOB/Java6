import java.io.FileInputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

public class Array {

    public static void main(String[] args) {
        arrayUnidimensional();
        arrayBidimensional();
        vector();
        vectorPorDefecto();
        arrayList();
        arrayListInt();
        dividePorCero(2,0);
    }

    public static void arrayUnidimensional() {

        String[] arrayUnidimensional = {"Paco", "Manuel", "Antonio"};

        for (String nombre : arrayUnidimensional) {
            System.out.println(nombre);
        }

    }

    public static void arrayBidimensional() {

        String[][] arrayBidimensional = {{"Paco", "Manuel", "Antonio"}, {"Laura", "Maria", "Patricia"}};

        for (int i = 0; i < arrayBidimensional.length; i++) {
            for (int j = 0; j < arrayBidimensional[i].length; j++) {
                System.out.println(i + "," + j);
                System.out.println(arrayBidimensional[i][j]);
            }
        }

    }

    public static void vector() {

        Vector<String> vector = new Vector<>();
        vector.add("Paco");
        vector.add("Manuel");
        vector.add("Antonio");
        vector.add("Laura");
        vector.add("Maria");
        vector.add("Patricia");

        System.out.println("Primer vector: " + vector);

        vector.remove(1);
        vector.remove(1);

        System.out.println("Segundo vector: " + vector);
    }

    public static void vectorPorDefecto() {

        System.out.println("Que al dejar la capacidad por " +
                "defecto crece de manera exponencial y malgastamos mucha memoria.");
    }

    public static void arrayList() {

        ArrayList<String> elementos = new ArrayList<>();
        LinkedList<String> listaElementos = new LinkedList<>();

        elementos.add("Fuego");
        elementos.add("Agua");
        elementos.add("Tierra");
        elementos.add("Viento");

        for (String nombre : elementos) {
            listaElementos.add(nombre);
            System.out.println(nombre);
        }

        for (String nombre : listaElementos) {
            System.out.println(nombre + ", ");
        }
    }

    public static void arrayListInt(){

        ArrayList<Integer> arrayInt = new ArrayList<>();
        for(int i = 0; i <10; i++){
            arrayInt.add(i);
        }

        for (int i=0;i<arrayInt.size();i++){
            if (arrayInt.get(i)%2==0){
                arrayInt.remove(i);
            }
        }
        System.out.println(arrayInt);
    }

    public static void dividePorCero(int num1, int num2) throws ArithmeticException{

        try {
            int resultado = num1 / num2;
            System.out.println(resultado);
        }catch (ArithmeticException e){
            System.out.println(e);
        }finally {
            System.out.println("Demo de codigo");
        }
    }
    private static void copiar(String fileIn, String fileOut) {
        try {
            InputStream in = new FileInputStream(fileIn);
            byte[] datos = in.readAllBytes();
            in.close();

            PrintStream out = new PrintStream(fileOut);
            out.write(datos);
            out.close();
        } catch (Exception e) {
            System.out.println("Excepcion: " + e.getMessage());
        }
    }

}

