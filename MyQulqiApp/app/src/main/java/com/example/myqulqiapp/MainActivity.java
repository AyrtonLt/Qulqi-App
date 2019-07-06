package com.example.myqulqiapp;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.Manifest;
import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Ingresar(View view) {
        Intent ingresar = new Intent(this, navigation_activity.class);
        startActivity(ingresar);
        finish();
    }

    public void Llamar(View view) {
        startActivity(new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel","0515364769",null)));
    }

    public void Ubicar(View view){
        Intent ubicar = new Intent(MainActivity.this, MapsActivity.class);
        startActivity(ubicar);
    }

    public void Crear_Usuario(View view){
        Intent crear_usuario = new Intent(MainActivity.this, CrearUsuarioActivity.class);
        startActivity(crear_usuario);
    }

}
