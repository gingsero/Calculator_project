package com.example.dhkim.mycalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView calculatorHistory = null;
    TextView calculatorSymbol = null;
    TextView calculatorHiddenNumber1 = null;
    TextView calculatorHiddenNumber2 = null;
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

    final static String numOne = "1";
    final static String numTwo = "2";
    final static String numThr = "3";
    final static String numFou = "4";
    final static String numFiv = "5";
    final static String numSix = "6";
    final static String numSev = "7";
    final static String numEig = "8";
    final static String numNin = "9";


    final static String zer = "0";
    final static String plu = "+";
    final static String min = "-";
    final static String mul = "x";
    final static String div = "÷";

    final static String dot = ".";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        calculatorHistory = (TextView) findViewById(R.id.calculatorHistory);
        calculatorSymbol = (TextView) findViewById(R.id.calculatorSymbol);
        calculatorHiddenNumber1 = (TextView) findViewById(R.id.calculatorHiddenNumber1);
        calculatorHiddenNumber2 = (TextView) findViewById(R.id.calculatorHiddenNumber2);
        calculatorNumber = (TextView) findViewById(R.id.calculatorNumber);

        calculatorHistory.setText(null);
        calculatorSymbol.setText(null);
        calculatorHiddenNumber1.setText(null);
        calculatorHiddenNumber2.setText(null);
        calculatorNumber.setText(zer);
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
        button_1.setOnClickListener(mClickListenerNumber);
        button_2.setOnClickListener(mClickListenerNumber);
        button_3.setOnClickListener(mClickListenerNumber);
        button_4.setOnClickListener(mClickListenerNumber);
        button_5.setOnClickListener(mClickListenerNumber);
        button_6.setOnClickListener(mClickListenerNumber);
        button_7.setOnClickListener(mClickListenerNumber);
        button_8.setOnClickListener(mClickListenerNumber);
        button_9.setOnClickListener(mClickListenerNumber);
        button_0.setOnClickListener(mClickListenerNumber);

        button_ac.setOnClickListener(mClickListenerSymbol);

        button_plu.setOnClickListener(mClickListenerSymbol);
        button_min.setOnClickListener(mClickListenerSymbol);
        button_mul.setOnClickListener(mClickListenerSymbol);
        button_div.setOnClickListener(mClickListenerSymbol);

        button_dot.setOnClickListener(mClickListenerSymbol);
        button_equ.setOnClickListener(mClickListenerSymbol);
    }


    /* 숫자 버튼 눌렸을때 동작 메소드 */
    View.OnClickListener mClickListenerNumber = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            System.out.println("mClickListenerNumber()");

            if(!calculatorNumber.getText().toString().equals(zer)){
                button_ac.setText("c");
            } else {
                button_ac.setText("ac");
            }


            String hiddenNumb1 = calculatorHiddenNumber1.getText().toString().trim();
            String hiddenNumb2 = calculatorHiddenNumber2.getText().toString().trim();
            String hiddenSymbol = calculatorSymbol.getText().toString().trim();
            String temp = null;

            if (hiddenNumb1.equals(null)||hiddenNumb1.equals("")) {
                System.out.println("1");
                switch (v.getId()) {
                    case R.id.button_1:
                        temp = numOne;
                        break;
                    case R.id.button_2:
                        temp = numTwo;
                        break;
                    case R.id.button_3:
                        temp = numThr;
                        break;
                    case R.id.button_4:
                        temp = numFou;
                        break;
                    case R.id.button_5:
                        temp = numFiv;
                        break;
                    case R.id.button_6:
                        temp = numSix;
                        break;
                    case R.id.button_7:
                        temp = numSev;
                        break;
                    case R.id.button_8:
                        temp = numEig;
                        break;
                    case R.id.button_9:
                        temp = numNin;
                        break;
                    case R.id.button_0:
                        temp = zer;
                        break;
                }
                calculatorHiddenNumber1.setText(temp);
                calculatorNumber.setText(temp);
            } else {
                System.out.println("2");
                if (hiddenSymbol.equals(null)||hiddenSymbol.equals("")) {
                    System.out.println("3");
                    switch (v.getId()) {
                        case R.id.button_1:
                            temp = hiddenNumb1 + numOne;
                            break;
                        case R.id.button_2:
                            temp = hiddenNumb1 + numTwo;
                            break;
                        case R.id.button_3:
                            temp = hiddenNumb1 + numThr;
                            break;
                        case R.id.button_4:
                            temp = hiddenNumb1 + numFou;
                            break;
                        case R.id.button_5:
                            temp = hiddenNumb1 + numFiv;
                            break;
                        case R.id.button_6:
                            temp = hiddenNumb1 + numSix;
                            break;
                        case R.id.button_7:
                            temp = hiddenNumb1 + numSev;
                            break;
                        case R.id.button_8:
                            temp = hiddenNumb1 + numEig;
                            break;
                        case R.id.button_9:
                            temp = hiddenNumb1 + numNin;
                            break;
                        case R.id.button_0:
                            temp = hiddenNumb1 + zer;
                            break;
                    }
                    calculatorHiddenNumber1.setText(temp);
                    calculatorNumber.setText(temp);
                } else {
                    System.out.println("4");
                    if (hiddenNumb2.equals(null)||hiddenNumb2.equals("")) {
                        System.out.println("5");
                        switch (v.getId()) {
                            case R.id.button_1:
                                temp = numOne;
                                break;
                            case R.id.button_2:
                                temp = numTwo;
                                break;
                            case R.id.button_3:
                                temp = numThr;
                                break;
                            case R.id.button_4:
                                temp = numFou;
                                break;
                            case R.id.button_5:
                                temp = numFiv;
                                break;
                            case R.id.button_6:
                                temp = numSix;
                                break;
                            case R.id.button_7:
                                temp = numSev;
                                break;
                            case R.id.button_8:
                                temp = numEig;
                                break;
                            case R.id.button_9:
                                temp = numNin;
                                break;
                            case R.id.button_0:
                                temp = zer;
                                break;
                        }
                        calculatorHiddenNumber2.setText(temp);
                        calculatorNumber.setText(temp);
                    } else {
                        System.out.println("6");
                        switch (v.getId()) {
                            case R.id.button_1:
                                temp = hiddenNumb2 + numOne;
                                break;
                            case R.id.button_2:
                                temp = hiddenNumb2 + numTwo;
                                break;
                            case R.id.button_3:
                                temp = hiddenNumb2 + numThr;
                                break;
                            case R.id.button_4:
                                temp = hiddenNumb2 + numFou;
                                break;
                            case R.id.button_5:
                                temp = hiddenNumb2 + numFiv;
                                break;
                            case R.id.button_6:
                                temp = hiddenNumb2 + numSix;
                                break;
                            case R.id.button_7:
                                temp = hiddenNumb2 + numSev;
                                break;
                            case R.id.button_8:
                                temp = hiddenNumb2 + numEig;
                                break;
                            case R.id.button_9:
                                temp = hiddenNumb2 + numNin;
                                break;
                            case R.id.button_0:
                                temp = hiddenNumb2 + zer;
                                break;
                        }
                        calculatorHiddenNumber2.setText(temp);
                        calculatorNumber.setText(temp);
                    }
                }

            }
            System.out.println("mClickListenerNumber() --> " + calculatorHiddenNumber1.getText().toString() + ", " + calculatorHiddenNumber2.getText().toString() +
                    ", "  + calculatorSymbol.getText().toString() + ","  + temp);

        }
    };

    /* 심볼 버튼 눌렸을때 동작 */
    View.OnClickListener mClickListenerSymbol = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            System.out.println("mClickListenerSymbol()");

            String hiddenNumb1 = calculatorHiddenNumber1.getText().toString();
            String hiddenNumb2 = calculatorHiddenNumber2.getText().toString();
            String hiddenSymbol = calculatorSymbol.getText().toString();
            String temp = null;

            if((v.getId()==R.id.button_ac)||(v.getId()==R.id.button_dot)||(v.getId()==R.id.button_equ)){
                switch (v.getId()){
                    case R.id.button_ac :
                        if(button_ac.getText().equals("c")){
                            if(hiddenSymbol.equals(null)||hiddenSymbol.equals("")){
                                if(hiddenNumb1.equals(null)||hiddenNumb1.equals("")){
//                                Error status
                                    calculatorNumber.setText("Error status 1");
                                } else {
                                    calculatorHiddenNumber1.setText(null);
                                    calculatorNumber.setText(zer);
                                }
                            } else {
                                if(hiddenNumb2.equals(null)||hiddenNumb2.equals("")){
//                                Error status
                                    calculatorNumber.setText("Error status 2");
                                } else {
                                    calculatorHiddenNumber2.setText(null);
                                    calculatorNumber.setText(zer);
                                }
                            }
                        } else {
                            calculatorHiddenNumber1.setText(null);
                            calculatorHiddenNumber2.setText(null);
                            calculatorSymbol.setText(null);
                            calculatorNumber.setText(zer);
                        }
                        break;
                    case R.id.button_dot :

                        break;
                    case R.id.button_equ :
                        if(hiddenNumb1.equals(null)||hiddenNumb1.equals("")){
//                        Error status
                            System.out.println("Not Calculator 1");
                        } else {
                            if(hiddenSymbol.equals(null)||hiddenSymbol.equals("")){
//                            Error status
                                System.out.println("Not Calculator 2");
                            } else {
                                if(hiddenNumb2.equals(null)||hiddenNumb2.equals("")){
                                    String result = methodEqu(hiddenNumb1, hiddenNumb1, hiddenSymbol);
                                    calculatorNumber.setText(result);
                                } else {
                                    String result = methodEqu(hiddenNumb1, hiddenNumb2, hiddenSymbol);
                                    calculatorNumber.setText(result);
                                }
                            }
                        }
                        break;

                }
            } else {
                if (hiddenNumb1.equals(null)||hiddenNumb1.equals("")) {
                    System.out.println("a");
                    switch (v.getId()) {
//                    case R.id.button_ac:
//                        break;
                        case R.id.button_plu:
                            temp = plu;
                            break;
                        case R.id.button_min:
                            temp = min;
                            break;
                        case R.id.button_mul:
                            temp = mul;
                            break;
                        case R.id.button_div:
                            temp = div;
                            break;
//                    case R.id.button_dot:
//                        break;
//                    case R.id.button_equ:
//                        break;
                    }
                    System.out.println("a-2 : " + temp);
                    calculatorSymbol.setText(temp);
                } else {
                    System.out.println("b-1");
                    if (hiddenSymbol.equals(null)||hiddenSymbol.equals("")) {
                        switch (v.getId()) {
//                        case R.id.button_ac:
//                            break;
                            case R.id.button_plu:
                                temp = plu;
                                break;
                            case R.id.button_min:
                                temp = min;
                                break;
                            case R.id.button_mul:
                                temp = mul;
                                break;
                            case R.id.button_div:
                                temp = div;
                                break;
//                        case R.id.button_dot:
//                            break;
//                        case R.id.button_equ:
//                            break;
                        }
                        System.out.println("b-1 : " + temp);
                        calculatorSymbol.setText(temp);
                    } else {
                        System.out.println("b-2");
                        if (hiddenNumb2.equals(null)||hiddenNumb2.equals("")) {
                            switch (v.getId()) {
//                            case R.id.button_ac:
//                                break;
                                case R.id.button_plu:
                                    temp = plu;
                                    break;
                                case R.id.button_min:
                                    temp = min;
                                    break;
                                case R.id.button_mul:
                                    temp = mul;
                                    break;
                                case R.id.button_div:
                                    temp = div;
                                    break;
//                            case R.id.button_dot:
//                                break;
//                            case R.id.button_equ:
//                                break;
                            }
                            System.out.println("b-2 : " + temp);
                            calculatorSymbol.setText(temp);
                        } else {
                            System.out.println("b-3");
                            String result = methodEqu(hiddenNumb1, hiddenNumb2, hiddenSymbol);
                            calculatorHiddenNumber1.setText(result);
                            calculatorHiddenNumber2.setText(null);
                            calculatorNumber.setText(result);
                            switch (v.getId()) {
//                            case R.id.button_ac:
//                                break;
                                case R.id.button_plu:
                                    temp = plu;
                                    break;
                                case R.id.button_min:
                                    temp = min;
                                    break;
                                case R.id.button_mul:
                                    temp = mul;
                                    break;
                                case R.id.button_div:
                                    temp = div;
                                    break;
//                            case R.id.button_dot:
//                                break;
//                            case R.id.button_equ:
//                                break;
                            }
                            System.out.println("b-3 : " + temp);
                            calculatorSymbol.setText(temp);
                        }
                    }
                }
            }




        }
    };

//    Calculator result method
    public static String methodEqu(String num1, String num2, String sym) {
        System.out.println("methodEqu()");
        String equResult = null;

        int intNum1 = 0;
        int intNum2 = 0;
        double doubleNum1 = 0;
        double doubleNum2 = 0;

        if (num1.equals(null) || num1.equals("")) {
            num1 = "0";
        }
        if (num2.equals(null) || num2.equals("")) {
            num2 = "0";
        }

        if (!(num1.contains(dot)) && !(num2.contains(dot))) { // 정수 연산
            intNum1 = Integer.parseInt(num1);
            intNum2 = Integer.parseInt(num2);
        } else {
            doubleNum1 = Double.parseDouble(num1);
            doubleNum2 = Double.parseDouble(num2);
        }

        if (sym.equals(plu)) {
            equResult = String.valueOf(intNum1 + intNum2 + doubleNum1 + doubleNum2);
        } else if (sym.equals(min)) {
            if ((intNum1 < intNum2) || (doubleNum1 < doubleNum2)) {
                equResult = String.valueOf(min + ((intNum2 - intNum1) + (doubleNum2 - doubleNum1)));
            } else {
                equResult = String.valueOf(intNum1 - intNum2 + doubleNum1 - doubleNum2);
            }
        } else if (sym.equals(mul)) {
            equResult = String.valueOf((intNum1 * intNum2) + (doubleNum1 * doubleNum2));
        } else if (sym.equals(div)) {
            equResult = String.valueOf((intNum1 / intNum2) + (doubleNum1 / doubleNum2));
        }

        System.out.println("methodEqu(equResult): " + equResult);


        return equResult;
    }


}
