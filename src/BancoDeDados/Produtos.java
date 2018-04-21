package BancoDeDados;


public class Produtos {
    
    private int idProdutos;
    private String nomeProdutos;
    private int qtdProdutos;
    private Double precoProdutos;
    private int idProdutos_Categoria;

    public Produtos(int idProdutos, String nomeProdutos, int qtdProdutos, Double precoProdutos, int idProdutos_Categoria) {
        this.idProdutos = idProdutos;
        this.nomeProdutos = nomeProdutos;
        this.qtdProdutos = qtdProdutos;
        this.precoProdutos = precoProdutos;
        this.idProdutos_Categoria = idProdutos_Categoria;
    }

    public Produtos(String nomeProdutos, int qtdProdutos, Double precoProdutos, int idProdutos_Categoria) {
        this.nomeProdutos = nomeProdutos;
        this.qtdProdutos = qtdProdutos;
        this.precoProdutos = precoProdutos;
        this.idProdutos_Categoria = idProdutos_Categoria;
    }

    public Produtos(int idProdutos) {
        this.idProdutos = idProdutos;
    }

    public int getIdProdutos() {
        return idProdutos;
    }

    public String getNomeProdutos() {
        return nomeProdutos;
    }

    public int getQtdProdutos() {
        return qtdProdutos;
    }

    public Double getPrecoProdutos() {
        return precoProdutos;
    }

    public int getIdProdutos_Categoria() {
        return idProdutos_Categoria;
    }

    public void setIdProdutos(int idProdutos) {
        this.idProdutos = idProdutos;
    }

    public void setNomeProdutos(String nomeProdutos) {
        this.nomeProdutos = nomeProdutos;
    }

    public void setQtdProdutos(int qtdProdutos) {
        this.qtdProdutos = qtdProdutos;
    }

    public void setPrecoProdutos(Double precoProdutos) {
        this.precoProdutos = precoProdutos;
    }

    public void setIdProdutos_Categoria(int idProdutos_Categoria) {
        this.idProdutos_Categoria = idProdutos_Categoria;
    }
    
    
    
    
}