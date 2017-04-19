package engineering.software.gsu.majoradvisement;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class RegisterActivity extends AppCompatActivity {

    private Button go_button;
    private EditText username_editText, password_editText;
    private Activity activity;
    String username;
    String password;
    GMHolder gmh;
    DbConnect dbc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        initGui();
        dbc = DbConnect.get(this);
        activity = this;

        //when button is clicked, it runs check on username
        go_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //if statement for the check
                boolean valid = dbc.checkUsername(username_editText.getText().toString());
                if (valid){
                    //if username isnt taken, then make username and password as what the user puts in
                    username = username_editText.getText().toString();
                    password = password_editText.getText().toString();
                    //creates a GMHolder with the username and password
                    GMHolder holder = new GMHolder(0,0,0,0,0,-1,username,password);
                    //inserts the information to the database
                    dbc.insertGameMaster(holder);

                    //start the quiz
                    GMHolder gmHolder = DbConnect.get(activity).getGM(username,password);
                    if(gmHolder!=null){
                        Question q = holder.initializeGM(password,activity).nextQuestion();
                        if(q!=null)
                            q.display(activity);
                        else{
                            Toast.makeText(activity,"Something went wrong",Toast.LENGTH_SHORT).show();
                        }
                    }else{
                        Toast.makeText(activity,"Something went wrong",Toast.LENGTH_SHORT).show();
                    }
                }
                else {
                    //displays a message if the username is taken
                    Toast.makeText(RegisterActivity.this, "This username is already taken, please enter in another username", Toast.LENGTH_LONG).show();
                }
            }
        });
    }

    public void initGui() {
        go_button = (Button) findViewById(R.id.go_button);
        username_editText = (EditText) findViewById(R.id.username_editText);
        password_editText = (EditText) findViewById(R.id.password_editText);
    }
}

