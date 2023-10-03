package com.example.firebase;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;


public class MainActivity extends AppCompatActivity {


    private Button botao;
    private DatabaseReference minhaReferencia = FirebaseDatabase.getInstance().getReference();

    FirebaseDatabase database = FirebaseDatabase.getInstance();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        botao = findViewById(R.id.btn_cadastro);

        botao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent_one = new Intent(MainActivity.this, SecondActivity.class);
                        startActivity(intent_one);

            }
        });
        

//        database = FirebaseDatabase.getInstance();
//        DatabaseReference myRef= database.getReference("Pessoa");
//        //(id, nome, telefone, cpf, rg, endereço, numero, bairro, complemento, estado, cidade)
//        Pessoa p = new Pessoa();
//        p.setId(1);
//        p.setNome(nome);
//        p.setTelefone(telefone);
//        p.setCpf(1234567891);
//        p.setRg(222222);
//        p.setEndereço("rua josé pinto");
//        p.setNumero(273);
//        p.setBairro("mooca");
//        p.setComplemento("Casa");
//        p.setEstado("Sp");
//        p.setCidade("SP");
        //myRef.child(Id).setValue(p);

        //p.setId(2);
        //p.setNome("Vic");
        //p.setTelefone(11.961700836);
        //p.setCpf(1234567891);
        //p.setRg(222222);
        //p.setEndereço("rua do Corno");
        //p.setNumero(273);
        //p.setBairro("Muuu");
        //p.setComplemento("Casa");
        //p.setEstado("Sp");
        //p.setCidade("SP");
        //myRef.child("2").setValue(p);

    }
}