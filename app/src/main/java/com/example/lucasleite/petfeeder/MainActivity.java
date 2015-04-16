package com.example.lucasleite.petfeeder;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonCreateNewPet = (Button) findViewById(R.id.buttonNewPet);
        buttonCreateNewPet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.out.println("Button NewPets was clicked");
                Intent intent = new Intent();
                intent.setClass(MainActivity.this, CreatePetActivity.class);
                startActivity(intent);
                finish();
            }
        });

        Button buttonMyPets = (Button) findViewById(R.id.buttonMyPets);
        buttonMyPets.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view){
                System.out.println("Button MyPets was clicked");
                Intent intent = new Intent();
                intent.setClass(MainActivity.this, MyPetsActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
