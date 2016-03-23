package seng301.monstertrainer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ChooseOrcActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_orc);
    }

    public void pickOrc(View view) {
        MainLaunchActivity.monster.setMonsterType("orc");
        Intent intent = new Intent(this, MonsterScreenActivity.class);
        startActivity(intent);
    }
}
