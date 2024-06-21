package aplicativos;

import java.util.*;

public class Chamadas {
    // atributo das ligações
    private String numeroTelefone;

    // métodos das ligações
    public void chamar(String numeroTelefoneChamado) {
        System.out.println("Ligando para " + numeroTelefoneChamado);

    }

    public String receberLigacaoAleatoria() {
        Random telefoneAleatorio = new Random();
        String numeroAleatorio = "(85) 9 ";
        for (int i = 0; i < 10; i++) {
            int digitoAleatorio = telefoneAleatorio.nextInt(10);
            numeroAleatorio += digitoAleatorio;
        }
        return numeroAleatorio;
    }

    List<String> caixaPostal = new ArrayList<>();

    public void atenderRecusar() {
        Scanner simNao = new Scanner(System.in);
        System.out.println("Recebendo chamada de " + receberLigacaoAleatoria() + ", deseja atender? (S/N)");
        String escolha = simNao.nextLine().toLowerCase();
        if (escolha.equalsIgnoreCase("s")) {
            System.out.println("Chamada de " + receberLigacaoAleatoria() + " aceita!");
        } else {
            System.out.println("Chamada recusada e encaminhada para caixa postal!\n");
            caixaPostal.add(receberLigacaoAleatoria());
        }
    }

    public void caixaPostal() {
        if (!caixaPostal.isEmpty()) {
            System.out.println("Números que estão na caixa postal:\n" + caixaPostal);
        } else System.out.println("Caixa postal vazia!");
    }
}
