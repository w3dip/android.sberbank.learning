package ru.sberbank.lesson2.task.simple;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView text = findViewById(R.id.uri);

        Uri uri = getIntent().getData();
        if (uri != null) {
            text.setText(uri.toString());
        } else {
            text.setText(R.string.empty_uri);
        }
    }
}
