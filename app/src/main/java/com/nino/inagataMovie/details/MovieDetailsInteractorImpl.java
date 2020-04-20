package com.nino.inagataMovie.details;

import com.nino.inagataMovie.Review;
import com.nino.inagataMovie.ReviewsWrapper;
import com.nino.inagataMovie.Video;
import com.nino.inagataMovie.VideoWrapper;
import com.nino.inagataMovie.network.TmdbWebService;

import java.util.List;

import io.reactivex.Observable;

class MovieDetailsInteractorImpl implements MovieDetailsInteractor {

    private TmdbWebService tmdbWebService;

    MovieDetailsInteractorImpl(TmdbWebService tmdbWebService) {
        this.tmdbWebService = tmdbWebService;
    }

    @Override
    public Observable<List<Video>> getTrailers(final String id) {
        return tmdbWebService.trailers(id).map(VideoWrapper::getVideos);
    }

    @Override
    public Observable<List<Review>> getReviews(final String id) {
        return tmdbWebService.reviews(id).map(ReviewsWrapper::getReviews);
    }

}
