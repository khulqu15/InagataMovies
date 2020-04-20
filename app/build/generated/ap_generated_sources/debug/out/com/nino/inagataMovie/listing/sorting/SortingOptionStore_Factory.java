package com.nino.inagataMovie.listing.sorting;

import android.content.Context;
import dagger.internal.Factory;
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
public final class SortingOptionStore_Factory implements Factory<SortingOptionStore> {
  private final Provider<Context> contextProvider;

  public SortingOptionStore_Factory(Provider<Context> contextProvider) {
    this.contextProvider = contextProvider;
  }

  @Override
  public SortingOptionStore get() {
    return new SortingOptionStore(contextProvider.get());
  }

  public static SortingOptionStore_Factory create(Provider<Context> contextProvider) {
    return new SortingOptionStore_Factory(contextProvider);
  }

  public static SortingOptionStore newInstance(Context context) {
    return new SortingOptionStore(context);
  }
}
