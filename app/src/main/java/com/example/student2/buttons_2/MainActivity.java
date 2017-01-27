package com.example.student2.buttons_2;

import android.content.res.AssetManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.LinkedList;

public class MainActivity extends AppCompatActivity {
    static AssetManager assetManager;
    Scene curr;
    Player player;
    LinkedList<Scene> scenes = new LinkedList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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
        scenes.remove(0);
    }

}
