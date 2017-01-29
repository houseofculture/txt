package com.example.student2.buttons_2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class WinActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_win);
        TextView tv = (TextView)findViewById(R.id.tw2);
        tv.setText(tv.getText()+"\nВЫ ПОБЕДИЛИ"+"\n"+"Ваши результаты:\nHP:"+MainActivity.player.hp+"\nDMG:"+MainActivity.player.dmg);
    }
}
