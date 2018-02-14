package com.example.csanchez.pushexample;

import android.app.Application;

/**
 * Created by csanchez on 11/02/18.
 */

public class PushExampleApplication extends Application {
    private RxBus bus;

    @Override
    public void onCreate() {
        super.onCreate();
        bus = new RxBus();
    }

    public RxBus bus() {
        return bus;
    }
}