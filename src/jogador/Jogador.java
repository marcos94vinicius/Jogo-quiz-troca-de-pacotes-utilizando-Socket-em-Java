package jogador;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Arrays;
import java.util.Scanner;

public class Jogador{
    
    public static void main(String[] args) throws IOException{
        
        //jogador se conecta ao servidor
        Socket jogador = new Socket("191.52.64.132", 12345);
        System.out.println("O jogador se conectou ao servidor!");
        
        //input para receber a mensagem do servidor
        InputStream recebe_mensagem = jogador.getInputStream();
        
        Scanner teclado = new Scanner(System.in);
        //output para enviar mensagem ao servidor
        PrintStream saida = new PrintStream(jogador.getOutputStream());
        Scanner s = new Scanner(recebe_mensagem);
        
        //variáveis úteis
        int n;
        String nome;
        
        //envia o nome para o servidor;
        s.hasNextLine();
        System.out.println(s.nextLine());
        nome = teclado.next();
        saida.println(nome);
        int i = 0;
        int w = 0;
        char[] ch;
        String perg;
        //recebe as perguntas e envia repostas do/para servidor
        while (w<10) {
            ch = s.nextLine().toCharArray();
            i=0;
            while(i < ch.length){
                if(ch[i] == '@'){
                    System.out.print("\n");
                }else{
                    System.out.print(ch[i]);
                }
                i++;
            }
            System.out.print("Resposta : ");
            n = teclado.nextInt();
            saida.println(n);
            w++;
        }        

       
        //recebe uma notificação de quem ganhou o jogo
        s.hasNextLine();
        System.out.println(s.nextLine());
        
        /*Scanner teclado = new Scanner(System.in);
        int n;
        PrintStream saida = new PrintStream(jogador.getOutputStream());
        while(true){
            
            n = teclado.nextInt();
            if(n == 0)
                break;
            saida.println(n);
        }
        saida.close();
        teclado.close();*/
        jogador.close();
    }
}