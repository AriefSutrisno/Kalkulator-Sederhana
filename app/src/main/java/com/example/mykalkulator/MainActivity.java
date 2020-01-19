package com.example.mykalkulator;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    EditText editTextLayar;
    Button button1, button2, button3, button4, button5, button6, button7, button8, button9, button0;
    Button buttontambah, buttonkurang, buttonkali, buttonbagi;
    Button buttonhapus, buttonhasil;

    public static double nilaiini = 0;
    public static String operasiini = "";
    public static double hasil = 0.00;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    private void init() {
        editTextLayar = (EditText) findViewById(R.id.editTextLayar);
        button1 = (Button)findViewById(R.id.button1);
        button1.setOnClickListener(this);
        button2 = (Button)findViewById(R.id.button2);
        button2.setOnClickListener(this);
        button3 = (Button)findViewById(R.id.button3);
        button3.setOnClickListener(this);
        button4 = (Button)findViewById(R.id.button4);
        button4.setOnClickListener(this);
        button5 = (Button)findViewById(R.id.button5);
        button5.setOnClickListener(this);
        button6 = (Button)findViewById(R.id.button6);
        button6.setOnClickListener(this);
        button7 = (Button)findViewById(R.id.button7);
        button7.setOnClickListener(this);
        button8 = (Button)findViewById(R.id.button8);
        button8.setOnClickListener(this);
        button9 = (Button)findViewById(R.id.button9);
        button9.setOnClickListener(this);
        button0 = (Button)findViewById(R.id.button0);
        button0.setOnClickListener(this);

        buttontambah = (Button)findViewById(R.id.buttontambah);
        buttontambah.setOnClickListener(this);
        buttonkurang = (Button)findViewById(R.id.buttonkurang);
        buttonkurang.setOnClickListener(this);
        buttonkali = (Button)findViewById(R.id.buttonkali);
        buttonkali.setOnClickListener(this);
        buttonbagi = (Button)findViewById(R.id.buttonbagi);
        buttonbagi.setOnClickListener(this);

        buttonhapus = (Button)findViewById(R.id.buttonhapus);
        buttonhapus.setOnClickListener(this);
        buttonhasil = (Button)findViewById(R.id.buttonhasil);
        buttonhasil.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button1:
                editTextLayar.setText(editTextLayar.getText().toString().trim()+"1");
                break;
            case R.id.button2:
                editTextLayar.setText(editTextLayar.getText().toString().trim()+"2");
                break;
            case R.id.button3:
                editTextLayar.setText(editTextLayar.getText().toString().trim()+"3");
                break;
            case R.id.button4:
                editTextLayar.setText(editTextLayar.getText().toString().trim()+"4");
                break;
            case R.id.button5:
                editTextLayar.setText(editTextLayar.getText().toString().trim()+"5");
                break;
            case R.id.button6:
                editTextLayar.setText(editTextLayar.getText().toString().trim()+"6");
                break;
            case R.id.button7:
                editTextLayar.setText(editTextLayar.getText().toString().trim()+"7");
                break;
            case R.id.button8:
                editTextLayar.setText(editTextLayar.getText().toString().trim()+"8");
                break;
            case R.id.button9:
                editTextLayar.setText(editTextLayar.getText().toString().trim()+"9");
                break;
            case R.id.button0:
                editTextLayar.setText(editTextLayar.getText().toString().trim()+"0");
                break;

            case R.id.buttontambah:
                if (editTextLayar.getText().toString().trim().equals("")){
                    Toast.makeText(MainActivity.this,"Angka Harus diisi",Toast.LENGTH_SHORT).show();
                    return;
                }
                operasiini="tambah";
                nilaiini = Double.parseDouble(editTextLayar.getText().toString());
                editTextLayar.setText("");
                break;
            case R.id.buttonkurang:
                if (editTextLayar.getText().toString().trim().equals("")){
                    Toast.makeText(MainActivity.this,"Angka Harus diisi",Toast.LENGTH_SHORT).show();
                    return;
                }
                operasiini="kurang";
                nilaiini = Double.parseDouble(editTextLayar.getText().toString());
                editTextLayar.setText("");
                break;
            case R.id.buttonkali:
                if (editTextLayar.getText().toString().trim().equals("")){
                    Toast.makeText(MainActivity.this,"Angka Harus diisi",Toast.LENGTH_SHORT).show();
                    return;
                }
                operasiini="kali";
                nilaiini = Double.parseDouble(editTextLayar.getText().toString());
                editTextLayar.setText("");
                break;
            case R.id.buttonbagi:
                if (editTextLayar.getText().toString().trim().equals("")){
                    Toast.makeText(MainActivity.this,"Angka Harus diisi",Toast.LENGTH_SHORT).show();
                    return;
                }
                operasiini="bagi";
                nilaiini = Double.parseDouble(editTextLayar.getText().toString());
                editTextLayar.setText("");
                break;

            case R.id.buttonhapus:
                nilaiini=0;
                editTextLayar.setText("");
                break;

            case R.id.buttonhasil:
                if (operasiini.equals("tambah")){
                    hasil = nilaiini + Double.parseDouble(editTextLayar.getText().toString().trim());
                }
                if (operasiini.equals("kurang")){
                    hasil = nilaiini - Double.parseDouble(editTextLayar.getText().toString().trim());
                }
                if (operasiini.equals("bagi")){
                    hasil = nilaiini / Double.parseDouble(editTextLayar.getText().toString().trim());
                }
                if (operasiini.equals("kali")){
                    hasil = nilaiini * Double.parseDouble(editTextLayar.getText().toString().trim());
                }
                int nilaiTemp = (int) hasil;
                if (nilaiTemp == hasil){
                    editTextLayar.setText(String.valueOf((int)hasil));
                }else {
                    editTextLayar.setText(String.valueOf(hasil));
                }

                break;
        }
    }
}
