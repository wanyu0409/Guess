package guess.fju.com.guess;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    int secret = (int) (Math.random()*10+1);
    int min=1, max=10;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void guess(View view){
        EditText edNmuber = (EditText) findViewById(R.id.ed_Number);

        int number = Integer.parseInt(edNmuber.getText().toString());
        if(secret > number){
            min = number;
            Toast.makeText(this, "大一點,請輸入"+min+"~"+max, Toast.LENGTH_LONG).show();
        }
        if (secret < number){
            max = number;
            Toast.makeText(this, "小一點,請輸入"+min+"~"+max, Toast.LENGTH_LONG).show();
        }
        if (secret == number){
            new AlertDialog.Builder(this)
                    .setMessage("答對了")
                    .setPositiveButton("OK", null)
                    .show();
        }

    }
}
