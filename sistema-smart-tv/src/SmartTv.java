public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void ligar(){
        ligada = true;
    }
    public void desligar(){
        ligada = false;
    }
    public void incrementarVolume(){
        volume++;
    }
    public void decrementarVolume(){
        volume--;
    }
    public void incrementarCanal(){
        canal++;
    }
    public void decrementarCanal(){
        canal--;
    }
    public void mudarCanal(int novoCanal){
        canal = novoCanal;
    }
}