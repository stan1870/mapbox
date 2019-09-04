package fr.dexma.mapbox;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;

import com.mapbox.services.android.navigation.v5.navigation.MapboxNavigation;

public class MainActivity extends AppCompatActivity {
    Context context;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MapboxNavigation navigation = new MapboxNavigation(context, 
                "pk.eyJ1Ijoic3RhbjE4NzAiLCJhIjoiY2swNWhhbTNmMnltZDNncTk0amJoZjh2dyJ9.wpGd_qAfBv7rb7IE0RdFSA");
    }
}
