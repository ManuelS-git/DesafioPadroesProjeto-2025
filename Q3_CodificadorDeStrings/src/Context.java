public class Context {
    private CodificadorStrategy codigo;
    public Context(CodificadorStrategy codigo){
        this.codigo = codigo;
    }
    public setStrategy(CodificadorStrategy codigo){
        this.codigo = codigo;
    }
    public String doCodifica(String codigo){
        return codigo.codifica(codigo);
    }
    public String doDecodifica(String codigo){
        return codigo.decodifica(codigo);
    }
}