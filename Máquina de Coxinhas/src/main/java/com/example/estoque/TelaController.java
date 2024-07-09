package com.example.estoque;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class TelaController {
    private final MaquinaCoxinha MAQUINACOXINHA = new MaquinaCoxinha();

    @FXML
    private TextField quantidadeCoxinhaAtual;

    @FXML
    private TextField abastecerCoxinha;

    @FXML
    private TextField venderCoxinha;

    @FXML
    private Label mensagemErro;

    private int quantidadeCoxinha;


    @FXML
    private void abastecer(){
        MAQUINACOXINHA.abastecer(Integer.parseInt(abastecerCoxinha.getText()));
        quantidadeCoxinhaAtual.setText(String.valueOf(MAQUINACOXINHA.getQuantidadeCoxinha()));
        abastecerCoxinha.setText("");
        mensagemErro.setText("");
    }

    @FXML
    private void venderCoxinha(){
        quantidadeCoxinha = MAQUINACOXINHA.getQuantidadeCoxinha();
        MAQUINACOXINHA.vender();
        quantidadeCoxinhaAtual.setText(String.valueOf(MAQUINACOXINHA.getQuantidadeCoxinha()));
        if (quantidadeCoxinha == MAQUINACOXINHA.getQuantidadeCoxinha()){
            mensagemErro.setText("Quantidade de coxinhas é 0");
        }
        else{
            mensagemErro.setText("");
        }
    }

    @FXML
    private void vender(){
        quantidadeCoxinha = MAQUINACOXINHA.getQuantidadeCoxinha();
        MAQUINACOXINHA.vender(Integer.parseInt(String.valueOf(venderCoxinha.getText())));
        quantidadeCoxinhaAtual.setText(String.valueOf(MAQUINACOXINHA.getQuantidadeCoxinha()));
        venderCoxinha.setText("");
        if (quantidadeCoxinha == MAQUINACOXINHA.getQuantidadeCoxinha()){
            mensagemErro.setText("Não há este número de coxinhas");
        }
        else{
            mensagemErro.setText("");
        }
    }

    @FXML
    private void zerarCoxinha(){
        MAQUINACOXINHA.zerarMaquina();
        quantidadeCoxinhaAtual.setText(String.valueOf(MAQUINACOXINHA.getQuantidadeCoxinha()));
        mensagemErro.setText("");
    }

}
