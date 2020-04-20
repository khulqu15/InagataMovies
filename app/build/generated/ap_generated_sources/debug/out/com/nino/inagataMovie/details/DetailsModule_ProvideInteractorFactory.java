package com.nino.inagataMovie.details;

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
public final class DetailsModule_ProvideInteractorFactory implements Factory<MovieDetailsInteractor> {
  private final DetailsModule module;

  private final Provider<TmdbWebService> tmdbWebServiceProvider;

  public DetailsModule_ProvideInteractorFactory(DetailsModule module,
      Provider<TmdbWebService> tmdbWebServiceProvider) {
    this.module = module;
    this.tmdbWebServiceProvider = tmdbWebServiceProvider;
  }

  @Override
  public MovieDetailsInteractor get() {
    return provideInteractor(module, tmdbWebServiceProvider.get());
  }

  public static DetailsModule_ProvideInteractorFactory create(DetailsModule module,
      Provider<TmdbWebService> tmdbWebServiceProvider) {
    return new DetailsModule_ProvideInteractorFactory(module, tmdbWebServiceProvider);
  }

  public static MovieDetailsInteractor provideInteractor(DetailsModule instance,
      TmdbWebService tmdbWebService) {
    return Preconditions.checkNotNull(instance.provideInteractor(tmdbWebService), "Cannot return null from a non-@Nullable @Provides method");
  }
}
