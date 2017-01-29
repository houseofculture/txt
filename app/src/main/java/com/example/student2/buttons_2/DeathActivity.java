package com.example.student2.buttons_2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DeathActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_death);
        TextView tv = (TextView)findViewById(R.id.tw);
        tv.setText(tv.getText()+"\n"+"Ваши результаты:\nHP:"+MainActivity.player.hp+"\nDMG:"+MainActivity.player.dmg);
    }
}
