package CarroRobo;


public class AutoRobo implements OperaCarro {

    public String Direcao;
    public String Virar;
    public int Raio;
    public double VelocidadeInicial;
    public double VelocidadeFinal;
    public String MudarDeFaixa;
    public String SinalVirar;
    public String SinalizadorLigado;
    public String GiroDoRadar;
    public String RadarTraseiro;
    public String RadarFrontal;
    public double VelocidadeCarro;
    public int DistanciaCarro;



    public int GiroDoRadar(Direcao direcao,
                           boolean SinalizadorLigado) {
        return 0;
    }

    public AutoRobo(
            String direcao, String virar, int raio, double velocidadeInicial,
            double velocidadeFinal, String mudarDeFaixa, String sinalVirar,
            String sinalizadorLigado, String giroDoRadar, String radarTraseiro,
            String radarFrontal, double velocidadeCarro, int distanciaCarro) {
        Direcao = direcao;
        Virar = virar;
        Raio = raio;
        VelocidadeInicial = velocidadeInicial;
        VelocidadeFinal = velocidadeFinal;
        MudarDeFaixa = mudarDeFaixa;
        SinalVirar = sinalVirar;
        SinalizadorLigado = sinalizadorLigado;
        GiroDoRadar = giroDoRadar;
        RadarTraseiro = radarTraseiro;
        RadarFrontal = radarFrontal;
        VelocidadeCarro = velocidadeCarro;
        DistanciaCarro = distanciaCarro;
    }

    public String getDirecao() {
        return Direcao;
    }

    public void setDirecao(String direcao) {
        Direcao = direcao;
    }

    public String getVirar() {
        return Virar;
    }

    public void setVirar(String virar) {
        Virar = virar;
    }

    public int getRaio() {
        return Raio;
    }

    public void setRaio(int raio) {
        Raio = raio;
    }

    public double getVelocidadeInicial() {
        return VelocidadeInicial;
    }

    public void setVelocidadeInicial(double velocidadeInicial) {
        VelocidadeInicial = velocidadeInicial;
    }

    public double getVelocidadeFinal() {
        return VelocidadeFinal;
    }

    public void setVelocidadeFinal(double velocidadeFinal) {
        VelocidadeFinal = velocidadeFinal;
    }

    public String getMudarDeFaixa() {
        return MudarDeFaixa;
    }

    public void setMudarDeFaixa(String mudarDeFaixa) {
        MudarDeFaixa = mudarDeFaixa;
    }

    public String getSinalVirar() {
        return SinalVirar;
    }

    public void setSinalVirar(String sinalVirar) {
        SinalVirar = sinalVirar;
    }

    public String getSinalizadorLigado() {
        return SinalizadorLigado;
    }

    public void setSinalizadorLigado(String sinalizadorLigado) {
        SinalizadorLigado = sinalizadorLigado;
    }

    public String getGiroDoRadar() {
        return GiroDoRadar;
    }

    public void setGiroDoRadar(String giroDoRadar) {
        GiroDoRadar = giroDoRadar;
    }

    public String getRadarTraseiro() {
        return RadarTraseiro;
    }

    public void setRadarTraseiro(String radarTraseiro) {
        RadarTraseiro = radarTraseiro;
    }

    public String getRadarFrontal() {
        return RadarFrontal;
    }

    public void setRadarFrontal(String radarFrontal) {
        RadarFrontal = radarFrontal;
    }

    public double getVelocidadeCarro() {
        return VelocidadeCarro;
    }

    public void setVelocidadeCarro(double velocidadeCarro) {
        VelocidadeCarro = velocidadeCarro;
    }

    public int getDistanciaCarro() {
        return DistanciaCarro;
    }

    public void setDistanciaCarro(int distanciaCarro) {
        DistanciaCarro = distanciaCarro;
    }

    @Override
    public int Virar(Direcao direcao, double Raio, double VelocidadeInicial, double VelocidadeFinal) {
        return 0;
    }

    @Override
    public int mudarFaixa(Direcao direcao, double VelocidadeInicial, double VelocidadeFinal) {
        return 0;
    }

    @Override
    public int SinalVirar(Direcao direcao, boolean SinalizadorLigado) {
        return 0;
    }

    @Override
    public int getRadarFrontal(double DistanciaCarro, double VelocidadeCarro) {
        return 0;
    }

    @Override
    public int getRadarTraseiro(double DistanciaCarro, double VelocidadeCarro) {
        return 0;
    }
}
