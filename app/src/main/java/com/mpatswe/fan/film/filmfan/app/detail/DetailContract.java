package com.mpatswe.fan.film.filmfan.app.detail;

import com.mpatswe.fan.film.filmfan.api.model.Images;
import com.mpatswe.fan.film.filmfan.api.model.Movie;



public interface DetailContract {

    interface View {

        void showLoading();

        void showContent(Movie movie);

        void showError();

        void onConfigurationSet(Images images);

    }

    interface Presenter {

        void start(int movieId);

        void finish();

    }

}
