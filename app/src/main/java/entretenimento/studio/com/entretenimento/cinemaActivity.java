package entretenimento.studio.com.entretenimento;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class cinemaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cinema);

        ListView lista = (ListView) findViewById(R.id.lvCinemaID);
        ArrayList<aEstabelecimento> est = adicionarEst();
        ArrayAdapter adapter = new aEstabelecimentoAdapter(this, est);
        lista.setAdapter(adapter);

        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                switch (position) {
                    case 0:
                        Intent intent = new Intent(cinemaActivity.this, cineAraujoActivity.class);
                        startActivity(intent);
                        break;
                    case 1:
                        Intent intent1 = new Intent(cinemaActivity.this, cineFlixActivity.class);
                        startActivity(intent1);
                        break;
                    case 2:
                        Intent intent2 = new Intent(cinemaActivity.this, cineLumiereActivity.class);
                        startActivity(intent2);
                        break;
                    case 3:
                        Intent intent3 = new Intent(cinemaActivity.this, cineMarkActivity.class);
                        startActivity(intent3);
                        break;
                    case 4:
                        Intent intent4 = new Intent(cinemaActivity.this, cineSystemActivity.class);
                        startActivity(intent4);
                        break;
                }
            }
        });

    }

    private ArrayList<aEstabelecimento> adicionarEst() {
        ArrayList<aEstabelecimento> est = new ArrayList<aEstabelecimento>();

        aEstabelecimento e = new aEstabelecimento("Cine Araujo",
                "Rodovia Celso Garcia CID.KM.377", R.drawable.listcinearaujo);
        est.add(e);
        e = new aEstabelecimento("CineFlix",
                "Av. Ayrton Senna da Silva, 400", R.drawable.listcineflix);

        est.add(e);
        e = new aEstabelecimento("CineLumière", "Rua Mato Grosso, 310", R.drawable.listcinelumiere);

        est.add(e);
        e = new aEstabelecimento("CineMark", "Av. Theodoro Victorelli, 150", R.drawable.listcinemark);

        est.add(e);
        e = new aEstabelecimento("CineSystem", "R. Américo Deolindo Garla, 224", R.drawable.listcinesystem);

        est.add(e);

        return est;
    }
    }

