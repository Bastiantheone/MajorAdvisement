package engineering.software.gsu.majoradvisement;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

// FIXME add registration option use insertGameMaster from DbConnect to insert the new user
public class LoginActivity extends AppCompatActivity {
    private Button loginButton, register_button;
    private Activity activity;
    private EditText usernameBox;
    private EditText passwordBox;
    private ImageView aboutPic;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        activity = this;
        loginButton = (Button)findViewById(R.id.login_button);
        usernameBox = (EditText)findViewById(R.id.username_input);
        passwordBox = (EditText)findViewById(R.id.password_input);
        register_button = (Button)findViewById(R.id.register_button);
        aboutPic = (ImageView)findViewById(R.id.aboutIcon);

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //GM.initialize(activity).nextQuestion().display(activity);
               GMHolder holder = DbConnect.get(activity).getGM(usernameBox.getText().toString(),passwordBox.getText().toString());
                if(holder!=null){
                    Question q = holder.initializeGM(passwordBox.getText().toString(),activity).nextQuestion();
                    if(q!=null)
                        q.display(activity);
                    else{
                        Intent intent = new Intent(activity,ScoreActivity.class);
                        startActivity(intent);
                    }
                }else{
                    Toast.makeText(activity,"Wrong username or password",Toast.LENGTH_SHORT).show();
                }
            }
        });
        register_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(LoginActivity.this, RegisterActivity.class));
            }
        });

        aboutPic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // About page switch
                Intent intent = new Intent(LoginActivity.this, AboutScreenActivity.class);
                startActivity(intent);
            }
        });
    }

    @Override
    public void onBackPressed(){
        //do nothing
    }
}
