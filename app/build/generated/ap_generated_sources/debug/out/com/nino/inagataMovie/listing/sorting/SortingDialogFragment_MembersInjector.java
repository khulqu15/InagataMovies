package com.nino.inagataMovie.listing.sorting;

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
public final class SortingDialogFragment_MembersInjector implements MembersInjector<SortingDialogFragment> {
  private final Provider<SortingDialogPresenter> sortingDialogPresenterProvider;

  public SortingDialogFragment_MembersInjector(
      Provider<SortingDialogPresenter> sortingDialogPresenterProvider) {
    this.sortingDialogPresenterProvider = sortingDialogPresenterProvider;
  }

  public static MembersInjector<SortingDialogFragment> create(
      Provider<SortingDialogPresenter> sortingDialogPresenterProvider) {
    return new SortingDialogFragment_MembersInjector(sortingDialogPresenterProvider);}

  @Override
  public void injectMembers(SortingDialogFragment instance) {
    injectSortingDialogPresenter(instance, sortingDialogPresenterProvider.get());
  }

  public static void injectSortingDialogPresenter(SortingDialogFragment instance,
      SortingDialogPresenter sortingDialogPresenter) {
    instance.sortingDialogPresenter = sortingDialogPresenter;
  }
}
