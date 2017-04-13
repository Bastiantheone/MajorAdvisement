package engineering.software.gsu.majoradvisement;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {
    private Button loginButton;
    private Activity activity;
    private EditText usernameBox;
    private EditText passwordBox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        activity = this;
        loginButton = (Button)findViewById(R.id.login_button);
        usernameBox = (EditText)findViewById(R.id.username_input);
        passwordBox = (EditText)findViewById(R.id.password_input);
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                GMHolder holder = DbConnect.get(activity).getGM(usernameBox.getText().toString(),passwordBox.getText().toString());
                if(holder!=null){
                    holder.initializeGM(passwordBox.getText().toString(),activity).nextQuestion().display(activity);
                }else{
                    Toast.makeText(activity,"Wrong username or password",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
