package com.geekbrains.androidlevel1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    private ToggleButton toggleButton;
    private CheckBox checkBox;
    private Switch aSwitch;
    private EditText editTextNumber;
    private Button button;
    private TextView textView2;
    private Button buttonRegistration;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // запускаем основное окно
        setContentView(R.layout.activity_main);
        // элементы управления
        toggleButton = findViewById(R.id.toggleButton);
        checkBox = findViewById(R.id.checkBox);
        editTextNumber = findViewById(R.id.editTextNumber);
        button = findViewById(R.id.registration);
        textView2 = findViewById(R.id.textView2);
        buttonRegistration = findViewById(R.id.registration);

        // нажатие на кнопку
        toggleButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                boolean on = toggleButton.isEnabled();
                System.out.println(toggleButton.isEnabled());
                checkBox.setChecked(on);
            }
        });
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView2.setText(editTextNumber.getText());
            }
        });
        // откроем форму регистрации (2 часть ДЗ)
        buttonRegistration.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setContentView(R.layout.lesson1_2);
            }
        });

    }
}