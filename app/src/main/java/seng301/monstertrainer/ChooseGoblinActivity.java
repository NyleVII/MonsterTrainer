package seng301.monstertrainer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ChooseGoblinActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_goblin);
    }

    public void pickGoblin(View view) {
        MainLaunchActivity.monster.setMonsterType("Goblin");
        Intent intent = new Intent(this, MonsterScreenActivity.class);
        startActivity(intent);
    }
}
