package com.reebrandogmail.timertask;

import android.util.Log;

import java.util.TimerTask;

public class Logger extends TimerTask {

    private long count = 0;

    public Logger(){
        Log.i("LOGGER", "Starting logger...");
    }
    @Override
    public void run() {
        count++;
        Log.i("LOGGER", "Logging " + count);

    }
}
