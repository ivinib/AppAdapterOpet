package com.example.opet.appadapteropet;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void evento_adapter(View view){
        switch (view.getId()){
            case R.id.btnAdapter1:
                //Chama a Activity AdapterSimple
                Intent novaTela = new Intent(MainActivity.this,AdapterSimplesActivity.class);
                startActivity(novaTela);

                break;
            case R.id.btnAdapter2:
                //Chama a Activity CustomAdapter
                Intent novaTela2 = new Intent(getApplicationContext(),CustomAdapterActivity.class);
                startActivity(novaTela2);
                //finish();
                break;
        }
    }
}
