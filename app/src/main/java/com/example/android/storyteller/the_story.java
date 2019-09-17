package com.example.android.storyteller;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

public class the_story extends AppCompatActivity {
    ImageView img;
    TextView title;
    TextView content;
    int font = 14;
    SharedPreferences preferences;
    SharedPreferences.Editor editor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_the_story);
        img = findViewById(R.id.real_story_image);
        title = findViewById(R.id.real_story_title);
        content = findViewById(R.id.real_story_content);

        title.setText(getIntent().getStringExtra("title"));
        content.setText(getIntent().getStringExtra("content"));
        img.setImageResource(getIntent().getIntExtra("mg", 1));


        preferences = getSharedPreferences("font", MODE_PRIVATE);
        editor = preferences.edit();

        font=preferences.getInt("f",14);
        content.setTextSize(font);
    }

    @Override
    protected void onResume() {
        preferences = getSharedPreferences("font", MODE_PRIVATE);
         font=preferences.getInt("f",14);
        content.setTextSize(font);
        super.onResume();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_activity, menu);
        return true;

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.increase:

                font+=2;
                preferences = getSharedPreferences("font", MODE_PRIVATE);
                 editor.putInt("f", font);
                editor.commit();
                content.setTextSize(font);

                break;
            case R.id.decrease:
                font-=2;

                preferences = getSharedPreferences("font", MODE_PRIVATE);
                 editor.putInt("f", font);
                editor.commit();
                content.setTextSize(font);
                break;

        }
        return super.onOptionsItemSelected(item);
    }
}
