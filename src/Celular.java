public class Celular {
    public static void main(String[] args) {
        Aplicativos reprodutor = new Aplicativos();
        //reprodutor
        System.out.println("--Métodos do reprodutor de músicas--");
        reprodutor.play("Spit It Out");
        System.out.println(reprodutor.pause());

        //chamadas
        System.out.println("--Métodos das chamadas--");
        Aplicativos chamadas = new Aplicativos();
        chamadas.chamar("85738066");
        chamadas.atenderRecusar();

    }


}
