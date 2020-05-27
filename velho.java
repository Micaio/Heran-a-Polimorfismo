
package atividade;


public class velho extends imovel {
     private double desconto = 50000;
    velho(){
    }
     velho(String cidade,String  bairro, String rua,String numerodo){
       super(cidade,bairro,rua,numerodo);
       
    }
    public double desconto(){
        double x;
        x = super.getPreco();
        x -= desconto;
        return x;
    }
    
    
    public String toString(){
        String xxx;
        xxx = super.toString() ;
        xxx += "cade imovel nessta  cidade custa:"+super.getPreco() + " mas,como este  imovel é muito velho,\nele tem um desconto de:"+desconto; 
        xxx += " com  ovalor final de:"+ desconto();
        return xxx;
    }
}
