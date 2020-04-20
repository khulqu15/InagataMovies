package com.nino.inagataMovie.favorites;

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
public final class FavoritesModule_ProvideFavouritesInteractorFactory implements Factory<FavoritesInteractor> {
  private final FavoritesModule module;

  private final Provider<FavoritesStore> storeProvider;

  public FavoritesModule_ProvideFavouritesInteractorFactory(FavoritesModule module,
      Provider<FavoritesStore> storeProvider) {
    this.module = module;
    this.storeProvider = storeProvider;
  }

  @Override
  public FavoritesInteractor get() {
    return provideFavouritesInteractor(module, storeProvider.get());
  }

  public static FavoritesModule_ProvideFavouritesInteractorFactory create(FavoritesModule module,
      Provider<FavoritesStore> storeProvider) {
    return new FavoritesModule_ProvideFavouritesInteractorFactory(module, storeProvider);
  }

  public static FavoritesInteractor provideFavouritesInteractor(FavoritesModule instance,
      FavoritesStore store) {
    return Preconditions.checkNotNull(instance.provideFavouritesInteractor(store), "Cannot return null from a non-@Nullable @Provides method");
  }
}
