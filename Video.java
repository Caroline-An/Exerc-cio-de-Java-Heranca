
public class Video implements AcoesVideo{
    
    private String titulo;
    private int avaliacao;
    private int views;
    private int curtidas;
    private Boolean reproduzindo;
    
    public Video(String titulo){
        this.titulo = titulo;
        this.avaliacao = 1;
        this.views = 0;
        this.curtidas = 0;
        this.reproduzindo = false;
    }
    
    @Override
    public void play(){
        this.reproduzindo = true;
    }
    
    @Override
    public void pause(){
        this.reproduzindo = false;
    }
    
    @Override
    public void like(){
        this.curtidas++;
    }
    
    @Override
    public String toString(){
        return "Víde{ "+"titulo= "+titulo+", avaliação= "+avaliacao+", views= "+views+", curtidas= "+curtidas+", reproduzindo= "+reproduzindo+'}';
    }
    
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    public String getTitulo(){
        return this.titulo;
    }
    public void setAvaliacao(int avaliacao){
        int nova;
        nova = ((this.avaliacao + avaliacao)/this.views);
        this.avaliacao = nova;
    }
    public int getAvaliacao(){
        return this.avaliacao;
    }
    public void setViews(int views){
        this.views = views;
    }
    public int getViews(){
        return this.views;
    }
    public void setCurtidas(int curtidas){
        this.curtidas = curtidas;
    }
    public int getCurtidas(){
        return this.curtidas;
    }
    public void setReproduzindo(Boolean reproduzindo){
        this.reproduzindo = reproduzindo;
    }
    public Boolean getReproduzindo(){
        return this.reproduzindo;
    }
    
}