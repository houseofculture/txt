package com.example.student2.buttons_2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class WinActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_win);
        TextView tv = (TextView)findViewById(R.id.tw2);
        tv.setText(MainActivity.end+"\n"+tv.getText()+"\n"+"Ваши результаты:\nHP:"+MainActivity.player.hp+"\nDMG:"+MainActivity.player.dmg);
    }

    public void winClick(View view) {
            Intent i = new Intent(this, startActivity.class);
            startActivity(i);
    }
}
