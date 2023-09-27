import java.util.Scanner;

public class Contador {

    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);

        System.out.println("Digite o primeiro parâmetro");
        int numeroInicial = terminal.nextInt();

        System.out.println("Digite o segundo parâmetro");
        int numeroFinal = terminal.nextInt();

        try {
            contar(numeroInicial, numeroFinal);
            terminal.close();
        } catch (ParametrosInvalidosException e) {
            System.err.println("Erro: " + e.getMessage());
        }
    }

    public static void contar(int numeroInicial, int numeroFinal) throws ParametrosInvalidosException {
        if (numeroInicial >= numeroFinal) {
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
        }

        int contagem = numeroFinal - numeroInicial;
        for (int i = 1; i <= contagem; i++) {
            System.out.println("Imprimindo o número " + i);
        }
    }

}
