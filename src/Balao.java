public class Balao implements Voador{

    private boolean ligado;

    public Balao(Boolean ligado){
        this.ligado = ligado;
    }

    public void setLigado(Boolean ligado){
        this.ligado = ligado;
    }

    public Boolean getLigado(){
        return ligado;
    }

    @Override
    public double voar() {
        System.out.println("Voa voa galinha");
        return 0;
    }

    @Override
    public void planar() {
        System.out.println("Plana galinha");
    }

    @Override
    public boolean pousar() {
        System.out.println("Pousa galinha");
        return true;
    }

}
