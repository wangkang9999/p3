
package com.example.mm99d.p3;
/**
 * Created by mm99d on 2018/2/23.
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class Table {

    int[][] mxt=new int[9][9];
    boolean flag=false;
    Table solution;
    String workon;
    int index;
    int lvl;

    public Table(){
        for (int i=0;i<9;i++) {
            for (int j=0;j<9;j++) {
                mxt[i][j]=0;
            }
        }
    }

    public Table (int[][] x){
        mxt=x;
    }

    public void random() {
        int[]  r1= {1,2,3,4,5,6,7,8,9};
        int[]  v1= {0,1,2,3,4,5,6,7,8};
        List r2 = new ArrayList();
        List v2 = new ArrayList();
        for(int i = 0;i < r1.length;i++){
            r2.add(r1[i]);
            v2.add(v1[i]);
        }
        Collections.shuffle(r2);
        Collections.shuffle(v2);

        for (int i=0;i<9;i++) {
            mxt[i][(int) v2.get(i)]=(int) r2.get(i);
        }
        this.solve();
        solution.show();
        lvl=(int) v2.get(8);
        int type=17+lvl*3;

        List mx=new ArrayList();
        for (int i=0;i<81;i++) {
            mx.add(i);
        }
        Collections.shuffle(mx);
        int x;
        for (int i=0;i<81-type;i++) {
            x=(int)mx.get(i);
            solution.mxt[x/9][x%9]=0;
        }
    }


    public boolean checkfinish() {
        for (int i=0;i<9;i++) {
            for (int j=0;j<9;j++) {
                if (mxt[i][j]==0) {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean checksubmit() {
        return checkfinish() && check(this);
    }


    public void solve (){
        degree(this,0);
    }


    public void degree(Table t, int d){
        Table tt=copy(t);
        int r,c;
        r=d/9;
        c=d%9;


        if (d==81 ){
            flag=true;
            solution=t.copy(t);
            return;
        }else if ( tt.mxt[r][c] != 0){
            if (check(tt)){
                degree(tt,d+1);
            }

        }else{
            for (int i=0;i<9;i++){
                tt.mxt[r][c]=i+1;
                if (check(tt)){
                    degree(tt,d+1);
                    if (flag) {
                        break;
                    }
                }

            }
        }
    }



    public boolean check(Table t){
        if ( checkRow(t) && checkCol(t)  && checkgroup(t)){
            return true;
        }else {
            return false;
        }
    }



    public boolean checkRow(Table t){
        workon="row";
        for (int i=0;i<9;i++){
            index=i;
            if (!checkitem(t.getRow(i))){
                return false;
            }
        }
        return true;
    }

    public boolean checkCol(Table t){
        workon="col";
        for (int i=0;i<9;i++){
            index=i;
            if (!checkitem(t.getCol(i))){
                return false;
            }
        }
        return true;
    }

    public boolean checkgroup(Table t) {
        workon="unit";
        for (int i=0;i<9;i++){
            index=i;
            if (!checkitem(t.getgroup(i))){
                return false;
            }
        }
        return true;
    }

    public int[] getgroup (int index ) {
        int r,c;
        int[] re=new int[9];
        r=index/3;
        c=index%3;
        for (int i=0;i<3;i++) {
            for (int j=0;j<3;j++) {
                re[i*3+j]=mxt[r*3+i][c*3+j];
            }
        }
        return re;
    }



    public boolean checkitem(int[] x){
        int[] xx= {0,0,0,0,0,0,0,0,0,0,0};
        for (int i=0;i<9;i++){
            if (x[i]!=0) {
                if (xx[x[i]]==0) {
                    xx[x[i]]=1;
                }else {
                    return false;
                }
            }
        }
        return true;
    }



    public int[] getRow(int index){

        return mxt[index];
    }

    public int[] getCol(int index){
        int[] re=new int[9];
        for (int i=0;i<9;i++) {
            re[i] = mxt[i][index];
        }
        return re;
    }
    public int[] get13(){
        int[] re=new int[9];
        for (int i=0;i<9;i++) {
            re[i] = mxt[i][i];
        }
        return re;
    }

    public int[] get24(){
        int[] re=new int[9];
        for (int i=0;i<9;i++) {
            re[i] = mxt[i][8-i];
        }
        return re;
    }


    public void show() {
        for (int i=0;i<9;i++) {
            for (int j=0;j<9;j++) {
                System.out.printf("%d ",mxt[i][j]);

            }
            System.out.println();
        }
    }

    public Table copy(Table t) {
        int[][] xx=new int[9][9];
        for (int i=0;i<9;i++) {
            for (int j=0;j<9;j++) {
                xx[i][j]=t.mxt[i][j];
            }
        }
        Table re =new Table(xx);
        return re;
    }
}
