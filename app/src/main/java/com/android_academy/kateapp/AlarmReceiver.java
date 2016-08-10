package com.android_academy.kateapp;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

public class AlarmReceiver extends BroadcastReceiver {
  public static String TAG = AlarmReceiver.class.getSimpleName();
  @Override public void onReceive(Context context, Intent intent) {
    Log.d(AlarmReceiver.TAG, "onReceive");
  }
}
