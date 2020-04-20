package com.nino.inagataMovie.network;

import dagger.internal.Factory;
import javax.annotation.Generated;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class RequestInterceptor_Factory implements Factory<RequestInterceptor> {
  private static final RequestInterceptor_Factory INSTANCE = new RequestInterceptor_Factory();

  @Override
  public RequestInterceptor get() {
    return new RequestInterceptor();
  }

  public static RequestInterceptor_Factory create() {
    return INSTANCE;
  }

  public static RequestInterceptor newInstance() {
    return new RequestInterceptor();
  }
}
