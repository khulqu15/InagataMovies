package com.nino.inagataMovie.details;

import com.nino.inagataMovie.Review;
import com.nino.inagataMovie.Video;

import java.util.List;

import io.reactivex.Observable;

public interface MovieDetailsInteractor {
    Observable<List<Video>> getTrailers(String id);

    Observable<List<Review>> getReviews(String id);
}
