package br.edu.ifpr.stiehl.minhaappteste;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private EditText txtLogin;
    private EditText txtSenha;
    private Button btLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        TextView info = findViewById(R.id.info);
//        info.setText("Modificado pelo Java");
//
//        Log.e("TADS18", "Olha nóis aqui!");

        txtLogin = findViewById(R.id.txtLogin);
        txtSenha = findViewById(R.id.txtSenha);
        btLogin = findViewById(R.id.btLogin);

//        Log.d("LOGIN", validaLogin("aluno", "12") + "");
//        Log.d("LOGIN", validaLogin("aluno", "123") + "");
//        Log.d("LOGIN", validaLogin("diego", "123") + "");

        btLogin.setOnClickListener(this);
    }

    private boolean validaLogin(String login, String senha) {
        return login.equals("aluno") && senha.equals("123");
    }

    @Override
    public void onClick(View view) {
        String login = txtLogin.getText().toString();
        String senha = txtSenha.getText().toString();
        boolean loginValido = validaLogin(login, senha);
        String mensagem = "Login " + (loginValido ? "VÁLIDO" : "INVÁLIDO");
        Toast.makeText(this, mensagem, Toast.LENGTH_SHORT).show();
    }
}
