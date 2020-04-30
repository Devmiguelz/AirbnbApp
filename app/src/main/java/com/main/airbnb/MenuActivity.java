package com.main.airbnb;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    public void displayToast(String message) {
        Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle item selection
        switch (item.getItemId()) {
            case R.id.action_save:
                displayToast("Touch item save");
                return true;
            case R.id.action_shared:
                displayToast("Touch item shared");
                return true;
            case R.id.action_mode:
                displayToast("Touch item dark mode");
                return true;
            case R.id.action_setting:
                displayToast("Touch item setting");
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    public void ShowImagenToast(View view) {
        displayToast("Touch in imagen");
    }
}
