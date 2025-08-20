public class codificaDesloca implements CodificaStrategy{

    public codificaDesloca(){}
    
    private String codifica(String str){
        char[] aux = str.toCharArray();
        char[] resp = new char[str.length()];
        for(int i=0;i<aux.length;i++){
            resp[i] = (char)(Character.valueOf(aux[i])+1);
        }
        return(new String(resp));
    }

    private String deCodificaDesloca(String str){
        char[] aux = str.toCharArray();
        char[] resp = new char[str.length()];
        for(int i=0;i<aux.length;i++){
            resp[i] = (char)(Character.valueOf(aux[i])-1);
        }
        return(new String(resp));
    }
}