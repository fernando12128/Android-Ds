package com.example.cadastro;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;


public class MainActivity extends AppCompatActivity {

    private DatabaseReference minhaReferencia = FirebaseDatabase.getInstance().getReference();

    FirebaseDatabase database = FirebaseDatabase.getInstance();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        database = FirebaseDatabase.getInstance();
        DatabaseReference myRef= database.getReference("Pessoa");

        Pessoa p = new Pessoa();
        p.setId('um');
        p.setNome("Fernando");

        myRef.child("777").setValue(p);
    }
}