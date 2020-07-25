package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

import com.example.myapplication.Compiler.DataToEnumsConverter;
import com.example.myapplication.Compiler.QREnums;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    private String step1_result_code =  "T_L,NaN,NaN,NaN,NaN,NaN,"  +
            "T_R,NaN,NaN,NaN,NaN,NaN,"  +
            "T_U,NaN,NaN,NaN,NaN,NaN,"  +
            "G_FW,NaN,NaN,NaN,NaN,NaN," +
            "G_BK,NaN,NaN,NaN,NaN,NaN," +
            "F_U,NaN,NaN,NaN,NaN,NaN,"  +
            "F_D,NaN,NaN,NaN,NaN,NaN,"  +
            "NaN,NaN,NaN,NaN,NaN,NaN";

    public ArrayList<QREnums> getQrEnumsFromString(String input){
        DataToEnumsConverter StreamToEnums = new DataToEnumsConverter();
        ArrayList<QREnums> arr = StreamToEnums.getQrEnumsFromStrAsArray(input);
        return arr;
    }

    public void clickFunction(View view){
        EditText qr_cards_string_var = findViewById(R.id.qrCardsString);
        Log.i("Info","Button Pressed!");
        Log.i("EditText contains: ",qr_cards_string_var.getText().toString());

        qr_cards_string_var.setText(step1_result_code);
        Log.i("EditText contains: ",qr_cards_string_var.getText().toString());

        ArrayList<QREnums> arr_from_string = getQrEnumsFromString(qr_cards_string_var.getText().toString());
//        Log.i("arr[7] contains: ",arr.get(6).toString());

//        arr.set(6,QREnums.CMD_STOP);
//        Log.i("arr[7] contains: ",arr.get(6).toString());
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
