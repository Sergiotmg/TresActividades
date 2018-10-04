package com.example.sergio.tresactividades;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    public static final String TEXT_EXTRA="texto_a_mostrar";// EL NPOMBRE QUE LE PONEMOS AL INTENT PARA PASARLO AL OTRO LADO!1
    //no hay que llamarle private , tiene que ser public

    /*String text2="234234cf34f234234  ";
    String text3="dwdewdsccdsdsds";
    String texto;*/
    //7mejor crearlos dentro del metodo showOne showTwoo, etc
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void launchSecondActivity(String text) {

        Intent intent = new Intent(this, MainActivity2.class);
        //para sar esa variable a la 2ª actividad:
        intent.putExtra(TEXT_EXTRA,text);//TEXT_EXTRA, y el valor que uqremos pasar a la 2ª ectividad
        startActivity(intent);
         //para eso creamos una cte
        //puede ir vacio cuando no hay que lanzar nada
        //si queremos lanzar una actividad dentro del indent le decimos lo que quremos que lance

    }

    public void showOne(View view) {
        //PARA RECOGER TEXTO DEL STRINGS.XML
        //texto=getResources().getString(R.string.texto1);
        String text=getString(R.string.texto1);
        launchSecondActivity(text);// ojo con no olvidarse de pasarle el mismo nombre"text" que tiene el
        //metodo launchSecondActivity() !! y con el intent.putExtra(TEXT_EXTRA,text) ese text que sea el mismo
        //que el que acbo de definir en showOne!!!, antes lo habia definido arriba
    }

    public void showTwo(View view) {
        //texto=getString(R.string.texto2);
        String text=getString(R.string.texto2);
        launchSecondActivity(text);
    }


    public void showThree(View view) {
        //texto=getResources().getString(R.string.texto2);
        String text=getString(R.string.texto3);
        launchSecondActivity(text);
    }
}
