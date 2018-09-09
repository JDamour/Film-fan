package com.mpatswe.fan.film.filmfan.app;

import android.app.Application;

import com.mpatswe.fan.film.filmfan.R;
import com.mpatswe.fan.film.filmfan.api.ApiModule;

public class App extends Application {
    private AppComponent mAppComponent;

    @Override
    public void onCreate() {
        super.onCreate();

        mAppComponent = DaggerAppComponent.builder()
                .apiModule(new ApiModule(getString(R.string.base_url), getString(R.string.api_key)))
                .appModule(new AppModule(this))
                .build();
    }

    public static AppComponent getAppComponent(Application application) {
        return ((App) application).getAppComponent();
    }

    public AppComponent getAppComponent() {
        return mAppComponent;
    }

}

