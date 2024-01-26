package CarroRobo;

//===========================================================//
//turn: Virar
//direction: direção
//radius: raio
//startspeed: velocidade inicial
//endspeed: velocidade final
//changelanes: mudar de faixa
//signalturn: sinal virar
//signalOn: sinalizar ligado
//radarTurn: giro dor radar
//radarRear: radar traseiro
//radarFront: radar frontal
//speedOfCar: velocidade do carro
//distanciaToCar: distancia do carro
//==========================================================//
public interface OperaCarro {

    default int Virar(Direcao direcao,
                      double Raio,
                      double VelocidadeInicial,
                      double VelocidadeFinal) {
        return 0;
    }

    default int mudarFaixa(Direcao direcao,
                           double VelocidadeInicial,
                           double VelocidadeFinal) {
        return 0;
    }

    int SinalVirar(Direcao direcao,
                   boolean SinalizadorLigado);
    int getRadarFrontal(double DistanciaCarro,
                        double VelocidadeCarro);
    int getRadarTraseiro(double DistanciaCarro,
                         double VelocidadeCarro);



}
