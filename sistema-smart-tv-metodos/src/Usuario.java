public class Usuario {
    public static void main(String[] args) throws Exception {

        SmartTv smartTv = new SmartTv();

        smartTv.diminuirVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarCanal();
        smartTv.diminuirCanal();
       

        System.out.println("TV ligada? " + smartTv.ligada);
        System.out.println("Canal atual: " + smartTv.canal);
        System.out.println("Volume atual: " + smartTv.volume);

        //CHAMAR METODO CRIADO NA ABA SmatrTv - Ligar e Desligar
        smartTv.ligar(); 
        System.out.println("Novo status -> TV ligada?" +" "+ smartTv.ligada);

        smartTv.desligada();
        System.out.println("Novo status -> TV ligada?" +" "+ smartTv.ligada);

        //CHAMAR METODO CRIADO NA ABA SmatrTv - Aumentar e Diminuir volume
        smartTv.aumentarVolume();
        System.out.println(smartTv.volume);

        smartTv.diminuirVolume();
        System.out.println(smartTv.volume);

        smartTv.mudarCanal(20);
        System.out.println("Canal atual: " + smartTv.canal);

    
        
    }
}
