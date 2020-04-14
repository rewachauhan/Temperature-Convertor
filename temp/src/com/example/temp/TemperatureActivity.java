package com.example.temp;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RadioGroup.OnCheckedChangeListener;
import android.widget.TextView;

public class TemperatureActivity extends Activity {
	EditText et1;
	TextView tv;
	RadioButton rb1;
	RadioButton rb2;
	RadioGroup rg;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_temperature);
        et1=(EditText) findViewById(R.id.editText1);
        tv=(TextView) findViewById(R.id.textView3);
        rb1=(RadioButton) findViewById(R.id.radio0);
        rb2=(RadioButton) findViewById(R.id.radio2);
        rg=(RadioGroup) findViewById(R.id.radioGroup2);
        rg.setOnCheckedChangeListener(new OnCheckedChangeListener() {
			
			@Override
			public void onCheckedChanged(RadioGroup arg0, int arg1) {
				// TODO Auto-generated method stub
				 int et2;
				int t;
			     et2=Integer.parseInt(et1.getText().toString());
			     for (int i=0;i<rg.getChildCount();i++)
			     {
			    	 if (rb2.isChecked())
				     {
				    	 t=(et2-32)*(5/9);
				    	 tv.setText("the conversion="+String.valueOf(t));
				     }
			    	 else if (rb1.isChecked())
				     {
				    	 t=(et2*(9/5))+32;
				    	 tv.setText("the conversion="+String.valueOf(t));
				     }
			     }
			    
			}
		});
       
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.temperature, menu);
        return true;
    }
    
}
