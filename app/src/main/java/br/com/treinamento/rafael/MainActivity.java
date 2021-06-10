package br.com.treinamento.rafael;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "Sharedreferences";
    private static final String PREF_NOME = "Sharedreferences_pref";

    SharedPreferences sharedPreferences;
    SharedPreferences.Editor dados;

    String nomeProduto;
    int codigoProduto;
    float precoProduto;
    boolean estoque;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.i(TAG, "Rodando ");

        sharedPreferences = getSharedPreferences(PREF_NOME, Context.MODE_PRIVATE);

        Log.i(TAG, "Pasta shared criada ");

        dados = sharedPreferences.edit();
        nomeProduto = "Notebook Alien";
        codigoProduto = 12345;
        precoProduto = 997.97f;
        estoque = true;

        dados.apply();

        dados.putString("nomeProduto",nomeProduto);
        dados.putFloat("precoProduto",precoProduto);
        dados.putInt("codigoProduto",codigoProduto);
        dados.putBoolean("estoque", estoque);

        Log.i(TAG, "Dados para serem salvos ");
        Log.w(TAG, "Produto: "+nomeProduto);
        Log.w(TAG, "Código: "+codigoProduto);
        Log.w(TAG, "Preço"+precoProduto);
        Log.w(TAG, "Em Estoque: "+estoque);
    }
}