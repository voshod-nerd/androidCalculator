package com.example.mycalc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Double operand1;
    Double operand2;
    String typeOperand;
    Double result;

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
    Button btnEqual;
    Button btnClear;
    TextView editTextTablo;





    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        btnZero= (Button) findViewById(R.id.button_zero);
        btnZero.setOnClickListener(this);
        btnOne =(Button) findViewById(R.id.button_one);
        btnOne.setOnClickListener(this);
        btnTwo = (Button) findViewById(R.id.button_two);
        btnTwo.setOnClickListener(this);
        btnThree=(Button) findViewById(R.id.button_three);
        btnThree.setOnClickListener(this);
        btnFour = (Button) findViewById(R.id.button_four);
        btnFour.setOnClickListener(this);
        btnFive= (Button) findViewById(R.id.button_five);
        btnFive.setOnClickListener(this);
        btnSix =(Button) findViewById(R.id.button_six);
        btnSix.setOnClickListener(this);
        btnSeven = (Button) findViewById(R.id.button_seven);
        btnSeven.setOnClickListener(this);
        btnEigth=(Button) findViewById(R.id.button_eight);
        btnEigth.setOnClickListener(this);
        btnNine = (Button) findViewById(R.id.button_nine);
        btnNine.setOnClickListener(this);

        btnAdd =(Button) findViewById(R.id.button_add);
        btnAdd.setOnClickListener(this);
        btnMulti = (Button) findViewById(R.id.button_multiplication);
        btnMulti.setOnClickListener(this);
        btnSub=(Button) findViewById(R.id.button_subtraction);
        btnSub.setOnClickListener(this);
        btnDiv = (Button) findViewById(R.id.button_division);
        btnDiv.setOnClickListener(this);

        btnBackspace = (Button) findViewById(R.id.button_deleteletter);
        btnBackspace.setOnClickListener(this);

        btnEqual = (Button) findViewById(R.id.button_equal);
        btnEqual.setOnClickListener(this);

        btnClear = (Button) findViewById(R.id.button_clear);
        btnClear.setOnClickListener(this);

        editTextTablo = (TextView) findViewById(R.id.etNum1);
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button_zero: { editTextTablo.setText(editTextTablo.getText().toString()+"0");    break;}
            case R.id.button_one: {  editTextTablo.setText(editTextTablo.getText().toString()+"1");  break;}
            case R.id.button_two: { editTextTablo.setText(editTextTablo.getText().toString()+"2");  break;}
            case R.id.button_three: { editTextTablo.setText(editTextTablo.getText().toString()+"3");  break;}
            case R.id.button_four: { editTextTablo.setText(editTextTablo.getText().toString()+"4");  break;}
            case R.id.button_five: { editTextTablo.setText(editTextTablo.getText().toString()+"5");  break;}
            case R.id.button_six: { editTextTablo.setText(editTextTablo.getText().toString()+"6");  break;}
            case R.id.button_seven: { editTextTablo.setText(editTextTablo.getText().toString()+"7");  break;}
            case R.id.button_eight: { editTextTablo.setText(editTextTablo.getText().toString()+"8");  break;}
            case R.id.button_nine: { editTextTablo.setText(editTextTablo.getText().toString()+"9");  break;}
            case R.id.button_equal: {
                operand2=Double.parseDouble(editTextTablo.getText().toString());

                switch (typeOperand) {
                    case "+": {  result=operand1+operand2; editTextTablo.setText(result.toString().toString()); break;}
                    case "-": {  result=operand1-operand2; editTextTablo.setText(result.toString().toString()); break;}
                    case "/":{  result=operand1/operand2; editTextTablo.setText(result.toString().toString()); break;}
                    case "*":{  result=operand1*operand2; editTextTablo.setText(result.toString().toString()); break;}
                    default: {editTextTablo.setText("some error"); break;}
                }
                break; }
            case R.id.button_add: {  operand1=Double.parseDouble(editTextTablo.getText().toString()); editTextTablo.setText(""); typeOperand="+"; break; }
            case R.id.button_multiplication:{  operand1=Double.parseDouble(editTextTablo.getText().toString()); editTextTablo.setText(""); typeOperand="*"; break;}
            case R.id.button_division: {  operand1=Double.parseDouble(editTextTablo.getText().toString()); editTextTablo.setText(""); typeOperand="/"; break;}
            case R.id.button_subtraction: { operand1=Double.parseDouble(editTextTablo.getText().toString()); editTextTablo.setText(""); typeOperand="-"; break;}
            case R.id.button_deleteletter: {
                String  text= editTextTablo.getText().toString();
                text=text.substring(0,text.length()-1);
                editTextTablo.setText(text);
                break;
            }
            case R.id.button_clear: {editTextTablo.setText("");  operand1=0.0; operand2=0.0; typeOperand="";   break;  }
            default: {break;}


        }

    }


    /** Метод обработки нажатия на кнопку*/

    public void sendMessage(View view) {
        // действия, совершаемые после нажатия на кнопку
        Intent intent = new Intent(this,DisplayMessageAcitvity.class);
        // Добавляем с помощью свойства putExtra объект - первый параметр - ключ,
        // второй параметр - хначение этого объекта
        //intent.putExtra(EXTRA_MESSAGE, "message");
        // запуск activity
        startActivity(intent);
    }

}

