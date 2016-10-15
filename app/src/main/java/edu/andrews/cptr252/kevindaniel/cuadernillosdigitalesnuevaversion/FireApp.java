package edu.andrews.cptr252.kevindaniel.cuadernillosdigitalesnuevaversion;

import android.app.Application;

import com.firebase.client.Firebase;

/**
 * Created by Kevin Daniel on 10/15/2016.
 */
public class FireApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        Firebase.setAndroidContext(this);
    }
}
