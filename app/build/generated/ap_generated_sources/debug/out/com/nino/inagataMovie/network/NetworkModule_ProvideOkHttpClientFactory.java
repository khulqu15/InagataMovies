package com.nino.inagataMovie.network;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;
import okhttp3.OkHttpClient;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class NetworkModule_ProvideOkHttpClientFactory implements Factory<OkHttpClient> {
  private final NetworkModule module;

  private final Provider<RequestInterceptor> requestInterceptorProvider;

  public NetworkModule_ProvideOkHttpClientFactory(NetworkModule module,
      Provider<RequestInterceptor> requestInterceptorProvider) {
    this.module = module;
    this.requestInterceptorProvider = requestInterceptorProvider;
  }

  @Override
  public OkHttpClient get() {
    return provideOkHttpClient(module, requestInterceptorProvider.get());
  }

  public static NetworkModule_ProvideOkHttpClientFactory create(NetworkModule module,
      Provider<RequestInterceptor> requestInterceptorProvider) {
    return new NetworkModule_ProvideOkHttpClientFactory(module, requestInterceptorProvider);
  }

  public static OkHttpClient provideOkHttpClient(NetworkModule instance,
      RequestInterceptor requestInterceptor) {
    return Preconditions.checkNotNull(instance.provideOkHttpClient(requestInterceptor), "Cannot return null from a non-@Nullable @Provides method");
  }
}
