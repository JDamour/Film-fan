package com.mpatswe.fan.film.filmfan.app.main;

import com.mpatswe.fan.film.filmfan.app.ActivityScope;
import com.mpatswe.fan.film.filmfan.app.AppComponent;

import dagger.Component;


@ActivityScope
@Component(
        dependencies = AppComponent.class,
        modules = MainModule.class
)
interface MainComponent {

    void inject(MainActivity mainActivity);

}

