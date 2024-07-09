package com.example.estoque;

public class MaquinaCoxinha {

    private int quantidadeCoxinha;

    public MaquinaCoxinha() {
        quantidadeCoxinha = 0;
    }

    public void abastecer(int abastecerCoxinha){
        quantidadeCoxinha += abastecerCoxinha;
    }

    public void vender(){
        if(quantidadeCoxinha > 0){
            quantidadeCoxinha--;
        }
    }

    public void vender(int venderCoxinha){
        if(quantidadeCoxinha >= venderCoxinha){
            quantidadeCoxinha -= venderCoxinha;
        }
    }

    public void zerarMaquina(){
        quantidadeCoxinha = 0;
    }

    public void setQuantidadeCoxinha(int quantidadeCoxinha) {
        this.quantidadeCoxinha = quantidadeCoxinha;
    }

    public int getQuantidadeCoxinha() {
        return quantidadeCoxinha;
    }
}
