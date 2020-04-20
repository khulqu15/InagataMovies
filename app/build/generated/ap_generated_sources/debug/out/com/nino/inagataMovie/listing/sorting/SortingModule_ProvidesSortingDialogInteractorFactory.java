package com.nino.inagataMovie.listing.sorting;

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
public final class SortingModule_ProvidesSortingDialogInteractorFactory implements Factory<SortingDialogInteractor> {
  private final SortingModule module;

  private final Provider<SortingOptionStore> storeProvider;

  public SortingModule_ProvidesSortingDialogInteractorFactory(SortingModule module,
      Provider<SortingOptionStore> storeProvider) {
    this.module = module;
    this.storeProvider = storeProvider;
  }

  @Override
  public SortingDialogInteractor get() {
    return providesSortingDialogInteractor(module, storeProvider.get());
  }

  public static SortingModule_ProvidesSortingDialogInteractorFactory create(SortingModule module,
      Provider<SortingOptionStore> storeProvider) {
    return new SortingModule_ProvidesSortingDialogInteractorFactory(module, storeProvider);
  }

  public static SortingDialogInteractor providesSortingDialogInteractor(SortingModule instance,
      SortingOptionStore store) {
    return Preconditions.checkNotNull(instance.providesSortingDialogInteractor(store), "Cannot return null from a non-@Nullable @Provides method");
  }
}
