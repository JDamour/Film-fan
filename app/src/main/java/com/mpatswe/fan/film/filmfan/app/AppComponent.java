package com.mpatswe.fan.film.filmfan.app;

import android.app.Application;


import com.mpatswe.fan.film.filmfan.api.ApiModule;
import com.mpatswe.fan.film.filmfan.api.ApiService;

import javax.inject.Singleton;

import dagger.Component;



@Singleton
@Component(
        modules = {
                AppModule.class,
                ApiModule.class
        }
)
public interface AppComponent {

    Application application();

    ApiService apiService();

    void inject(App app);

}

