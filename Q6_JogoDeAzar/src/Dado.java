import java.util.Random;

/**
 * Represents a dice with a configurable number of sides.
 * Provides methods to roll the dice and retrieve the last rolled value.
 */
public class Dado implements IDado {/
    private int lados;
    int valorJogada;
    private final Random random;

    /**
     * Constructs a dice 
     * @param lados Number of sides
     */
    public Dado(int lados) {
        this.lados = lados;
        this.random = new Random();
    }

    /**
     * Rolls the dice
     */
    public void lançar() {
        valorJogada = random.nextInt(lados) + 1;
    }

    /**
     * @return Last rolled value
     */
    public int getValor() {
        return valorJogada;
    }
}