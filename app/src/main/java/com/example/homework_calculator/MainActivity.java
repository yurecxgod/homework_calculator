package com.example.homework_calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private EditText compute;
    private EditText result;
    private String formulaHolder;
    private String currentResult;
    private boolean isOperatorTriggered;
    private String operator;
    private List<String> firstHolder;
    private List<String> secondHolder;
    private Button btn_0, btn_1, btn_2, btn_3, btn_4, btn_5, btn_6, btn_7, btn_8, btn_9, btnDiv, btnMulti, btnMis, btnAdd, btnEqual, btnDot;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.formulaHolder = "";
        this.currentResult = "";
        this.isOperatorTriggered = false;
        this.firstHolder = new ArrayList<>();
        this.secondHolder = new ArrayList<>();

        findByIds();

        this.btn_0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isOperatorTriggered == true) {
                    firstHolder.add("0");
                    formulaHolder = formulaHolder + "0";
                } else {
                    secondHolder.add("0");
                    formulaHolder = formulaHolder + "0";
                }
                displayFormula(formulaHolder);
            }
        });

        this.btn_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isOperatorTriggered == true) {
                    firstHolder.add("1");
                    formulaHolder = formulaHolder + "1";
                } else {
                    secondHolder.add("1");
                    formulaHolder = formulaHolder + "1";
                }
                displayFormula(formulaHolder);
            }
        });

        this.btn_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isOperatorTriggered == true) {
                    firstHolder.add("2");
                    formulaHolder = formulaHolder + "2";
                } else {
                    secondHolder.add("2");
                    formulaHolder = formulaHolder + "2";
                }
                displayFormula(formulaHolder);
            }
        });

        this.btn_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isOperatorTriggered == true) {
                    firstHolder.add("3");
                    formulaHolder = formulaHolder + "3";
                } else {
                    secondHolder.add("3");
                    formulaHolder = formulaHolder + "3";
                }
                displayFormula(formulaHolder);
            }
        });

        this.btn_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isOperatorTriggered == true) {
                    firstHolder.add("4");
                    formulaHolder = formulaHolder + "4";
                } else {
                    secondHolder.add("4");
                    formulaHolder = formulaHolder + "4";
                }
                displayFormula(formulaHolder);
            }
        });

        this.btn_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isOperatorTriggered == true) {
                    firstHolder.add("5");
                    formulaHolder = formulaHolder + "5";
                } else {
                    secondHolder.add("5");
                    formulaHolder = formulaHolder + "5";
                }
                displayFormula(formulaHolder);
            }
        });

        this.btn_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isOperatorTriggered == true) {
                    firstHolder.add("6");
                    formulaHolder = formulaHolder + "6";
                } else {
                    secondHolder.add("6");
                    formulaHolder = formulaHolder + "6";
                }
                displayFormula(formulaHolder);
            }
        });

        this.btn_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isOperatorTriggered == true) {
                    firstHolder.add("7");
                    formulaHolder = formulaHolder + "7";
                } else {
                    secondHolder.add("7");
                    formulaHolder = formulaHolder + "7";
                }
                displayFormula(formulaHolder);
            }
        });

        this.btn_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isOperatorTriggered == true) {
                    firstHolder.add("8");
                    formulaHolder = formulaHolder + "8";
                } else {
                    secondHolder.add("8");
                    formulaHolder = formulaHolder + "8";
                }
                displayFormula(formulaHolder);
            }
        });

        this.btn_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isOperatorTriggered == true) {
                    firstHolder.add("9");
                    formulaHolder = formulaHolder + "9";
                } else {
                    secondHolder.add("9");
                    formulaHolder = formulaHolder + "9";
                }
                displayFormula(formulaHolder);
            }
        });

        this.btnDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                formulaHolder = formulaHolder + ".";
                displayFormula(formulaHolder);
            }
        });

        this.btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isOperatorTriggered == false) {
                    operator = "/";
                    formulaHolder = formulaHolder + "/";
                    isOperatorTriggered = true;
                }
                displayFormula(formulaHolder);
            }
        });

        this.btnMulti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isOperatorTriggered == false) {
                    operator = "*";
                    isOperatorTriggered = true;
                    formulaHolder = formulaHolder + "*";
                }
                displayFormula(formulaHolder);
            }
        });

        this.btnMis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isOperatorTriggered == false) {
                    operator = "-";
                    isOperatorTriggered = true;
                    formulaHolder = formulaHolder + "-";
                }
                displayFormula(formulaHolder);
            }
        });

        this.btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isOperatorTriggered == false) {
                    operator = "+";
                    isOperatorTriggered = true;
                    formulaHolder = formulaHolder + "+";
                }
                displayFormula(formulaHolder);
            }
        });

        this.btnEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int finalResult = computedResult(firstHolder, secondHolder, operator);
                displayResult(Integer.toString(finalResult));
            }
        });

    }

    private void findByIds() {
        this.compute = (EditText) findViewById(R.id.compute);
        this.result = (EditText) findViewById(R.id.result);
        this.btn_0 = (Button) findViewById(R.id.key_0);
        this.btn_1 = (Button) findViewById(R.id.key_1);
        this.btn_2 = (Button) findViewById(R.id.key_2);
        this.btn_3 = (Button) findViewById(R.id.key_3);
        this.btn_4 = (Button) findViewById(R.id.key_4);
        this.btn_5 = (Button) findViewById(R.id.key_5);
        this.btn_6 = (Button) findViewById(R.id.key_6);
        this.btn_7 = (Button) findViewById(R.id.key_7);
        this.btn_8 = (Button) findViewById(R.id.key_8);
        this.btn_9 = (Button) findViewById(R.id.key_9);
        this.btnDiv = (Button) findViewById(R.id.key_divide);
        this.btnMis = (Button) findViewById(R.id.key_minus);
        this.btnAdd = (Button) findViewById(R.id.key_plus);
        this.btnDot = (Button) findViewById(R.id.key_dot);
        this.btnMulti = (Button) findViewById(R.id.key_multy);
        this.btnEqual = (Button) findViewById(R.id.key_ravno);
    }

    private void displayFormula(String number) {
        this.compute.setText(number);
    }

    private void displayResult(String result) {
        this.result.setText(result);
    }

    private static int computedResult(List<String> listOne, List<String> listTwo, String operator) {
        int sumFirstHolder = 0;
        int sumSecondHolder = 0;
        int result = 0;

        for (int i = 0; i < listOne.size(); i++) {
            sumFirstHolder += Integer.parseInt(listOne.get(i));
        }

        for (int i = 0; i < listTwo.size(); i++) {
            sumSecondHolder += Integer.parseInt(listTwo.get(i));
        }

        switch (operator) {
            case "+":
                result = sumFirstHolder + sumSecondHolder;
                break;
            case "-":
                result = sumFirstHolder - sumSecondHolder;
                break;
            case "*":
                result = sumFirstHolder * sumSecondHolder;
                break;
            case "/":
                result = sumFirstHolder / sumSecondHolder;
                break;
        }
        return result;
    }
}