package com.nino.inagataMovie;

import android.content.Context;
import android.content.res.Resources;
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
public final class AppModule_ProvideResourcesFactory implements Factory<Resources> {
  private final AppModule module;

  private final Provider<Context> contextProvider;

  public AppModule_ProvideResourcesFactory(AppModule module, Provider<Context> contextProvider) {
    this.module = module;
    this.contextProvider = contextProvider;
  }

  @Override
  public Resources get() {
    return provideResources(module, contextProvider.get());
  }

  public static AppModule_ProvideResourcesFactory create(AppModule module,
      Provider<Context> contextProvider) {
    return new AppModule_ProvideResourcesFactory(module, contextProvider);
  }

  public static Resources provideResources(AppModule instance, Context context) {
    return Preconditions.checkNotNull(instance.provideResources(context), "Cannot return null from a non-@Nullable @Provides method");
  }
}
