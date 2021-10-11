package com.example.timezone_mgmt;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.widget.TextView;

public class DisplayDetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_detail);

//         Get the Intent that started this activity and extract the string
        Intent intent = getIntent();
        String id = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);

        // Capture the layout's TextView and set the string as its text
        TextView textView = findViewById(R.id.textView);
        SQLiteDatabase mydatabase = openOrCreateDatabase("freelance", MODE_PRIVATE, null);
        Cursor c = mydatabase.rawQuery("Select * from friends order by name",null);
        c.moveToFirst();
        Friend friend = new Friend(c.getInt(0), c.getString(1), c.getString(2));
        textView.setText(friend.getName() + " -> " + friend.getTimezone());
    }
}