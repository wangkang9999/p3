package com.example.mm99d.p3;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import java.util.ArrayList;
import java.lang.*;

/**
 * Created by mm99d on 2018/2/23.
 */

public class Sudoku extends Activity {

    ArrayList<ArrayList<EditText>>  mx=new ArrayList<>();
    Table t1;

    protected void onCreate (Bundle x){
        super.onCreate(x);
        setContentView(R.layout.sudokulayout);

        
        // l1
        ArrayList<EditText> l1=new ArrayList<>();
        EditText x11=(EditText)findViewById(R.id.s11);
        l1.add(x11);
        EditText x12=(EditText)findViewById(R.id.s12);
        l1.add(x12);
        EditText x13=(EditText)findViewById(R.id.s13);
        l1.add(x13);
        EditText x14=(EditText)findViewById(R.id.s14);
        l1.add(x14);
        EditText x15=(EditText)findViewById(R.id.s15);
        l1.add(x15);
        EditText x16=(EditText)findViewById(R.id.s16);
        l1.add(x16);
        EditText x17=(EditText)findViewById(R.id.s17);
        l1.add(x17);
        EditText x18=(EditText)findViewById(R.id.s18);
        l1.add(x18);
        EditText x19=(EditText)findViewById(R.id.s19);
        l1.add(x19);

        // l2
        ArrayList<EditText> l2=new ArrayList<>();
        EditText x21=(EditText)findViewById(R.id.s21);
        l2.add(x21);
        EditText x22=(EditText)findViewById(R.id.s22);
        l2.add(x22);
        EditText x23=(EditText)findViewById(R.id.s23);
        l2.add(x23);
        EditText x24=(EditText)findViewById(R.id.s24);
        l2.add(x24);
        EditText x25=(EditText)findViewById(R.id.s25);
        l2.add(x25);
        EditText x26=(EditText)findViewById(R.id.s26);
        l2.add(x26);
        EditText x27=(EditText)findViewById(R.id.s27);
        l2.add(x27);
        EditText x28=(EditText)findViewById(R.id.s28);
        l2.add(x28);
        EditText x29=(EditText)findViewById(R.id.s29);
        l2.add(x29);

        // l3
        ArrayList<EditText> l3=new ArrayList<>();
        EditText x31=(EditText)findViewById(R.id.s31);
        l3.add(x31);
        EditText x32=(EditText)findViewById(R.id.s32);
        l3.add(x32);
        EditText x33=(EditText)findViewById(R.id.s33);
        l3.add(x33);
        EditText x34=(EditText)findViewById(R.id.s34);
        l3.add(x34);
        EditText x35=(EditText)findViewById(R.id.s35);
        l3.add(x35);
        EditText x36=(EditText)findViewById(R.id.s36);
        l3.add(x36);
        EditText x37=(EditText)findViewById(R.id.s37);
        l3.add(x37);
        EditText x38=(EditText)findViewById(R.id.s38);
        l3.add(x38);
        EditText x39=(EditText)findViewById(R.id.s39);
        l3.add(x39);


        // l4
        ArrayList<EditText> l4=new ArrayList<>();
        EditText x41=(EditText)findViewById(R.id.s41);
        l4.add(x41);
        EditText x42=(EditText)findViewById(R.id.s42);
        l4.add(x42);
        EditText x43=(EditText)findViewById(R.id.s43);
        l4.add(x43);
        EditText x44=(EditText)findViewById(R.id.s44);
        l4.add(x44);
        EditText x45=(EditText)findViewById(R.id.s45);
        l4.add(x45);
        EditText x46=(EditText)findViewById(R.id.s46);
        l4.add(x46);
        EditText x47=(EditText)findViewById(R.id.s47);
        l4.add(x47);
        EditText x48=(EditText)findViewById(R.id.s48);
        l4.add(x48);
        EditText x49=(EditText)findViewById(R.id.s49);
        l4.add(x49);

        // l5
        ArrayList<EditText> l5=new ArrayList<>();
        EditText x51=(EditText)findViewById(R.id.s51);
        l5.add(x51);
        EditText x52=(EditText)findViewById(R.id.s52);
        l5.add(x52);
        EditText x53=(EditText)findViewById(R.id.s53);
        l5.add(x53);
        EditText x54=(EditText)findViewById(R.id.s54);
        l5.add(x54);
        EditText x55=(EditText)findViewById(R.id.s55);
        l5.add(x55);
        EditText x56=(EditText)findViewById(R.id.s56);
        l5.add(x56);
        EditText x57=(EditText)findViewById(R.id.s57);
        l5.add(x57);
        EditText x58=(EditText)findViewById(R.id.s58);
        l5.add(x58);
        EditText x59=(EditText)findViewById(R.id.s59);
        l5.add(x59);

        // l6
        ArrayList<EditText> l6=new ArrayList<>();
        EditText x61=(EditText)findViewById(R.id.s61);
        l6.add(x61);
        EditText x62=(EditText)findViewById(R.id.s62);
        l6.add(x62);
        EditText x63=(EditText)findViewById(R.id.s63);
        l6.add(x63);
        EditText x64=(EditText)findViewById(R.id.s64);
        l6.add(x64);
        EditText x65=(EditText)findViewById(R.id.s65);
        l6.add(x65);
        EditText x66=(EditText)findViewById(R.id.s66);
        l6.add(x66);
        EditText x67=(EditText)findViewById(R.id.s67);
        l6.add(x67);
        EditText x68=(EditText)findViewById(R.id.s68);
        l6.add(x68);
        EditText x69=(EditText)findViewById(R.id.s69);
        l6.add(x69);

        // l7
        ArrayList<EditText> l7=new ArrayList<>();
        EditText x71=(EditText)findViewById(R.id.s71);
        l7.add(x71);
        EditText x72=(EditText)findViewById(R.id.s72);
        l7.add(x72);
        EditText x73=(EditText)findViewById(R.id.s73);
        l7.add(x73);
        EditText x74=(EditText)findViewById(R.id.s74);
        l7.add(x74);
        EditText x75=(EditText)findViewById(R.id.s75);
        l7.add(x75);
        EditText x76=(EditText)findViewById(R.id.s76);
        l7.add(x76);
        EditText x77=(EditText)findViewById(R.id.s77);
        l7.add(x77);
        EditText x78=(EditText)findViewById(R.id.s78);
        l7.add(x78);
        EditText x79=(EditText)findViewById(R.id.s79);
        l7.add(x79);

        // l8
        ArrayList<EditText> l8=new ArrayList<>();
        EditText x81=(EditText)findViewById(R.id.s81);
        l8.add(x81);
        EditText x82=(EditText)findViewById(R.id.s82);
        l8.add(x82);
        EditText x83=(EditText)findViewById(R.id.s83);
        l8.add(x83);
        EditText x84=(EditText)findViewById(R.id.s84);
        l8.add(x84);
        EditText x85=(EditText)findViewById(R.id.s85);
        l8.add(x85);
        EditText x86=(EditText)findViewById(R.id.s86);
        l8.add(x86);
        EditText x87=(EditText)findViewById(R.id.s87);
        l8.add(x87);
        EditText x88=(EditText)findViewById(R.id.s88);
        l8.add(x88);
        EditText x89=(EditText)findViewById(R.id.s89);
        l8.add(x89);

        // l9
        ArrayList<EditText> l9=new ArrayList<>();
        EditText x91=(EditText)findViewById(R.id.s91);
        l9.add(x91);
        EditText x92=(EditText)findViewById(R.id.s92);
        l9.add(x92);
        EditText x93=(EditText)findViewById(R.id.s93);
        l9.add(x93);
        EditText x94=(EditText)findViewById(R.id.s94);
        l9.add(x94);
        EditText x95=(EditText)findViewById(R.id.s95);
        l9.add(x95);
        EditText x96=(EditText)findViewById(R.id.s96);
        l9.add(x96);
        EditText x97=(EditText)findViewById(R.id.s97);
        l9.add(x97);
        EditText x98=(EditText)findViewById(R.id.s98);
        l9.add(x98);
        EditText x99=(EditText)findViewById(R.id.s99);
        l9.add(x99);


        mx.add(l1);
        mx.add(l2);
        mx.add(l3);
        mx.add(l4);
        mx.add(l5);
        mx.add(l6);
        mx.add(l7);
        mx.add(l8);
        mx.add(l9);



        for (int i=0;i<9;i++){
            for (int j=0;j<9;j++){
                mx.get(i).get(j).setText("");
                mx.get(i).get(j).setShowSoftInputOnFocus(false);
                mx.get(i).get(j).setTextColor(this.getResources().getColor(R.color.colorBlack));
                if ((i/3*3+j/3)%2==0 ){
                    mx.get(i).get(j).setBackground(this.getResources().getDrawable(R.drawable.bg_edittext2));
                }else{
                    mx.get(i).get(j).setBackground(this.getResources().getDrawable(R.drawable.bg_edittext));
                }
            }
        }

        Button btn3,btn4,btn5;

        btn3 = (Button) findViewById(R.id.button3);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int[][] input=new int[9][9];
                String s;
                for (int i=0;i<9;i++){
                    for (int j=0;j<9;j++){
                        s=mx.get(i).get(j).getText().toString();
                        if (s.equals("")){
                            input[i][j]=0;
                        }else{
                            input[i][j]=Integer.valueOf(s);
                        }
                    }
                }
                t1=new Table(input);
                t1.solve();
                Table t2=t1.solution;
                for (int i=0;i<9;i++){
                    for (int j=0;j<9;j++){
                        if (mx.get(i).get(j).getText().toString().equals("")){
                            mx.get(i).get(j).setText(String.valueOf((t2.mxt[i][j])));
                            mx.get(i).get(j).setTextColor(0xffff0000);
                        }
                    }
                }
            }
        });

        btn5 = (Button) findViewById(R.id.button5);
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
            });

        btn4 = (Button) findViewById(R.id.button4);
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText x;
                for (int i=0;i<9;i++){
                    for (int j=0;j<9;j++){
                        x=mx.get(i).get(j);
                        x.setText("");
                        x.setTextColor(0xff000000);
                    }
                }
            }
        });

        Button n1,n2,n3,n4,n5,n6,n7,n8,n9;


        n2= (Button) findViewById(R.id.button14);
        n2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                for (int i=0;i<9;i++) {
                    for (int j = 0; j < 9; j++) {
                        if (mx.get(i).get(j).isFocused()){
                            mx.get(i).get(j).setText("2");
                        }
                    }
                }
            }
        });

        n1= (Button) findViewById(R.id.button15);
        n1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                for (int i=0;i<9;i++) {
                    for (int j = 0; j < 9; j++) {
                        if (mx.get(i).get(j).isFocused()){
                            mx.get(i).get(j).setText("1");
                        }
                    }
                }
            }
        });
        n3= (Button) findViewById(R.id.button16);
        n3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                for (int i=0;i<9;i++) {
                    for (int j = 0; j < 9; j++) {
                        if (mx.get(i).get(j).isFocused()){
                            mx.get(i).get(j).setText("3");
                        }
                    }
                }
            }
        });
        n5= (Button) findViewById(R.id.button17);
        n5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                for (int i=0;i<9;i++) {
                    for (int j = 0; j < 9; j++) {
                        if (mx.get(i).get(j).isFocused()){
                            mx.get(i).get(j).setText("5");
                        }
                    }
                }
            }
        });
        n4= (Button) findViewById(R.id.button18);
        n4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                for (int i=0;i<9;i++) {
                    for (int j = 0; j < 9; j++) {
                        if (mx.get(i).get(j).isFocused()){
                            mx.get(i).get(j).setText("4");
                        }
                    }
                }
            }
        });
        n6= (Button) findViewById(R.id.button19);
        n6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                for (int i=0;i<9;i++) {
                    for (int j = 0; j < 9; j++) {
                        if (mx.get(i).get(j).isFocused()){
                            mx.get(i).get(j).setText("6");
                        }
                    }
                }
            }
        });
        n8= (Button) findViewById(R.id.button20);
        n8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                for (int i=0;i<9;i++) {
                    for (int j = 0; j < 9; j++) {
                        if (mx.get(i).get(j).isFocused()){
                            mx.get(i).get(j).setText("8");
                        }
                    }
                }
            }
        });
        n7= (Button) findViewById(R.id.button21);
        n7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                for (int i=0;i<9;i++) {
                    for (int j = 0; j < 9; j++) {
                        if (mx.get(i).get(j).isFocused()){
                            mx.get(i).get(j).setText("7");
                        }
                    }
                }
            }
        });
        n9= (Button) findViewById(R.id.button22);
        n9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                for (int i=0;i<9;i++) {
                    for (int j = 0; j < 9; j++) {
                        if (mx.get(i).get(j).isFocused()){
                            mx.get(i).get(j).setText("9");
                        }
                    }
                }
            }
        });

    }


}
