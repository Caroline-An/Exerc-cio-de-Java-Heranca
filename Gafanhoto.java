
public class Gafanhoto extends Pessoa{
    
    private String login;
    private int totAsistindo;
    
    public Gafanhoto(String nome, int idade, String sexo, String login){
        super(nome, idade, sexo);
        this.login = login;
        this.totAsistindo = 0;
    }
    
    @Override
    public String toString(){
        return "Gafanhoto{ "+ super.toString()+"\nlogin= "+login+", totAsistido="+totAsistindo+'}';
    }
    
    public void setLogin(String login){
        this.login = login;
    }
    public String getLogin(){
        return this.login;
    }
    public void setTotAssistindo(int totAsistindo){
        this.totAsistindo = totAsistindo;
    }
    public int getTotAssistindo(){
        return this.totAsistindo;
    }
}