package com.example.casper;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class EditTextActivity extends AppCompatActivity {

    private Button button_change_language;
    private EditText edit_text_country;
    private TextView text_view_language;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_text);

        button_change_language=this.findViewById(R.id.button_change_language);
        edit_text_country=this.findViewById(R.id.edit_text_country);
        text_view_language=this.findViewById(R.id.text_view_language);


        button_change_language.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (edit_text_country.getText().toString())
                {
                    case "语言" :
                        button_change_language.setText(R.string.change_language_cn);
                        text_view_language.setText(R.string.language_cn);
                        break;

                    case "Language"  :
                        button_change_language.setText(R.string.change_language_en);
                        text_view_language.setText(R.string.language_en);
                        break;

                    case "言語"   :
                        button_change_language.setText(R.string.change_language_jp);
                        text_view_language.setText(R.string.language_jp);
                        break;

                    case "언어" :
                        button_change_language.setText(R.string.change_language_kr);
                        text_view_language.setText(R.string.language_kr);
                        break;

                    default:break;
                }

            }
        });
    }
}
