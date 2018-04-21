package BancoDeDados;


public class Funcionarios {
    
    private int idFuncionarios;
    private String nomeFuncionarios;
    private String usuarioFuncionarios;
    private String senhaFuncionarios;
    private String emailFuncionarios;
    private int statusFuncionarios;

    public Funcionarios(int idFuncionarios, String nomeFuncionarios, String usuarioFuncionarios, String senhaFuncionarios, String emailFuncionarios, int statusFuncionarios) {
        this.idFuncionarios = idFuncionarios;
        this.nomeFuncionarios = nomeFuncionarios;
        this.usuarioFuncionarios = usuarioFuncionarios;
        this.senhaFuncionarios = senhaFuncionarios;
        this.emailFuncionarios = emailFuncionarios;
        this.statusFuncionarios = statusFuncionarios;
    }

    public Funcionarios(String nomeFuncionarios, String usuarioFuncionarios, String senhaFuncionarios, String emailFuncionarios, int statusFuncionarios) {
        this.nomeFuncionarios = nomeFuncionarios;
        this.usuarioFuncionarios = usuarioFuncionarios;
        this.senhaFuncionarios = senhaFuncionarios;
        this.emailFuncionarios = emailFuncionarios;
        this.statusFuncionarios = statusFuncionarios;
    }

    public Funcionarios(int idFuncionarios) {
        this.idFuncionarios = idFuncionarios;
    }

    public int getIdFuncionarios() {
        return idFuncionarios;
    }

    public String getNomeFuncionarios() {
        return nomeFuncionarios;
    }

    public String getUsuarioFuncionarios() {
        return usuarioFuncionarios;
    }

    public String getSenhaFuncionarios() {
        return senhaFuncionarios;
    }

    public String getEmailFuncionarios() {
        return emailFuncionarios;
    }

    public int getStatusFuncionarios() {
        return statusFuncionarios;
    }

    public void setIdFuncionarios(int idFuncionarios) {
        this.idFuncionarios = idFuncionarios;
    }

    public void setNomeFuncionarios(String nomeFuncionarios) {
        this.nomeFuncionarios = nomeFuncionarios;
    }

    public void setUsuarioFuncionarios(String usuarioFuncionarios) {
        this.usuarioFuncionarios = usuarioFuncionarios;
    }

    public void setSenhaFuncionarios(String senhaFuncionarios) {
        this.senhaFuncionarios = senhaFuncionarios;
    }

    public void setEmailFuncionarios(String emailFuncionarios) {
        this.emailFuncionarios = emailFuncionarios;
    }

    public void setStatusFuncionarios(int statusFuncionarios) {
        this.statusFuncionarios = statusFuncionarios;
    }
    
    
    
}