package com.nino.inagataMovie.favorites;

import dagger.internal.Factory;
import io.realm.Realm;
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
public final class FavoritesStore_Factory implements Factory<FavoritesStore> {
  private final Provider<Realm> realmProvider;

  public FavoritesStore_Factory(Provider<Realm> realmProvider) {
    this.realmProvider = realmProvider;
  }

  @Override
  public FavoritesStore get() {
    return new FavoritesStore(realmProvider.get());
  }

  public static FavoritesStore_Factory create(Provider<Realm> realmProvider) {
    return new FavoritesStore_Factory(realmProvider);
  }

  public static FavoritesStore newInstance(Realm realm) {
    return new FavoritesStore(realm);
  }
}
