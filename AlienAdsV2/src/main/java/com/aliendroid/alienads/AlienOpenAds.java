package com.aliendroid.alienads;

import static androidx.lifecycle.Lifecycle.Event.ON_START;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.util.Log;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.OnLifecycleEvent;
import androidx.lifecycle.ProcessLifecycleOwner;

import com.aliendroid.alienads.interfaces.open.OnLoadOpenAppAdmob;
import com.aliendroid.alienads.interfaces.open.OnShowOpenAppAdmob;


public class AlienOpenAds implements LifecycleObserver, Application.ActivityLifecycleCallbacks {

    public static OnShowOpenAppAdmob onShowOpenAppAdmob;
    public static OnLoadOpenAppAdmob onLoadOpenAppAdmob;
    public static boolean LOADADS = false;
    public AlienOpenAds(MyApplication myApplication) {
        ProcessLifecycleOwner.get().getLifecycle().addObserver(this);
    }


    public static void ShowOpen(Activity activity) {

    }

    public static void LoadOpenAds(String idOpenAds, boolean loadads) {

    }

    @OnLifecycleEvent(ON_START)
    public void onStart() {

    }

    public void fetchAd() {

    }

    public void showAdIfAvailable() {

    }
    @Override
    public void onActivityCreated(@NonNull Activity activity, @Nullable Bundle savedInstanceState) {

    }

    @Override
    public void onActivityStarted(@NonNull Activity activity) {

    }

    @Override
    public void onActivityResumed(@NonNull Activity activity) {

    }

    @Override
    public void onActivityPaused(@NonNull Activity activity) {

    }

    @Override
    public void onActivityStopped(@NonNull Activity activity) {

    }

    @Override
    public void onActivitySaveInstanceState(@NonNull Activity activity, @NonNull Bundle outState) {

    }

    @Override
    public void onActivityDestroyed(@NonNull Activity activity) {

    }
}