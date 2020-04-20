package com.nino.inagataMovie.details;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class MovieDetailsFragment_MembersInjector implements MembersInjector<MovieDetailsFragment> {
  private final Provider<MovieDetailsPresenter> movieDetailsPresenterProvider;

  public MovieDetailsFragment_MembersInjector(
      Provider<MovieDetailsPresenter> movieDetailsPresenterProvider) {
    this.movieDetailsPresenterProvider = movieDetailsPresenterProvider;
  }

  public static MembersInjector<MovieDetailsFragment> create(
      Provider<MovieDetailsPresenter> movieDetailsPresenterProvider) {
    return new MovieDetailsFragment_MembersInjector(movieDetailsPresenterProvider);}

  @Override
  public void injectMembers(MovieDetailsFragment instance) {
    injectMovieDetailsPresenter(instance, movieDetailsPresenterProvider.get());
  }

  public static void injectMovieDetailsPresenter(MovieDetailsFragment instance,
      MovieDetailsPresenter movieDetailsPresenter) {
    instance.movieDetailsPresenter = movieDetailsPresenter;
  }
}
