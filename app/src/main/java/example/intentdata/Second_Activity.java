package example.intentdata;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Second_Activity extends AppCompatActivity {


    TextView userNameTxt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        userNameTxt = (TextView) findViewById(R.id.user_name_id);

        String name = getIntent().getStringExtra("nameKey");

        String password = getIntent().getStringExtra("passwordkey");

        userNameTxt.setText(name);
    }
}
