public class App {
    public static void main(String[] args) {
        InterfaceDado d6 = new DadoHistorico(new Dado(6));
        InterfaceDado d20 = new DadoHistorico(new Dado(20));

        for (int i = 0; i < 10; i++) {
            d6.rolar();
            d20.rolar();
        }

        System.out.println("D6 último valor: " + d6.getValor());
        System.out.println("D20 último valor: " + d20.getValor());

        System.out.println("Histórico D6: " + ((DadoHistorico)d6).getHistorico());
        System.out.println("Histórico D20: " + ((DadoHistorico)d20).getHistorico());
    }
}