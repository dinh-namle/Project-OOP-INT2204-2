package com.oop.iotapp;

import static android.content.ContentValues.TAG;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.EditText;
import android.widget.RadioButton;

import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.radiobutton.MaterialRadioButton;
import com.google.android.material.slider.Slider;

public class TemperatureActivity extends AppCompatActivity {

    private TemperatureData temperatureData;

    private MaterialRadioButton rb_mode_on, rb_mode_off, rb_eco_on, rb_eco_off, rb_timer_on, rb_timer_off;
    private Slider sl_fanSpeed, sl_temperature;
    private MaterialCardView cv_back;
    private MaterialButton bt_start;
    private EditText et_timer_start, et_timer_stop;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_temperature);

        initViews();

    }

    private void initViews() {

        rb_mode_on = findViewById(R.id.radiobutton_status_on);
        rb_mode_off = findViewById(R.id.radiobutton_status_off);
        rb_eco_on = findViewById(R.id.radiobutton_eco_on);
        rb_eco_off = findViewById(R.id.radiobutton_eco_off);
        rb_timer_on = findViewById(R.id.radiobutton_timer_on);
        rb_timer_off = findViewById(R.id.radiobutton_timer_off);

        sl_temperature = findViewById(R.id.slider_temperature_temp);
        sl_fanSpeed = findViewById(R.id.slider_fanSpeed_temp);

        cv_back = findViewById(R.id.cardview_back_temperature);

        et_timer_start = findViewById(R.id.edittext_timer_start);
        et_timer_stop = findViewById(R.id.edittext_timer_stop);

        bt_start = findViewById(R.id.button_start_temperature);

        Log.e(TAG, "initViews: Start");
    }
}