package com.example.administrator.t3.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

import com.example.administrator.t3.service.AutoUpdateService;

/**
 * Created by ykai on 2015/8/14.
 */
public class AutoUpdateReceiver extends BroadcastReceiver{
    @Override
    public void onReceive(Context context, Intent intent) {
        Intent i= new Intent(context, AutoUpdateService.class);
        context.startService(i);
    }
}
