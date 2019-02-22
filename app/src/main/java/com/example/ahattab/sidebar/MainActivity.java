package com.example.ahattab.sidebar;

import android.content.Intent;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener
{
    private DrawerLayout dl;
    private ActionBarDrawerToggle t;
    double input1 = 0, input2 = 0;
    TextView edt1;
    boolean Addition, Subtract, Multiplication, Division, mRemainder, decimal;
    Button button0, button1, button2, button3, button4, button5, button6, button7, button8, button9, buttonAdd, buttonSub,
            buttonMul, buttonDivision, buttonEqual, buttonDel, buttonDot, Remainder, buttonReset, buttonPlusNegative;
    final ArrayList<String> list = new ArrayList<String>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dl = (DrawerLayout)findViewById(R.id.drawer_layout);
        t = new ActionBarDrawerToggle
                (this, dl,R.string.nav_open, R.string.nav_close);
        dl.addDrawerListener(t);
        t.syncState();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        NavigationView nv = findViewById(R.id.nav_view);
        nv.setNavigationItemSelectedListener(this);

        button0 =  findViewById(R.id.button0);
        button1 =  findViewById(R.id.button1);
        button2 =  findViewById(R.id.button2);
        button3 =  findViewById(R.id.button3);
        button4 =  findViewById(R.id.button4);
        button5 =  findViewById(R.id.button5);
        button6 =  findViewById(R.id.button6);
        button7 =  findViewById(R.id.button7);
        button8 =  findViewById(R.id.button8);
        button9 =  findViewById(R.id.button9);
        buttonDot =  findViewById(R.id.buttonDot);
        buttonAdd =  findViewById(R.id.buttonadd);
        buttonSub =  findViewById(R.id.buttonsub);
        buttonMul =  findViewById(R.id.buttonmul);
        buttonDivision =  findViewById(R.id.buttondiv);
        Remainder =  findViewById(R.id.Remainder);
        buttonDel = findViewById(R.id.buttonDel);
        buttonEqual =  findViewById(R.id.buttoneql);
        buttonReset = findViewById(R.id.buttonReset);
        buttonPlusNegative = findViewById(R.id.buttonPlusNegative);



        edt1 = findViewById(R.id.display);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt1.setText(edt1.getText() + "1");
                list.add("1 \n");
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt1.setText(edt1.getText() + "2");
                list.add("2 \n");
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt1.setText(edt1.getText() + "3");
                list.add("3 \n");
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt1.setText(edt1.getText() + "4");
                list.add("4 \n");
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt1.setText(edt1.getText() + "5");
                list.add("5 \n");
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt1.setText(edt1.getText() + "6");
                list.add("6 \n");
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt1.setText(edt1.getText() + "7");
                list.add("7 \n");
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt1.setText(edt1.getText() + "8");
                list.add("8 \n");
            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt1.setText(edt1.getText() + "9");
                list.add("9 \n");
            }
        });

        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt1.setText(edt1.getText() + "0");
                list.add("0 \n");
            }
        });


        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (edt1.getText().length() != 0) {
                    input1 = Float.parseFloat(edt1.getText() + "");
                    Addition = true;
                    decimal = false;
                    edt1.setText(null);
                    list.add("+ \n");
                }
            }
        });

        buttonSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (edt1.getText().length() != 0) {
                    input1 = Float.parseFloat(edt1.getText() + "");
                    Subtract = true;
                    decimal = false;
                    edt1.setText(null);
                    list.add("- \n");
                }
            }
        });

        buttonMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (edt1.getText().length() != 0) {
                    input1 = Float.parseFloat(edt1.getText() + "");
                    Multiplication = true;
                    decimal = false;
                    edt1.setText(null);
                    list.add("x \n");
                }
            }
        });

        buttonDivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (edt1.getText().length() != 0) {
                    input1 = Float.parseFloat(edt1.getText() + "");
                    Division = true;
                    decimal = false;
                    edt1.setText(null);
                    list.add("÷ \n");

                }
            }
        });

        Remainder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (edt1.getText().length() != 0) {
                    input1 = Float.parseFloat(edt1.getText() + "");
                    mRemainder = true;
                    decimal = false;
                    edt1.setText(null);
                    list.add("% \n");
                }
            }
        });

        buttonEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Addition || Subtract || Multiplication || Division || mRemainder) {
                    input2 = Float.parseFloat(edt1.getText() + "");
                }

                if (Addition) {

                    edt1.setText(input1 + input2 + ""+ "\n");
                    Addition = false;
                    list.add("=");
                    list.add(input1 + input2 + "");

                }

                if (Subtract) {

                    edt1.setText(input1 - input2 + ""+ "\n");
                    Subtract = false;
                    list.add("=");
                    list.add(input1 - input2 + ""+ "\n");
                }

                if (Multiplication) {
                    edt1.setText(input1 * input2 + ""+ "\n");
                    Multiplication = false;
                    list.add("=");
                    list.add(input1 * input2 + "" + "\n");
                }

                if (Division) {
                    edt1.setText(input1 / input2 + "");
                    Division = false;
                    list.add("=");
                    list.add(input1 / input2 + "");
                }
                if (mRemainder) {
                    edt1.setText(edt1.getText() + ""+ "\n");
                    mRemainder = false;
                    list.add("=");
                    list.add(input1 % input2 + ""+ "\n");
                }
            }
        });

        buttonDel.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

                edt1.setText("");
            }
        });

        buttonReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt1.setText("");
                input1 = 0.0;
                input2 = 0.0;
                list.add("Reset");

            }
        });
        buttonPlusNegative.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

                edt1.setText("-" + edt1.getText());
                list.add("Negative");
            }

        });

        buttonDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (decimal) {
                    //do nothing or you can show the error
                } else {
                    edt1.setText(edt1.getText() + ".");
                    decimal = true;
                    list.add(".");

                }

            }
        });


    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (t.onOptionsItemSelected(item))
            return true;
        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onNavigationItemSelected(MenuItem item)
    {
if (item.getItemId() == R.id.nav_about){

    Intent i = new Intent (getApplicationContext(),Main2Activity.class);
    startActivity(i);
}
if(item.getItemId()== R.id.nav_history){
    Intent i = new Intent(getApplicationContext(), Main3Activity.class);
    String listString = "";

    for (String s : list)
    {
        listString += s + "\t";
    }
    i.putExtra("value", listString);
    startActivity(i);

}

dl.closeDrawer(GravityCompat.START);
        return true;
    }
}
