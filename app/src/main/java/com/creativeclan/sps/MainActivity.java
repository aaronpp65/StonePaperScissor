package com.creativeclan.sps;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    String mymov,compmov;
    int mescore=0,compscore=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void score (String me,String comp){
        TextView mes=(TextView)findViewById(R.id.me);
        TextView comps=(TextView)findViewById(R.id.comp);



        if(me==comp){
            Toast.makeText(MainActivity.this,"Draw",Toast.LENGTH_SHORT).show();

        }
        else if(me.equals("stone") && comp.equals("scissor")) {
            Toast.makeText(MainActivity.this, "You win", Toast.LENGTH_LONG).show();
            mescore++;
            String scorem=Integer.toString(mescore);
            mes.setText(scorem);
        }

        else if(me.equals("stone") && comp.equals("paper")) {
            Toast.makeText(MainActivity.this, "comp win", Toast.LENGTH_LONG).show();
            compscore++;
            String scorec=Integer.toString(compscore);
            comps.setText(scorec);

        }

        else if(me.equals("scissor") && comp.equals("stone")) {
            Toast.makeText(MainActivity.this, "comp win", Toast.LENGTH_LONG).show();
            compscore++;
            String scorec=Integer.toString(compscore);
            comps.setText(scorec);

        }

        else if(me.equals("paper") && comp.equals("stone")){
            Toast.makeText(MainActivity.this,"You win",Toast.LENGTH_LONG).show();
            mescore++;
            String scorem=Integer.toString(mescore);
            mes.setText(scorem);
        }

        else if(me.equals("paper") && comp.equals("scissor")) {
            Toast.makeText(MainActivity.this, "comp win", Toast.LENGTH_LONG).show();
            compscore++;
            String scorec=Integer.toString(compscore);
            comps.setText(compscore);

        }

        else if(me.equals("scissor") && comp.equals("paper")) {
            Toast.makeText(MainActivity.this, "You win", Toast.LENGTH_LONG).show();
            mescore++;
            String scorem=Integer.toString(mescore);
            mes.setText(scorem);
        }


    }

    public  void stone(View view)
    {
        mymov= "stone";
        compmov=compmov();
        score(mymov,compmov);

    }

    public  void paper(View view)
    {
        mymov= "stone";
        compmov=compmov();
        score(mymov,compmov);
    }

    public  void scissor(View view)
    {
        mymov= "scissor";
        compmov=compmov();
        score(mymov,compmov);
    }

    public  String compmov(){
        double val = Math.random();
        if(val<0.33)
            return "stone";
        else if(val<0.66)
            return "paper";

        return "scissor";
    }
}
