import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Uber u = new Uber();
        Scanner sc = new Scanner(System.in);         
                            
        System.out.println("Informe a distância percorrida em km: ");
        u.distancia = sc.nextDouble();
        System.out.println("Informe o tempo de espera em minutos: ");
        u.tempoEspera = sc.nextInt();
        System.out.println("Informe o valor cobrado pela corrida: ");
        u.tarifaBase = sc.nextDouble();
        System.out.println("Informe o preço em horários de alta demanda: ");
        u.fatorDemanda = sc.nextDouble();
                                                                                    
        System.out.println("O valor final foi: ");
        u.calcularValorCorrida(u.distancia, u.tempoEspera, u.tarifaBase, u.fatorDemanda);
        }
}