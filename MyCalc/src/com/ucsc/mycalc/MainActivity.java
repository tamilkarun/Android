package com.ucsc.mycalc;

import android.R;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBar;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.os.Build;
import android.app.Activity;
import android.widget.*;
import android.view.View.OnClickListener;
public class MainActivity extends Activity {

	
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.fragment_main);

		Button Add = (Button)findViewById(R.id.button1);
		Button Sub = (Button)findViewById(R.id.button2);
		Button Mul = (Button)findViewById(R.id.button3);
		Button Div = (Button)findViewById(R.id.button4);
        final EditText et1 = (EditText)findViewById(R.id.editText1);
        final EditText et2 = (EditText)findViewById(R.id.editText2);
        final TextView result = (TextView)findViewById(R.id.textView1);
        
       
        
        //Addition
        Add.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				int x = Integer.valueOf(et1.getText().toString());
		        int y = Integer.valueOf(et2.getText().toString());
                int sum = x + y;
                result.setText("The Sum of "+x+" and "+y+" is "+sum);
			}
		});
        //Substraction
        Sub.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				int x = Integer.valueOf(et1.getText().toString());
		        int y = Integer.valueOf(et2.getText().toString());
                int Sub = x - y;
                result.setText("The Sub of "+x+" and "+y+" is "+Sub);
			}
		});
        //Multiplication
        Mul.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				int x = Integer.valueOf(et1.getText().toString());
		        int y = Integer.valueOf(et2.getText().toString());
                int Mul = x * y;
                result.setText("The Mul of "+x+" and "+y+" is "+Mul);
			}
		});
        //Division
        Div.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				int x = Integer.valueOf(et1.getText().toString());
		        int y = Integer.valueOf(et2.getText().toString());
                int Div = x / y;
                result.setText("The Div of "+x+" and "+y+" is "+Div);
			}
		});
        
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {

		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		
		
		
		if (id == R.id.action_settings) {
			return true;
		}
		if(id == R.id.button1){
			
					// TODO Auto-generated method stub
					
				
			
			
		}
		return super.onOptionsItemSelected(item);
	}

	/**
	 * A placeholder fragment containing a simple view.
	 */
	public static class PlaceholderFragment extends Fragment {

		public PlaceholderFragment() {
		}

		@Override
		public View onCreateView(LayoutInflater inflater, ViewGroup container,
				Bundle savedInstanceState) {
			View rootView = inflater.inflate(R.layout.fragment_main, container,
					false);
			return rootView;
		}
	}

}
