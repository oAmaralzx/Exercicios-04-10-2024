import builder.RelatorioBuilder;
import propriedades.Relatorio;

public class Main {
    public static void main(String[] args) {
        builder();
    }

    public static void builder(){
        Relatorio relatorio1 = new RelatorioBuilder()
                .setTitulo("Vendas Diárias")
                .setCorpo("O lucro do dia foi de R$350,90")
                .build();

        Relatorio relatorio2 = new RelatorioBuilder()
                .setTitulo("Vendas Semanal")
                .setCorpo("O lucro da semana foi de R$3580,50")
                .setRodape("A meta foi batida com sucesso!")
                .build();

        System.out.println(relatorio1.toString());
        System.out.println(relatorio2.toString());
    }
}