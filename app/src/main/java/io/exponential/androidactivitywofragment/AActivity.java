package io.exponential.androidactivitywofragment;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
// The import below was not automatic. However, I imported it so that I would not have to write
// View.OnClickListener everywhere.
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;


public class AActivity extends ActionBarActivity {
    // Define a constant that will be used to define a scoped name/key for the extra
    public static final String EXTRA_FIRST_NAME = "io.exponential.androidactivitywofragment.FIRST_NAME";

    // Implement an event handler for a click event
    OnClickListener startActivityB = new OnClickListener() {
        @Override
        public void onClick(View v) {
            // Get a reference to the first_name EditText control
            EditText fName = (EditText) findViewById(R.id.first_name);
            // Save the name entered by the user in the first_name EditText control into the
            // firstName variable
            String firstName = fName.getText().toString();

            // Create an intent and set this (the context) to our current class (AActivity), and
            // set BActivity as the target class. This is an explicit intent as we are explicitly
            // defining which activity we want to start.
            Intent intent = new Intent(AActivity.this, BActivity.class);
            // Save a key/value in the intent's extra.
            intent.putExtra(EXTRA_FIRST_NAME, firstName);

            // Start the next activity by passing the intent. The intent defines the next activity
            // to start (BActivity) and includes the user's first name which is passed via an extra
            // key/value pair.
            startActivity(intent);
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a);

        // Get a reference to the Send button
        Button send = (Button) findViewById(R.id.send);
        // Assign the click event handler to the Send button
        send.setOnClickListener(startActivityB);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_a, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
