import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * If the last 5 rolls are all greater than 4, the next roll will be forced to a low value (1 or 2).
 */
public class DadoHistorico implements InterfaceDado {
    private final InterfaceDado dado;
    private final List<Integer> historico = new ArrayList<>();
    private int valorAtual;

    /**
     * Constructor
     * @param dado The dice to decorate
     */
    public DadoHistorico(InterfaceDado dado) {
        this.dado = dado;
    }

    /**
     * Rolls the dice. If the last 5 rolls were all high (greater than 4),
     * Then the next roll will be a low value (1 or 2).
     */
    @Override
    public void rolar() {
        if (ultimasCincoAltas()) {
            // Forces a low value (1 or 2). O próprio decorador gera e armazena este valor.
            this.valorAtual = new Random().nextInt(2) + 1;
        } else {
            dado.rolar();
            this.valorAtual = dado.getValor();
        }
        historico.add(this.valorAtual);
    }

    /**
     * Checks if the last 5 rolls were all high (greater than 4).
     * @return true if the last 5 rolls were all high, false otherwise
     */
    private boolean ultimasCincoAltas() {
        if (historico.size() < 5) return false;
        for (int i = historico.size() - 5; i < historico.size(); i++) {
            if (historico.get(i) <= 4) return false;
        }
        return true;
    }

    /**
     * Returns the value in the last roll.
     * @return Last rolled
     */
    @Override
    public int getValor() {
        return this.valorAtual;
    }

    /**
     * Returns  all rolled.
     * @return List of all rolled values
     */
    public List<Integer> getHistorico() {
        return historico;
    }
}