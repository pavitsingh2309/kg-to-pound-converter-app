package org.pavitsingh.unitconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText editText;
    Button convertBtn;
    TextView answer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        answer = findViewById(R.id.answer);
        convertBtn = findViewById(R.id.convertBtn);
        editText = findViewById(R.id.edt);

        convertBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String edit = editText.getText().toString();
                float editNum = Float.parseFloat(edit);
                float onePound = 2.205f;
                float ans = editNum * onePound;
                String str = String.valueOf(ans);
                answer.setText("Answer in pounds is : " + str);
            }
        });
    }
}