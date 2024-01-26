package CarroRobo;


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
