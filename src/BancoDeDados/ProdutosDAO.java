package BancoDeDados;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;



public class ProdutosDAO {
    public int inserir_Produtos(Produtos a) {
        String query = "INSERT INTO produtos (nomeProdutos,qtdProdutos,precoProdutos,idProdutos_Categoria)"
                + " VALUES (?,?,?,?)";
        return MySql.executeQuery(query, a.getNomeProdutos()
                ,a.getQtdProdutos()
                ,a.getPrecoProdutos()
                ,a.getIdProdutos_Categoria());
    }

    public void atualizar_Produtos(Produtos a) {
        String query = "UPDATE produtos SET nomeProdutos = ?, qtdProdutos = ?,"
                + "precoProdutos = ?, idProdutos_Categoria = ?"
                + " WHERE idProdutos = ?";
        MySql.executeQuery(query, a.getNomeProdutos(), a.getQtdProdutos()
                ,a.getPrecoProdutos(), a.getIdProdutos_Categoria());
    }
    
    public void excluir_Produtos(Produtos a) {
        String query = "DELETE FROM produtos WHERE idProdutos = ?";
        MySql.executeQuery(query, a.getIdProdutos());
    }
    
    public Produtos busca_Produtos(String name){
        return (Produtos) buscador_Produtos("SELECT * FROM produtos WHERE nomeProdutos LIKE '%"+name+"%'" ).get(0);
    }
    
    
    public Produtos busca_Produtos(int id) {
        return (Produtos) buscador_Produtos("SELECT * FROM produtos WHERE idProdutos = "+id).get(0);
    }
    
    public ArrayList<Produtos> buscaAllPorNome_Produtos(String name){
        return buscador_Produtos("SELECT * FROM produtos WHERE nomeProdutos LIKE '%"+name+"%'" );
    }
    
    public ArrayList<Produtos> buscaAllPorId_Produtos(int id){
        return buscador_Produtos("SELECT * FROM produtos WHERE idProdutos = "+id);
    }
    
    private ArrayList buscador_Produtos(String query){
        ArrayList <Produtos> lista = new ArrayList<>();
        ResultSet rs = null;
        rs = MySql.getResultSet(query);
        try {
            while (rs.next()) {
                Produtos a = new Produtos (rs.getInt("idProdutos")
                        ,rs.getString("nomeProdutos")
                        ,rs.getInt("qtdProdutos")
                        ,rs.getDouble("precoProdutos")
                        ,rs.getInt("idProdutos_Categoria"));           
                lista.add(a);
            }
            rs.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return lista;
    }
}