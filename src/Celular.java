import aplicativos.*;


public class Celular {
    public static void main(String[] args) {
        Reprodutor reprodutor = new Reprodutor();
        //reprodutor
        System.out.println("--Métodos do reprodutor de músicas--");
        reprodutor.play("Spit It Out");
        System.out.println(reprodutor.pause());

        //chamadas
        System.out.println("--Métodos das chamadas--");
        Chamadas chamadas = new Chamadas();
        chamadas.chamar("85738066");
        chamadas.atenderRecusar();

    }


}
