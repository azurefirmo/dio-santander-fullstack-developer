package one.digitalinnovation.gof.strategy;

public class Test {
    public static void main(String[] args) {
        Comportamento normal = new ComportamentoNormal();
        Comportamento defensivo = new ComportamentoDefensivo();
        Comportamento agressivo = new ComportamentoAgressivo();

        Robo robo = new Robo();
        robo.setcomportamento(normal);
        robo.mover();
        robo.mover();
        System.out.println("\n");
        System.out.println("O Robô mudou de comportamento...");
        robo.setcomportamento(defensivo);
        robo.mover();
        System.out.println("\n");
        System.out.println("O Robô mudou de comportamento...");
        robo.setcomportamento(agressivo);
        robo.mover();
        robo.mover();
    }
}
