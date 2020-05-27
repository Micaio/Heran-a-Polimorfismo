
package atividade;


public class novo extends imovel{
    private double adicao = 50000;
    novo(){
    }
    novo(String cidade,String  bairro, String rua,String numerodo){
       super(cidade,bairro,rua,numerodo);
       
    }
    public double adicional(){
        double x;
        x = super.getPreco();
        x += adicao;
        return x;
    }
    
    
    public String toString(){
        String xxx;
        xxx = super.toString() ;
        xxx += "cade imovel nessta  cidade custa:"+super.getPreco() + " mas,como este  imovel é muito novo,\nele tem um adicional de:"+adicao; 
        xxx += " com  ovalor final de:"+ adicional();
        return xxx;
    }
    
}
