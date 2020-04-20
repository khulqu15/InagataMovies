package com.nino.inagataMovie.details;

import com.nino.inagataMovie.favorites.FavoritesInteractor;
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
public final class DetailsModule_ProvidePresenterFactory implements Factory<MovieDetailsPresenter> {
  private final DetailsModule module;

  private final Provider<MovieDetailsInteractor> detailsInteractorProvider;

  private final Provider<FavoritesInteractor> favoritesInteractorProvider;

  public DetailsModule_ProvidePresenterFactory(DetailsModule module,
      Provider<MovieDetailsInteractor> detailsInteractorProvider,
      Provider<FavoritesInteractor> favoritesInteractorProvider) {
    this.module = module;
    this.detailsInteractorProvider = detailsInteractorProvider;
    this.favoritesInteractorProvider = favoritesInteractorProvider;
  }

  @Override
  public MovieDetailsPresenter get() {
    return providePresenter(module, detailsInteractorProvider.get(), favoritesInteractorProvider.get());
  }

  public static DetailsModule_ProvidePresenterFactory create(DetailsModule module,
      Provider<MovieDetailsInteractor> detailsInteractorProvider,
      Provider<FavoritesInteractor> favoritesInteractorProvider) {
    return new DetailsModule_ProvidePresenterFactory(module, detailsInteractorProvider, favoritesInteractorProvider);
  }

  public static MovieDetailsPresenter providePresenter(DetailsModule instance,
      MovieDetailsInteractor detailsInteractor, FavoritesInteractor favoritesInteractor) {
    return Preconditions.checkNotNull(instance.providePresenter(detailsInteractor, favoritesInteractor), "Cannot return null from a non-@Nullable @Provides method");
  }
}
