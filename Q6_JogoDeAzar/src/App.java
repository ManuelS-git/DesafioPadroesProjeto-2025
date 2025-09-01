/**
 * Main application class for the dice game.
 * Demonstrates the use of dice with history and forced low values after a lucky streak.
 */
public class App {
    /**
     * Main method to run the dice game example.
     * @param args Command line arguments
     */
    public static void main(String[] args) {
        IDado d6 = new DadoHistorico(new Dado(6));
        IDado d20 = new DadoHistorico(new Dado(20));

        for (int i = 0; i < 5; i++) {
            d6.lançar();
            d20.lançar();
        }

        System.out.println("D6 último valor: " + d6.getValor());
        System.out.println("D20 último valor: " + d20.getValor());

        System.out.println("Histórico D6: " + ((DadoHistorico)d6).getHistorico());
        System.out.println("Histórico D20: " + ((DadoHistorico)d20).getHistorico());
    }
}
