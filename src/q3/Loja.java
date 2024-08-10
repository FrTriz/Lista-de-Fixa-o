package q3;

public class Loja {
    private String nome;
    private String ramo;
    private int anoFundacao;
    private Vendedor vendedor;

    public Loja(String nome, String ramo, int anoFundacao){
        this.nome = nome;
        this.ramo = ramo;
        this.anoFundacao = anoFundacao;
    }
    public void admitirVendedor(Vendedor vendedor){
        this.vendedor = vendedor;
        System.out.println(vendedor.getNome() + ", foi admitido na loja " + this.nome + "!\n");
    }
    public void demitirVendedor(Vendedor vendedor){
        if(this.vendedor != null){
            System.out.println(this.vendedor.getNome() + ", foi demitido da loja " + this.nome + "!\n");
            this.vendedor = null;
        } else {
            System.out.println("Nenhum vendedor para ser demitido!");
        }

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRamo() {
        return ramo;
    }

    public void setRamo(String ramo) {
        this.ramo = ramo;
    }

    public int getAnoFundacao() {
        return anoFundacao;
    }

    public void setAnoFundacao(int anoFundacao) {
        this.anoFundacao = anoFundacao;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

}
