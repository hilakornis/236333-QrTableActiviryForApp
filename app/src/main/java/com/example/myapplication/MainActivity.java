package com.example.myapplication;

import androidx.annotation.ColorInt;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
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
//    private Button update_button;
    private Button done_button;

    private ArrayList<QREnums> enums_in_table ;

    private String[] listCards;


    public ArrayList<QREnums> getQrEnumsFromString(String input){
        DataToEnumsConverter StreamToEnums = new DataToEnumsConverter();
        ArrayList<QREnums> arr = StreamToEnums.getQrEnumsFromStrAsArray(input);
        return arr;
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

    protected String enumToString (QREnums enum_val ){

        String ret = "";

        switch (enum_val) {

            case VAR_0:
                ret = "0";
                break;
            case VAR_1:
                ret = "1";
                break;
            case VAR_2:
                ret = "2";
                break;
            case VAR_3:
                ret = "3";
                break;
            case VAR_4:
                ret = "4";
                break;
            case VAR_5:
                ret = "5";
                break;
            case VAR_6:
                ret = "6";
                break;
            case VAR_7:
                ret = "7";
                break;
            case VAR_8:
                ret = "8";
                break;
            case VAR_9:
                ret = "9";
                break;
            //-----------
            case CONDITION:
                ret = "CND";
                break;
            //-----------
            case JMP_FROM_1:
                ret = "JMP_F1";
                break;
            case JMP_TO_1:
                ret = "JMP_T1";
                break;
            case JMP_FROM_2:
                ret = "JMP_F2";
                break;
            case JMP_TO_2:
                ret = "JMP_T2";
                break;
            case JMP_FROM_3:
                ret = "JMP_F3";
                break;
            case JMP_TO_3:
                ret = "JMP_T3";
                break;
            //-----------
            case CMD_TURN_LEFT :
                ret = "T_L";
                break;
            case CMD_TURN_RIGHT:
                ret = "T_R";
                break;
            case CMD_TURN_AROUND:
                ret = "T_U";
                break;
            case CMD_GO_FORWARD:
                ret = "G_FW";
                break;
            case CMD_GO_BACKWARD:
                ret = "G_BK";
                break;
            case CMD_FORKLIFT_UP:
                ret = "F_U";
                break;
            case CMD_FORKLIFT_DOWN:
                ret = "F_D";
                break;
            case CMD_STOP:
                ret = "STP";
                break;
            //-----------
            case VAR_COLOR_RED:
                ret = "CL_R";
                break;
            case VAR_COLOR_BLUE:
                ret = "CL_BL";
                break;
            case VAR_COLOR_GREEN:
                ret = "CL_G";
                break;
            case VAR_COLOR_YELLOW:
                ret = "CL_Y";
                break;
            case VAR_COLOR_WHITE:
                ret = "CL_W";
                break;
            case VAR_COLOR_BLACK:
                ret = "CL_BK";
                break;
            //-----------
            case TILE:
                ret = "TILE";
                break;
            case BOX:
                ret = "BOX";
                break;
            case FENCE:
                ret = "FN";
                break;
            default: //this is for "NaN" string
                ret = "NaN";
        }

        return ret;
    }

    protected QREnums stringToEnum (String val_str ){

        QREnums qrEnum;

        switch (val_str) {
            case "0":
                qrEnum = QREnums.VAR_0;
                break;
            case "1":
                qrEnum = QREnums.VAR_1;
                break;
            case "2":
                qrEnum = QREnums.VAR_2;
                break;
            case "3":
                qrEnum = QREnums.VAR_3;
                break;
            case "4":
                qrEnum = QREnums.VAR_4;
                break;
            case "5":
                qrEnum = QREnums.VAR_5;
                break;
            case "6":
                qrEnum = QREnums.VAR_6;
                break;
            case "7":
                qrEnum = QREnums.VAR_7;
                break;
            case "8":
                qrEnum = QREnums.VAR_8;
                break;
            case "9":
                qrEnum = QREnums.VAR_9;
                break;
            //-----------
            case "CND":
                qrEnum = QREnums.CONDITION;
                break;
            //-----------
            case "JMP_F1":
                qrEnum = QREnums.JMP_FROM_1;
                break;
            case "JMP_T1":
                qrEnum = QREnums.JMP_TO_1;
                break;
            case "JMP_F2":
                qrEnum = QREnums.JMP_FROM_2;
                break;
            case "JMP_T2":
                qrEnum = QREnums.JMP_TO_2;
                break;
            case "JMP_F3":
                qrEnum = QREnums.JMP_FROM_3;
                break;
            case "JMP_T3":
                qrEnum = QREnums.JMP_TO_3;
                break;
            //-----------
            case "T_L":
                qrEnum = QREnums.CMD_TURN_LEFT;
                break;
            case "T_R":
                qrEnum = QREnums.CMD_TURN_RIGHT;
                break;
            case "T_U":
                qrEnum = QREnums.CMD_TURN_AROUND;
                break;
            case "G_FW":
                qrEnum = QREnums.CMD_GO_FORWARD;
                break;
            case "G_BK":
                qrEnum = QREnums.CMD_GO_BACKWARD;
                break;
            case "F_U":
                qrEnum = QREnums.CMD_FORKLIFT_UP;
                break;
            case "F_D":
                qrEnum = QREnums.CMD_FORKLIFT_DOWN;
                break;
            case "STP":
                qrEnum = QREnums.CMD_STOP;
                break;
            //-----------
            case "CL_R":
                qrEnum = QREnums.VAR_COLOR_RED;
                break;
            case "CL_BL":
                qrEnum = QREnums.VAR_COLOR_BLUE;
                break;
            case "CL_G":
                qrEnum = QREnums.VAR_COLOR_GREEN;
                break;
            case "CL_Y":
                qrEnum = QREnums.VAR_COLOR_YELLOW;
                break;
            case "CL_W":
                qrEnum = QREnums.VAR_COLOR_WHITE;
                break;
            case "CL_BK":
                qrEnum = QREnums.VAR_COLOR_BLACK;
                break;
            //-----------
            case "TILE":
                qrEnum = QREnums.TILE;
                break;
            case "BOX":
                qrEnum = QREnums.BOX;
                break;
            case "FN":
                qrEnum = QREnums.FENCE;
                break;
            default: //this is for "NaN" string
                qrEnum = QREnums.NaN;
        }

        return qrEnum;
    }

    protected void setAllButtonsOfTable(ArrayList<QREnums> vals){
        QREnums qrEnums;
        String qr_str;
        for (int i = 0 ; i < 8; i++){
            for(int j = 0; j < 6 ; j++){
                qrEnums = vals.get(i*6+j);
                qr_str = enumToString(qrEnums);
                this.table_buttons[i][j].setText(qr_str);
            }
        }

    }

    protected ArrayList<QREnums> updateEnumAccordingToTable(){
        QREnums qrEnums;
        String qr_str;
        for (int i = 0 ; i < 8; i++){
            for(int j = 0; j < 6 ; j++){
                qr_str = this.table_buttons[i][j].getText().toString();
                qrEnums = stringToEnum(qr_str);
                this.enums_in_table.set(i*6+j, qrEnums);
            }
        }
        return enums_in_table;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        this.update_button = findViewById(R.id.update_button);
        this.done_button = findViewById(R.id.done_button);
        this.table_buttons = new Button[8][6];
        setIdForTableButtons();

//        this.update_button.setOnClickListener(this);
        this.done_button.setOnClickListener(this);
        setListenersForTableButtons();

        Log.i("Info","Setting the buttons according to step1_result_code variable");
        this.enums_in_table = getQrEnumsFromString(step1_result_code);
        setAllButtonsOfTable(this.enums_in_table);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.done_button:
                Toast.makeText(this, "Button done clicked", Toast.LENGTH_SHORT).show();
                updateEnumAccordingToTable();
                //todo: Alon : here I think you to take 'this.enums_in_table'
                //  -Hila
                break;
            // --- Row 0
            case R.id.button00:
                break;
            case R.id.button01:
                break;
            case R.id.button02:
                break;
            case R.id.button03:
                break;
            case R.id.button04:
                break;
            case R.id.button05:
                break;

            // --- Row 1
            case R.id.button10:
                break;
            case R.id.button11:
                break;
            case R.id.button12:
                break;
            case R.id.button13:
                break;
            case R.id.button14:
                break;
            case R.id.button15:
                break;

            // --- Row 2
            case R.id.button20:
                break;
            case R.id.button21:
                break;
            case R.id.button22:
                break;
            case R.id.button23:
                break;
            case R.id.button24:
                break;
            case R.id.button25:
                break;

            // --- Row 3
            case R.id.button30:
                break;
            case R.id.button31:
                break;
            case R.id.button32:
                break;
            case R.id.button33:
                break;
            case R.id.button34:
                break;
            case R.id.button35:
                break;

            // --- Row 4
            case R.id.button40:
                break;
            case R.id.button41:
                break;
            case R.id.button42:
                break;
            case R.id.button43:
                break;
            case R.id.button44:
                break;
            case R.id.button45:
                break;

            // --- Row 5
            case R.id.button50:
                break;
            case R.id.button51:
                break;
            case R.id.button52:
                break;
            case R.id.button53:
                break;
            case R.id.button54:
                break;
            case R.id.button55:
                break;

            // --- Row 6
            case R.id.button60:
                break;
            case R.id.button61:
                break;
            case R.id.button62:
                break;
            case R.id.button63:
                break;
            case R.id.button64:
                break;
            case R.id.button65:
                break;

            // --- Row 7
            case R.id.button70:
                break;
            case R.id.button71:
                break;
            case R.id.button72:
                break;
            case R.id.button73:
                break;
            case R.id.button74:
                break;
            case R.id.button75:
                break;
            default:
                Toast.makeText(this, "a Button was clicked", Toast.LENGTH_SHORT).show();
                break;
        }
    }


}
