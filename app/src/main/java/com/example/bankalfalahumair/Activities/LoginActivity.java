package com.example.bankalfalahumair.Activities;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.biometric.BiometricManager;
import androidx.biometric.BiometricPrompt;
import androidx.core.content.ContextCompat;

import com.example.bankalfalahumair.R;

import java.util.concurrent.Executor;

public class LoginActivity extends AppCompatActivity {


    EditText etName, etPass;

    RelativeLayout LoginBtn;




    private TextView fingerprintTV, forgotPasswordTV;

    TextView msgtex;

    Button loginbutton;

    LinearLayout contactusLL;

    // create a CancellationSignal
    // variable and assign a
    // value null to it
    private CancellationSignal cancellationSignal = null;





    // create an authenticationCallback
    private BiometricPrompt.AuthenticationCallback authenticationCallback;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


        initViews();
        onClickListners();


        biometricLogin();

    }

    private void biometricLogin() {

        BiometricManager biometricManager = androidx.biometric.BiometricManager.from(this);
        switch (biometricManager.canAuthenticate()) {

            // this means we can use biometric sensor
            case BiometricManager.BIOMETRIC_SUCCESS:
                msgtex.setTextColor(Color.parseColor("#424242"));
                break;

            // this means that the device doesn't have fingerprint sensor
            case BiometricManager.BIOMETRIC_ERROR_NO_HARDWARE:
                msgtex.setText("This device doesnot have a fingerprint sensor");
                loginbutton.setVisibility(View.GONE);
                break;

            // this means that biometric sensor is not available
            case BiometricManager.BIOMETRIC_ERROR_HW_UNAVAILABLE:
                msgtex.setText("The biometric sensor is currently unavailable");
                loginbutton.setVisibility(View.GONE);
                break;

            // this means that the device doesn't contain your fingerprint
            case BiometricManager.BIOMETRIC_ERROR_NONE_ENROLLED:
                msgtex.setText("Your device doesn't have fingerprint saved,please check your security settings");
                loginbutton.setVisibility(View.GONE);
                break;
        }
        // creating a variable for our Executor
        Executor executor = ContextCompat.getMainExecutor(this);
        // this will give us result of AUTHENTICATION
        final BiometricPrompt biometricPrompt = new BiometricPrompt(this, executor,
                new BiometricPrompt.AuthenticationCallback() {
            @Override
            public void onAuthenticationError(int errorCode, @NonNull CharSequence errString) {
                super.onAuthenticationError(errorCode, errString);
            }

            // THIS METHOD IS CALLED WHEN AUTHENTICATION IS SUCCESS
            @Override
            public void onAuthenticationSucceeded(@NonNull BiometricPrompt.AuthenticationResult result) {
                super.onAuthenticationSucceeded(result);
                Toast.makeText(getApplicationContext(), "Login Success", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(LoginActivity.this,SecondLevelActivity.class));

            }
            @Override
            public void onAuthenticationFailed() {
                super.onAuthenticationFailed();
            }
        });
        // creating a variable for our promptInfo
        // BIOMETRIC DIALOG


        final BiometricPrompt.PromptInfo promptInfo = new BiometricPrompt.PromptInfo.Builder().setTitle("Alfalah Login")
                .setDescription("Use your fingerprint to login ").setNegativeButtonText("Cancel").build();


        loginbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                biometricPrompt.authenticate(promptInfo);

            }
        });
    }

    private void initViews() {


        LoginBtn = findViewById(R.id.LoginBtn);

        fingerprintTV = findViewById(R.id.fingerprintTV);
        forgotPasswordTV = findViewById(R.id.forgotPasswordTV);

        etName = findViewById(R.id.etName);
        etPass = findViewById(R.id.etPass);
        msgtex = findViewById(R.id.msgtext);
        loginbutton = findViewById(R.id.login);
        contactusLL = findViewById(R.id.contactusLL);

    }

    private void onClickListners() {
        LoginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), SecondLevelActivity.class);
                startActivity(intent);

            }
        });

        contactusLL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(LoginActivity.this, SignupActivity.class));
            }
        });
    }
}