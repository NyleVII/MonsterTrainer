package seng301.monstertrainer;

import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.common.api.GoogleApiClient;

import java.text.NumberFormat;

import seng301.monstertrainer.Monster;

import static seng301.monstertrainer.Monster.getHP;
import static seng301.monstertrainer.Monster.getMaxHP;
import static seng301.monstertrainer.Monster.getMonsterType;
import static seng301.monstertrainer.Monster.*;

public class MonsterScreenActivity extends AppCompatActivity {

    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_monster_screen);
        TextView systemMessageTextView = (TextView) findViewById(R.id.systemMessageTextView);
        systemMessageTextView.setText("");

        //Gets new values for the MonsterScreenActivity
        updateDisplay();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client = new GoogleApiClient.Builder(this).addApi(AppIndex.API).build();
    }

    @Override
    public void onStart() {
        super.onStart();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client.connect();
        Action viewAction = Action.newAction(
                Action.TYPE_VIEW, // TODO: choose an action type.
                "MonsterScreen Page", // TODO: Define a title for the content shown.
                // TODO: If you have web page content that matches this app activity's content,
                // make sure this auto-generated web page URL is correct.
                // Otherwise, set the URL to null.
                Uri.parse("http://host/path"),
                // TODO: Make sure this auto-generated app deep link URI is correct.
                Uri.parse("android-app://seng301.monstertrainer/http/host/path")
        );
        AppIndex.AppIndexApi.start(client, viewAction);
    }

    @Override
    public void onStop() {
        super.onStop();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        Action viewAction = Action.newAction(
                Action.TYPE_VIEW, // TODO: choose an action type.
                "MonsterScreen Page", // TODO: Define a title for the content shown.
                // TODO: If you have web page content that matches this app activity's content,
                // make sure this auto-generated web page URL is correct.
                // Otherwise, set the URL to null.
                Uri.parse("http://host/path"),
                // TODO: Make sure this auto-generated app deep link URI is correct.
                Uri.parse("android-app://seng301.monstertrainer/http/host/path")
        );
        AppIndex.AppIndexApi.end(client, viewAction);
        client.disconnect();
    }

    public void updateDisplay() {
        //Update monster image
        ImageView chosenMonsterImage = (ImageView) findViewById(R.id.chosenMonsterImage);
        Resources res = getResources();
        int resourceID = res.getIdentifier(getMonsterType(), "drawable",getPackageName());
        chosenMonsterImage.setImageResource(resourceID);

        //Update monster type text
        TextView chosenMonsterTextView = (TextView) findViewById(R.id.chosenMonsterTextView);
        chosenMonsterTextView.setText(getMonsterType());

        //Update monster HP
        TextView monsterHPTextView = (TextView) findViewById(R.id.monsterHPTextView);
        monsterHPTextView.setText("HP: " + getHP() + "/" + getMaxHP());

        //Update monster stamina
        TextView monsterStaminaTextView = (TextView) findViewById(R.id.monsterStaminaTextView);
        monsterStaminaTextView.setText("Stamina: " + getStamina() + "/" + getMaxStamina());

        //Update monster hunger
        TextView monsterHungerTextView = (TextView) findViewById(R.id.monsterHungerTextView);
        monsterHungerTextView.setText("Hunger: " + getHunger());

        //Update monster loyalty
        TextView monsterLoyaltyTextView = (TextView) findViewById(R.id.monsterLoyaltyTextView);
        monsterLoyaltyTextView.setText("Loyalty: " + getLoyalty());

        //Update monster exp display
        TextView monsterExpTextView = (TextView) findViewById(R.id.monsterEXPTextView);
        monsterExpTextView.setText("EXP: " + getExp() + "/" + getMaxExp());

        //Update monster level text
        TextView monsterLevelTextView = (TextView) findViewById(R.id.monsterLevelTextView);
        monsterLevelTextView.setText("Level: " + getLevel());
    }

    public void feed(View view){
        int currentHunger = getHunger();
        currentHunger -= 10;
        if(currentHunger > 0){
            setHunger(currentHunger);
            TextView systemMessageTextView = (TextView) findViewById(R.id.systemMessageTextView);
            systemMessageTextView.setText("You fed your monster!");
            //You fed him so up his loyalty
            setLoyalty(getLoyalty() + 1);
        }
        else {
            setHunger(0);
            TextView systemMessageTextView = (TextView) findViewById(R.id.systemMessageTextView);
            systemMessageTextView.setText("Your monster is full!");
        }

        //Update the display
        updateDisplay();
    }

    public void train(View view){
        //Make the monster hungry!
        setHunger(getHunger() + 10);
        if(getHunger() >= 100 && (getHP() != 0 || getStamina() != 0)){
            setHunger(100);
            TextView systemMessageTextView = (TextView) findViewById(R.id.systemMessageTextView);
            systemMessageTextView.setText("Your monster is too hungry to train!");
            updateDisplay();
            return;
        }

        //Do some damage to his HP
        setHp(getHP() - 1);
        if(getHP() <= 0) {
            setHp(0);
            TextView systemMessageTextView = (TextView) findViewById(R.id.systemMessageTextView);
            systemMessageTextView.setText("Rest to regain HP!");
            updateDisplay();
            return;
        }

        //Make him tired
        setStamina(getStamina() - 2);
        if(getStamina() <= 0) {
            setStamina(0);
            TextView systemMessageTextView = (TextView) findViewById(R.id.systemMessageTextView);
            systemMessageTextView.setText("Rest to regain Stamina!");
            updateDisplay();
            return;
        }



        TextView systemMessageTextView = (TextView) findViewById(R.id.systemMessageTextView);
        systemMessageTextView.setText("You gained exp!");
        setExp(getExp() + 10);
        TextView monsterExpTextView = (TextView) findViewById(R.id.monsterEXPTextView);
        monsterExpTextView.setText("EXP: " + getExp() + "/" + getMaxExp());

        //Level up!
        if(getExp() >= getMaxExp()){
            setExp(getExp() - getMaxExp()); //Resets exp to whatever it should be after you level up
            setLevel(getLevel() + 1); //Increments your level!
            //Update monster level text
            TextView monsterLevelTextView = (TextView) findViewById(R.id.monsterLevelTextView);
            monsterLevelTextView.setText("Level: " + getLevel());

            //Reset EXP
            setMaxExp((int) (getMaxExp() * 1.1));
            //Set new EXP and max EXP
            monsterExpTextView = (TextView) findViewById(R.id.monsterEXPTextView);
            monsterExpTextView.setText("EXP: " + getExp() + "/" + getMaxExp());

            //Level up system message
            systemMessageTextView = (TextView) findViewById(R.id.systemMessageTextView);
            systemMessageTextView.setText("Your monster has reached level " + getLevel() + "!");

            //Increase max stats!
            setMaxHP((int) (getMaxHP() * 1.2));
            setMaxStamina((int) (getMaxStamina() * 1.1));

        }

        //Update the display
        updateDisplay();
    }

    public void rest(View view){
        //Check if at max HP and Stamina
        if((getHP() == getMaxHP() ) && (getStamina() == getMaxStamina() )){
            TextView systemMessageTextView = (TextView) findViewById(R.id.systemMessageTextView);
            systemMessageTextView.setText("Your monster is fully rested!");
            updateDisplay();
            return;
        }

        //HP goes up
        setHp(getHP() + 1);
        if(getHP() > getMaxHP()) {
            setHp(getMaxHP());
        }

        //Stamina goes up
        setStamina(getStamina() + 2);
        if(getStamina() > getMaxStamina()) {
            setStamina(getMaxStamina());
        }
        //System Message
        TextView systemMessageTextView = (TextView) findViewById(R.id.systemMessageTextView);
        systemMessageTextView.setText("Regained HP and Stamina!");

        //updateDisplay
        updateDisplay();
    }

    @Override
    public void onBackPressed() {
        //finish();
        Intent intent = new Intent(this, TitleScreenActivity.class);
        startActivity(intent);
    }
}
