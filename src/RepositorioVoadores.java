import java.util.ArrayList;
import java.util.List;

public class RepositorioVoadores {

    private List<Voador> voadors = new ArrayList<>();
    
    public void adicionarVoador(Voador voador){
        voadors.add(voador);
    }
    public int tamanho(){
        return voadors.size();
    }

    public Voador removeVoador(int posicao){
        return removeVoador(posicao);
    }

    public void fazVoar(int posicao) {
        voadors.get(posicao).voar();
    }

    public void fazPousar(int posicao) {
        voadors.get(posicao).pousar();
    }

    public void fazPlanar(int posicao){
        voadors.get(posicao).planar();
    }

    public void fazTodosVoar (){
        for (Voador voador : voadors) {
            voador.voar();
        }
    }

    public void fazTodosPousarem (){
        for (Voador voador : voadors) {
            voador.pousar();
        }
    }
    public void fazTodoPlanarem (){
        for (Voador voador : voadors) {
            voador.planar();
        }
    }

}
