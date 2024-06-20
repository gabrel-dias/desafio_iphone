public class Celular {
    public static void main(String[] args) {
        //reprodutor
        Aplicativos reprodutor = new Aplicativos();
        reprodutor.play("Spit It Out");
        System.out.println(reprodutor.pause());

        //chamadas
        Aplicativos chamadas = new Aplicativos();
        chamadas.chamar("85738066");
        System.out.println("Recebendo ligação de " + chamadas.receberLigacao());
        System.out.println(chamadas.fazerLigacao("985738165"));
    }


}
