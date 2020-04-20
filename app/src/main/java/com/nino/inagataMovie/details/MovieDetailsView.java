package com.nino.inagataMovie.details;

import com.nino.inagataMovie.Movie;
import com.nino.inagataMovie.Review;
import com.nino.inagataMovie.Video;

import java.util.List;

interface MovieDetailsView {
    void showDetails(Movie movie);

    void showTrailers(List<Video> trailers);

    void showReviews(List<Review> reviews);

    void showFavorited();

    void showUnFavorited();
}
