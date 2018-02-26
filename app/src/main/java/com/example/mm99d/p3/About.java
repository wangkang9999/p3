package com.example.mm99d.p3;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by mm99d on 2018/2/23.
 */

public class About extends Activity {
    protected void onCreate (Bundle x){
        super.onCreate(x);
        setContentView(R.layout.layout);
        Button btn6;
        btn6 = (Button) findViewById(R.id.button6);
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}
