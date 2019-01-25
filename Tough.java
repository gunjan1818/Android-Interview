package com.android_interview.gunjanagarwal.androidinterview;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Tough extends Activity implements View.OnClickListener{
    String t_q[],t_a[];
    int index;
    TextView tvq,tva,tv_yy,tv_xx;
    Button bleft,bshow,bright;
    @SuppressLint("ResourceType")
    protected void onCreate(Bundle savedInstanceState) {
        setContentView(R.layout.questions);
        super.onCreate(savedInstanceState);
        t_q = getResources().getStringArray(R.array.tough_ques);
        t_a = getResources().getStringArray(R.array.tough_ans);

        tvq = (TextView)findViewById(R.id.tvq);
        tva = (TextView)findViewById(R.id.tva);

        bleft = (Button)findViewById(R.id.bleft);
        bshow = (Button)findViewById(R.id.banswer);
        bright = (Button)findViewById(R.id.bright);

        bleft.setOnClickListener(this);
        bshow.setOnClickListener(this);
        bright.setOnClickListener(this);

        tv_yy = (TextView)findViewById(R.id.tvYY);
        tv_xx = (TextView)findViewById(R.id.tvXX);

        index= 0; //setting to our values to number xx/yy

        tvq.setText(t_q[index]);
        tva.setText("Press ANSWER for the answer");

        tv_xx.setText(String.valueOf(index+1));
        tv_yy.setText("/"+String.valueOf(t_q.length));

    }

    public void onClick(View v) {
        switch(v.getId()){
            case R.id.bleft:
                tva.setText("Press ANSWER for the answer");
                index--;
                if(index == -1){
                    index = t_q.length - 1;
                    tvq.setText(t_q[index]);
                    tv_xx.setText(String.valueOf(index+1));
                }
                else {
                    tvq.setText(t_q[index]);
                    tv_xx.setText(String.valueOf(index + 1));
                }
                break;
            case R.id.banswer:
                tva.setText(t_a[index]);

                break;
            case R.id.bright:
                tva.setText("Press ANSWER for the answer");
                index++;
                if(index == t_q.length){
                    index = 0;
                    tvq.setText(t_q[index]);
                    tv_xx.setText(String.valueOf(index+1));
                }else {

                    tvq.setText(t_q[index]);
                    tv_xx.setText(String.valueOf(index + 1));
                    break;
                }
        }

    }
}

