package com.example.calc;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Answer extends Activity{

	TextView CalcResult;
	Button BackToMain;
	
	
	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.answer);
        CalcResult = (TextView)findViewById(R.id.ResultAdd);
        BackToMain = (Button) findViewById(R.id.Back);
        //CalcResult.setText(Double.toString(z));
        Intent a = getIntent();
        String s = a.getExtras().getString("CalValue");
        CalcResult.setText("Answer is" + " " + s);
        BackToMain.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				try{
	        		Class ToMain = Class.forName("com.example.calc.MainActivity");
	        		Intent ourIntent = new Intent(Answer.this,ToMain);
	        		startActivity(ourIntent);
	        		}catch(ClassNotFoundException e){
	        			e.printStackTrace();
	        		}
			}
		});
	}
	
	
}
