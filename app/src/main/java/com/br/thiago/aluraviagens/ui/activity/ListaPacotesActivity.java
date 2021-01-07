package com.br.thiago.aluraviagens.ui.activity;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import com.br.thiago.aluraviagens.R;
import com.br.thiago.aluraviagens.dao.PacoteDAO;
import com.br.thiago.aluraviagens.modelo.Pacote;
import com.br.thiago.aluraviagens.ui.adapter.ListaPacotesAdapter;

import java.util.List;

public class ListaPacotesActivity extends AppCompatActivity {

    public static final String TITULO_APP_BAR = "Pacotes";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_pacotes);

        setTitle(TITULO_APP_BAR);
        configuraLista();
    }

    private void configuraLista() {
        ListView listaDePacotes = findViewById(R.id.lista_pacotes_listview);
        List<Pacote> pacotes = new PacoteDAO().lista();
        listaDePacotes.setAdapter(new ListaPacotesAdapter(pacotes, this));
    }

}