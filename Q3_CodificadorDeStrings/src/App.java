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
        Context codificador = new Context(new CodificaSimples());
        System.out.println(aux);
        aux = codificador.doCodifica(aux);
        System.out.println(aux);
        aux = "Desafio Padrões de Projeto";
        codificador.setStrategy(new codificaDesloca());
        System.out.println(aux);
        aux = codificador.doCodifica(aux);
        System.out.println(aux);
        
    }
}
