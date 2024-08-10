package q3;

public class Vendedor {
    private int idade;
    private String nome;

    public Vendedor(int idade, String nome){
        this.idade = idade;
        this.nome = nome;

    }
    public void vender(){
        System.out.println(this.nome + ", fez uma venda!\n");
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
