package seng301.monstertrainer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import static seng301.monstertrainer.Monster.getMonsterType;
import static seng301.monstertrainer.Monster.setExp;
import static seng301.monstertrainer.Monster.setHp;
import static seng301.monstertrainer.Monster.setHunger;
import static seng301.monstertrainer.Monster.setLevel;
import static seng301.monstertrainer.Monster.setLoyalty;
import static seng301.monstertrainer.Monster.setMaxExp;
import static seng301.monstertrainer.Monster.setMaxHP;
import static seng301.monstertrainer.Monster.setMaxStamina;
import static seng301.monstertrainer.Monster.setStamina;

public class TitleScreenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_title_screen);
    }

    public void newGame(View view) {
        setContentView(R.layout.activity_choose_screen);

        //Reset monster to base stats
        setHp(10);
        setMaxHP(10);
        setStamina(15);
        setMaxStamina(15);
        setHunger(20);
        setLoyalty(0);
        setLevel(1);
        setExp(0);
        setMaxExp(100);
    }

    public void loadGame(View view){
        if(getMonsterType() != null){
            Intent intent = new Intent(this, MonsterScreenActivity.class);
            startActivity(intent);
        }
    }

    public void ChooseOgreActivity(View view) {
        Intent intent = new Intent(this, ChooseOgreActivity.class);
        startActivity(intent);
    }

    public void ChooseTrollActivity(View view) {
        Intent intent = new Intent(this, ChooseTrollActivity.class);
        startActivity(intent);
    }

    public void ChooseOrcActivity(View view) {
        Intent intent = new Intent(this, ChooseOrcActivity.class);
        startActivity(intent);
    }

    public void ChooseGoblinActivity(View view) {
        Intent intent = new Intent(this, ChooseGoblinActivity.class);
        startActivity(intent);
    }

    public void ChooseGremlinActivity(View view) {
        Intent intent = new Intent(this, ChooseGremlinActivity.class);
        startActivity(intent);
    }

    public void ChooseImpActivity(View view) {
        Intent intent = new Intent(this, ChooseImpActivity.class);
        startActivity(intent);
    }
}
