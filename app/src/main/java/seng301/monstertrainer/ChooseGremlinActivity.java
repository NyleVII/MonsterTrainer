package seng301.monstertrainer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ChooseGremlinActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_gremlin);
    }

    public void pickGremlin(View view) {
        MainLaunchActivity.monster.setMonsterType("Gremlin");
        Intent intent = new Intent(this, MonsterScreenActivity.class);
        startActivity(intent);
    }
}
