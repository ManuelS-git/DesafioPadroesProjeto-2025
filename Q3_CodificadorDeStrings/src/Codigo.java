public class Codigo {
    private Codificador route;
    public String codigo;
    public Codigo(String codigo, Codificador strategy){
        this.codigo = codigo;
        this.route = strategy;
    }
    public void setStrategy(Codificador strategy){
        this.route = strategy;
    }  
    public void doCodifica(){
        codigo = route.codifica(codigo);
    }
    public void doDeCodifica(){
        codigo = route.deCodifica(codigo);
    }
    public void printCodigo(){
        System.out.println(codigo);
    }
    public String getCodigo(){
        return codigo;
    }
}