package seng301.monstertrainer;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.common.api.GoogleApiClient;

import static seng301.monstertrainer.Monster.getMonsterType;

public class MainLaunchActivity extends AppCompatActivity {

    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;

    public static Monster monster = new Monster(); //Default constructor, setting monster to null

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if(getMonsterType() == null) {
            //setContentView(R.layout.activity_choose_screen);
            //setContentView(R.layout.activity_title_screen);
            Intent intent = new Intent(this, TitleScreenActivity.class);
            startActivity(intent);
        }
        else {
            Intent intent = new Intent(this, MonsterScreenActivity.class);
            startActivity(intent);
        }
        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client = new GoogleApiClient.Builder(this).addApi(AppIndex.API).build();
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

    @Override
    public void onStart() {
        super.onStart();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client.connect();
        Action viewAction = Action.newAction(
                Action.TYPE_VIEW, // TODO: choose an action type.
                "MainLaunch Page", // TODO: Define a title for the content shown.
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
                "MainLaunch Page", // TODO: Define a title for the content shown.
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

}
