package com.nino.inagataMovie.listing;

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
public final class MoviesListingFragment_MembersInjector implements MembersInjector<MoviesListingFragment> {
  private final Provider<MoviesListingPresenter> moviesPresenterProvider;

  public MoviesListingFragment_MembersInjector(
      Provider<MoviesListingPresenter> moviesPresenterProvider) {
    this.moviesPresenterProvider = moviesPresenterProvider;
  }

  public static MembersInjector<MoviesListingFragment> create(
      Provider<MoviesListingPresenter> moviesPresenterProvider) {
    return new MoviesListingFragment_MembersInjector(moviesPresenterProvider);}

  @Override
  public void injectMembers(MoviesListingFragment instance) {
    injectMoviesPresenter(instance, moviesPresenterProvider.get());
  }

  public static void injectMoviesPresenter(MoviesListingFragment instance,
      MoviesListingPresenter moviesPresenter) {
    instance.moviesPresenter = moviesPresenter;
  }
}
