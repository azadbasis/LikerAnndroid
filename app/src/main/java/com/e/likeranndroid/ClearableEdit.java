package com.e.likeranndroid;

import android.annotation.SuppressLint;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class ClearableEdit extends AppCompatActivity  {

    @SuppressLint("SetTextI18n")
    @Override protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.clearable_edit);

        final TextInputLayout textInputLayout = findViewById(R.id.text_input_layout);
        final ClearableEditText editText = findViewById(R.id.edit_text);
        final Button button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (editText.getText().toString().equals(""))
                    textInputLayout.setError("You need to enter a name");
                else
                    textInputLayout.setError(null);
            }
        });

        editText.setDrawableClickListener(new ClearableEditText.DrawableClickListener() {
            @Override
            public void onClick() {
                editText.setText(null);
            }
        });
    }
}