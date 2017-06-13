package com.example.dhkim.mycalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView calculatorHistory = null;
    TextView calculatorSymbol = null;
    TextView calculatorNumber = null;



    Button button_1 = null;
    Button button_2 = null;
    Button button_3 = null;
    Button button_4 = null;
    Button button_5 = null;
    Button button_6 = null;
    Button button_7 = null;
    Button button_8 = null;
    Button button_9 = null;
    Button button_0 = null;

    Button button_dev = null;
    Button button_mul = null;
    Button button_plu = null;
    Button button_min = null;

    Button button_dot = null;
    Button button_equ = null;
    Button button_ac = null;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        calculatorHistory = (TextView) findViewById(R.id.calculatorHistory);
        calculatorSymbol = (TextView) findViewById(R.id.calculatorSymbol);
        calculatorNumber = (TextView) findViewById(R.id.calculatorNumber);

        calculatorHistory.setText(null);
        calculatorSymbol.setText(null);
        calculatorNumber.setText("0");
//        Button initialize
        button_ac = (Button) findViewById(R.id.button_ac);
        button_dev = (Button) findViewById(R.id.button_dev);

        button_7 = (Button) findViewById(R.id.button_7);
        button_8 = (Button) findViewById(R.id.button_8);
        button_9 = (Button) findViewById(R.id.button_9);
        button_mul = (Button) findViewById(R.id.button_mul);

        button_4 = (Button) findViewById(R.id.button_4);
        button_5 = (Button) findViewById(R.id.button_5);
        button_6 = (Button) findViewById(R.id.button_6);
        button_min = (Button) findViewById(R.id.button_min);

        button_1 = (Button) findViewById(R.id.button_1);
        button_2 = (Button) findViewById(R.id.button_2);
        button_3 = (Button) findViewById(R.id.button_3);
        button_plu = (Button) findViewById(R.id.button_plu);

        button_0 = (Button) findViewById(R.id.button_0);
        button_dot = (Button) findViewById(R.id.button_dot);
        button_equ = (Button) findViewById(R.id.button_equ);


//        Listener bridge
        button_ac.setOnClickListener(mClickListener);
        button_dev.setOnClickListener(mClickListener);

        button_7.setOnClickListener(mClickListener);
        button_8.setOnClickListener(mClickListener);
        button_9.setOnClickListener(mClickListener);
        button_mul.setOnClickListener(mClickListener);

        button_4.setOnClickListener(mClickListener);
        button_5.setOnClickListener(mClickListener);
        button_6.setOnClickListener(mClickListener);
        button_min.setOnClickListener(mClickListener);

        button_1.setOnClickListener(mClickListener);
        button_2.setOnClickListener(mClickListener);
        button_3.setOnClickListener(mClickListener);
        button_plu.setOnClickListener(mClickListener);

        button_0.setOnClickListener(mClickListener);
        button_dot.setOnClickListener(mClickListener);
        button_equ.setOnClickListener(mClickListener);
    }

    View.OnClickListener mClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            //        ac 버튼 초기화
            if(calculatorNumber.getText().toString()!=null){
                button_ac.setText("C");
            } else {
                button_ac.setText("AC");
            }
            String strValue = null;
            int intValue = 0;

            switch (v.getId()){
                case R.id.button_ac:
                    calculatorHistory.setText(null);
                    calculatorSymbol.setText(null);
                    calculatorNumber.setText("0");
                    button_ac.setText("AC");
                    break;

                case R.id.button_1:
                    if(calculatorNumber.getText()!="0"){
                        strValue = calculatorNumber.getText().toString() + "1";
                        calculatorNumber.setText(strValue);
                    } else {
                        strValue = "1";
                        calculatorNumber.setText(strValue);
                    }
                    break;
                case R.id.button_2:
                    if(calculatorNumber.getText()!="0"){
                        strValue = calculatorNumber.getText().toString() + "2";
                        calculatorNumber.setText(strValue);
                    } else {
                        strValue = "2";
                        calculatorNumber.setText(strValue);
                    }
                    break;
                case R.id.button_3:
                    if(calculatorNumber.getText()!="0"){
                        strValue = calculatorNumber.getText().toString() + "3";
                        calculatorNumber.setText(strValue);
                    } else {
                        strValue = "3";
                        calculatorNumber.setText(strValue);
                    }
                    break;
                case R.id.button_4:
                    if(calculatorNumber.getText()!="0"){
                        strValue = calculatorNumber.getText().toString() + "4";
                        calculatorNumber.setText(strValue);
                    } else {
                        strValue = "4";
                        calculatorNumber.setText(strValue);
                    }
                    break;
                case R.id.button_5:
                    if(calculatorNumber.getText()!="0"){
                        strValue = calculatorNumber.getText().toString() + "5";
                        calculatorNumber.setText(strValue);
                    } else {
                        strValue = "5";
                        calculatorNumber.setText(strValue);
                    }
                    break;
                case R.id.button_6:
                    if(calculatorNumber.getText()!="0"){
                        strValue = calculatorNumber.getText().toString() + "6";
                        calculatorNumber.setText(strValue);
                    } else {
                        strValue = "6";
                        calculatorNumber.setText(strValue);
                    }
                    break;
                case R.id.button_7:
                    if(calculatorNumber.getText()!="0"){
                        strValue = calculatorNumber.getText().toString() + "7";
                        calculatorNumber.setText(strValue);
                    } else {
                        strValue = "7";
                        calculatorNumber.setText(strValue);
                    }
                    break;
                case R.id.button_8:
                    if(calculatorNumber.getText()!="0"){
                        strValue = calculatorNumber.getText().toString() + "8";
                        calculatorNumber.setText(strValue);
                    } else {
                        strValue = "8";
                        calculatorNumber.setText(strValue);
                    }
                    break;
                case R.id.button_9:
                    if(calculatorNumber.getText()!="0"){
                        strValue = calculatorNumber.getText().toString() + "9";
                        calculatorNumber.setText(strValue);
                    } else {
                        strValue = "9";
                        calculatorNumber.setText(strValue);
                    }
                    break;
                case R.id.button_0:
                    if(calculatorNumber.getText()!="0"){
                        strValue = calculatorNumber.getText().toString() + "0";
                        calculatorNumber.setText(strValue);
                    } else {
                        strValue = "0";
                        calculatorNumber.setText(strValue);
                    }
                    break;



                case R.id.button_dev:
                    if(calculatorSymbol.getText().toString().contains("÷")){
                        break;
                    }
                    if(calculatorNumber.getText().toString()!=null){
                        strValue = calculatorNumber.getText().toString() + "÷";
                        calculatorSymbol.setText(strValue);
                        calculatorNumber.setText("0");
                    } else {
                        Toast.makeText(getApplicationContext(), "값을 입력하세요.", Toast.LENGTH_SHORT).show();
                        calculatorSymbol.setText(null);
                        calculatorNumber.setText("0");
                        button_ac.setText("AC");
                    }
                    break;
                case R.id.button_mul:
                    if(calculatorSymbol.getText().toString().contains("x")){
                        break;
                    }
                    if(calculatorNumber.getText().toString()!=null){
                        strValue = calculatorNumber.getText().toString() + "x";
                        calculatorSymbol.setText(strValue);
                        calculatorNumber.setText("0");
                    } else {
                        Toast.makeText(getApplicationContext(), "값을 입력하세요.", Toast.LENGTH_SHORT).show();
                        calculatorSymbol.setText(null);
                        calculatorNumber.setText("0");
                        button_ac.setText("AC");
                    }
                    break;
                case R.id.button_min:
                    calculatorNumber.setText("Minus Button");
                    break;
                case R.id.button_plu:
                    if(calculatorSymbol.getText().toString().equals(null)
                            &&calculatorNumber.getText().toString().equals(null)){
                        break;
                    } else if(calculatorSymbol.getText().toString()!=null
                            &&calculatorNumber.getText().toString()==null){
                        strValue = calculatorSymbol.getText().toString();

                        if((strValue.charAt(strValue.length()-1))=='+'){
                            break;
                        } else if((strValue.charAt(strValue.length()-1))=='-'
                                &&(strValue.charAt(strValue.length()-1))=='%'
                                &&(strValue.charAt(strValue.length()-1))=='x'
                                &&(strValue.charAt(strValue.length()-1))=='÷'){
                            strValue = strValue.substring(0, strValue.length()-2) + "+";

                            calculatorSymbol.setText(strValue);
                            calculatorNumber.setText("0");
                        }
                    } else if(calculatorNumber.getText().toString()!=null){
                        strValue = calculatorSymbol.getText().toString() + calculatorNumber.getText().toString();
                        calculatorSymbol.setText(strValue);
                        calculatorNumber.setText("0");
                    }
                    break;
                case R.id.button_dot:
                    calculatorNumber.setText(0);
                    break;
                case R.id.button_equ:
                    calculatorNumber.setText(0);
                    break;






            }
        }
    };
}
