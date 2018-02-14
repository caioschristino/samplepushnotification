package com.example.csanchez.pushexample;

import io.reactivex.Observable;
import io.reactivex.subjects.PublishSubject;

/**
 * Created by csanchez on 11/02/18.
 */

public class RxBus {
    public RxBus() {
    }

    private PublishSubject<Object> bus = PublishSubject.create();

    public void send(Object o) {
        bus.onNext(o);
    }

    public Observable<Object> toObservable() {
        return bus;
    }
}
