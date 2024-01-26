import CarroRobo.AutoRobo;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        AutoRobo robo = new AutoRobo("seguir", "esquerda","12", "23",
                "sim", "sim", "nao", "sim", "agora",
                "piscar", "atento", "15km","10metros");


        System.out.println(robo.Direcao + "esquerda");




    }
}