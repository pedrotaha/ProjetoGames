package br.com.ProjetoGames.model;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class UsuarioModel {
    private int id;
    private String nome;
    private String cpf;
    private String telefone;
    private String email;
    private String sexo;
    private EnderecoModel enderecoModel;
    private Calendar dataNasc;
    private String login;
    private String senha;
    private Calendar dataCadastro;
    private TipoUsuarioModel tipoUsuarioModel;

    public UsuarioModel() {
        id = 0;
        nome = new String();
        cpf = new String();
        telefone = new String();
        email = new String();
        sexo = new String();
        enderecoModel = new EnderecoModel();
        dataNasc = new GregorianCalendar();
        login = new String();
        senha = new String();
        dataCadastro = new GregorianCalendar();
        tipoUsuarioModel = new TipoUsuarioModel();
    }

    public UsuarioModel(int id, String nome, String cpf, String telefone, String email, String sexo, EnderecoModel enderecoModel, Calendar dataNasc, String login, String senha, Calendar dataCadastro, TipoUsuarioModel tipoUsuarioModel) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.email = email;
        this.sexo = sexo;
        this.enderecoModel = enderecoModel;
        this.dataNasc = dataNasc;
        this.login = login;
        this.senha = senha;
        this.dataCadastro = dataCadastro;
        this.tipoUsuarioModel = tipoUsuarioModel;
    }
    public UsuarioModel(FuncionarioModel objFunc){
        this.id = objFunc.getId();
        this.nome = objFunc.getNome();
        this.cpf = objFunc.getCpf();
        this.telefone = objFunc.getTelefone();
        this.email = objFunc.getEmail();
        this.sexo = objFunc.getSexo();
        this.enderecoModel = objFunc.getEnderecoModel();
        this.dataNasc = objFunc.getDataNasc();
        this.login = objFunc.getLogin();
        this.senha = objFunc.getSenha();
        this.dataCadastro = objFunc.getDataCadastro();
        this.tipoUsuarioModel = objFunc.getTipoUsuarioModel();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public EnderecoModel getEnderecoModel() {
        return enderecoModel;
    }

    public void setEnderecoModel(EnderecoModel enderecoModel) {
        this.enderecoModel = enderecoModel;
    }

    public Calendar getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(Calendar dataNasc) {
        this.dataNasc = dataNasc;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Calendar getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(Calendar dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public TipoUsuarioModel getTipoUsuarioModel() {
        return tipoUsuarioModel;
    }

    public void setTipoUsuarioModel(TipoUsuarioModel tipoUsuarioModel) {
        this.tipoUsuarioModel = tipoUsuarioModel;
    }
    
}
