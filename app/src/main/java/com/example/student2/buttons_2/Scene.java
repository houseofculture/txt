package com.example.student2.buttons_2;

import android.content.res.AssetManager;
import android.widget.TextView;

import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;
import java.util.LinkedList;

/**
 * Created by student2 on 27.01.17.
 */
public class Scene {
    BufferedReader reader;
    public LinkedList<String> text = new LinkedList<>();
    public LinkedList<String> vars = new LinkedList<>();
    public Scene(String f1,String f2)
    {
        String m;
        try {
            reader = new BufferedReader(
                    new InputStreamReader(MainActivity.assetManager.open(f1)));
            while((m=reader.readLine())!=null)
            {
                text.add(m);
            }
        }
        catch (Exception e)
        {

        }
        finally
        {
            try {
                reader = new BufferedReader(new InputStreamReader(MainActivity.assetManager.open(f2)));
                while((m=reader.readLine()) !=null)
                {
                    vars.add(m);
                }

            }
            catch(Exception e)
            {

            }
        }
    }
    public void out(TextView tw)
    {
        String txt = tw.getText()+"\n";
        for(String s:text)
        {
            txt+=s+"\n";
        }
        tw.setText(txt);
    }
}
