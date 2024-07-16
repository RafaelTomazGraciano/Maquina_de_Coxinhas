package com.example.estoque;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class TelaController {
    private MaquinaCoxinha maquinaCoxinha;

    @FXML
    private TextField quantidadeCoxinhaAtual;

    @FXML
    private TextField abastecerCoxinha;

    @FXML
    private TextField venderCoxinha;

    @FXML
    private Label mensagemErro;

    @FXML
    private void initialize(){
        maquinaCoxinha = new MaquinaCoxinha();
    }

    @FXML
    private void abastecer(){
        maquinaCoxinha.abastecer(Integer.parseInt(abastecerCoxinha.getText()));
        quantidadeCoxinhaAtual.setText(String.valueOf(maquinaCoxinha.getQuantidadeCoxinha()));
        abastecerCoxinha.setText("");
        mensagemErro.setText("");
    }

    @FXML
    private void venderCoxinha(){
        if (maquinaCoxinha.getQuantidadeCoxinha() > 0 ){
            maquinaCoxinha.vender();
            mensagemErro.setText("");
        }
        else{
            mensagemErro.setText("");
            mensagemErro.setText("Quantidade de coxinhas é 0");
        }
        quantidadeCoxinhaAtual.setText(String.valueOf(maquinaCoxinha.getQuantidadeCoxinha()));
    }

    @FXML
    private void vender(){
        if (maquinaCoxinha.getQuantidadeCoxinha() >= Integer.parseInt(String.valueOf(venderCoxinha.getText()))){
            maquinaCoxinha.vender(Integer.parseInt(String.valueOf(venderCoxinha.getText())));
            mensagemErro.setText("");
        }
        else{
            mensagemErro.setText("");
            mensagemErro.setText("Não há este número de coxinhas");
        }
        quantidadeCoxinhaAtual.setText(String.valueOf(maquinaCoxinha.getQuantidadeCoxinha()));
        venderCoxinha.setText("");
    }

    @FXML
    private void zerarCoxinha(){
        maquinaCoxinha.zerarMaquina();
        quantidadeCoxinhaAtual.setText(String.valueOf(maquinaCoxinha.getQuantidadeCoxinha()));
        mensagemErro.setText("");
    }

}
