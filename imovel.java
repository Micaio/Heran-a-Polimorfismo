
package atividade;

public class imovel {
    private String cidade;
    private String bairro;
    private String rua;
    private String numeroDaCasa;
    private double preco;
    
    
    imovel(){
    }
    imovel(String cidade,String bairro,String rua,String numeroDaCasa){
        this.bairro = bairro;
        this.cidade = cidade;
        this.numeroDaCasa = numeroDaCasa;
        this.rua = rua;
        preco = 150000.f;
    }
    public double getPreco(){
        return preco;
    }
    
    public String toString(){
        String xxx;
            xxx = "Endereço:\n" + "Cidade:" + cidade + "\t Bairro:" + bairro;
            xxx+= "\nRua:" + rua + "\tNumero do imovel:"+ numeroDaCasa +"\n";
        return xxx;
}
    
}
