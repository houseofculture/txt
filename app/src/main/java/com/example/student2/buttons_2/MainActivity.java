package com.example.student2.buttons_2;

import android.content.Intent;
import android.content.res.AssetManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.LinkedList;

public class MainActivity extends AppCompatActivity {
    static AssetManager assetManager;
    Scene curr;
    public static Player player;
    public static String end;
    LinkedList<Scene> scenes = new LinkedList<>();
    TextView tw;
    Button b1,b2,b3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tw = (TextView)findViewById(R.id.text);
        b1 = (Button)findViewById(R.id.button1);
        b2 = (Button)findViewById(R.id.button2);
        b3 = (Button)findViewById(R.id.button3);
        assetManager = getAssets();
        player = new Player();
        scenes.add(new Scene("sceneone.txt","sceneonevar.txt"));
        scenes.add(new Scene("scene2.txt","scene2var.txt"));
        scenes.add(new Scene("scene3.txt","scene3var.txt"));
        scenes.add(new Scene("scene4.txt","scene4var.txt"));
        scenes.add(new Scene("scene5.txt","scene5var.txt"));
        scenes.add(new Scene("scene6.txt","scene6var.txt"));
        scenes.add(new Scene("scene7.txt","scene7var.txt"));
        scenes.add(new Scene("scene8.txt","scene8var.txt"));
        curr = scenes.getFirst();
        curr.out(tw);
        scenes.remove(0);
    }
    public void b1Click(View view)
    {
        tw.setText("");
        String[] vars = curr.vars.getFirst().split("/");
        if(vars[1].equals("hp"))
        {
            player.hp += Integer.parseInt(vars[2]);
        }
        if(vars[1].equals("dmg"))
        {
            player.dmg+=Integer.parseInt(vars[2]);
        }
        if(scenes.getLast()!=curr) {
            if(player.hp>0) {
                tw.setText(vars[0] + "\n" + "HP:" + player.hp + " DMG:" + player.dmg);
                curr = scenes.get(scenes.indexOf(curr) + 1);
                curr.out(tw);
            }
            else
            {
                end = vars[0];
                Intent i = new Intent(this,DeathActivity.class);
                startActivity(i);
            }
        }
        else
        {
            end = vars[0];
            Intent i = new Intent(this,WinActivity.class);
            startActivity(i);
        }
    }
    public void b2Click(View view)
    {
        tw.setText("");
        String[] vars = curr.vars.get(1).split("/");
        if(vars[1].equals("hp"))
        {
            player.hp += Integer.parseInt(vars[2]);
        }
        if(vars[1].equals("dmg"))
        {
            player.dmg+=Integer.parseInt(vars[2]);
        }
        if(scenes.getLast()!=curr) {
            if(player.hp>0) {
                tw.setText(vars[0] + "\n" + "HP:" + player.hp + " DMG:" + player.dmg);
                curr = scenes.get(scenes.indexOf(curr) + 1);
                curr.out(tw);
            }
            else
            {
                end = vars[0];
                Intent i = new Intent(this,DeathActivity.class);
                startActivity(i);
            }
        }
        else
        {
            end = vars[0];
            Intent i = new Intent(this,WinActivity.class);
            startActivity(i);
        }
    }
    public void b3Click(View view)
    {
        tw.setText("");
        String[] vars = curr.vars.getLast().split("/");
        if(vars[1].equals("hp"))
        {
            player.hp += Integer.parseInt(vars[2]);
        }
        if(vars[1].equals("dmg"))
        {
            player.dmg+=Integer.parseInt(vars[2]);
        }
        if(scenes.getLast()!=curr) {
            if(player.hp>0) {
                tw.setText(vars[0] + "\n" + "HP:" + player.hp + " DMG:" + player.dmg);
                curr = scenes.get(scenes.indexOf(curr) + 1);
                curr.out(tw);
            }
            else
            {
                end = vars[0];
                Intent i = new Intent(this,DeathActivity.class);
                startActivity(i);
            }
        }
        else
        {
            end = vars[0];
            Intent i = new Intent(this,WinActivity.class);
            startActivity(i);
        }
    }
}
