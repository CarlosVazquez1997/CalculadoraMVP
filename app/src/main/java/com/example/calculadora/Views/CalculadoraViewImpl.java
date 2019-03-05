package com.example.calculadora.Views;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.calculadora.Presenters.CalculadoraPresenter;
import com.example.calculadora.Presenters.CalculadoraPresenterImpl;
import com.example.calculadora.R;

public class CalculadoraViewImpl extends AppCompatActivity implements CalculadoraView{

    private EditText numeroUno, numeroDos;
    private TextView textResultado;
    private CalculadoraPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        numeroUno = (EditText) findViewById(R.id.numero1);
        numeroDos = (EditText) findViewById(R.id.numero2);
        textResultado = (TextView) findViewById(R.id.resultado);

        presenter = new CalculadoraPresenterImpl(this);
    }

    @Override
    public void mostrarResultado(String resultado)
    {
        textResultado.setText(resultado);
    }

    @Override
    public void mostrarError(String error)
    {
        Toast.makeText(CalculadoraViewImpl.this, error, Toast.LENGTH_SHORT).show();
    }

    //region Operaciones
    //Los métodos aquí usados mandan a llamar al Interactor
    public  void  sumar(View v)
    {
        presenter.sumarPresenter(numeroUno.getText().toString(), numeroDos.getText().toString());
    }
    public void restar(View v)
    {
        presenter.restarPresenter(numeroUno.getText().toString(), numeroDos.getText().toString());
    }
    public void multiplicar(View v)
    {
        presenter.multiplicarPresenter(numeroUno.getText().toString(), numeroDos.getText().toString());
    }

    public void dividir(View v)
    {
        presenter.dividirPresenter(numeroUno.getText().toString(), numeroDos.getText().toString());

    }
    //endregion
}
