package com.example.calculatrice;



import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import  org.mariuszgromada.math.mxparser.*;

import java.text.DecimalFormat;


public class MainActivity extends AppCompatActivity {
    //attributes:
    Button btn0,btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btnPlus,btnMinus,btnDivide,btnModulo,btnEquals,btnClear,btnBracket,btnPoint,btnMultiply,btnHistory,btnplusMinus,btnSin,btnCos,btnTan,btnExp,btnLn,btnSqrt,btnPower;
    ImageButton btnDelete;
    TextView input0,input1;
    String process;
    boolean checkBracket;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //find id of view:
        //buttons views:
        btn0 = findViewById(R.id.zeroBTN);
        btn1 = findViewById(R.id.oneBTN);
        btn2 = findViewById(R.id.twoBTN);
        btn3 = findViewById(R.id.threeBTN);
        btn4 = findViewById(R.id.fourBTN);
        btn5 = findViewById(R.id.fiveBTN);
        btn6 = findViewById(R.id.sexBTN);
        btn7 = findViewById(R.id.sevenBTN);
        btn8 = findViewById(R.id.eightBTN);
        btn9 = findViewById(R.id.nineBTN);

        btnPlus = findViewById(R.id.plusBTN);
        btnMinus = findViewById(R.id.minusBTN);
        btnModulo = findViewById(R.id.moduloBTN);
        btnDivide = findViewById(R.id.divideBTN);
        btnMultiply = findViewById(R.id.multiplyBTN);
        btnEquals = findViewById(R.id.equalBTN);
        btnClear = findViewById(R.id.clearBTN);
        btnBracket = findViewById(R.id.parenthesesBTN);
        btnPoint = findViewById(R.id.pointBTN);
        btnplusMinus = findViewById(R.id.plusMinusBTN);
        btnSin = findViewById(R.id.sinBTN);
        btnCos = findViewById(R.id.cosBTN);
        btnTan = findViewById(R.id.tanBTN);
        btnExp = findViewById(R.id.expBTN);
        btnLn = findViewById(R.id.logBTN);
        btnSqrt = findViewById(R.id.sqrtBTN);
        btnPower = findViewById(R.id.powerBTN);
        btnDelete = findViewById(R.id.deleteBTN);
        //input views:
        input0= findViewById(R.id.input0);
        input1 = findViewById(R.id.input1);

        //setListeners to views:
        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input0.setText("");
                input1.setText("");
                checkBracket = false;
            }
        });
        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process = input0.getText().toString();
                input0.setText(process+"0");
            }
        });
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process = input0.getText().toString();
                input0.setText(process+"1");
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process = input0.getText().toString();
                input0.setText(process+"2");
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process = input0.getText().toString();
                input0.setText(process+"3");
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process = input0.getText().toString();
                input0.setText(process+"3");
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process = input0.getText().toString();
                input0.setText(process+"4");
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process = input0.getText().toString();
                input0.setText(process+"5");
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process = input0.getText().toString();
                input0.setText(process+"6");
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process = input0.getText().toString();
                input0.setText(process+"7");
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process = input0.getText().toString();
                input0.setText(process+"8");
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process = input0.getText().toString();
                input0.setText(process+"9");
            }
        });
        btnPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process = input0.getText().toString();
                input0.setText(process+"+");
            }
        });
        btnDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process = input0.getText().toString();
                input0.setText(process+"÷");
            }
        });
        btnMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process = input0.getText().toString();
                input0.setText(process+"-");
            }
        });
        btnMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process = input0.getText().toString();
                input0.setText(process+"x");
            }
        });
        btnModulo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process = input0.getText().toString();
                input0.setText(process+"%");
            }
        });
        btnPoint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process = input0.getText().toString();
                input0.setText(process+".");
            }
        });
        btnplusMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process = input0.getText().toString();
                input0.setText("(-" +process);
                checkBracket = true;
            }
        });
        btnBracket.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(checkBracket){
                    process = input0.getText().toString();
                    input0.setText(process+")");
                    checkBracket = false;

                }else{
                    process = input0.getText().toString();
                    input0.setText(process+"(");
                    checkBracket = true;
                }
            }
        });
        btnDelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process = input0.getText().toString();
                if(!process.equals("")){
                    input0.setText(process.substring(0,process.length()-1));
                }
            }
        });
        btnSin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process = input0.getText().toString();
                input0.setText(process+"sin(");
                checkBracket = true;
            }
        });
        btnCos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process = input0.getText().toString();
                input0.setText(process+"cos(");
                checkBracket = true;
            }
        });
        btnTan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process = input0.getText().toString();
                input0.setText(process+"tan(");
                checkBracket = true;
            }
        });
        btnLn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process = input0.getText().toString();
                input0.setText(process+"Log10(");
                checkBracket = true;
            }
        });
        btnExp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process = input0.getText().toString();
                input0.setText(process+"e^(");
                checkBracket = true;
            }
        });
        btnSqrt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process = input0.getText().toString();
                input0.setText(process+"√(");
                checkBracket = true;
            }
        });
        btnPower.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process = input0.getText().toString();
                if(!process.equals("")){
                    input0.setText(process+"^(2)");
                    checkBracket = false;
                }
            }
        });
        btnEquals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process = input0.getText().toString();
                //
                process = process.replaceAll("x","*");
                process = process.replaceAll("%","/100");
                process = process.replaceAll("÷","/");
                process = process.replaceAll("√","sqrt");
                process = process.replaceAll("Log10","log10");
                process = process.replaceAll("e^","exp");
                //define a format:
                DecimalFormat decimalFormat = new DecimalFormat("#.######");
                //
                Expression expression = new Expression(process);
                String result = String.valueOf(decimalFormat.format(expression.calculate()));
                input1.setText(result);
            }
        });
    }
}