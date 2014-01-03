package kk.test.mysecondapp;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    
    public void solve(View view) {
    	TextView solutionField = (TextView) findViewById(R.id.solution);
    	String solutionString;
    	String x1 = "";
    	String x2 = "";
    	
    	//Get input fields to double values
    	EditText Ax2Field = (EditText) findViewById(R.id.Ax2);
    	EditText BxField = (EditText) findViewById(R.id.Bx);
    	EditText CField = (EditText) findViewById(R.id.C);
    	
    	try {
	    	double Ax2 = Double.parseDouble(Ax2Field.getText().toString());
	    	double Bx = Double.parseDouble(BxField.getText().toString());
	    	double C = Double.parseDouble(CField.getText().toString());
	    	
		    if(Bx*Bx > 4*Ax2*C) {
	    		x1 = String.format("%.4f", (-Bx + Math.sqrt(Bx*Bx - 4*Ax2*C))/(2*Ax2));
	    		x2 = String.format("%.4f", (-Bx - Math.sqrt(Bx*Bx - 4*Ax2*C))/(2*Ax2));
	    	} else if (Bx*Bx == 4*Ax2*C) {
	    		x1 = String.format("%.4f", -Bx/(2*Ax2));
	    		x2 = x1;
	    	} else {
	    		x1 = "Complex number";
	    		x2 = x1;
	    	}
		    	
	    	solutionString = "x1 = " + x1 + "\nx2 = " + x2;
	    	
    	} catch (NumberFormatException e) {
    		solutionString = "One of your values is not a number.";
    	}
    	
    	solutionField.setText(solutionString);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
