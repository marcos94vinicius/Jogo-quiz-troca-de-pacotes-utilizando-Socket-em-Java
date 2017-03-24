package servidor;
  
public class DadosJogador {
    
    private String nome;
    private int pontuacao;
    
    public DadosJogador(String nome){
        
        this.nome = nome;
        this.pontuacao = 0;
    }
    
    public void setPontuacao(){
        
        this.pontuacao += 1;
    }
    
    public String getNome(){
        
        return(this.nome);
    }
    
    public int getPontuacao(){
        
        return(this.pontuacao);
    }
}
