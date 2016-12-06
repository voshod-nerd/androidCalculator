package com.example.mycalc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Double operand1;
    Double operand2;
    String typeOperand;
    Double result;
    boolean operand;

    Button btnZero;
    Button btnOne;
    Button btnTwo;
    Button btnThree;
    Button btnFour;
    Button btnFive;
    Button btnSix;
    Button btnSeven;
    Button btnEigth;
    Button btnNine;
    Button btnAdd;
    Button btnMulti;
    Button btnSub;
    Button btnDiv;
    Button btnBackspace;
    EditText editTextTablo;





    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setContentView(R.layout.land_acivity_main);

        btnZero= (Button) findViewById(R.id.button_zero);
        btnOne =(Button) findViewById(R.id.button_one);
        btnTwo = (Button) findViewById(R.id.button_two);
        btnThree=(Button) findViewById(R.id.button_three);
        btnAdd = (Button) findViewById(R.id.button_add);
        btnBackspace = (Button) findViewById(R.id.button_deleteletter);
        editTextTablo = (EditText) findViewById(R.id.etNum1);
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button_zero: { if (operand) editTextTablo.setText("0"); else editTextTablo.setText(editTextTablo.getText().toString()+"0");    break;}
            case R.id.button_one: {if (operand) editTextTablo.setText("0"); else editTextTablo.setText(editTextTablo.getText().toString()+"1");  break;}
            case R.id.button_two: {if (operand) editTextTablo.setText("0"); else editTextTablo.setText(editTextTablo.getText().toString()+"2");  break;}
            case R.id.button_three: {if (operand) editTextTablo.setText("0"); else editTextTablo.setText(editTextTablo.getText().toString()+"3");  break;}
            case R.id.button_four: {if (operand) editTextTablo.setText("0"); else editTextTablo.setText(editTextTablo.getText().toString()+"4");  break;}
            case R.id.button_five: {if (operand) editTextTablo.setText("0"); else editTextTablo.setText(editTextTablo.getText().toString()+"5");  break;}
            case R.id.button_six: {if (operand) editTextTablo.setText("0"); else editTextTablo.setText(editTextTablo.getText().toString()+"6");  break;}
            case R.id.button_seven: {if (operand) editTextTablo.setText("0"); else editTextTablo.setText(editTextTablo.getText().toString()+"7");  break;}
            case R.id.button_eight: {if (operand) editTextTablo.setText("0"); else editTextTablo.setText(editTextTablo.getText().toString()+"8");  break;}
            case R.id.button_nine: {if (operand) editTextTablo.setText("0"); else editTextTablo.setText(editTextTablo.getText().toString()+"9");  break;}
            case R.id.button_equal: {
                operand2=Double.parseDouble(editTextTablo.getText().toString());
                switch (typeOperand) {
                    case "+": {  result=operand1+operand2; editTextTablo.setText(result.toString().toString()); break;}
                    case "-": {  result=operand1-operand2; editTextTablo.setText(result.toString().toString()); break;}
                    case "/":{  result=operand1/operand2; editTextTablo.setText(result.toString().toString()); break;}
                    case "*":{  result=operand1*operand2; editTextTablo.setText(result.toString().toString()); break;}
                }



                break; }
            case R.id.button_add: { operand=true; operand1=Double.parseDouble(editTextTablo.getText().toString()); editTextTablo.setText(""); typeOperand="+"; break; }
            case R.id.button_multiplication:{ operand=true; Double.parseDouble(editTextTablo.getText().toString()); editTextTablo.setText(""); typeOperand="*"; break;}
            case R.id.button_division: { operand=true; Double.parseDouble(editTextTablo.getText().toString()); editTextTablo.setText(""); typeOperand="/"; break;}
            case R.id.button_subtraction: {operand=true; Double.parseDouble(editTextTablo.getText().toString()); editTextTablo.setText(""); typeOperand="-"; break;}
            case R.id.button_deleteletter: {
                String  text= editTextTablo.getText().toString();
                text=text.substring(0,text.length()-1);
                editTextTablo.setText(text);
                break;


            }



        }

    }
}
