package es.esy.mobilehost.android.flopcard;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item){
        switch (item.getItemId()) {
            case R.id.menu_gallery:
                Toast.makeText(this, "menu_gallery", Toast.LENGTH_SHORT).show();
                break;
            case R.id.menu_volume:
                Toast.makeText(this, "menu_volume", Toast.LENGTH_SHORT).show();
                break;
            case R.id.menu_reset:
                Toast.makeText(this, "menu_reset", Toast.LENGTH_SHORT).show();
                break;
            case R.id.menu_copyright:
                Toast.makeText(this, "menu_copyright", Toast.LENGTH_SHORT).show();
                break;
            case R.id.menu_developer:
                Toast.makeText(this, "menu_developer", Toast.LENGTH_SHORT).show();
                break;
            default:
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}
