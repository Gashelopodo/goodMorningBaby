package com.gashe.goodmorningbaby;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class WakeUpReceiver extends BroadcastReceiver {


    @Override
    public void onReceive(Context context, Intent intent) {

        //lanzamos la actividad al encender el móvil
        Intent intent1 = new Intent(context, MainActivity.class);
        intent1.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        context.startActivity(intent1);

    }


}
