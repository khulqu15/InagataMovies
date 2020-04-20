package com.nino.inagataMovie.network;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;
import retrofit2.Retrofit;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class NetworkModule_TmdbWebServiceFactory implements Factory<TmdbWebService> {
  private final NetworkModule module;

  private final Provider<Retrofit> retrofitProvider;

  public NetworkModule_TmdbWebServiceFactory(NetworkModule module,
      Provider<Retrofit> retrofitProvider) {
    this.module = module;
    this.retrofitProvider = retrofitProvider;
  }

  @Override
  public TmdbWebService get() {
    return tmdbWebService(module, retrofitProvider.get());
  }

  public static NetworkModule_TmdbWebServiceFactory create(NetworkModule module,
      Provider<Retrofit> retrofitProvider) {
    return new NetworkModule_TmdbWebServiceFactory(module, retrofitProvider);
  }

  public static TmdbWebService tmdbWebService(NetworkModule instance, Retrofit retrofit) {
    return Preconditions.checkNotNull(instance.tmdbWebService(retrofit), "Cannot return null from a non-@Nullable @Provides method");
  }
}
