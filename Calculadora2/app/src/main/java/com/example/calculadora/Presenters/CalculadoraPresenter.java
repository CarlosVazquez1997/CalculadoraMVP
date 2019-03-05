package com.example.calculadora.Presenters;

public interface CalculadoraPresenter
{
    void sumarPresenter(String numero1, String Numero2);
    void restarPresenter(String numero1, String Numero2);
    void dividirPresenter(String numero1, String Numero2);
    void multiplicarPresenter(String numero1, String Numero2);

    void mostrarError(String error);
    void mostrarResultado(String resultado);


}
