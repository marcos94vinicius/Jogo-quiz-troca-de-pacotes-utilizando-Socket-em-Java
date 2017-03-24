package servidor;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.*;
import java.util.Scanner;

public class Servidor{
    
    public static void main(String[] args) throws IOException{
        
        ServerSocket servidor = new ServerSocket(12345);
        System.out.println("Porta 12345 aberta!");
        
        //aceita a conexão com o jogador 1
        Socket jogador = servidor.accept();
        System.out.println("Nova conexão com o jogador: " + jogador.getInetAddress().getHostAddress());
        //aceita a conexão com o jogador 2
        Socket jogador2 = servidor.accept();
        System.out.println("Nova conexão com o jogador2: " + jogador2.getInetAddress().getHostAddress());
        
        Scanner s = new Scanner(jogador.getInputStream());//lê a entrada do jogador 1
        Scanner s2 = new Scanner(jogador2.getInputStream());//lê a entrada do jogador 2
        
        int n, i;
        
        //pega as perguntas e respostas certas das perguntas 
        Perguntas perguntas = new Perguntas();
        Perguntas respostas = new Perguntas();
        
        //endereço do jogador 1
        OutputStream envia_mensagem = jogador.getOutputStream();
        //endereço do jogador 2
        OutputStream envia_mensagem2 = jogador2.getOutputStream();
        
        //conexão com o jogador 1
        PrintStream saida = new PrintStream(envia_mensagem);
        //conexão com o jogador 2
        PrintStream saida2 = new PrintStream(envia_mensagem2);
        
        //recebe o nome do jogador 1
        saida.println("Digite seu nome: ");
        DadosJogador player1 = new DadosJogador(s.next());
        
        //recebe o nome do jogador 2
        saida2.println("Digite seu nome: ");
        DadosJogador player2 = new DadosJogador(s2.next());
        
        //envia e recebe mensagens para/do jogador 1
        for(i = 0; i < 10; i++){
            
            saida.println(perguntas.getPerguntas(i));
            n = s.nextInt();
            if (n == respostas.getRespostas(i))
                player1.setPontuacao();
        }
        
        //envia e recebe mensagens para/do jogador 2
        for(i = 0; i < 10; i++){
            
            saida2.println(perguntas.getPerguntas(i));
            n = s2.nextInt();
            if (n == respostas.getRespostas(i))
                player2.setPontuacao();
        }
        
        //verificando quem ganhou e quem perdeu
        //se o jogador 1 ganhou
        if(player1.getPontuacao() > player2.getPontuacao()){
            
            saida.println("Jogador: "+ player1.getNome() +" acertou: "+player1.getPontuacao()+" questões e ganhou!!");
            saida2.println("Jogador: "+ player1.getNome() +" acertou: "+player1.getPontuacao()+" questões e ganhou!!");
        }
        else if(player1.getPontuacao() == player2.getPontuacao()){
            
            saida.println("O jogo empatou com "+player1.getPontuacao()+" questões certas para cada");
            saida2.println("O jogo empatou com "+player2.getPontuacao()+" questões certas para cada");
        }
        else{
            
            saida.println("Jogador: "+ player2.getNome() +" acertou: "+player2.getPontuacao()+" questões e ganhou!!");
            saida2.println("Jogador: "+ player2.getNome() +" acertou: "+player2.getPontuacao()+" questões e ganhou!!");
        }
        
        servidor.close();
        jogador.close();
    }
}