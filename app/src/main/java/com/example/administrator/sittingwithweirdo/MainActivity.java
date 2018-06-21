package com.example.administrator.sittingwithweirdo;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView txt;
    float num = 0;
    int op = 0;
    int[] buttId = new int[]{0, R.id.button, R.id.button2, R.id.button3, R.id.button4, R.id.button5, R.id.button6, R.id.button7,
            R.id.button8, R.id.button9, R.id.button10, R.id.button11, R.id.button12, R.id.button13, R.id.button14, R.id.button15, R.id.button16, R.id.button17};
    Button b[] = new Button[20];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        for (int i = 1; i < buttId.length; i++) {

            b[i] = (Button) findViewById(buttId[i]);
            b[i].setOnClickListener(this);
        }

        txt = findViewById(R.id.textView);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Why are you even clicking here you moron? The numbers are above", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


    @Override
    public void onClick(View view) {

            switch (view.getId()) {
                case R.id.button:
                    txt.setText(txt.getText() + "8");
                    break;
                case R.id.button2:
                    txt.setText(txt.getText() + "7");
                    break;
                case R.id.button3:
                    txt.setText(txt.getText() + "0");
                    break;
                case R.id.button4:
                    txt.setText(txt.getText() + b[4].getText().toString());
                    break;
                case R.id.button5:
                    txt.setText(txt.getText() + b[5].getText().toString());
                    break;
                case R.id.button6:
                    txt.setText(txt.getText() + b[6].getText().toString());
                    break;
                case R.id.button7:
                    txt.setText(txt.getText() + b[7].getText().toString());
                    break;
                case R.id.button8:
                    txt.setText(txt.getText() + b[8].getText().toString());
                    break;
                case R.id.button9:
                    txt.setText(txt.getText() + b[9].getText().toString());
                    break;
                case R.id.button10:
                    txt.setText(txt.getText() + b[10].getText().toString());
                    break;
                case R.id.button11:
                    txt.setText(txt.getText() + b[11].getText().toString());
                    break;
                case R.id.button12:
                    if (txt.getText().toString().compareTo("") != 0) {
                        float num2 = Float.parseFloat(txt.getText().toString());
                        float res = 0;
                        txt.setText("");
                        if (op == 1) {
                            res = num - num2;
                        } else if (op == 2) {
                            res = num + num2;
                        } else if (op == 3) {
                            res = num * num2;
                        } else if (op == 4) {
                            res = num / num2;
                        } else {
                            Toast.makeText(this, "Enter valid logic", Toast.LENGTH_SHORT).show();
                        }
                        txt.setText(res + "");
                        op = 0;
                        num = 0;
                    } else {
                        Toast.makeText(this, "Enter valid logic", Toast.LENGTH_SHORT).show();
                    }

                    break;
                case R.id.button13:
                    num = Float.parseFloat(txt.getText().toString());
                    txt.setText("");
                    op = 1;
                    break;
                case R.id.button14:
                    num = Float.parseFloat(txt.getText().toString());
                    txt.setText("");
                    op = 2;
                    break;
                case R.id.button15:
                    num = Float.parseFloat(txt.getText().toString());
                    txt.setText("");
                    op = 3;
                    break;
                case R.id.button16:
                    num = 0;
                    op = 0;
                    txt.setText("");
                    break;
                case R.id.button17:
                    num = Float.parseFloat(txt.getText().toString());
                    txt.setText("");
                    op = 4;
                    break;
                default:
                    Toast.makeText(this, "Enter valid logic", Toast.LENGTH_SHORT).show();
                    break;
            }
    }
}
