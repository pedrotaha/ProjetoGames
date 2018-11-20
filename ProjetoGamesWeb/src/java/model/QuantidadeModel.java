package model;

public class QuantidadeModel {
    private int quantidadeAlugar;
    private int quantidadeVender;
    private float valorAlugar;
    private float valorVender;

    public QuantidadeModel() {
        quantidadeAlugar = 0;
        quantidadeVender = 0;
        valorAlugar = 0;
        valorVender = 0;
    }

    public QuantidadeModel(int quantidadeAlugar, int quantidadeVender, float valorAlugar, float valorVender) {
        this.quantidadeAlugar = quantidadeAlugar;
        this.quantidadeVender = quantidadeVender;
        this.valorAlugar = valorAlugar;
        this.valorVender = valorVender;
    }

    public int getQuantidadeAlugar() {
        return quantidadeAlugar;
    }

    public void setQuantidadeAlugar(int quantidadeAlugar) {
        this.quantidadeAlugar = quantidadeAlugar;
    }

    public int getQuantidadeVender() {
        return quantidadeVender;
    }

    public void setQuantidadeVender(int quantidadeVender) {
        this.quantidadeVender = quantidadeVender;
    }

    public float getValorAlugar() {
        return valorAlugar;
    }

    public void setValorAlugar(float valorAlugar) {
        this.valorAlugar = valorAlugar;
    }

    public float getValorVender() {
        return valorVender;
    }

    public void setValorVender(float valorVender) {
        this.valorVender = valorVender;
    }
    
}
