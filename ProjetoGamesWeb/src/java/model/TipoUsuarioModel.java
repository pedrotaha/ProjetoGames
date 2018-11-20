package model;

public class TipoUsuarioModel {
    private int id;
    private String descricao;
    private int nivel;

    public TipoUsuarioModel() {
        id = 0;
        descricao = new String();
        nivel = 0;
    }

    public TipoUsuarioModel(int id, String descricao, int nivel) {
        this.id = id;
        this.descricao = descricao;
        this.nivel = nivel;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }
}
