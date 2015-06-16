package com.dreisonlabs.basketballscorekeeper;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;


public class TeamSelector extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_team_selector);
    }

    public void onClick(View view) {
        Intent i = new Intent(this, ScoreKeeper.class);

        final EditText teamAInput = (EditText) findViewById(R.id.team_a_input);
        String teamAName = teamAInput.getText().toString();
        i.putExtra("teamA", teamAName);

        final EditText teamBInput = (EditText) findViewById(R.id.team_b_input);
        String teamBName = teamBInput.getText().toString();
        i.putExtra("teamB", teamBName);

        startActivity(i);
    }

}
