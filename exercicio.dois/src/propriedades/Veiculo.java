package propriedades;

public class Veiculo {
    private String tipo = "";
    private String cor = "";
    private int rodas = 0;


    public Veiculo(){

    }

    public Veiculo(String tipo, String cor, int rodas) {
        this.tipo = tipo;
        this.cor = cor;
        this.rodas = rodas;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setRodas(int rodas) {
        this.rodas = rodas;
    }

    @Override
    public String toString(){
        return "Veículo: Tipo ["+ tipo + "] Cor [" + cor + "] Número de Rodas [" + rodas + "]";
    }
}
