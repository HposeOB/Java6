public class Texto {

    public static void main(String[] args) {
        reverse("Hola Mundo");
    }
    public static String reverse(String texto){

        String nuevoTexto = "";

        for(int i =  texto.length();i > 0; i--){

            nuevoTexto += texto.charAt((i-1));

        }
        System.out.println(nuevoTexto);
        return nuevoTexto;
    }


}
