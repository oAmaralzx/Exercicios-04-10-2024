import builder.VeiculoBuilder;
import propriedades.Veiculo;

public class Main {
    public static void main(String[] args) {
        builder();
    }

    public static void builder(){
        Veiculo carro = new VeiculoBuilder()
                .setTipo("Astra")
                .setCor("Branco")
                .setRodas(4)
                .build();

        Veiculo moto = new VeiculoBuilder()
                .setTipo("CG 160 Titan")
                .setCor("Vermelha")
                .setRodas(2)
                .build();

        System.out.println(carro.toString());
        System.out.println(moto.toString());
    }
}