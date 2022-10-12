package com.example.roanoke;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class ViewController {


    @FXML
    protected TextField tf01;

    @FXML
    protected TextField tf02;

    @FXML
    protected TextField tf03;

    @FXML
    protected TextField tf04;

    @FXML
    protected TextField tf05;

    @FXML
    protected TextField tf06;

    @FXML
    protected TextField tf07;

    @FXML
    protected TextField tf08;

    @FXML
    protected TextField tf09;

    @FXML
    protected TextField tf10;

    @FXML
    protected TextField tf11;

    @FXML
    protected Button pecbt01;

    @FXML
    protected Button peebt02;

    @FXML
    protected Button pefbt03;

    @FXML
    protected Label lb01;

    @FXML
    protected Label lb02;

    @FXML
    protected Label lb03;

    @FXML
    protected Label lb04;

    @FXML
    protected Label lb05;

    @FXML
    protected Label lb06;


    public void pecuni(){

        int cft = Integer.parseInt(tf01.getText());
        int pv = Integer.parseInt(tf02.getText());
        int cv = Integer.parseInt(tf03.getText());

        int pvcv = pv - cv;
        int total = cft / pvcv;

        lb01.setText(String.format("%d", total));

        int pecval = total * pv;

        lb02.setText(String.format("%d", pecval));


    }

    public void peeuni(){

        int cft = Integer.parseInt(tf04.getText());
        int retorno = Integer.parseInt(tf05.getText());
        int pv = Integer.parseInt(tf06.getText());
        int cv = Integer.parseInt(tf07.getText());

        int pvcv = pv - cv;

        int calc = cft + retorno;

        int total = calc / pvcv;

        lb03.setText(String.format("%d", total));

        int peeval = total * pv;

        lb04.setText(String.format("%d", peeval));

    }

    public void pefuni(){

        int cft = Integer.parseInt(tf08.getText());
        int dep = Integer.parseInt(tf09.getText());
        int pv = Integer.parseInt(tf10.getText());
        int cv = Integer.parseInt(tf11.getText());

        int calc = cft - dep;
        int pvcv = pv - cv;
        int total = calc / pvcv;

        lb05.setText(String.format("%d", total));

        int pefval = total * pv;

        lb06.setText(String.format("%d", pefval));

    }





}
