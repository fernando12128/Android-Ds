package com.example.firebase;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class CadastroActivity extends AppCompatActivity {

    TextInputEditText editTextNome, editTextTelefone, editTextCpf, editTextRg, editTextEndereco, editTextNumero, editTextBairro, editTextComplemento, editTextEstado, editTextCidade;
    Button buttonReg;

    DatabaseReference databaseReference;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cadastro);

        // Inicializar o Firebase
        databaseReference = FirebaseDatabase.getInstance().getReference("Pessoa");

        editTextNome = findViewById(R.id.signupNome);
        editTextTelefone = findViewById(R.id.signupTelefone);
        editTextCpf = findViewById(R.id.signupConfirmCpf);
        editTextRg = findViewById(R.id.signupConfirmRG);
        editTextEndereco = findViewById(R.id.signupConfirmEndereco);
        editTextNumero = findViewById(R.id.signupConfirmNumero);
        editTextBairro = findViewById(R.id.signupConfirmBairro);
        editTextComplemento = findViewById(R.id.signupConfirmComplemento);
        editTextEstado = findViewById(R.id.signupConfirmEstado);
        editTextCidade = findViewById(R.id.signupConfirmCidade);
        buttonReg = findViewById(R.id.buttonReg);

        buttonReg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Criar uma Intent para abrir a CadastroActivity
                Intent intent = new Intent(CadastroActivity.this, MainActivity.class);
                startActivity(intent); // Iniciar a atividade MainActivity
            }
        });
    }

    private void cadastrarUsuario() {
        String nome = editTextNome.getText().toString();
        String telefone = editTextTelefone.getText().toString();
        String cpf = editTextCpf.getText().toString();
        String rg = editTextRg.getText().toString();
        String endereco = editTextEndereco.getText().toString();
        String numero = editTextNumero.getText().toString();
        String bairro = editTextBairro.getText().toString();
        String complemento = editTextComplemento.getText().toString();
        String estado = editTextEstado.getText().toString();
        String cidade = editTextCidade.getText().toString();



        // Crie um ID único para o usuário (você pode usar o CPF, por exemplo, desde que seja único)
        String userId = databaseReference.push().getKey();

        if (userId != null) {
            // Crie uma instância da classe Pessoa e defina seus atributos
            Pessoa pessoa = new Pessoa();
            pessoa.setId(2);
            pessoa.setNome(nome);
            pessoa.setTelefone(String.valueOf(Double.parseDouble(telefone)));
            pessoa.setCpf(Integer.parseInt(cpf));
            pessoa.setRg(Integer.parseInt(rg));
            pessoa.setEndereço(endereco);
            pessoa.setNumero(Integer.parseInt(numero));
            pessoa.setBairro(bairro);
            pessoa.setComplemento(complemento);
            pessoa.setEstado(estado);
            pessoa.setCidade(cidade);

            // Envie os dados do usuário para o Firebase Realtime Database
            databaseReference.child(userId).setValue(pessoa);

            Toast.makeText(this, "Usuário cadastrado com sucesso!", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "Erro ao cadastrar o usuário.", Toast.LENGTH_SHORT).show();
        }
    }
}
