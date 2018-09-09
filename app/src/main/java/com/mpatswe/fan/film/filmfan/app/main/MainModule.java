package com.mpatswe.fan.film.filmfan.app.main;
import com.mpatswe.fan.film.filmfan.app.ActivityScope;

import dagger.Module;
import dagger.Provides;

@Module
public class MainModule {
    private final MainContract.View mainView;

    MainModule(MainContract.View mainView) {
        this.mainView = mainView;
    }

    @Provides
    @ActivityScope
    MainContract.View provideMainView() {
        return mainView;
    }

}

