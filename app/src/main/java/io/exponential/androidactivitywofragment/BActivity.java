package io.exponential.androidactivitywofragment;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class BActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b);

        // Get the intent
        Intent intent = getIntent();

        // Extract the extra by passing the extra key/name to getStringExtra().
        String firstName = intent.getStringExtra(AActivity.EXTRA_FIRST_NAME);

        // Get a reference to the TextView in the activity_b.xml layout
        TextView displayFirstName = (TextView) findViewById(R.id.display_first_name);

        // Set the TextView's text to the value in the firstName variable
        displayFirstName.setText(firstName);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_b, menu);
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
