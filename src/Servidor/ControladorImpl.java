package Servidor;

import BancoDeDados.Categoria;
import BancoDeDados.CategoriaDAO;
import BancoDeDados.Funcionarios;
import BancoDeDados.FuncionariosDAO;
import BancoDeDados.Produtos;
import BancoDeDados.ProdutosDAO;
import java.util.ArrayList;



public class ControladorImpl {
    private final CategoriaDAO CategoriaDAO = new CategoriaDAO();
    private final FuncionariosDAO FuncionariosDAO = new FuncionariosDAO();
    private final ProdutosDAO ProdutosDAO = new ProdutosDAO();
    
    
    public void inserir_Categoria(String name) {
        Categoria categoria = new Categoria(name);
        CategoriaDAO.inserir_Categoria(categoria);
    }

    public void atualizar_Categoria(String name,int id) {
        Categoria categoria = new Categoria(id,name);
        CategoriaDAO.atualizar_Categoria(categoria);
    }
    
    public void excluir_Categoria(int id) {
        Categoria categoria = new Categoria(id);
        CategoriaDAO.excluir_Categoria(categoria);
    }
    
    public Categoria busca_Categoria(String name){
        return CategoriaDAO.busca_Categoria(name);
    }
    
    public Categoria busca_Categoria(int id) {
        return CategoriaDAO.busca_Categoria(id);
    }
    
    public ArrayList<Categoria> buscaAllPorNome_Categoria(String name){
        return CategoriaDAO.buscaAllPorNome_Categoria(name);
    }
    
    public ArrayList<Categoria> buscaAllPorId_Categoria(int id){
        return CategoriaDAO.buscaAllPorId_Categoria(id);
    }
    
    ////////////////////////////////////////////////////////////////////////////
    
    public void inserir_Funcionarios(String name, String user, String senha, String email, int status) {
        Funcionarios funcionario = new Funcionarios(name,user, senha, email, status);
        FuncionariosDAO.inserir_Funcionarios(funcionario);
    }

    public void atualizar_Funcionarios(String name, String user, String senha, String email, int status,int id) {
        Funcionarios funcionario = new Funcionarios(id,name,user, senha, email, status);
        FuncionariosDAO.atualizar_Funcionarios(funcionario);
    }
    
    public void excluir_Funcionarios(int id) {
        Funcionarios funcionario = new Funcionarios(id);
        FuncionariosDAO.excluir_Funcionarios(funcionario);
    }
    
    public Funcionarios busca_Funcionarios(String name){
        return FuncionariosDAO.busca_Funcionarios(name);
    }
    
    public Funcionarios busca_Funcionarios(int id) {
        return FuncionariosDAO.busca_Funcionarios(id);
    }
    
    public ArrayList<Funcionarios> buscaAllPorNome_Funcionarios(String name){
        return FuncionariosDAO.buscaAllPorNome_Funcionarios(name);
    }
    
    public ArrayList<Funcionarios> buscaAllPorId_Funcionarios(int id){
        return FuncionariosDAO.buscaAllPorId_Funcionarios(id);
    }
    
    ////////////////////////////////////////////////////////////////////////////
    
    public void inserir_Produtos(String name, int qtd, Double preco, int idCatego) {
        Produtos produto = new Produtos(name, qtd, preco, idCatego);
        ProdutosDAO.inserir_Produtos(produto);
    }

    public void atualizar_Produtos(String name, int qtd, Double preco, int idCatego,int id) {
        Produtos produto = new Produtos(id,name,qtd, preco, idCatego);
        ProdutosDAO.atualizar_Produtos(produto);
    }
    
    public void excluir_Produtos(int id) {
        Produtos produto = new Produtos(id);
        ProdutosDAO.excluir_Produtos(produto);
    }
    
    public Produtos busca_Produtos(String name){
        return ProdutosDAO.busca_Produtos(name);
    }
    
    public Produtos busca_Produtos(int id) {
        return ProdutosDAO.busca_Produtos(id);
    }
    
    public ArrayList<Produtos> buscaAllPorNome_Produtos(String name){
        return ProdutosDAO.buscaAllPorNome_Produtos(name);
    }
    
    public ArrayList<Produtos> buscaAllPorId_Produtos(int id){
        return ProdutosDAO.buscaAllPorId_Produtos(id);
    }
    
    ////////////////////////////////////////////////////////////////////////////
}