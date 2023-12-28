import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class BingoDaVirada {

    public static void main(String[] args) {
        System.out.println("Bem-vindo ao Bingo!");
        List<Integer> numerosSorteados = new ArrayList<>();
        Random random = new Random();

        for (int i = 1; i <= 75; i++) {
            int numeroSorteado = sortearNumero(numerosSorteados, random);
            System.out.println("Número sorteado: " + numeroSorteado);
            numerosSorteados.add(numeroSorteado);

            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("O sorteio terminou.");
    }
    private static int sortearNumero(List<Integer> numerosSorteados, Random random) {
        int numeroSorteado;
        do {
            numeroSorteado = random.nextInt(75) + 1;
        } while (numerosSorteados.contains(numeroSorteado));
        return numeroSorteado;
    }
}
