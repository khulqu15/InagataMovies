package com.nino.inagataMovie.listing;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
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
public final class ListingModule_ProvideMovieListingPresenterFactory implements Factory<MoviesListingPresenter> {
  private final ListingModule module;

  private final Provider<MoviesListingInteractor> interactorProvider;

  public ListingModule_ProvideMovieListingPresenterFactory(ListingModule module,
      Provider<MoviesListingInteractor> interactorProvider) {
    this.module = module;
    this.interactorProvider = interactorProvider;
  }

  @Override
  public MoviesListingPresenter get() {
    return provideMovieListingPresenter(module, interactorProvider.get());
  }

  public static ListingModule_ProvideMovieListingPresenterFactory create(ListingModule module,
      Provider<MoviesListingInteractor> interactorProvider) {
    return new ListingModule_ProvideMovieListingPresenterFactory(module, interactorProvider);
  }

  public static MoviesListingPresenter provideMovieListingPresenter(ListingModule instance,
      MoviesListingInteractor interactor) {
    return Preconditions.checkNotNull(instance.provideMovieListingPresenter(interactor), "Cannot return null from a non-@Nullable @Provides method");
  }
}
