package com.example.android.sih_service20;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class OnDeviceBootReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        Intent myIntent = new Intent(context, MyService.class);
        context.startService(myIntent);
        //throw new UnsupportedOperationException("Not yet implemented");
    }
}
