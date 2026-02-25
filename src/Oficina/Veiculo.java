package Oficina;

public class Veiculo {
    private String marca;
    private String modelo;
    private String cor;
    private String id;
    private String tipo;
    private String placa;
    private String ano;

    public Veiculo(String marca, String modelo, String cor, String id, String tipo, String placa, String ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.id = id;
        this.tipo = tipo;
        this.placa = placa;
        this.ano = ano;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }
}
