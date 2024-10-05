import builder.PizzaBuilder;
import propriedades.Pizza;

public class Main{
        public static void main(String[] args) {
            comBuilder();
        }
        public static void comBuilder(){
            Pizza peperoni = new PizzaBuilder()
                    .setMassa("Napolitana")
                    .setTamanho("Grande")
                    .setIngrediente("Peperoni")
                    .build();

            Pizza calabresa = new PizzaBuilder()
                    .setMassa("Estilo Siciliano")
                    .setTamanho("Família")
                    .setIngrediente("Calabresa")
                    .build();
            System.out.println(peperoni.toString());
            System.out.println(calabresa.toString());
        }

        public static void semBuilder(){
            Pizza peperoni = new Pizza("Napolitana", "Grande","Peperoni");
            Pizza calabresa = new Pizza("Estilo Siciliano", "Famíilia", "Calabresa");

            System.out.println(peperoni.toString());
            System.out.println(calabresa.toString());
        }

    }