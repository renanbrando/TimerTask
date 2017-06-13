package com.reebrandogmail.timertask;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

import java.util.Timer;

public class LoggerService extends Service {

    private Timer timer;
    private Logger logger;

    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        timer = new Timer();
        logger = new Logger();
        timer.schedule(logger, 1000, 2000);
    }

    @Override
    public void onDestroy() {
        logger.cancel();
        timer.cancel();
        super.onDestroy();
    }
}
