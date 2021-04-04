package com.lempar_coin_anggie;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class Lempar_Coin extends Activity implements View.OnClickListener {
    private Button buttonToss;
    private Button buttonRepeat;
    private Button buttonExit;
    private Random acak;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        acak=new Random();
        setContentView(R.layout.activity_lempar_coin);
        buttonToss=(Button)findViewById(R.id.button_1);
        buttonRepeat=(Button)findViewById(R.id.button2);
        buttonExit=(Button)findViewById(R.id.button3);
        buttonToss.setOnClickListener(this);
        buttonRepeat.setOnClickListener(this);
        buttonExit.setOnClickListener(this);

    }
    @Override
    public void onClick(View view) {
    if (view==buttonToss){
        Log.d ("CLICK_EVENT"," Toss Button Clicked");
        TextView tw=(TextView)findViewById(R.id.textView_1);
        ImageView iw=(ImageView)findViewById(R.id.imageView);
       if (acak.nextDouble() < 0.5) {
           tw.setText("Kepala");
           iw.setImageResource(R.drawable.head);
       } else if{
           tw.setText("Cross");
           iw.setImageResource(R.drawable.tail);

       }
       buttonToss.setVisibility(View.VISIBLE);
       buttonRepeat.setVisibility(View.VISIBLE);
       buttonExit.setVisibility(View.VISIBLE);
    }
    else if(view==buttonRepeat){
        TextView tw=(TextView)findViewById(R.id.textView_1);
        ImageView iw=(ImageView)findViewById(R.id.imageView);
        buttonToss.setVisibility(View.VISIBLE);
        buttonRepeat.setVisibility(View.VISIBLE);
        buttonExit.setVisibility(View.INVISIBLE);
        tw.setText("");
        iw.setImageResource(R.drawable.question);
    } else  if (View==buttonExit){
        this.finish();
    }
    }



}
