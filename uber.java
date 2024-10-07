
public class Uber {
    double distancia, tarifaBase, fatorDemanda;
    int tempoEspera;
    double valorFinal;
                
    public void calcularValorCorrida(double distancia, int tempoEspera, double tarifaBase, double fatorDemanda){
        valorFinal = ((distancia * 2) + (tempoEspera * 0.5) + tarifaBase * fatorDemanda);
        System.out.println(valorFinal);
    }
    
    public void exibirDetalhesCorrida(){
        System.out.println(distancia);
        System.out.println(tempoEspera);
        System.out.println(tarifaBase);
        System.out.println(fatorDemanda);
        System.out.println(valorFinal);
    }                                                                                   
}