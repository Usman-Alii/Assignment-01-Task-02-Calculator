package pk.edu.pucit.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import org.mariuszgromada.math.mxparser.*;

public class MainActivity extends AppCompatActivity {
    TextView btn1, btn2, btn3, btn4, btn5,
            btn6, btn7, btn8, btn9, btn_0,
            btnDot, btn_00;
    TextView btn_AC, btn_Equal, btn_Mod, btn_Div, btn_Multi,
            btn_Sub, btn_Add, btn_Del;
    TextView tv_Equation, tv_Result;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        btn_0 = (TextView) findViewById(R.id.btn_0);
        btn1 = (TextView) findViewById(R.id.btn_1);
        btn2 = (TextView) findViewById(R.id.btn_2);
        btn3 = (TextView) findViewById(R.id.btn_3);
        btn4 = (TextView) findViewById(R.id.btn_4);
        btn5 = (TextView) findViewById(R.id.btn_5);
        btn6 = (TextView) findViewById(R.id.btn_6);
        btn7 = (TextView) findViewById(R.id.btn_7);
        btn8 = (TextView) findViewById(R.id.btn_8);
        btn9 = (TextView) findViewById(R.id.btn_9);
        btn_00 = (TextView) findViewById(R.id.btn_00);
        btnDot = (TextView) findViewById(R.id.btn_dot);


        btn_AC = (TextView) findViewById(R.id.btn_AC);
        btn_Del = (TextView) findViewById(R.id.btn_del);
        btn_Equal = (TextView) findViewById(R.id.btn_equal);
        btn_Add = (TextView) findViewById(R.id.btn_Plus);
        btn_Sub = (TextView) findViewById(R.id.btn_sub);
        btn_Div = (TextView) findViewById(R.id.btn_div);
        btn_Mod = (TextView) findViewById(R.id.btn_mod);
        btn_Multi = (TextView) findViewById(R.id.btn_multiply);


        tv_Equation = (TextView) findViewById(R.id.tv_equation);
        tv_Result = (TextView) findViewById(R.id.tv_result);

        clearScreen();



        //click listeners



        btn_AC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clearScreen();
            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                writeExpression("1");
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                writeExpression("2");
            }
        });


        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                writeExpression("3");
            }
        });


        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                writeExpression("4");
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                writeExpression("5");
            }
        });


        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                writeExpression("6");
            }
        });


        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                writeExpression("7");
            }
        });



        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                writeExpression("8");
            }
        });


        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                writeExpression("9");
            }
        });



        btn_0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                writeExpression("0");
            }
        });


        btn_00.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                writeExpression("00");
            }
        });


        btnDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                writeExpression(".");
            }
        });


        btn_Add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                writeExpression("+");
            }
        });



        btn_Sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                writeExpression("-");
            }
        });



        btn_Multi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                writeExpression("*");
            }
        });


        btn_Div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                writeExpression("/");
            }
        });


        btn_Mod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                writeExpression("%");
            }
        });



        btn_Equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String expression = tv_Equation.getText().toString();
                if(expression.length()>0) {

                    Expression e = new Expression(expression);
                    String result = String.valueOf(e.calculate());
                    if(result=="NaN")
                    {
                        tv_Result.setText("Syntax Error");
                    }
                    else {
                        tv_Result.setText(result);
                    }
                }
            }
        });


        btn_Del.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String expression = tv_Equation.getText().toString();
                if(expression.length()>0)
                {
                    expression=expression.substring(1);
                    tv_Equation.setText(expression);
                }

            }
        });












    }






    void clearScreen(){
        tv_Equation.setText("");
        tv_Result.setText("0");
    }



    void writeExpression(String value){
        String expression = tv_Equation.getText().toString();
        expression = expression + value;

        tv_Equation.setText(expression);
    }
}

