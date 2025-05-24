package com.example.utsfriska;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;

public class LoginActivity extends AppCompatActivity {

    private TextInputEditText editEmail, editPassword;
    private MaterialButton buttonLogin;
    private TextView textRegister;
    private DatabaseHelper dbHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_login);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        dbHelper = new DatabaseHelper(this);

        editEmail = findViewById(R.id.editTextEmail);
        editPassword = findViewById(R.id.editTextPassword);
        buttonLogin = findViewById(R.id.buttonLogin);
        textRegister = findViewById(R.id.textRegister);

        textRegister.setOnClickListener(v -> {
            startActivity(new Intent(LoginActivity.this, RegisterActivity.class));
        });

        buttonLogin.setOnClickListener(v -> {
            String email = editEmail.getText().toString().trim();
            String password = editPassword.getText().toString();

            if (email.isEmpty() || password.isEmpty()) {
                Toast.makeText(this, "Field tidak boleh kosong", Toast.LENGTH_SHORT).show();
                return;
            }

            String username = dbHelper.loginUser(email, password);
            if (username != null) {
                Intent intent = new Intent(LoginActivity.this, MainActivity.class);
                intent.putExtra("USERNAME", username);
                startActivity(intent);
                finish();
            } else {
                Toast.makeText(this, "Email atau password salah", Toast.LENGTH_SHORT).show();
            }
        });
    }
}