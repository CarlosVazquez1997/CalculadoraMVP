package com.example.calculadora.Presenters;

import com.example.calculadora.Interactors.CalculadoraInteractor;
import com.example.calculadora.Interactors.CalculadoraInteractorImpl;
import com.example.calculadora.Views.CalculadoraView;

public class CalculadoraPresenterImpl implements CalculadoraPresenter
{

    //region instancias view e Interactor
    private CalculadoraView calView;
    private CalculadoraInteractor calInteractor;
    //endregion

    //region Constructores
    //Se hace esta instancia para controlar la vista desde el presentador
    public CalculadoraPresenterImpl(CalculadoraView calView)
    {
        this.calView = calView;
        calInteractor = new CalculadoraInteractorImpl(this);
    }


    //endregioneses

    //Métodos del Presentador llaman a métodos del Interactor
    @Override
    public void sumarPresenter(String numero1, String numero2) {
        if (calView != null)
        {
            calInteractor.sumar(numero1, numero2);
        }
    }

    @Override
    public void restarPresenter(String numero1, String numero2)
    {
        if (calView != null)
        {
            calInteractor.restar(numero1, numero2);
        }
    }

    @Override
    public void dividirPresenter(String numero1, String numero2)
    {
        if (calView != null)
        {
            calInteractor.dividir(numero1, numero2);
        }
    }

    @Override
    public void multiplicarPresenter(String numero1, String numero2)
    {
        if (calView != null)
        {
            calInteractor.multplicar(numero1, numero2);
        }
    }

    //Métodos del Presentador llaman a métodos de la vista

    @Override
    public void mostrarError(String error)
    {
        if (calView != null)
        {
            calView.mostrarError(error);
        }
    }

    @Override
    public void mostrarResultado(String resultado)
    {
        if (calView != null)
        {
            calView.mostrarResultado(resultado);
        }
    }


}
