package br.com.sp.senac.apptoolbarmenu;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    // Variavel Global

    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Apresentaçaõ do objeto java para o objeto layout

        toolbar = findViewById(R.id.toolBar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setTitle("Senac Largo Treze");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.menu_toolbar, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId()) {
            case R.id.mSalvar:
                Toast.makeText(getApplicationContext(), "Cliquei no Salvar!!!", Toast.LENGTH_SHORT).show();
                break;

            case R.id.mAlterar:
                Toast.makeText(getApplicationContext(), "Cliquei no Alterar!!!", Toast.LENGTH_SHORT).show();
                break;

            case R.id.mExcluir:
                Toast.makeText(getApplicationContext(), "Cliquei no Excluir!!!", Toast.LENGTH_SHORT).show();
                break;

            case R.id.mBuscar:
                Toast.makeText(getApplicationContext(), "Cliquei no Buscar!!!", Toast.LENGTH_SHORT).show();
                break;

            case R.id.mAbrir:
                // Intent abrirJanelaNova = new Intent(getApplicationContext(),SubMenu_Activity.class);
                // startActivity(abrirJanelaNova);

                startActivity(new Intent(getApplicationContext(), SubMenu_Activity.class));
                break;

            case R.id.mAbriGrupo:

                startActivity(new Intent(getApplicationContext(), GrupoMenu_Activity.class));
                break;

            case R.id.mSair:
                finish();
                break;
        }

        return super.onOptionsItemSelected(item);
    }
}
