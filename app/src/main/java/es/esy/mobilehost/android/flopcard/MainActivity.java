package es.esy.mobilehost.android.flopcard;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //取得此Button的實體
        Button button = (Button) findViewById(R.id.Benter);

        //實做OnClickListener界面
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //初始化Intent物件
                Intent intent = new Intent();
                //從MainActivity 到Main2Activity
                intent.setClass(MainActivity.this, Main2Activity.class);
                //開啟Activity
                startActivity(intent);
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        //menu.add
        //menu.add (group ID , item_ID, �ƦC����, item�q�b�e�����W��);
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
