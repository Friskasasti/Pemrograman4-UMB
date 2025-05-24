package com.example.utsfriska;

import android.os.Bundle;
import android.util.Patterns;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;

public class RegisterActivity extends AppCompatActivity {

    private TextInputEditText editName, editEmail, editPassword;
    private MaterialButton buttonSignUp;
    private DatabaseHelper dbHelper;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_register);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        dbHelper = new DatabaseHelper(this);

        editName = findViewById(R.id.editTextName);
        editEmail = findViewById(R.id.editTextEmail);
        editPassword = findViewById(R.id.editTextPassword);
        buttonSignUp = findViewById(R.id.buttonSignUp);

        buttonSignUp.setOnClickListener(v -> {
            String name = editName.getText().toString().trim();
            String email = editEmail.getText().toString().trim();
            String password = editPassword.getText().toString();

            if (name.isEmpty() || email.isEmpty() || password.isEmpty()) {
                Toast.makeText(this, "Semua field harus diisi", Toast.LENGTH_SHORT).show();
                return;
            }

            if (!Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
                Toast.makeText(this, "Email tidak valid", Toast.LENGTH_SHORT).show();
                return;
            }

            if (password.length() < 6) {
                Toast.makeText(this, "Password minimal 6 karakter", Toast.LENGTH_SHORT).show();
                return;
            }

            boolean success = dbHelper.registerUser(name, email, password);
            if (success) {
                Toast.makeText(this, "Pendaftaran berhasil", Toast.LENGTH_SHORT).show();
                finish(); // Kembali ke Login
            } else {
                Toast.makeText(this, "Email sudah terdaftar", Toast.LENGTH_SHORT).show();
            }
        });
    }
}