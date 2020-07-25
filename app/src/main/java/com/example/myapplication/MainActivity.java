package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.myapplication.Compiler.DataToEnumsConverter;
import com.example.myapplication.Compiler.QREnums;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    private String step1_result_code =  "T_L,NaN,NaN,NaN,NaN,NaN,"  +
            "T_R,NaN,NaN,NaN,NaN,NaN,"  +
            "T_U,NaN,NaN,NaN,NaN,NaN,"  +
            "G_FW,NaN,NaN,NaN,NaN,NaN," +
            "G_BK,NaN,NaN,NaN,NaN,NaN," +
            "F_U,NaN,NaN,NaN,NaN,NaN,"  +
            "F_D,NaN,NaN,NaN,NaN,NaN,"  +
            "NaN,NaN,NaN,NaN,NaN,NaN";

    private Button[][]  table_buttons;
    private Button update_button;
    private Button done_button;

    public ArrayList<QREnums> getQrEnumsFromString(String input){
        DataToEnumsConverter StreamToEnums = new DataToEnumsConverter();
        ArrayList<QREnums> arr = StreamToEnums.getQrEnumsFromStrAsArray(input);
        return arr;
    }

    public void updateButtonClickedFunction(View view){
        EditText qr_cards_string_var = findViewById(R.id.qrCardsString);
        Log.i("Info","Button Pressed!");
        Log.i("EditText contains: ",qr_cards_string_var.getText().toString());

        qr_cards_string_var.setText(step1_result_code);
        Log.i("EditText contains: ",qr_cards_string_var.getText().toString());

        ArrayList<QREnums> arr_from_string = getQrEnumsFromString(qr_cards_string_var.getText().toString());
//        Log.i("arr[7] contains: ",arr.get(6).toString());

//        arr.set(6,QREnums.CMD_STOP);
//        Log.i("arr[7] contains: ",arr.get(6).toString());

        //EditText qr_cards_string_var = findViewById(R.id.qrCardsString);

        //update text in button

        this.table_buttons[0][0].setText("00");


    }

    protected void setListenersForTableButtons(){
        // --- Row 0
        this.table_buttons[0][0].setOnClickListener(this);
        this.table_buttons[0][1].setOnClickListener(this);
        this.table_buttons[0][2].setOnClickListener(this);
        this.table_buttons[0][3].setOnClickListener(this);
        this.table_buttons[0][4].setOnClickListener(this);
        this.table_buttons[0][5].setOnClickListener(this);

        // --- Row 1
        this.table_buttons[1][0].setOnClickListener(this);
        this.table_buttons[1][1].setOnClickListener(this);
        this.table_buttons[1][2].setOnClickListener(this);
        this.table_buttons[1][3].setOnClickListener(this);
        this.table_buttons[1][4].setOnClickListener(this);
        this.table_buttons[1][5].setOnClickListener(this);

        // --- Row 2
        this.table_buttons[2][0].setOnClickListener(this);
        this.table_buttons[2][1].setOnClickListener(this);
        this.table_buttons[2][2].setOnClickListener(this);
        this.table_buttons[2][3].setOnClickListener(this);
        this.table_buttons[2][4].setOnClickListener(this);
        this.table_buttons[2][5].setOnClickListener(this);

        // --- Row 3
        this.table_buttons[3][0].setOnClickListener(this);
        this.table_buttons[3][1].setOnClickListener(this);
        this.table_buttons[3][2].setOnClickListener(this);
        this.table_buttons[3][3].setOnClickListener(this);
        this.table_buttons[3][4].setOnClickListener(this);
        this.table_buttons[3][5].setOnClickListener(this);

        // --- Row 4
        this.table_buttons[4][0].setOnClickListener(this);
        this.table_buttons[4][1].setOnClickListener(this);
        this.table_buttons[4][2].setOnClickListener(this);
        this.table_buttons[4][3].setOnClickListener(this);
        this.table_buttons[4][4].setOnClickListener(this);
        this.table_buttons[4][5].setOnClickListener(this);


        // --- Row 5
        this.table_buttons[5][0].setOnClickListener(this);
        this.table_buttons[5][1].setOnClickListener(this);
        this.table_buttons[5][2].setOnClickListener(this);
        this.table_buttons[5][3].setOnClickListener(this);
        this.table_buttons[5][4].setOnClickListener(this);
        this.table_buttons[5][5].setOnClickListener(this);

        // --- Row 6
        this.table_buttons[6][0].setOnClickListener(this);
        this.table_buttons[6][1].setOnClickListener(this);
        this.table_buttons[6][2].setOnClickListener(this);
        this.table_buttons[6][3].setOnClickListener(this);
        this.table_buttons[6][4].setOnClickListener(this);
        this.table_buttons[6][5].setOnClickListener(this);

        // --- Row 7
        this.table_buttons[7][0].setOnClickListener(this);
        this.table_buttons[7][1].setOnClickListener(this);
        this.table_buttons[7][2].setOnClickListener(this);
        this.table_buttons[7][3].setOnClickListener(this);
        this.table_buttons[7][4].setOnClickListener(this);
        this.table_buttons[7][5].setOnClickListener(this);

    }

    protected void setIdForTableButtons(){

        // --- Row 0
        this.table_buttons[0][0] =  findViewById(R.id.button00);
        this.table_buttons[0][1] =  findViewById(R.id.button01);
        this.table_buttons[0][2] =  findViewById(R.id.button02);
        this.table_buttons[0][3] =  findViewById(R.id.button03);
        this.table_buttons[0][4] =  findViewById(R.id.button04);
        this.table_buttons[0][5] =  findViewById(R.id.button05);

        // --- Row 1
        this.table_buttons[1][0] =  findViewById(R.id.button10);
        this.table_buttons[1][1] =  findViewById(R.id.button11);
        this.table_buttons[1][2] =  findViewById(R.id.button12);
        this.table_buttons[1][3] =  findViewById(R.id.button13);
        this.table_buttons[1][4] =  findViewById(R.id.button14);
        this.table_buttons[1][5] =  findViewById(R.id.button15);

        // --- Row 2
        this.table_buttons[2][0] =  findViewById(R.id.button20);
        this.table_buttons[2][1] =  findViewById(R.id.button21);
        this.table_buttons[2][2] =  findViewById(R.id.button22);
        this.table_buttons[2][3] =  findViewById(R.id.button23);
        this.table_buttons[2][4] =  findViewById(R.id.button24);
        this.table_buttons[2][5] =  findViewById(R.id.button25);

        // --- Row 3
        this.table_buttons[3][0] =  findViewById(R.id.button30);
        this.table_buttons[3][1] =  findViewById(R.id.button31);
        this.table_buttons[3][2] =  findViewById(R.id.button32);
        this.table_buttons[3][3] =  findViewById(R.id.button33);
        this.table_buttons[3][4] =  findViewById(R.id.button34);
        this.table_buttons[3][5] =  findViewById(R.id.button35);

        // --- Row 4
        this.table_buttons[4][0] =  findViewById(R.id.button40);
        this.table_buttons[4][1] =  findViewById(R.id.button41);
        this.table_buttons[4][2] =  findViewById(R.id.button42);
        this.table_buttons[4][3] =  findViewById(R.id.button43);
        this.table_buttons[4][4] =  findViewById(R.id.button44);
        this.table_buttons[4][5] =  findViewById(R.id.button45);


        // --- Row 5
        this.table_buttons[5][0] =  findViewById(R.id.button50);
        this.table_buttons[5][1] =  findViewById(R.id.button51);
        this.table_buttons[5][2] =  findViewById(R.id.button52);
        this.table_buttons[5][3] =  findViewById(R.id.button53);
        this.table_buttons[5][4] =  findViewById(R.id.button54);
        this.table_buttons[5][5] =  findViewById(R.id.button55);

        // --- Row 6
        this.table_buttons[6][0] =  findViewById(R.id.button60);
        this.table_buttons[6][1] =  findViewById(R.id.button61);
        this.table_buttons[6][2] =  findViewById(R.id.button62);
        this.table_buttons[6][3] =  findViewById(R.id.button63);
        this.table_buttons[6][4] =  findViewById(R.id.button64);
        this.table_buttons[6][5] =  findViewById(R.id.button65);

        // --- Row 7
        this.table_buttons[7][0] =  findViewById(R.id.button70);
        this.table_buttons[7][1] =  findViewById(R.id.button71);
        this.table_buttons[7][2] =  findViewById(R.id.button72);
        this.table_buttons[7][3] =  findViewById(R.id.button73);
        this.table_buttons[7][4] =  findViewById(R.id.button74);
        this.table_buttons[7][5] =  findViewById(R.id.button75);

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.update_button = findViewById(R.id.update_button);
        this.done_button = findViewById(R.id.done_button);
        this.table_buttons = new Button[8][6];
        setIdForTableButtons();

        this.update_button.setOnClickListener(this);
        this.done_button.setOnClickListener(this);
        setListenersForTableButtons();

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {

            case R.id.update_button:
                Toast.makeText(this, "Button update clicked", Toast.LENGTH_SHORT).show();
                updateButtonClickedFunction(v);
                break;
            case R.id.done_button:
                Toast.makeText(this, "Button done clicked", Toast.LENGTH_SHORT).show();
                break;
            default:
                Toast.makeText(this, "Button table was clicked", Toast.LENGTH_SHORT).show();
                break;
//            case R.id.button1:
//                Toast.makeText(this, "Button 1 clicked", Toast.LENGTH_SHORT).show();
//                break;
//            case R.id.button2:
//                Toast.makeText(this, "Button 2 clicked", Toast.LENGTH_SHORT).show();
//                break;
//            case R.id.button3:
//                Toast.makeText(this, "Button 3 clicked", Toast.LENGTH_SHORT).show();
//                break;
//            case R.id.button4:
//                Toast.makeText(this, "Button 4 clicked", Toast.LENGTH_SHORT).show();
//                break;
//            case R.id.button5:
//                Toast.makeText(this, "Button 5 clicked", Toast.LENGTH_SHORT).show();
//                break;
        }
    }


}
