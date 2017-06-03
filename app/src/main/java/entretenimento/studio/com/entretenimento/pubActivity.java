package entretenimento.studio.com.entretenimento;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class pubActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pub);

        ListView lista = (ListView)findViewById(R.id.lvPubID);
        ArrayList<aEstabelecimento> est = adicionarEst();
        ArrayAdapter adapter = new aEstabelecimentoAdapter(this,est);
        lista.setAdapter(adapter);

        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                switch (position) {
                    case 0:
                        Intent intent = new Intent(pubActivity.this, pubCheersActivity.class);
                        startActivity(intent);
                        break;
                    case 1:
                        Intent intent1 = new Intent(pubActivity.this, pubFlanniganActivity.class);
                        startActivity(intent1);
                        break;
                    case 2:
                        Intent intent2 = new Intent(pubActivity.this, pubFolksActivity.class);
                        startActivity(intent2);
                        break;
                    case 3:
                        Intent intent3 = new Intent(pubActivity.this, pubJohnActivity.class);
                        startActivity(intent3);
                    case 4:
                        Intent intent4 = new Intent(pubActivity.this, pubPalhanoActivity.class);
                        startActivity(intent4);
                    case 5:
                        Intent intent5 = new Intent(pubActivity.this, pubSlowActivity.class);
                        startActivity(intent5);
                }
            }
        });
    }

    private ArrayList<aEstabelecimento>adicionarEst(){

        ArrayList<aEstabelecimento>est = new ArrayList<aEstabelecimento>();
        aEstabelecimento e = new aEstabelecimento("Cherrers Pub","Rua Alagoas, 1005",R.drawable.listpubcheers);

        est.add(e);
        e = new aEstabelecimento("Flannigan's","Av. Ayrton Senna, 850",R.drawable.listpubflannigan);

        est.add(e);
        e = new aEstabelecimento("Folks", "Avenida Maringá, 2247",R.drawable.listpubfolks);

        est.add(e);
        e = new aEstabelecimento("John O'Groats Pub", "Rua Paranaguá, 1004", R.drawable.listpubjohn);

        est.add(e);
        e = new aEstabelecimento("Palhano Pub","Rua Mar Vermelho, 25",R.drawable.listpubpalhano);

        est.add(e);
        e = new aEstabelecimento("Slow Down", "Rua Ibiporã, 884",R.drawable.listpubslow);

        est.add(e);

        return est;

    }
}
