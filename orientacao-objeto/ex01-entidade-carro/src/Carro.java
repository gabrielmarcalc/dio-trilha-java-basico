public class Carro {
    
    String cor;
    String modelo;
    int capacidadeTanque;       // Atributos

    Carro() {} // CRIADOR 1
    
    Carro(String cor, String modelo, int capacidadeTanque) {    // CRIADOR 2 (Permite criar o objeto já
        this.cor = cor;                                         // inicializando os atributos).
        this.modelo = modelo;
        this.capacidadeTanque = capacidadeTanque;
    }

    void setCor(String cor) {
        this.cor = cor;
    }
    String getCor() {
        return cor;
    }
    void setModelo(String modelo) {
        this.modelo = modelo;
    }
    String getModelo() {
        return modelo;
    }
    void setCapacidadeTanque(int capacidadeTanque) {
        this.capacidadeTanque = capacidadeTanque;
    }
    int getCapacidadeTanque() {
        return capacidadeTanque;
    }
    double totalValorTanque(double valorCombustivel) {
        return capacidadeTanque * valorCombustivel; 
    }
}
