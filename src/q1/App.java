package q1;
public class App {
    public static void main(String[] args) {

        Brinquedo b1 = new Navio();
        Brinquedo b2 = new Caminhao();
        Brinquedo b3 = new Helicoptero();

        ControleRemoto c1 = new ControleRemoto(b1);
        ControleRemoto c2 = new ControleRemoto(b2);
        ControleRemoto c3 = new ControleRemoto(b3);

        c1.mover();
        c2.mover();
        c3.mover();

    }
}