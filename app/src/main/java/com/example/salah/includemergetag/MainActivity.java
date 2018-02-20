package com.example.salah.includemergetag;

import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button button, bbotton1;
    ImageView iimageView, iimageView1;

    @RequiresApi(api = Build.VERSION_CODES.N)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );
        button = (Button)findViewById( R.id.button );
        bbotton1 = (Button)findViewById( R.id.button1 );
        iimageView =(ImageView)findViewById( R.id.iimageView );
        iimageView1= (ImageView) findViewById(R.id.iimageView1);


        button.setOnClickListener( new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.N)
            @Override
            public void onClick(View view) {


                Toast.makeText( getApplication(), "click on includ button for belize flag", Toast.LENGTH_LONG ).show();

            }
        } );

        bbotton1.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText( getApplication(), "click on inclde button for england flag", Toast.LENGTH_LONG ).show();
            }
        } );

    }
}
