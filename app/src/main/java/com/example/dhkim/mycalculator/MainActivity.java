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

    String hisValue = null;
    String hidValue = null;
    String strValue = null;
    String symValue = null;

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
            hisValue = calculatorHistory.getText().toString().trim();
            strValue = calculatorNumber.getText().toString().trim();
            symValue = calculatorSymbol.getText().toString().trim();
            hidValue = calculatorHiddenNumber.getText().toString().trim();

            String calculResult = null;

            /*if(symValue.length()>0){
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
            System.out.println("hidValue : " + hidValue);*/


            switch (v.getId()){
                case R.id.button_ac:
                    calculatorHistory.setText(null);
                    calculatorSymbol.setText(null);
                    calculatorNumber.setText("0");
                    button_ac.setText("AC");
                    break;

                case R.id.button_1:
                    System.out.println("button_1");
                    if(strValue.equals(zer)&&!(symValue.length()>0)&&!(hidValue.length()>0)){ // 0 0 0
                        System.out.println("button_1 : 1");
                        calculatorNumber.setText("1");
                    } else if(strValue.equals(zer)&&(symValue.length()>0)&&!(hidValue.length()>0)){ // 0 1 0
                        System.out.println("button_1 : 2");
                        if(strValue.equals(zer)){
                            calculatorNumber.setText("1");
                        } else {
                            calculatorNumber.setText(strValue + "1"); // 실행 안되는 코드 > 테스트 후 삭제 예정
                        }
                    } else if(!strValue.equals(zer)&&!(symValue.length()>0)&&!(hidValue.length()>0)){ // 1 0 0
                        System.out.println("button_1 : 3");
                        strValue = calculatorNumber.getText().toString();
                        if(strValue.equals(zer)){
                            calculatorNumber.setText("1"); // 실행 안되는 코드 > 테스트 후 삭제 예정
                        } else {
                            calculatorNumber.setText(strValue + "1");
                        }
                    } else if(!strValue.equals(zer)&&(symValue.length()>0)&&!(hidValue.length()>0)){ // 1 1 0
                        System.out.println("button_1 : 4");
                        strValue = calculatorNumber.getText().toString();
                        hidValue = strValue;
                        calculatorNumber.setText(zer);
                        strValue = calculatorNumber.getText().toString();
                        if(strValue.equals(zer)){
                            calculatorNumber.setText("1");
                        } else {
                            calculatorNumber.setText(strValue + "1"); // 실행 안되는 코드 > 테스트 후 삭제 예정
                        }
                    } else if(!strValue.equals(zer)&&(symValue.length()>0)&&(hidValue.length()>0)){ // 1 1 1
                        System.out.println("button_1 : 5");
                        if(strValue.equals(zer)){
                            calculatorNumber.setText("1"); // 실행 안되는 코드 > 테스트 후 삭제 예정
                        } else {
                            calculatorNumber.setText(strValue + "1");
                        }
                    } else {
                        System.out.println("1번 버튼 에러");
                    }
                    break;
                case R.id.button_2:
                    if(strValue.equals(zer)&&!(symValue.length()>0)&&!(hidValue.length()>0)){
                        calculatorNumber.setText("2");
                    } else if(strValue.equals(zer)&&(symValue.length()>0)&&!(hidValue.length()>0)){
                        if(strValue.equals(zer)){
                            calculatorNumber.setText("2");
                        } else {
                            calculatorNumber.setText(strValue + "2");
                        }
                    } else if(!strValue.equals(zer)&&!(symValue.length()>0)&&!(hidValue.length()>0)){
                        if(strValue.equals(zer)){
                            calculatorNumber.setText("2");
                        } else {
                            calculatorNumber.setText(strValue + "2");
                        }
                    } else if(!strValue.equals(zer)&&(symValue.length()>0)&&!(hidValue.length()>0)){
                        hidValue = strValue;
                        calculatorNumber.setText(zer);
                        strValue = calculatorNumber.getText().toString();
                        if(strValue.equals(zer)){
                            calculatorNumber.setText("2");
                        } else {
                            calculatorNumber.setText(strValue + "2"); // 실행 안되는 코드 > 테스트 후 삭제 예정
                        }
                    } else if(!strValue.equals(zer)&&(symValue.length()>0)&&(hidValue.length()>0)){
                        if(strValue.equals(zer)){
                            calculatorNumber.setText("2"); // 실행 안되는 코드 > 테스트 후 삭제 예정
                        } else {
                            calculatorNumber.setText(strValue + "2");
                        }
                    } else {
                        System.out.println("2번 버튼 에러");
                    }
                    break;
                case R.id.button_3:
                    if(strValue.equals(zer)&&!(symValue.length()>0)&&!(hidValue.length()>0)){
                        calculatorNumber.setText("3");
                    } else if(strValue.equals(zer)&&(symValue.length()>0)&&!(hidValue.length()>0)){
                        if(strValue.equals(zer)){
                            calculatorNumber.setText("3");
                        } else {
                            calculatorNumber.setText(strValue + "3");
                        }
                    } else if(!strValue.equals(zer)&&!(symValue.length()>0)&&!(hidValue.length()>0)){
                        if(strValue.equals(zer)){
                            calculatorNumber.setText("3");
                        } else {
                            calculatorNumber.setText(strValue + "3");
                        }
                    } else if(!strValue.equals(zer)&&(symValue.length()>0)&&!(hidValue.length()>0)){
                        hidValue = strValue;
                        calculatorNumber.setText(zer);
                        strValue = calculatorNumber.getText().toString();
                        if(strValue.equals(zer)){
                            calculatorNumber.setText("3");
                        } else {
                            calculatorNumber.setText(strValue + "3"); // 실행 안되는 코드 > 테스트 후 삭제 예정
                        }
                    } else if(!strValue.equals(zer)&&(symValue.length()>0)&&(hidValue.length()>0)){
                        if(strValue.equals(zer)){
                            calculatorNumber.setText("3"); // 실행 안되는 코드 > 테스트 후 삭제 예정
                        } else {
                            calculatorNumber.setText(strValue + "3");
                        }
                    } else {
                        System.out.println("3번 버튼 에러");
                    }
                    break;
                case R.id.button_4:
                    if(strValue.equals(zer)&&!(symValue.length()>0)&&!(hidValue.length()>0)){
                        calculatorNumber.setText("4");
                    } else if(strValue.equals(zer)&&(symValue.length()>0)&&!(hidValue.length()>0)){
                        if(strValue.equals(zer)){
                            calculatorNumber.setText("4");
                        } else {
                            calculatorNumber.setText(strValue + "4");
                        }
                    } else if(!strValue.equals(zer)&&!(symValue.length()>0)&&!(hidValue.length()>0)){
                        if(strValue.equals(zer)){
                            calculatorNumber.setText("4");
                        } else {
                            calculatorNumber.setText(strValue + "4");
                        }
                    } else if(!strValue.equals(zer)&&(symValue.length()>0)&&!(hidValue.length()>0)){
                        hidValue = strValue;
                        calculatorNumber.setText(zer);
                        strValue = calculatorNumber.getText().toString();
                        if(strValue.equals(zer)){
                            calculatorNumber.setText("4");
                        } else {
                            calculatorNumber.setText(strValue + "4"); // 실행 안되는 코드 > 테스트 후 삭제 예정
                        }
                    } else if(!strValue.equals(zer)&&(symValue.length()>0)&&(hidValue.length()>0)){
                        if(strValue.equals(zer)){
                            calculatorNumber.setText("4"); // 실행 안되는 코드 > 테스트 후 삭제 예정
                        } else {
                            calculatorNumber.setText(strValue + "4");
                        }
                    } else {
                        System.out.println("4번 버튼 에러");
                    }
                    break;
                case R.id.button_5:
                    if(strValue.equals(zer)&&!(symValue.length()>0)&&!(hidValue.length()>0)){
                        calculatorNumber.setText("5");
                    } else if(strValue.equals(zer)&&(symValue.length()>0)&&!(hidValue.length()>0)){
                        if(strValue.equals(zer)){
                            calculatorNumber.setText("5");
                        } else {
                            calculatorNumber.setText(strValue + "5");
                        }
                    } else if(!strValue.equals(zer)&&!(symValue.length()>0)&&!(hidValue.length()>0)){
                        if(strValue.equals(zer)){
                            calculatorNumber.setText("5");
                        } else {
                            calculatorNumber.setText(strValue + "5");
                        }
                    } else if(!strValue.equals(zer)&&(symValue.length()>0)&&!(hidValue.length()>0)){
                        hidValue = strValue;
                        calculatorNumber.setText(zer);
                        strValue = calculatorNumber.getText().toString();
                        if(strValue.equals(zer)){
                            calculatorNumber.setText("5");
                        } else {
                            calculatorNumber.setText(strValue + "5"); // 실행 안되는 코드 > 테스트 후 삭제 예정
                        }
                    } else if(!strValue.equals(zer)&&(symValue.length()>0)&&(hidValue.length()>0)){
                        if(strValue.equals(zer)){
                            calculatorNumber.setText("5"); // 실행 안되는 코드 > 테스트 후 삭제 예정
                        } else {
                            calculatorNumber.setText(strValue + "5");
                        }
                    } else {
                        System.out.println("5번 버튼 에러");
                    }
                    break;
                case R.id.button_6:
                    if(strValue.equals(zer)&&!(symValue.length()>0)&&!(hidValue.length()>0)){
                        calculatorNumber.setText("6");
                    } else if(strValue.equals(zer)&&(symValue.length()>0)&&!(hidValue.length()>0)){
                        if(strValue.equals(zer)){
                            calculatorNumber.setText("6");
                        } else {
                            calculatorNumber.setText(strValue + "6");
                        }
                    } else if(!strValue.equals(zer)&&!(symValue.length()>0)&&!(hidValue.length()>0)){
                        if(strValue.equals(zer)){
                            calculatorNumber.setText("6");
                        } else {
                            calculatorNumber.setText(strValue + "6");
                        }
                    } else if(!strValue.equals(zer)&&(symValue.length()>0)&&!(hidValue.length()>0)){
                        hidValue = strValue;
                        calculatorNumber.setText(zer);
                        strValue = calculatorNumber.getText().toString();
                        if(strValue.equals(zer)){
                            calculatorNumber.setText("6");
                        } else {
                            calculatorNumber.setText(strValue + "6"); // 실행 안되는 코드 > 테스트 후 삭제 예정
                        }
                    } else if(!strValue.equals(zer)&&(symValue.length()>0)&&(hidValue.length()>0)){
                        if(strValue.equals(zer)){
                            calculatorNumber.setText("6"); // 실행 안되는 코드 > 테스트 후 삭제 예정
                        } else {
                            calculatorNumber.setText(strValue + "6");
                        }
                    } else {
                        System.out.println("6번 버튼 에러");
                    }
                    break;
                case R.id.button_7:
                    if(strValue.equals(zer)&&!(symValue.length()>0)&&!(hidValue.length()>0)){
                        calculatorNumber.setText("7");
                    } else if(strValue.equals(zer)&&(symValue.length()>0)&&!(hidValue.length()>0)){
                        if(strValue.equals(zer)){
                            calculatorNumber.setText("7");
                        } else {
                            calculatorNumber.setText(strValue + "7");
                        }
                    } else if(!strValue.equals(zer)&&!(symValue.length()>0)&&!(hidValue.length()>0)){
                        if(strValue.equals(zer)){
                            calculatorNumber.setText("7");
                        } else {
                            calculatorNumber.setText(strValue + "7");
                        }
                    } else if(!strValue.equals(zer)&&(symValue.length()>0)&&!(hidValue.length()>0)){
                        hidValue = strValue;
                        calculatorNumber.setText(zer);
                        strValue = calculatorNumber.getText().toString();
                        if(strValue.equals(zer)){
                            calculatorNumber.setText("7");
                        } else {
                            calculatorNumber.setText(strValue + "7"); // 실행 안되는 코드 > 테스트 후 삭제 예정
                        }
                    } else if(!strValue.equals(zer)&&(symValue.length()>0)&&(hidValue.length()>0)){
                        if(strValue.equals(zer)){
                            calculatorNumber.setText("7"); // 실행 안되는 코드 > 테스트 후 삭제 예정
                        } else {
                            calculatorNumber.setText(strValue + "7");
                        }
                    } else {
                        System.out.println("7번 버튼 에러");
                    }
                    break;
                case R.id.button_8:
                    if(strValue.equals(zer)&&!(symValue.length()>0)&&!(hidValue.length()>0)){
                        calculatorNumber.setText("8");
                    } else if(strValue.equals(zer)&&(symValue.length()>0)&&!(hidValue.length()>0)){
                        if(strValue.equals(zer)){
                            calculatorNumber.setText("8");
                        } else {
                            calculatorNumber.setText(strValue + "8");
                        }
                    } else if(!strValue.equals(zer)&&!(symValue.length()>0)&&!(hidValue.length()>0)){
                        if(strValue.equals(zer)){
                            calculatorNumber.setText("8");
                        } else {
                            calculatorNumber.setText(strValue + "8");
                        }
                    } else if(!strValue.equals(zer)&&(symValue.length()>0)&&!(hidValue.length()>0)){
                        hidValue = strValue;
                        calculatorNumber.setText(zer);
                        strValue = calculatorNumber.getText().toString();
                        if(strValue.equals(zer)){
                            calculatorNumber.setText("8");
                        } else {
                            calculatorNumber.setText(strValue + "8"); // 실행 안되는 코드 > 테스트 후 삭제 예정
                        }
                    } else if(!strValue.equals(zer)&&(symValue.length()>0)&&(hidValue.length()>0)){
                        if(strValue.equals(zer)){
                            calculatorNumber.setText("8"); // 실행 안되는 코드 > 테스트 후 삭제 예정
                        } else {
                            calculatorNumber.setText(strValue + "8");
                        }
                    } else {
                        System.out.println("8번 버튼 에러");
                    }
                    break;
                case R.id.button_9:
                    if(strValue.equals(zer)&&!(symValue.length()>0)&&!(hidValue.length()>0)){
                        calculatorNumber.setText("9");
                    } else if(strValue.equals(zer)&&(symValue.length()>0)&&!(hidValue.length()>0)){
                        if(strValue.equals(zer)){
                            calculatorNumber.setText("9");
                        } else {
                            calculatorNumber.setText(strValue + "9");
                        }
                    } else if(!strValue.equals(zer)&&!(symValue.length()>0)&&!(hidValue.length()>0)){
                        if(strValue.equals(zer)){
                            calculatorNumber.setText("9");
                        } else {
                            calculatorNumber.setText(strValue + "9");
                        }
                    } else if(!strValue.equals(zer)&&(symValue.length()>0)&&!(hidValue.length()>0)){
                        hidValue = strValue;
                        calculatorNumber.setText(zer);
                        strValue = calculatorNumber.getText().toString();
                        if(strValue.equals(zer)){
                            calculatorNumber.setText("9");
                        } else {
                            calculatorNumber.setText(strValue + "9"); // 실행 안되는 코드 > 테스트 후 삭제 예정
                        }
                    } else if(!strValue.equals(zer)&&(symValue.length()>0)&&(hidValue.length()>0)){
                        if(strValue.equals(zer)){
                            calculatorNumber.setText("9"); // 실행 안되는 코드 > 테스트 후 삭제 예정
                        } else {
                            calculatorNumber.setText(strValue + "9");
                        }
                    } else {
                        System.out.println("9번 버튼 에러");
                    }
                    break;
                case R.id.button_0:
                    if(strValue.equals(zer)&&!(symValue.length()>0)&&!(hidValue.length()>0)){
                        calculatorNumber.setText("0");
                    } else if(strValue.equals(zer)&&(symValue.length()>0)&&!(hidValue.length()>0)){
                        if(strValue.equals(zer)){
                            calculatorNumber.setText("0");
                        } else {
                            calculatorNumber.setText(strValue + "0");
                        }
                    } else if(!strValue.equals(zer)&&!(symValue.length()>0)&&!(hidValue.length()>0)){
                        if(strValue.equals(zer)){
                            calculatorNumber.setText("0");
                        } else {
                            calculatorNumber.setText(strValue + "0");
                        }
                    } else if(!strValue.equals(zer)&&(symValue.length()>0)&&!(hidValue.length()>0)){
                        hidValue = strValue;
                        calculatorNumber.setText(zer);
                        strValue = calculatorNumber.getText().toString();
                        if(strValue.equals(zer)){
                            calculatorNumber.setText("0");
                        } else {
                            calculatorNumber.setText(strValue + "0"); // 실행 안되는 코드 > 테스트 후 삭제 예정
                        }
                    } else if(!strValue.equals(zer)&&(symValue.length()>0)&&(hidValue.length()>0)){
                        if(strValue.equals(zer)){
                            calculatorNumber.setText("0"); // 실행 안되는 코드 > 테스트 후 삭제 예정
                        } else {
                            calculatorNumber.setText(strValue + "0");
                        }
                    } else {
                        System.out.println("0번 버튼 에러");
                    }
                    break;


//                사칙연산
                case R.id.button_plu:
                    System.out.println("button_plu");
                    if(strValue.equals(zer)&&!(symValue.length()>0)&&!(hidValue.length()>0)){calculatorSymbol.setText(plu);System.out.println("button_plu 1");} // 초기화 기호 입력
                    else if(strValue.equals(zer)&&(symValue.length()>0)&&!(hidValue.length()>0)){calculatorSymbol.setText(plu);System.out.println("button_plu 2");} // symbol 변경

                    else if(!strValue.equals(zer)&&!(symValue.length()>0)&&!(hidValue.length()>0)){calculatorSymbol.setText(plu);System.out.println("button_plu 3");} // symbol 입력
                    else if(!strValue.equals(zer)&&(symValue.length()>0)&&!(hidValue.length()>0)){
                        calculatorSymbol.setText(plu);
                        System.out.println("button_plu 4");
                    } // symbol 변경
                    else if(!strValue.equals(zer)&&(symValue.length()>0)&&(hidValue.length()>0)){
                        System.out.println("button_plu 5");// 연산
                        System.out.println("plu : " + strValue + "/ " + hidValue + "/ " + symValue);
                        calculResult = methodEqu(strValue, hidValue, symValue);
                        System.out.println("calculResult : " + calculResult);
                        calculatorNumber.setText(calculResult);
                        calculatorSymbol.setText(plu);
                        calculatorHiddenNumber.setText(zer);
                        /*if(hisValue.length()>0){ // history 입력
                            calculatorHistory.setText(hisValue + strValue + symValue + hidValue + plu);
                        } else {
                            calculatorHistory.setText(strValue + symValue + hidValue + plu);
                        }*/
                    }
                    else{
                        System.out.println("덧셈 에러 식");
                    }

                    break;
                case R.id.button_min:
                case R.id.button_mul:
                case R.id.button_div:
                    calculResult = methodEqu(hidValue, strValue, symValue);
                    calculatorHistory.setText(hidValue + symValue + strValue);
                    calculatorNumber.setText(calculResult);

                    break;
                case R.id.button_dot:

                case R.id.button_equ:
                    calculResult = methodEqu(hidValue, strValue, symValue);

            }
        }
    };

    public static String methodEqu(String num1, String num2, String sym){
        String equResult = null;

        int intNum1 = 0;
        int intNum2 = 0;
        double doubleNum1 = 0;
        double doubleNum2 = 0;

        if(num1.equals(null)||num1.equals("")){
            num1 = "0";
        }
        if(num2.equals(null)||num2.equals("")){
            num2 = "0";
        }

        if(!(num1.contains(dot))&&!(num2.contains(dot))){ // 정수 연산
            intNum1 = Integer.parseInt(num1);
            intNum2 = Integer.parseInt(num2);
        } else {
            doubleNum1 = Double.parseDouble(num1);
            doubleNum2 = Double.parseDouble(num2);
        }

        if(sym.equals(plu)){
            equResult = String.valueOf(intNum1 + intNum2 + doubleNum1 + doubleNum2);
        } else if(sym.equals(min)){
            if((intNum1<intNum2)||(doubleNum1<doubleNum2)){
                equResult = String.valueOf(min + ((intNum2-intNum1)+(doubleNum2-doubleNum1)));
            } else {
                equResult = String.valueOf(intNum1-intNum2 + doubleNum1-doubleNum2);
            }
        } else if(sym.equals(mul)){
            equResult = String.valueOf((intNum1*intNum2) + (doubleNum1*doubleNum2));
        } else if(sym.equals(div)){
            equResult = String.valueOf((intNum1/intNum2) + (doubleNum1/doubleNum2));
        }

        System.out.println("methodEqu(equResult): " + equResult);

        return equResult;
    };
}
