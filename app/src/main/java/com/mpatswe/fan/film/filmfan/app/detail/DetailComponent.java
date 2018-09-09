package com.mpatswe.fan.film.filmfan.app.detail;

import com.mpatswe.fan.film.filmfan.app.ActivityScope;
import com.mpatswe.fan.film.filmfan.app.AppComponent;

import dagger.Component;


@ActivityScope
@Component(
        dependencies = AppComponent.class,
        modules = DetailModule.class
)
interface DetailComponent {

    void inject(DetailActivity DetailActivity);

}

