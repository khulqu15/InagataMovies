package com.nino.inagataMovie.network;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;
import okhttp3.Interceptor;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class NetworkModule_RequestInterceptorFactory implements Factory<Interceptor> {
  private final NetworkModule module;

  private final Provider<RequestInterceptor> interceptorProvider;

  public NetworkModule_RequestInterceptorFactory(NetworkModule module,
      Provider<RequestInterceptor> interceptorProvider) {
    this.module = module;
    this.interceptorProvider = interceptorProvider;
  }

  @Override
  public Interceptor get() {
    return requestInterceptor(module, interceptorProvider.get());
  }

  public static NetworkModule_RequestInterceptorFactory create(NetworkModule module,
      Provider<RequestInterceptor> interceptorProvider) {
    return new NetworkModule_RequestInterceptorFactory(module, interceptorProvider);
  }

  public static Interceptor requestInterceptor(NetworkModule instance,
      RequestInterceptor interceptor) {
    return Preconditions.checkNotNull(instance.requestInterceptor(interceptor), "Cannot return null from a non-@Nullable @Provides method");
  }
}
