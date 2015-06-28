package info.antoniogoncalves.materialdesignworkout;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class Exercises extends AppCompatActivity{

    private Toolbar mToolbar;
    int sets;
    int reps;
    int weight;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.exercises);
        sets = 0;
        reps = 0;

        //Toolbar setup ----------------------------------------------------------------------------

        mToolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(mToolbar);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_second, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }
        if (id == R.id.submit){
            finish();
        }

        return super.onOptionsItemSelected(item);
    }

    // Display functions ---------------------------------------------------------------------------

    public void displaySets(int sets){
        TextView setsView = (TextView) findViewById(R.id.number_of_sets);
        setsView.setText(String.valueOf(sets));
    }

    public void displayReps(int reps){
        TextView setsView = (TextView) findViewById(R.id.number_of_reps);
        setsView.setText(String.valueOf(reps));
    }

    public void displayWeight(int weight){
        TextView setsView = (TextView) findViewById(R.id.weight);
        setsView.setText(String.valueOf(weight));
    }

    // change values -------------------------------------------------------------------------------

    public void addSets(View view){
        sets++;
        displaySets(sets);
    }
    public void subtractSets(View view){
        if (sets > 0){
            sets--;
            displaySets(sets);
        }
        else {
            displaySets(sets);
        }
    }
    public void addReps(View view){
        reps++;
        displayReps(reps);
    }
    public void subtractReps(View view){
        if (reps > 0){
            reps--;
            displayReps(reps);
        }
        else {
            displayReps(reps);
        }
    }
    public void addWeight(View view){
        weight = weight + 5;
        displayWeight(weight);
    }
    public void subtractWeight(View view){
        if (weight > 0){
            weight = weight - 5;
            displayWeight(weight);
        }
        else {
            displayWeight(weight);
        }
    }
}
