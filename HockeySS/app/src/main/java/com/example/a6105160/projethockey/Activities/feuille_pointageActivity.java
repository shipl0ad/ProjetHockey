package com.example.a6105160.projethockey.Activities;

import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.a6105160.projethockey.R;

public class feuille_pointageActivity extends AppCompatActivity {

    TextView tv_time;
    Button btn_start,btn_cancel,btn_pause,btn_resume;
    long onpause=0;

    CountDownTimer countDownTimer;
    long totaltime = 2500 * 1000;
    long sec = 1000;


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
        Button boutonRetour = (Button) findViewById(R.id.button38);
        boutonRetour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
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

        btn_start = (Button) findViewById(R.id.button29);
        tv_time = (TextView) findViewById(R.id.textView33);
        btn_cancel = (Button)findViewById(R.id.button44);
        btn_pause = (Button)findViewById(R.id.button27);
        btn_resume= (Button)findViewById(R.id.button28);

        btn_start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    countDownTimer.cancel();
                }catch (Exception e){

                }
                totaltime = 20 * 60 * 1000;
                btn_resume.setEnabled(false);
                btn_pause.setEnabled(true);
                btn_start.setEnabled(false);
                btn_cancel.setEnabled(true);

                fn_countdown(totaltime);
            }
        });
        btn_cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                countDownTimer.cancel();
                btn_resume.setEnabled(false);
                btn_pause.setEnabled(false);
                btn_start.setEnabled(true);
                btn_cancel.setEnabled(false);
            }
        });

        btn_pause.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                try{
                    countDownTimer.cancel();
                }catch (Exception e){

                }
                btn_resume.setEnabled(true);
                btn_pause.setEnabled(false);
                btn_start.setEnabled(false);
                btn_cancel.setEnabled(false);
                countDownTimer.cancel();
                totaltime = onpause;
//                onpause = totaltime
            }
        });


        btn_resume.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                try{
                    countDownTimer.cancel();
                }catch (Exception e){

                }
                fn_countdown(totaltime);

                btn_resume.setEnabled(false);
                btn_pause.setEnabled(true);
                btn_start.setEnabled(true);
                btn_cancel.setEnabled(true);
//                onpause = totaltime
            }
        });


    }

    private void fn_countdown(long time){
        countDownTimer = new CountDownTimer(time, sec) {
            @Override
            public void onTick(long millisUntilFinished) {

                onpause = millisUntilFinished;
                int seconds = (int) (millisUntilFinished / 1000) % 60;
                int minutes = (int) ((millisUntilFinished / (1000 * 60)) % 60);
                int hours = (int) ((millisUntilFinished / (1000 * 60 * 60)) % 24);
                String newtime = hours + ":" + minutes + ":" + seconds;

                if (newtime.equals("0:0:0")) {
                    tv_time.setText("00:00:00");
                } else if ((String.valueOf(hours).length() == 1) && (String.valueOf(minutes).length() == 1) && (String.valueOf(seconds).length() == 1)) {
                    tv_time.setText("0" + hours + ":0" + minutes + ":0" + seconds);
                } else if ((String.valueOf(hours).length() == 1) && (String.valueOf(minutes).length() == 1)) {
                    tv_time.setText("0" + hours + ":0" + minutes + ":" + seconds);
                } else if ((String.valueOf(hours).length() == 1) && (String.valueOf(seconds).length() == 1)) {
                    tv_time.setText("0" + hours + ":" + minutes + ":0" + seconds);
                } else if ((String.valueOf(minutes).length() == 1) && (String.valueOf(seconds).length() == 1)) {
                    tv_time.setText(hours + ":0" + minutes + ":0" + seconds);
                } else if (String.valueOf(hours).length() == 1) {
                    tv_time.setText("0" + hours + ":" + minutes + ":" + seconds);
                } else if (String.valueOf(minutes).length() == 1) {
                    tv_time.setText(hours + ":0" + minutes + ":" + seconds);
                } else if (String.valueOf(seconds).length() == 1) {
                    tv_time.setText(hours + ":" + minutes + ":0" + seconds);
                } else {
                    tv_time.setText(hours + ":" + minutes + ":" + seconds);
                }


            }

            @Override
            public void onFinish() {
                tv_time.setText(00 + ":" + 00 + ":" + 00);
            }
        }.start();
    }

    }

