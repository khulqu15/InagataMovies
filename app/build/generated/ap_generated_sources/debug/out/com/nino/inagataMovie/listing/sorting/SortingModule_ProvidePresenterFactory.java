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
public final class SortingModule_ProvidePresenterFactory implements Factory<SortingDialogPresenter> {
  private final SortingModule module;

  private final Provider<SortingDialogInteractor> interactorProvider;

  public SortingModule_ProvidePresenterFactory(SortingModule module,
      Provider<SortingDialogInteractor> interactorProvider) {
    this.module = module;
    this.interactorProvider = interactorProvider;
  }

  @Override
  public SortingDialogPresenter get() {
    return providePresenter(module, interactorProvider.get());
  }

  public static SortingModule_ProvidePresenterFactory create(SortingModule module,
      Provider<SortingDialogInteractor> interactorProvider) {
    return new SortingModule_ProvidePresenterFactory(module, interactorProvider);
  }

  public static SortingDialogPresenter providePresenter(SortingModule instance,
      SortingDialogInteractor interactor) {
    return Preconditions.checkNotNull(instance.providePresenter(interactor), "Cannot return null from a non-@Nullable @Provides method");
  }
}
