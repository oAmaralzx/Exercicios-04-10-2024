package propriedades;

import builder.PizzaBuilder;

public class Pizza {
    private String massa = "";
    private String tamanho = "";
    private String ingrediente = "";

    public Pizza() {
    }

    public Pizza(String massa, String tamanho, String ingrediente) {
        this.massa = massa;
        this.tamanho = tamanho;
        this.ingrediente = ingrediente;
    }

    public void setMassa(String massa) {
        this.massa = massa;
    }

    public void setIngrediente(String ingrediente) {
        this.ingrediente = ingrediente;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    @Override
    public String toString(){
        return "Pizza: Massa: [" + massa + "] Tamanho [" + tamanho + "] Ingredientes [" + ingrediente + "]";
    }
}