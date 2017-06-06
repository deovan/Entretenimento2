package entretenimento.studio.com.entretenimento;

import android.content.Intent;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class boatActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_boate);

        ListView lista = (ListView) findViewById(R.id.lvBoateID);
        ArrayList<aEstabelecimento> est = adicionarEst();
        ArrayAdapter adapter = new aEstabelecimentoAdapter(this, est);
        lista.setAdapter(adapter);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);




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


    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();

        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main_sem_settings, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_inicio) {

            Intent intent = new Intent(this, MainActivity.class);
            intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            startActivity(intent);

        } else if (id == R.id.nav_bar) {

            Intent intent = new Intent(this, barActivity.class);
            startActivity(intent);

        } else if (id == R.id.nav_boate) {

            Intent intent = new Intent(this, boatActivity.class);
            startActivity(intent);


        } else if (id == R.id.nav_cinema) {

            Intent intent = new Intent(this, cinemaActivity.class);
            startActivity(intent);

        } else if (id == R.id.nav_Pub) {

            Intent intent = new Intent(this, pubActivity.class);
            startActivity(intent);


        } else if (id == R.id.nav_contato) {

            Intent intent = new Intent(this, contatoActivity.class);
            startActivity(intent);

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }






}



