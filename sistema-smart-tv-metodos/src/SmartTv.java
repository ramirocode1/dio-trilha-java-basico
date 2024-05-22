public class SmartTv {

    boolean ligada = false;
    int canal = 5;
    int volume = 80;

    public void ligar(){
        ligada=true;
    }

    public void desligada(){
        ligada=false;
    }

    public void aumentarVolume(){
        // volume = volume + 1;
        volume++;
    }

    public void diminuirVolume(){
        // volume = volume - 1;
        volume--;
    }

    public void mudarCanal(int novoCanal){
        canal = novoCanal;
    }

    public void aumentarCanal(){
        canal++;
    }

    public void diminuirCanal(){
        canal--;
    }





}
