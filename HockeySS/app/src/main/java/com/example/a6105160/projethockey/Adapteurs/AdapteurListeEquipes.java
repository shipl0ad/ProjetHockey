package com.example.a6105160.projethockey.Adapteurs;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import android.widget.TextView;

import com.example.a6105160.projethockey.Modeles.Equipe;
import com.example.a6105160.projethockey.R;

import java.util.ArrayList;

/**
 * Created by Jess3e on 2016-11-25.
 */
public class AdapteurListeEquipes extends BaseAdapter {

    private Activity context_1;

    private ArrayList<Equipe> pairs;

    public AdapteurListeEquipes(Activity context, ArrayList<Equipe> pairs) {
        context_1 = context;
        this.pairs = pairs;
    }

    @Override
    public int getCount() {
        return pairs.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder = null;

        if (convertView == null) {
            convertView = LayoutInflater.from(context_1).inflate(R.layout.simple_list_item_1, parent, false);
            viewHolder = new ViewHolder();
            viewHolder.nom = (TextView) convertView.findViewById(R.id.nom);
            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
        }

        viewHolder.nom.setText(pairs.get(position).getNom());
        return convertView;
    }

    public void setPairs(ArrayList<Equipe> pairs) {
        this.pairs = pairs;
    }

    public class ViewHolder {
        public TextView nom;
    }
}
