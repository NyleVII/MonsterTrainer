package seng301.monstertrainer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ChooseTrollActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_troll);
    }

    public void pickTroll(View view) {
        MainLaunchActivity.monster.setMonsterType("troll");
        Intent intent = new Intent(this, MonsterScreenActivity.class);
        startActivity(intent);
    }
}
