package com.android_interview.gunjanagarwal.androidinterview;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class FrontPage extends Activity implements View.OnClickListener {
    Button bsq,btq,bsoa;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.front_page);

        bsq= (Button) findViewById(R.id.bsq);
        bsq.setOnClickListener(FrontPage.this);

        btq= (Button) findViewById(R.id.btq);
        btq.setOnClickListener(FrontPage.this);

        bsoa= (Button) findViewById(R.id.bsoa);
        bsoa.setOnClickListener(FrontPage.this);


    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.bsq:
                    //Log.d(TAG,"FIRST BUTTON CLICKED");
                Intent i = new Intent(FrontPage.this,Simple.class);
                startActivity(i);
                break;
            case R.id.btq:
                //Log.d(TAG,"FIRST BUTTON CLICKED");
                Intent j = new Intent(FrontPage.this,Tough.class);
                startActivity(j);
                break;
            case R.id.bsoa:
                Intent k = new Intent(FrontPage.this,SeeOtherApp.class);
                startActivity(k);
                //Log.d(TAG,"FIRST BUTTON CLICKED");

                break;





        }

    }
}
