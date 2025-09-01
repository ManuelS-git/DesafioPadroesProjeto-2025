public class App {
    public static void main(String[] args) throws Exception {
        //Codificador cod = new Codificador();

        String aux = "Desafio Padrões de Projeto";

        // System.out.println(aux);
        // aux = cod.codifica(Codificador.Tipo.SIMPLES, aux);
        // System.out.println(aux);
        // aux = cod.deCodifica(Codificador.Tipo.SIMPLES, aux);
        // System.out.println(aux);
        // aux = cod.codifica(Codificador.Tipo.DESLOCA, aux);
        // System.out.println(aux);
        // aux = cod.deCodifica(Codificador.Tipo.DESLOCA, aux);
        // System.out.println(aux);
        Codificador estrategia1 = new CodificadorDesloca();
        Codificador estrategia2 = new CodificadorSimples();
        Codigo teste = new Codigo("Hello World!", estrategia1);
        teste.printCodigo();
        teste.doCodifica();
        teste.printCodigo();
        teste.setStrategy(estrategia2);
        teste.doCodifica();
        teste.printCodigo();
        teste.doDeCodifica();
        teste.setStrategy(estrategia1);
        teste.doDeCodifica();
        teste.printCodigo();
    }
}
