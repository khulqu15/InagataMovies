package com.nino.inagataMovie.listing;

import com.nino.inagataMovie.favorites.FavoritesInteractor;
import com.nino.inagataMovie.listing.sorting.SortingOptionStore;
import com.nino.inagataMovie.network.TmdbWebService;
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
public final class ListingModule_ProvideMovieListingInteractorFactory implements Factory<MoviesListingInteractor> {
  private final ListingModule module;

  private final Provider<FavoritesInteractor> favoritesInteractorProvider;

  private final Provider<TmdbWebService> tmdbWebServiceProvider;

  private final Provider<SortingOptionStore> sortingOptionStoreProvider;

  public ListingModule_ProvideMovieListingInteractorFactory(ListingModule module,
      Provider<FavoritesInteractor> favoritesInteractorProvider,
      Provider<TmdbWebService> tmdbWebServiceProvider,
      Provider<SortingOptionStore> sortingOptionStoreProvider) {
    this.module = module;
    this.favoritesInteractorProvider = favoritesInteractorProvider;
    this.tmdbWebServiceProvider = tmdbWebServiceProvider;
    this.sortingOptionStoreProvider = sortingOptionStoreProvider;
  }

  @Override
  public MoviesListingInteractor get() {
    return provideMovieListingInteractor(module, favoritesInteractorProvider.get(), tmdbWebServiceProvider.get(), sortingOptionStoreProvider.get());
  }

  public static ListingModule_ProvideMovieListingInteractorFactory create(ListingModule module,
      Provider<FavoritesInteractor> favoritesInteractorProvider,
      Provider<TmdbWebService> tmdbWebServiceProvider,
      Provider<SortingOptionStore> sortingOptionStoreProvider) {
    return new ListingModule_ProvideMovieListingInteractorFactory(module, favoritesInteractorProvider, tmdbWebServiceProvider, sortingOptionStoreProvider);
  }

  public static MoviesListingInteractor provideMovieListingInteractor(ListingModule instance,
      FavoritesInteractor favoritesInteractor, TmdbWebService tmdbWebService,
      SortingOptionStore sortingOptionStore) {
    return Preconditions.checkNotNull(instance.provideMovieListingInteractor(favoritesInteractor, tmdbWebService, sortingOptionStore), "Cannot return null from a non-@Nullable @Provides method");
  }
}
