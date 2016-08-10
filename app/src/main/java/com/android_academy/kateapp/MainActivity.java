package com.android_academy.kateapp;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

  @Override protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    AlarmManager alarmMgr = (AlarmManager) getSystemService(Context.ALARM_SERVICE);
    Intent intent = new Intent(this, AlarmReceiver.class);
    PendingIntent alarmIntent = PendingIntent.getBroadcast(this, 0, intent, PendingIntent.FLAG_CANCEL_CURRENT);

    alarmMgr.setInexactRepeating(AlarmManager.ELAPSED_REALTIME_WAKEUP, 60 * 1000, 60 * 1000,
        alarmIntent);
  }
}
