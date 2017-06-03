package entretenimento.studio.com.entretenimento;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class boatActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_boate);

        ListView lista = (ListView) findViewById(R.id.lvBoateID);
        ArrayList<aEstabelecimento> est = adicionarEst();
        ArrayAdapter adapter = new aEstabelecimentoAdapter(this, est);
        lista.setAdapter(adapter);

        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                switch (position) {
                    case 0:
                        Intent intent = new Intent(boatActivity.this, boate2800Activity.class);
                        startActivity(intent);
                        break;
                    case 1:
                        Intent intent1 = new Intent(boatActivity.this, boateArabianActivity.class);
                        startActivity(intent1);
                        break;
                    case 2:
                        Intent intent2 = new Intent(boatActivity.this, boateNyActivity.class);
                        startActivity(intent2);
                        break;

                }
            }
        });
    }

    private ArrayList<aEstabelecimento> adicionarEst() {
        ArrayList<aEstabelecimento> est = new ArrayList<aEstabelecimento>();

        aEstabelecimento e = new aEstabelecimento("2800 Music Club", "Avenida Higienópolis, 2800", R.drawable.listboatedois);

        est.add(e);
        e = new aEstabelecimento("Arabian's hookah lounge", "R. Prof. Joaquim de Matos Barreto, 350", R.drawable.listboatearabians);

        est.add(e);
        e = new aEstabelecimento("NY Lounge", "Rio Grande do Norte, 750", R.drawable.listboateny);

        est.add(e);

        return est;
    }
    }

