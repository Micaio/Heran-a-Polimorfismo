
package atividade;

import java.util.Scanner;


public class teste {
    public static void main(String[] args){
         byte x;
        novo nv =new novo("Horizonte","Pica-Pau","Castelo Branco","Nº 102");
        velho vl =new velho("Horizonte","Pica-Pau","Luziana Montes","Nº 388");
         Scanner input = new Scanner(System.in);
         System.out.println("Voce está  procurando um  imovel velho ou  novo?(novo digite=1) ou (velho digite=2).");
         x =input.nextByte();
         switch(x){
             case 1: calcularImovel(nv);break;
             case 2: calcularImovel(vl);break;
             default:System.out.println("Você digitou uma opção invalida!"); ;break;
         }
    }
    
    public static void calcularImovel(imovel p){
     
        if(p instanceof novo){
            novo nvv = (novo)p;
            System.out.println(nvv.toString());
        }
        else if(p instanceof velho){
        velho vv = (velho)p;
            System.out.println(vv.toString());
    }
    }
    
    
}
