package com.example.a6105160.projethockey.Activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.a6105160.projethockey.R;

public class feuille_pointageActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.feuille_de_pointage);


        final TextView ed=(TextView)findViewById(R.id.editText34);

        Button b1=(Button)findViewById(R.id.button33);

        b1.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                // TODO Auto-generated method stub

                int a=Integer.parseInt(ed.getText().toString());
                if(a!=0)
                {
                    int b=a-1;
                    ed.setText(new Integer(b).toString());
                }

            }
        });
        Button b2=(Button)findViewById(R.id.button34);

        b2.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v)
            {
                // TODO Auto-generated method stub

                int a=Integer.parseInt(ed.getText().toString());

                    int b=a+1;
                    ed.setText(new Integer(b).toString());
            }

        });



        final TextView ed2=(TextView)findViewById(R.id.editText35);

        Button b3=(Button)findViewById(R.id.button35);

        b3.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                // TODO Auto-generated method stub

                int z=Integer.parseInt(ed2.getText().toString());
                if(z!=0)
                {
                    int w=z-1;
                    ed2.setText(new Integer(w).toString());
                }

            }
        });
        Button b4=(Button)findViewById(R.id.button36);

        b4.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v)
            {
                // TODO Auto-generated method stub

                int g=Integer.parseInt(ed2.getText().toString());

                int f=g+1;
                ed2.setText(new Integer(f).toString());
            }

        });

    }
}
