package example.intentdata;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // creating edittext box

    private EditText userNameEt , passwordEt ;
    private TextView loginText ;

    @Override
    protected void onCreate(Bundle savedInstanceState)

    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        userNameEt = (EditText) findViewById(R.id.userName_et);

        // finding view of edittext password by find view

        passwordEt = (EditText) findViewById(R.id.password_et);

        loginText = (TextView) findViewById(R.id.login_text);

        // creating click listener

        View.OnClickListener onBtnClick = new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                String userName = userNameEt.getText().toString();

                // getting values from edit text
                String password = passwordEt.getText().toString();

                if(userName.equals("GURLAL") && password.equals("12345678"))
                {
                    Intent i = new Intent(MainActivity.this , Second_Activity.class);

                    i.putExtra("nameKey",userName);
                    i.putExtra("passwordkey",password);


                    startActivity(i);
                }

            }
        };

        // setting on click listener

        loginText.setOnClickListener(onBtnClick);


    }
}
