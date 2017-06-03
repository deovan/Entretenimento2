package entretenimento.studio.com.entretenimento;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class barActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bar);

        ListView lista = (ListView) findViewById(R.id.lvBarID);
        ArrayList<aEstabelecimento> est = adicionarEst();
        ArrayAdapter adapter = new aEstabelecimentoAdapter(this, est);
        lista.setAdapter(adapter);

        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                //Intent intent = new Intent(barActivity.this, rockbarActivity.class);

                switch (position) {
                    case 0:
                        Intent intent = new Intent(barActivity.this, bar43rockActivity.class);
                        startActivity(intent);
                        break;
                    case 1:
                        Intent intent1 = new Intent(barActivity.this, barCativeiroActivity.class);
                        startActivity(intent1);
                        break;
                    case 2:
                        Intent intent2 = new Intent(barActivity.this, barEscritorioActivity.class);
                        startActivity(intent2);
                        break;
                    case 3:
                        Intent intent3 = new Intent(barActivity.this, barEstacaoActivity.class);
                        startActivity(intent3);
                        break;
                    case 4:
                        Intent intent4 = new Intent(barActivity.this, barMeninasActivity.class);
                        startActivity(intent4);
                        break;
                    case 5:
                        Intent intent5 = new Intent(barActivity.this, barMariaActivity.class);
                        startActivity(intent5);
                        break;
                    case 6:
                        Intent intent6 = new Intent(barActivity.this, barOficinaActivity.class);
                        startActivity(intent6);
                        break;
                    case 7:
                        Intent intent7 = new Intent(barActivity.this, barR2Activity.class);
                        startActivity(intent7);
                        break;
                    case 8:
                        Intent intent8 = new Intent(barActivity.this, barVitrolaActivity.class);
                        startActivity(intent8);
                        break;
                    case 9:
                        Intent intent9 = new Intent(barActivity.this, barValentinoActivity.class);
                        startActivity(intent9);
                        break;
                    case 10:
                        Intent intent10 = new Intent(barActivity.this, barSantoActivity.class);
                        startActivity(intent10);
                        break;
                    case 11:
                        Intent intent11 = new Intent(barActivity.this, barTozenActivity.class);
                        startActivity(intent11);
                        break;
                }


            }
        });

    }

    private ArrayList<aEstabelecimento> adicionarEst() {
        ArrayList<aEstabelecimento> est = new ArrayList<aEstabelecimento>();

        aEstabelecimento e = new aEstabelecimento("43 Rockbar", "Avenida Maringa, 1550", R.drawable.listbarrockbar);

        est.add(e);
        e = new aEstabelecimento("Cativeiro Bar", "Avenida Pres. Castelo Branco, 1537", R.drawable.listbarcativeiro);

        est.add(e);
        e = new aEstabelecimento("Escritório Bar", "Rua José Roque Salton, 33", R.drawable.listbarescritorio);

        est.add(e);
        e = new aEstabelecimento("Estação Café Brasil", "R. Humaitá, 472", R.drawable.listbarestacao);

        est.add(e);
        e = new aEstabelecimento("Meninas Bar", "Avenida Santos Dumont, 1113", R.drawable.listbarmeninas);

        est.add(e);
        e = new aEstabelecimento("Maria Vai Cazoutras", "Rua Humaitá, 370", R.drawable.listbarmaria);

        est.add(e);
        e = new aEstabelecimento("Narciso Bar", "R. Pref. Faria Lima, 765", R.drawable.listbarnarciso);

        est.add(e);
        e = new aEstabelecimento("Oficina Bar", "Rua Prefeito Faria Lima, 1380", R.drawable.listbaroficinar);

        est.add(e);
        e = new aEstabelecimento("R2 Choperia", "Rua Fernando de Noronha, 1376", R.drawable.listbardois);

        est.add(e);
        e = new aEstabelecimento("Vitrola Bar", "Avenida Higienópolis 2405", R.drawable.listbarvitrola);

        est.add(e);
        e = new aEstabelecimento("Valentino", "Rua Prefeito Faria Lima, 486", R.drawable.listbarvalentino);

        est.add(e);
        e = new aEstabelecimento("Santo Graau", "Avenida Maringá, 1959", R.drawable.listbarsanto);

        est.add(e);
        e = new aEstabelecimento("Trozen", "Avenida Harry Prochet,1130", R.drawable.listbartozen);

        est.add(e);

        return est;
    }
}



