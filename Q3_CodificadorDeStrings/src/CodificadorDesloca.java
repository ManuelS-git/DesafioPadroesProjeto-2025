public class CodificadorDesloca implements Codificador {
    public CodificadorDesloca(){}
    @Override
    public String codifica(String texto) {
        char[] aux = texto.toCharArray();
        char[] resp = new char[texto.length()];
        for(int i=0;i<aux.length;i++){
            resp[i] = (char)(Character.valueOf(aux[i])+1);
        }
        return(new String(resp));
    }
    @Override
    public String deCodifica(String codigo) {
        char[] aux = codigo.toCharArray();
        char[] resp = new char[codigo.length()];
        for(int i=0;i<aux.length;i++){
            resp[i] = (char)(Character.valueOf(aux[i])-1);
        }
        return(new String(resp));
    }
}
