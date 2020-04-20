package com.nino.inagataMovie;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import io.realm.Realm;
import javax.annotation.Generated;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class AppModule_ProvideRealmFactory implements Factory<Realm> {
  private final AppModule module;

  public AppModule_ProvideRealmFactory(AppModule module) {
    this.module = module;
  }

  @Override
  public Realm get() {
    return provideRealm(module);
  }

  public static AppModule_ProvideRealmFactory create(AppModule module) {
    return new AppModule_ProvideRealmFactory(module);
  }

  public static Realm provideRealm(AppModule instance) {
    return Preconditions.checkNotNull(instance.provideRealm(), "Cannot return null from a non-@Nullable @Provides method");
  }
}
