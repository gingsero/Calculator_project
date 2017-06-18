package com.example.dhkim.mycalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView calculatorHistory = null;
    TextView calculatorSymbol = null;
    TextView calculatorHiddenNumber = null;
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

    Button button_div = null;
    Button button_mul = null;
    Button button_plu = null;
    Button button_min = null;

    Button button_dot = null;
    Button button_equ = null;
    Button button_ac = null;

    final String zer = "0";
    final String plu = "+";
    final String min = "-";
    final String mul = "x";
    final String div = "÷";

    final String dot = ".";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        calculatorHistory = (TextView) findViewById(R.id.calculatorHistory);
        calculatorSymbol = (TextView) findViewById(R.id.calculatorSymbol);
        calculatorHiddenNumber = (TextView) findViewById(R.id.calculatorHiddenNumber);
        calculatorNumber = (TextView) findViewById(R.id.calculatorNumber);

        calculatorHistory.setText(null);
        calculatorSymbol.setText(null);
        calculatorHiddenNumber.setText(null);
        calculatorNumber.setText("0");
//        Button initialize
        button_ac = (Button) findViewById(R.id.button_ac);
        button_div = (Button) findViewById(R.id.button_div);

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
        button_div.setOnClickListener(mClickListener);

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
            if(calculatorNumber.getText().toString()!="0"){
                button_ac.setText("C");
            } else {
                button_ac.setText("AC");
            }
            String hisValue = calculatorHistory.getText().toString().trim();
            String strValue = calculatorNumber.getText().toString().trim();
            String symValue = calculatorSymbol.getText().toString().trim();
            String hidValue = calculatorHiddenNumber.getText().toString().trim();

            if(symValue.length()>0){
                System.out.println("symValue.equals(null) : false / " + symValue.length());
            } else {
                System.out.println("symValue.equals(null) : true");
            }

            if(hidValue.length()>0){
                System.out.println("hidValue.equals(null) : false / " + hidValue.length());
            } else {
                System.out.println("hidValue.equals(null) : true");
            }

            System.out.println("hisValue : " + hisValue);
            System.out.println("strValue : " + strValue);
            System.out.println("symValue : " + symValue);
            System.out.println("hidValue : " + hidValue);


            switch (v.getId()){
                case R.id.button_ac:
                    calculatorHistory.setText(null);
                    calculatorSymbol.setText(null);
                    calculatorNumber.setText("0");
                    button_ac.setText("AC");
                    break;

                case R.id.button_1:
                    if(strValue!="0"){
                        strValue = calculatorNumber.getText().toString() + "1";
                        calculatorNumber.setText(strValue);
                    } else {
                        strValue = "1";
                        calculatorNumber.setText(strValue);
                    }
                    break;
                case R.id.button_2:
                    if(strValue!="0"){
                        strValue = calculatorNumber.getText().toString() + "2";
                        calculatorNumber.setText(strValue);
                    } else {
                        strValue = "2";
                        calculatorNumber.setText(strValue);
                    }
                    break;
                case R.id.button_3:
                    if(strValue!="0"){
                        strValue = calculatorNumber.getText().toString() + "3";
                        calculatorNumber.setText(strValue);
                    } else {
                        strValue = "3";
                        calculatorNumber.setText(strValue);
                    }
                    break;
                case R.id.button_4:
                    if(strValue!="0"){
                        strValue = calculatorNumber.getText().toString() + "4";
                        calculatorNumber.setText(strValue);
                    } else {
                        strValue = "4";
                        calculatorNumber.setText(strValue);
                    }
                    break;
                case R.id.button_5:
                    if(strValue!="0"){
                        strValue = calculatorNumber.getText().toString() + "5";
                        calculatorNumber.setText(strValue);
                    } else {
                        strValue = "5";
                        calculatorNumber.setText(strValue);
                    }
                    break;
                case R.id.button_6:
                    if(strValue!="0"){
                        strValue = calculatorNumber.getText().toString() + "6";
                        calculatorNumber.setText(strValue);
                    } else {
                        strValue = "6";
                        calculatorNumber.setText(strValue);
                    }
                    break;
                case R.id.button_7:
                    if(strValue!="0"){
                        strValue = calculatorNumber.getText().toString() + "7";
                        calculatorNumber.setText(strValue);
                    } else {
                        strValue = "7";
                        calculatorNumber.setText(strValue);
                    }
                    break;
                case R.id.button_8:
                    if(strValue!="0"){
                        strValue = calculatorNumber.getText().toString() + "8";
                        calculatorNumber.setText(strValue);
                    } else {
                        strValue = "8";
                        calculatorNumber.setText(strValue);
                    }
                    break;
                case R.id.button_9:
                    if(strValue!="0"){
                        strValue = calculatorNumber.getText().toString() + "9";
                        calculatorNumber.setText(strValue);
                    } else {
                        strValue = "9";
                        calculatorNumber.setText(strValue);
                    }
                    break;
                case R.id.button_0:
                    if(strValue!="0"){
                        strValue = calculatorNumber.getText().toString() + "0";
                        calculatorNumber.setText(strValue);
                    } else {
                        strValue = "0";
                        calculatorNumber.setText(strValue);
                    }
                    break;


//                사칙연산
                case R.id.button_plu:
//                    strValue , symValue , hidValue;
                    if((strValue.equals("0")&&!(symValue.length()>0)&&!(hidValue.length()>0))){
                        System.out.println("덧셈 pass 식");
                    } else if((!strValue.equals("0")&&!(symValue.length()>0)&&!(hidValue.length()>0))){
                        System.out.println("k1");
                        calculatorSymbol.setText(plu);
                        calculatorHistory.setText(strValue + plu);
                    } else if((strValue.equals("0")&&(symValue.length()>0)&&!(hidValue.length()>0))){
                        System.out.println("k2");
                        calculatorSymbol.setText(plu);
                    } else if((strValue.equals("0")&&!(symValue.length()>0)&&(hidValue.length()>0))){ // 계산 오류 식 pass
                        System.out.println("k3");
                        calculatorHiddenNumber.setText(null);
                        calculatorSymbol.setText(null);
                        calculatorNumber.setText(zer);
                    } else if((!strValue.equals("0")&&(symValue.length()>0)&&!(hidValue.length()>0))){
                        System.out.println("k4");
                        calculatorHiddenNumber.setText(strValue);
                        calculatorSymbol.setText(plu);
                    } else if((!strValue.equals("0")&&!(symValue.length()>0)&&(hidValue.length()>0))){
                        System.out.println("k5");
                        calculatorHiddenNumber.setText(null);
                        calculatorSymbol.setText(null);
                        calculatorNumber.setText(zer);
                    } else if((strValue.equals("0")&&(symValue.length()>0)&&(hidValue.length()>0))){
                        System.out.println("k6");
                        calculatorSymbol.setText(plu);
                        calculatorNumber.setText(zer);
                    } else if((!strValue.equals("0")&&(symValue.length()>0)&&(hidValue.length()>0))){
                        System.out.println("k7");
//                        int foo = Double.parseDouble("1234");
                        if(!(hisValue.contains(dot))&&!(strValue.contains(dot))){
//                            정수 연산
                            int tempInt1 = Integer.parseInt(hidValue);
                            int tempInt2 = Integer.parseInt(strValue);

                            if(symValue.equals(plu)){
                                calculatorNumber.setText(String.valueOf(tempInt1 + tempInt2));
                            } else if(symValue.equals(min)){
                                if(tempInt1<tempInt2){
                                    calculatorNumber.setText("-"+String.valueOf(tempInt2 - tempInt1));
                                } else {
                                    calculatorNumber.setText(String.valueOf(tempInt1 - tempInt2));
                                }
                            } else if(symValue.equals(mul)){
                                calculatorNumber.setText(String.valueOf(tempInt1*tempInt2));
                            } else if(symValue.equals(div)){
                                calculatorNumber.setText(String.valueOf(tempInt1/tempInt2));
                            } else {
                                System.out.println("덧셈 식 에러");
                            }
                            calculatorHiddenNumber.setText(null);
                            calculatorSymbol.setText(plu);
                            calculatorHistory.setText(String.valueOf(tempInt1) + symValue + String.valueOf(tempInt2) + plu);
                        } else {
//                            소수점 연산
                            double tempDouble1 = Double.parseDouble(hidValue);
                            double tempDouble2 = Double.parseDouble(strValue);
                            if(symValue.equals(plu)){
                                calculatorHiddenNumber.setText(String.valueOf(tempDouble1 + tempDouble2));
                            } else if(symValue.equals(min)){
                                if(tempDouble1<tempDouble2){
                                    calculatorHiddenNumber.setText("-"+String.valueOf(tempDouble2 - tempDouble1));
                                } else {
                                    calculatorHiddenNumber.setText(String.valueOf(tempDouble1 - tempDouble2));
                                }
                            } else if(symValue.equals(mul)){
                                calculatorHiddenNumber.setText(String.valueOf(tempDouble1*tempDouble2));
                            } else if(symValue.equals(div)){
                                calculatorHiddenNumber.setText(String.valueOf(tempDouble1/tempDouble2));
                            } else {
                                System.out.println("덧셈 식 에러");
                            }
                            calculatorHiddenNumber.setText(null);
                            calculatorSymbol.setText(plu);
                            calculatorHistory.setText(String.valueOf(tempDouble1) + symValue + String.valueOf(tempDouble2) + plu);

                        }
                    } else {
                        System.out.println("덧셈 pass 식");
                    }
                    break;
                case R.id.button_min:
                    if((strValue.equals("0")&&!(symValue.length()>0)&&!(hidValue.length()>0))){
                        calculatorSymbol.setText(min);
                    } else if((!strValue.equals("0")&&!(symValue.length()>0)&&!(hidValue.length()>0))){
                        calculatorHiddenNumber.setText(strValue);
                        calculatorSymbol.setText(min);
                        calculatorNumber.setText(zer);
                        calculatorHistory.setText(strValue + min);
                    } else if((strValue.equals("0")&&(symValue.length()>0)&&!(hidValue.length()>0))){
                        calculatorSymbol.setText(min);
                    } else if((strValue.equals("0")&&!(symValue.length()>0)&&(hidValue.length()>0))){ // 계산 오류 식 pass
                        calculatorHiddenNumber.setText(null);
                        calculatorSymbol.setText(null);
                        calculatorNumber.setText(zer);
                    } else if((!strValue.equals("0")&&(symValue.length()>0)&&!(hidValue.length()>0))){ // 계산 오류 식 pass
                        calculatorHiddenNumber.setText(null);
                        calculatorSymbol.setText(null);
                        calculatorNumber.setText(zer);
                    } else if((!strValue.equals("0")&&!(symValue.length()>0)&&(hidValue.length()>0))){ // 계산 오류 식 pass
                        calculatorHiddenNumber.setText(null);
                        calculatorSymbol.setText(null);
                        calculatorNumber.setText(zer);
                    } else if((strValue.equals("0")&&(symValue.length()>0)&&(hidValue.length()>0))){
                        calculatorHiddenNumber.setText(null);
                        calculatorSymbol.setText(min);
                        calculatorNumber.setText(zer);
                    } else if((!strValue.equals("0")&&(symValue.length()>0)&&(hidValue.length()>0))){
//                        int foo = Double.parseDouble("1234");
                        double temp1 = Double.parseDouble(hidValue);
                        double temp2 = Double.parseDouble(strValue);
                        if(symValue.equals(plu)){
                            calculatorHiddenNumber.setText(String.valueOf(temp1 + temp2));
                        } else if(symValue.equals(min)){
                            if(temp1<temp2){
                                calculatorHiddenNumber.setText("-"+String.valueOf(temp2 - temp1));
                            } else {
                                calculatorHiddenNumber.setText(String.valueOf(temp1 - temp2));
                            }
                        } else if(symValue.equals(mul)){
                            calculatorHiddenNumber.setText(String.valueOf(temp1*temp2));
                        } else if(symValue.equals(div)){
                            calculatorHiddenNumber.setText(String.valueOf(temp1/temp2));
                        } else {
                            System.out.println("뺄셈 식 에러");
                        }
                        calculatorSymbol.setText(min);
                        calculatorNumber.setText("0");

                    } else {
                        System.out.println("뺄셈 pass 식");
                    }
                    break;
                case R.id.button_mul:
                    if((strValue.equals("0")&&!(symValue.length()>0)&&!(hidValue.length()>0))){
                        calculatorSymbol.setText(mul);
                    } else if((!strValue.equals("0")&&!(symValue.length()>0)&&!(hidValue.length()>0))){
                        calculatorHiddenNumber.setText(strValue);
                        calculatorSymbol.setText(mul);
                        calculatorNumber.setText(zer);
                        calculatorHistory.setText(strValue + mul);
                    } else if((strValue.equals("0")&&(symValue.length()>0)&&!(hidValue.length()>0))){
                        calculatorSymbol.setText(mul);
                    } else if((strValue.equals("0")&&!(symValue.length()>0)&&(hidValue.length()>0))){ // 계산 오류 식 pass
                        calculatorHiddenNumber.setText(null);
                        calculatorSymbol.setText(null);
                        calculatorNumber.setText(zer);
                    } else if((!strValue.equals("0")&&(symValue.length()>0)&&!(hidValue.length()>0))){ // 계산 오류 식 pass
                        calculatorHiddenNumber.setText(null);
                        calculatorSymbol.setText(null);
                        calculatorNumber.setText(zer);
                    } else if((!strValue.equals("0")&&!(symValue.length()>0)&&(hidValue.length()>0))){ // 계산 오류 식 pass
                        calculatorHiddenNumber.setText(null);
                        calculatorSymbol.setText(null);
                        calculatorNumber.setText(zer);
                    } else if((strValue.equals("0")&&(symValue.length()>0)&&(hidValue.length()>0))){
                        calculatorHiddenNumber.setText(null);
                        calculatorSymbol.setText(mul);
                        calculatorNumber.setText(zer);
                    } else if((!strValue.equals("0")&&(symValue.length()>0)&&(hidValue.length()>0))){
//                        int foo = Double.parseDouble("1234");
                        double temp1 = Double.parseDouble(hidValue);
                        double temp2 = Double.parseDouble(strValue);
                        if(symValue.equals(plu)){
                            calculatorHiddenNumber.setText(String.valueOf(temp1 + temp2));
                        } else if(symValue.equals(min)){
                            if(temp1<temp2){
                                calculatorHiddenNumber.setText("-"+String.valueOf(temp2 - temp1));
                            } else {
                                calculatorHiddenNumber.setText(String.valueOf(temp1 - temp2));
                            }
                        } else if(symValue.equals(mul)){
                            calculatorHiddenNumber.setText(String.valueOf(temp1*temp2));
                        } else if(symValue.equals(div)){
                            calculatorHiddenNumber.setText(String.valueOf(temp1/temp2));
                        } else {
                            System.out.println("곱셈 식 에러");
                        }
                        calculatorSymbol.setText(mul);
                        calculatorNumber.setText("0");

                    } else {
                        System.out.println("곱셈 pass 식");
                    }
                    break;
                case R.id.button_div:
                    if((strValue.equals("0")&&!(symValue.length()>0)&&!(hidValue.length()>0))){
                        calculatorSymbol.setText(div);
                    } else if((!strValue.equals("0")&&!(symValue.length()>0)&&!(hidValue.length()>0))){
                        calculatorHiddenNumber.setText(strValue);
                        calculatorSymbol.setText(mul);
                        calculatorNumber.setText(zer);
                        calculatorHistory.setText(strValue + mul);
                    } else if((strValue.equals("0")&&(symValue.length()>0)&&!(hidValue.length()>0))){
                        calculatorSymbol.setText(div);
                    } else if((strValue.equals("0")&&!(symValue.length()>0)&&(hidValue.length()>0))){ // 계산 오류 식 pass
                        calculatorHiddenNumber.setText(null);
                        calculatorSymbol.setText(null);
                        calculatorNumber.setText(zer);
                    } else if((!strValue.equals("0")&&(symValue.length()>0)&&!(hidValue.length()>0))){ // 계산 오류 식 pass
                        calculatorHiddenNumber.setText(null);
                        calculatorSymbol.setText(null);
                        calculatorNumber.setText(zer);
                    } else if((!strValue.equals("0")&&!(symValue.length()>0)&&(hidValue.length()>0))){ // 계산 오류 식 pass
                        calculatorHiddenNumber.setText(null);
                        calculatorSymbol.setText(null);
                        calculatorNumber.setText(zer);
                    } else if((strValue.equals("0")&&(symValue.length()>0)&&(hidValue.length()>0))){
                        calculatorHiddenNumber.setText(null);
                        calculatorSymbol.setText(mul);
                        calculatorNumber.setText(zer);
                    } else if((!strValue.equals("0")&&(symValue.length()>0)&&(hidValue.length()>0))){
//                        int foo = Double.parseDouble("1234");
                        double temp1 = Double.parseDouble(hidValue);
                        double temp2 = Double.parseDouble(strValue);
                        if(symValue.equals(plu)){
                            calculatorHiddenNumber.setText(String.valueOf(temp1 + temp2));
                        } else if(symValue.equals(min)){
                            if(temp1<temp2){
                                calculatorHiddenNumber.setText("-"+String.valueOf(temp2 - temp1));
                            } else {
                                calculatorHiddenNumber.setText(String.valueOf(temp1 - temp2));
                            }
                        } else if(symValue.equals(mul)){
                            calculatorHiddenNumber.setText(String.valueOf(temp1*temp2));
                        } else if(symValue.equals(div)){
                            calculatorHiddenNumber.setText(String.valueOf(temp1/temp2));
                        } else {
                            System.out.println("나눗셈 식 에러");
                        }
                        calculatorSymbol.setText(mul);
                        calculatorNumber.setText("0");

                    } else {
                        System.out.println("나눗셈 pass 식");
                    }
                    break;
                case R.id.button_dot:
                    if((strValue.equals("0")&&!(symValue.length()>0)&&!(hidValue.length()>0))){
                        calculatorNumber.setText(zer + dot);
                    } else if((!strValue.equals("0")&&!(symValue.length()>0)&&!(hidValue.length()>0))){
                        if(!strValue.contains(dot)){
                            calculatorNumber.setText(strValue + dot);
                        } else {
                            System.out.println("소수점 pass 식");
                        }
                    } else if((strValue.equals("0")&&(symValue.length()>0)&&!(hidValue.length()>0))){ // 계산 오류 식 pass
                        calculatorHiddenNumber.setText(null);
                        calculatorSymbol.setText(null);
                        calculatorNumber.setText(zer + dot);
                    } else if((strValue.equals("0")&&!(symValue.length()>0)&&(hidValue.length()>0))){ // 계산 오류 식 pass
                        calculatorHiddenNumber.setText(null);
                        calculatorSymbol.setText(null);
                        calculatorNumber.setText(zer + dot);
                    } else if((!strValue.equals("0")&&(symValue.length()>0)&&!(hidValue.length()>0))){ // 계산 오류 식 pass
                        calculatorHiddenNumber.setText(null);
                        calculatorSymbol.setText(null);
                        calculatorNumber.setText(zer + dot);
                    } else if((!strValue.equals("0")&&!(symValue.length()>0)&&(hidValue.length()>0))){ // 계산 오류 식 pass
                        calculatorHiddenNumber.setText(null);
                        calculatorSymbol.setText(null);
                        calculatorNumber.setText(zer + dot);
                    } else if((strValue.equals("0")&&(symValue.length()>0)&&(hidValue.length()>0))){
                        calculatorHiddenNumber.setText(null);
                        calculatorSymbol.setText(mul);
                        calculatorNumber.setText(zer + dot);
                    } else if((!strValue.equals("0")&&(symValue.length()>0)&&(hidValue.length()>0))){
//                        int foo = Double.parseDouble("1234");
                        if(!strValue.contains(dot)){
                            calculatorNumber.setText(strValue + dot);
                        } else {
                            System.out.println("소수점 pass 식");
                        }
                    } else {
                        System.out.println("소수점 pass 식");
                    }
                    break;
                case R.id.button_equ:
                    if((strValue.equals("0")&&!(symValue.length()>0)&&!(hidValue.length()>0))){
                        System.out.println("등호 pass 식");
                    } else if((!strValue.equals("0")&&!(symValue.length()>0)&&!(hidValue.length()>0))){
                        System.out.println("등호 pass 식");
                    } else if((strValue.equals("0")&&(symValue.length()>0)&&!(hidValue.length()>0))){
                        System.out.println("등호 pass 식");
                    } else if((strValue.equals("0")&&!(symValue.length()>0)&&(hidValue.length()>0))){
                        System.out.println("등호 pass 식");
                    } else if((!strValue.equals("0")&&(symValue.length()>0)&&!(hidValue.length()>0))){ // 정상 식
                        calculatorHiddenNumber.setText(strValue);
                        calculatorSymbol.setText(symValue);
                        calculatorNumber.setText(strValue);
                    } else if((!strValue.equals("0")&&!(symValue.length()>0)&&(hidValue.length()>0))){
                        calculatorHiddenNumber.setText(null);
                        calculatorSymbol.setText(null);
                        calculatorNumber.setText(strValue);
                    } else if((strValue.equals("0")&&(symValue.length()>0)&&(hidValue.length()>0))){
                        calculatorHiddenNumber.setText(null);
                        calculatorSymbol.setText(null);
                        calculatorNumber.setText(hidValue);
                    } else if((!strValue.equals("0")&&(symValue.length()>0)&&(hidValue.length()>0))){
//                        int foo = Double.parseDouble("1234");
                        double temp1 = Double.parseDouble(hidValue);
                        double temp2 = Double.parseDouble(strValue);

                        if(symValue.equals(plu)){
                            calculatorHiddenNumber.setText(String.valueOf(temp2));
                            calculatorNumber.setText(String.valueOf(temp1 + temp2));
                        } else if(symValue.equals(min)){
                            if(temp1<temp2){
                                calculatorHiddenNumber.setText(String.valueOf(temp2));
                                calculatorNumber.setText("-" + String.valueOf(temp2-temp1));
                            } else {
                                calculatorHiddenNumber.setText(String.valueOf(temp2));
                                calculatorNumber.setText(String.valueOf(temp1-temp2));
                            }
                        } else if(symValue.equals(mul)){
                            calculatorHiddenNumber.setText(String.valueOf(temp2));
                            calculatorNumber.setText(String.valueOf(temp1*temp2));
                        } else if(symValue.equals(div)){
                            calculatorHiddenNumber.setText(String.valueOf(temp2));
                            calculatorNumber.setText(String.valueOf(temp1/temp2));
                        } else {
                            System.out.println("등호 식 에러");
                        }

                    } else {
                        System.out.println("등호 pass 식");
                    }
                    break;

            }
        }
    };
}
