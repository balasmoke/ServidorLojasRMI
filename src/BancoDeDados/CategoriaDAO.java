package BancoDeDados;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class CategoriaDAO {
    
    public int inserir_Categoria(Categoria a) {
        String query = "INSERT INTO Categoria (nomeCategoria) VALUES (?)";
        return MySql.executeQuery(query, a.getNomeCategoria());
    }

    public void atualizar_Categoria(Categoria a) {
        String query = "UPDATE Categoria SET nomeCategoria = ? WHERE idCategoria = ?";
        MySql.executeQuery(query, a.getNomeCategoria(), a.getIdCategoria());
    }
    
    public void excluir_Categoria(Categoria a) {
        String query = "DELETE FROM Categoria WHERE idCategoria = ?";
        MySql.executeQuery(query, a.getIdCategoria());
    }
    
    public Categoria busca_Categoria(String name){
        return (Categoria) buscador_Categoria("SELECT * FROM categoria WHERE nomeCategoria LIKE '%"+name+"%'" ).get(0);
    }
    
    
    public Categoria busca_Categoria(int id) {
        return (Categoria) buscador_Categoria("SELECT * FROM categoria WHERE idCategoria = "+id).get(0);
    }
      
    public ArrayList<Categoria> buscaAllPorNome_Categoria(String name){
        return buscador_Categoria("SELECT * FROM categoria WHERE nomeCategoria LIKE '%"+name+"%'" );
    }
    
    public ArrayList<Categoria> buscaAllPorId_Categoria(int id){
        return buscador_Categoria("SELECT * FROM categoria WHERE idCategoria = "+id);
    }
    
    private ArrayList buscador_Categoria(String query){
        ArrayList <Categoria> lista = new ArrayList<>();
        ResultSet rs = null;
        rs = MySql.getResultSet(query);
        try {
            while (rs.next()) {
                Categoria a = new Categoria (rs.getInt("idCategoria"),rs.getString("nomeCategoria"));           
                lista.add(a);
            }
            rs.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return lista;
    }
}