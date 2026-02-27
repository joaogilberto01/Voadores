import java.util.Random;

public class VoadoresMain {
    public static void main(String[] args) {

        RepositorioVoadores voadores = new RepositorioVoadores();
        
        for (int i = 0; i < 10; i++) {
            Voador voador = recebeVoador();
            voadores.adicionarVoador(voador);
        }
        
        for (int i = 0; i < voadores.tamanho(); i++) {
            voadores.fazPlanar(i);
            voadores.fazPolsar(i);
            voadores.fazVoar(i);
        }

    }

    private static Voador recebeVoador() {

        Random r = new Random();
        int numero = r.nextInt(3);

        switch (numero) {
            case 0:
                return new GalinhaVoadora();
            case 1:
                return new Drone("do bom");
            case 2:
                return new Balao(true);        
            default:
                return null;
        }
    }

}
