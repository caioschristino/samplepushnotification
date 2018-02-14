package com.example.csanchez.pushexample;

import android.util.Log;

import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;

/**
 * Created by csanchez on 11/02/18.
 */

public class MyFirebaseMessagingService extends FirebaseMessagingService {

    private static final String TAG = "MyFirebaseMsgService";

    /**
     * Called when message is received.
     *
     * @param remoteMessage Object representing the message received from Firebase Cloud Messaging.
     */
    // [START receive_message]
    @Override
    public void onMessageReceived(RemoteMessage remoteMessage) {

        if(remoteMessage == null){
            return;
        }

        Log.d(TAG, "From: " + remoteMessage.getFrom());
        if (remoteMessage.getData().size() > 0) {
            Log.d(TAG, "Message data: " + remoteMessage.getData());
        }

        if (remoteMessage.getNotification() != null) {
            Log.d(TAG, "Message Body: " + remoteMessage.getNotification().getBody());
        }

        ((PushExampleApplication) getApplication())
                .bus()
                .send(new MyNotification(remoteMessage.getNotification().getTitle(),
                        remoteMessage.getNotification().getBody()));
    }
}