package com.example.calculadora.Interactors;

import com.example.calculadora.Presenters.CalculadoraPresenter;

public class CalculadoraInteractorImpl implements CalculadoraInteractor
{
    private CalculadoraPresenter presenter;
    private Double resultado;

    public CalculadoraInteractorImpl(CalculadoraPresenter presenter)
    {
        this.presenter = presenter;
    }

    @Override
    public void sumar(String numero1, String numero2)
    {
        if (numero1.equals("") && numero2.equals(""))
        {
            presenter.mostrarError("Revise los campos");
        }
        else
        {
            try
            {
                resultado = Double.valueOf(numero1) + Double.valueOf(numero2);
                presenter.mostrarResultado(resultado.toString());
            }
            catch (Exception error)
            {
                presenter.mostrarError("Revise los campos");
            }
        }
    }

    @Override
    public void restar(String numero1, String numero2)
    {
        if (numero1.equals("") && numero2.equals(""))
        {
            presenter.mostrarError("Revise los campos");
        }
        else
        {
            try
            {
                resultado = Double.valueOf(numero1) - Double.valueOf(numero2);
                presenter.mostrarResultado(resultado.toString());
            }
            catch (Exception error)
            {
                presenter.mostrarError("Revise los campos");
            }
        }
    }

    @Override
    public void multplicar(String numero1, String numero2)
    {
        if (numero1.equals("") && numero2.equals(""))
        {
            presenter.mostrarError("Revise los campos");
        }
        else
        {
            try
            {
                resultado = Double.valueOf(numero1) * Double.valueOf(numero2);
                presenter.mostrarResultado(resultado.toString());
            }
            catch (Exception error)
            {
                presenter.mostrarError("Revise los campos");
            }
        }
    }

    @Override
    public void dividir(String numero1, String numero2)
    {
        if (numero1.equals("") && numero2.equals(""))
        {
            presenter.mostrarError("Revise los campos");
        }
        else
        {
            try
            {
                resultado = Double.valueOf(numero1) / Double.valueOf(numero2);
                presenter.mostrarResultado(resultado.toString());
            }
            catch (Exception error)
            {
                presenter.mostrarError("Revise los campos");
            }
        }
    }
}
