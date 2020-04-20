package com.nino.inagataMovie.network;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class NetworkModule_RetrofitFactory implements Factory<Retrofit> {
  private final NetworkModule module;

  private final Provider<OkHttpClient> okHttpClientProvider;

  public NetworkModule_RetrofitFactory(NetworkModule module,
      Provider<OkHttpClient> okHttpClientProvider) {
    this.module = module;
    this.okHttpClientProvider = okHttpClientProvider;
  }

  @Override
  public Retrofit get() {
    return retrofit(module, okHttpClientProvider.get());
  }

  public static NetworkModule_RetrofitFactory create(NetworkModule module,
      Provider<OkHttpClient> okHttpClientProvider) {
    return new NetworkModule_RetrofitFactory(module, okHttpClientProvider);
  }

  public static Retrofit retrofit(NetworkModule instance, OkHttpClient okHttpClient) {
    return Preconditions.checkNotNull(instance.retrofit(okHttpClient), "Cannot return null from a non-@Nullable @Provides method");
  }
}
