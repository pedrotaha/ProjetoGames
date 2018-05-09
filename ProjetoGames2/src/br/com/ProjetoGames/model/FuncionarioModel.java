package br.com.ProjetoGames.model;

import java.util.Calendar;

public class FuncionarioModel extends UsuarioModel {
    private float salario;
    private String cargo;
    private String cargaHoraria;
    private String estadoCivil;

    public FuncionarioModel() {
        super();
        salario = 0;
        cargo = new String();
        cargaHoraria = new String();
        estadoCivil = new String();
    }

    public FuncionarioModel(int id, String nome, String cpf, String telefone, String email, String sexo, EnderecoModel enderecoModel, Calendar dataNasc, String login, String senha, Calendar dataCadastro, TipoUsuarioModel tipoUsuarioModel, float salario, String cargo, String cargaHoraria, String estadoCivil) {
        super(id, nome, cpf, telefone, email, sexo, enderecoModel, dataNasc, login, senha, dataCadastro, tipoUsuarioModel);
        this.salario = salario;
        this.cargo = cargo;
        this.cargaHoraria = cargaHoraria;
        this.estadoCivil = estadoCivil;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(String cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

}
