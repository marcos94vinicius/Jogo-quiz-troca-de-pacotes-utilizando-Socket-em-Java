package servidor;

public class Perguntas {
    
    private String[] perguntas;
    private int[] respostas;
    
    public Perguntas(){
      
        this.perguntas = new String[10];
        this.respostas =  new int[10];
        
        perguntas[0] = "O símbolo das Olimpiadas é composto por quantos anéis entrelaçados?@"
                + "1 - 3 anéis@"
                + "2 - 5 anéis@"
                + "3 - 10 anéis@"
                + "4 - 6 anéis@"
                + "5 - 1 anel@";
        respostas[0] = 2;
      
        perguntas[1] = "Em que lugar os jogos olímpicos tiveram a origem?@" +
                "1 - Namíbia@" +
                "2 - Irlanda@" +
                "3 - Jordânia@" +
                "4 - Grécia Antiga@" +
                "5 - Suíça@";
        respostas[1] = 4;
        
        perguntas[2] = "A Tocha Olímpica apareceu pela primeira vez em:@" +
                "1 - Londres@" +
                "2 - Berlim@" +
                "3 - Madagascar@" +
                "4 - Tókio@" +
                "5 - São Paulo@" ;
        respostas[2] = 2;
        
        perguntas[3] = "A tocha olímpica percorrerá quantos estados do Brasil?@" +
                "1 - 9 Estados, mais o Distrito Federal@" +
                "2 - 14 Estados, mais o Distrito Federal@" +
                "3 - 19 Estados, mais o Distrito Federal@" +
                "4 - 22 Estados, mais o Distrito Federal@" +
                "5 - 26 Estados, mais o Distrito Federal@";
        respostas[3] = 5;
        
        perguntas[4] = "Qual destas cidade NÃO foi candidata para ser a cidade-sede dos Jogos Olímpicos e Paralímpicos de Verão de 2016?@" +
                "1 - Rio de Janeiro@" +
                "2 - Madri@" +
                "3 - Istambul@" +
                "4 - Tóquio@" +
                "5 - Chicago@";
        respostas[4] = 3;
        
        perguntas[5] = "Cerca de quantos países participarão dos Jogos Olímpicos de 2016?@" +
                "1 - 32 países@" +
                "2 - 68 países@" +
                "3 - 83 países@" +
                "4 - 165 países@" +
                "5 - 206 países@";
        respostas[5] = 5;
        
        perguntas[6] = "Quem inventou os Jogos Olímpicos da Era Moderna?@" +
                "1 - Pierre de Coubertin@" +
                "2 - Dimítrios Vikélas@" +
                "3 - Orvile Wright@" +
                "4 - Spiridon Louis@" +
                "5 - Jules Rimet@";
        respostas[6] = 1;
        
        perguntas[7] = "Em qual Olimpíada o Brasil conseguiu sua primeira medalha de ouro?@" +
                "1 - 1996,Atenas@" +
                "2 - 1920,Antuerpia@" +
                "3 - 1924,Londres@" +
                "4 - 1946,Londres@" +
                "5 - 2014,Brasil@";
        respostas[7] = 2;
        
        perguntas[8] = "Onde foram as Olimpíadas de 2004?@" +
                "1 - Sydney@" +
                "2 - Atlanta@" +
                "3 - Atenas@" +
                "4 - Pequim@" +
                "5 - Washington@";
        respostas[8] = 3;
        
        perguntas[9] = "Quantos esportes serão disputados nos Jogos Olímpicos de 2016?@" +
                "1 - 26 esportes@" +
                "2 - 28 esportes@" +
                "3 - 32 esportes@" +
                "4 - 36 esportes@" +
                "5 - 41 esportes@";
        respostas[9] = 2;
    }
    
    public String getPerguntas(int i){
        
        return (this.perguntas[i]);
    }
    
    public int getRespostas(int i){
        
        return (this.respostas[i]);
    }
}
