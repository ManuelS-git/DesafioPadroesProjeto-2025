import java.util.ArrayList;
import java.util.List;

/**
 * Decorator for dice that adds the ability to keep a history of all rolls.
 * If the last 5 rolls are all greater than 4, the next roll will be forced to a low value (1 or 2).
 */
public class DadoHistorico implements IDado {
    /** The decorated dice */
    private final IDado dado;
    /** List storing the history of all rolled values */
    private final List<Integer> historico = new ArrayList<>();

    /**
     * Constructs a historical dice
     * @param dado The dice to decorate
     */
    public DadoHistorico(IDado dado) {
        this.dado = dado;
    }

    /**
     * Rolls the dice. If the last 5 rolls were all high (greater than 4),
     * forces the next roll to be a low value (1 or 2).
     */
    @Override
    public void lançar() {
        if (ultimasCincoAltas()) {
            // Forces a low value (1 or 2)
            if (dado instanceof Dado) {
                int lados = ((Dado)dado).lados;
                int valorBaixo = 1 + (int)(Math.random() * Math.min(2, lados));
                ((Dado)dado).valorJogada = valorBaixo;
            } else {
                dado.lançar();
            }
        } else {
            dado.lançar();
        }
        historico.add(dado.getValor());
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
     * Returns the value obtained in the last roll.
     * @return Last rolled value
     */
    @Override
    public int getValor() {
        return dado.getValor();
    }

    /**
     * Returns the history of all rolled values.
     * @return List of all rolled values
     */
    public List<Integer> getHistorico() {
        return historico;
    }
}
