package entretenimento.studio.com.entretenimento;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import static android.R.attr.id;
import static android.R.attr.layout;
import static entretenimento.studio.com.entretenimento.R.id.parent;

/**
 * Created by Celio Nascimento on 02/06/2017.
 */

public class aEstabelecimentoAdapter extends ArrayAdapter<aEstabelecimento> {

    private final Context context;
    private final ArrayList<aEstabelecimento> elementos;

    public aEstabelecimentoAdapter(Context context, ArrayList<aEstabelecimento>elementos){
        super (context, R.layout.llinha, elementos);
        this.context = context;
        this.elementos = elementos;
    }

    public View getView (int position, View convertView, ViewGroup parent){
        LayoutInflater inflater = (LayoutInflater)context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(R.layout.llinha, parent, false);

        TextView nomeEst = (TextView)rowView.findViewById(R.id.nomeID);
        TextView endEst = (TextView)rowView.findViewById(R.id.enderecoID);
        ImageView imgEst = (ImageView)rowView.findViewById(R.id.imagemID);

        nomeEst.setText(elementos.get(position).getNome());
        endEst.setText(elementos.get(position).getEndereco());
        imgEst.setImageResource(elementos.get(position).getImagem());

        return rowView;
    }
}
