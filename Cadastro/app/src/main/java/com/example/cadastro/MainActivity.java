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
        //(id, nome, telefone, cpf, rg, endereço, numero, bairro, complemento, estado, cidade)
        Pessoa p = new Pessoa();
        p.setId(1);
        p.setNome("FernandoA");
        p.setTelefone(11.961700836);
        p.setCpf(1234567891);
        p.setRg(222222);
        p.setEndereço("rua x");
        p.setNumero(273);
        p.setBairro("bairosinhos");
        p.setComplemento("Casa");
        p.setEstado("Sp");
        p.setCidade("SP");
        myRef.child("1").setValue(p);


        p.setId(2);
        p.setNome("FernandoB");
        p.setTelefone(11.961700836);
        p.setCpf(1234567891);
        p.setRg(222222);
        p.setEndereço("rua x");
        p.setNumero(273);
        p.setBairro("bairosinhos");
        p.setComplemento("Casa");
        p.setEstado("Sp");
        p.setCidade("SP");
        myRef.child("2").setValue(p);


        p.setId(3);
        p.setNome("FernandoC");
        p.setTelefone(11.961700836);
        p.setCpf(1234567891);
        p.setRg(222222);
        p.setEndereço("rua x");
        p.setNumero(273);
        p.setBairro("bairosinhos");
        p.setComplemento("Casa");
        p.setEstado("Sp");
        p.setCidade("SP");
        myRef.child("3").setValue(p);
    }
}