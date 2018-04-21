package BancoDeDados;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class FuncionariosDAO {
    public int inserir_Funcionarios(Funcionarios a) {
        String query = "INSERT INTO funcionarios (nomeFuncionarios, usuarioFuncionarios"
                + ",senhaFuncionarios, emailFuncionarios, statusFuncionarios) VALUES (?,?,?,?,?)";
        return MySql.executeQuery(query, a.getNomeFuncionarios()
                ,a.getUsuarioFuncionarios()
                ,a.getSenhaFuncionarios()
                ,a.getEmailFuncionarios()
                ,a.getStatusFuncionarios());
    }

    public void atualizar_Funcionarios(Funcionarios a) {
        String query = "UPDATE funcionarios SET nomeFuncionarios = ?, usuarioFuncionarios = ?,"
                + "senhaFuncionarios = ?, emailFuncionarios = ?,statusFuncionarios = ?"
                + " WHERE idFuncionarios = ?";
        MySql.executeQuery(query, a.getNomeFuncionarios(),a.getUsuarioFuncionarios()
                , a.getSenhaFuncionarios(), a.getEmailFuncionarios(),a.getStatusFuncionarios()
                , a.getIdFuncionarios());
    }
    
    public void excluir_Funcionarios(Funcionarios a) {
        String query = "DELETE FROM funcionarios WHERE idFuncionarios = ?";
        MySql.executeQuery(query, a.getIdFuncionarios());
    }
    
    public Funcionarios busca_Funcionarios(String name){
        return (Funcionarios) buscador_Funcionarios("SELECT * FROM funcionarios WHERE nomeFuncionarios LIKE '%"+name+"%'" ).get(0);
    }
    
    
    public Funcionarios busca_Funcionarios(int id) {
        return (Funcionarios) buscador_Funcionarios("SELECT * FROM funcionarios WHERE idFuncionarios = "+id).get(0);
    }
      
    public ArrayList<Funcionarios> buscaAllPorNome_Funcionarios(String name){
        return buscador_Funcionarios("SELECT * FROM funcionarios WHERE nomeFuncionarios LIKE '%"+name+"%'" );
    }
    
    public ArrayList<Funcionarios> buscaAllPorId_Funcionarios(int id){
        return buscador_Funcionarios("SELECT * FROM funcionarios WHERE idFuncionarios = "+id);
    }
    
    
    private ArrayList buscador_Funcionarios(String query){
        ArrayList <Funcionarios> lista = new ArrayList<>();
        ResultSet rs = null;
        rs = MySql.getResultSet(query);
        try {
            while (rs.next()) {
                Funcionarios a = new Funcionarios (rs.getInt("idFuncionarios")
                        ,rs.getString("nomeFuncionarios")
                        ,rs.getString("usuarioFuncionarios")
                        ,rs.getString("senhaFuncionarios")
                        ,rs.getString("emailFuncionarios")
                        ,rs.getInt("statusFuncionarios"));           
                lista.add(a);
            }
            rs.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return lista;
    }
}