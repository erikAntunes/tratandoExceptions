public class main {

    public static void main(String[] args) {
        System.out.println("Programa Iniciado");

        try {
        int resultado = 10000 / 0;
            System.out.println(resultado);}
        catch (Exception exception){
        System.out.println("Operação Invalida");
        exception.printStackTrace();
    }


        System.out.println("Programa Finalizado");
    }
}
