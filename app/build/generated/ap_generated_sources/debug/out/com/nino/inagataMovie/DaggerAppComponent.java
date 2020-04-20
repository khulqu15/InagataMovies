package com.nino.inagataMovie;

import android.content.Context;
import com.nino.inagataMovie.details.DetailsComponent;
import com.nino.inagataMovie.details.DetailsModule;
import com.nino.inagataMovie.details.DetailsModule_ProvideInteractorFactory;
import com.nino.inagataMovie.details.DetailsModule_ProvidePresenterFactory;
import com.nino.inagataMovie.details.MovieDetailsFragment;
import com.nino.inagataMovie.details.MovieDetailsFragment_MembersInjector;
import com.nino.inagataMovie.details.MovieDetailsInteractor;
import com.nino.inagataMovie.details.MovieDetailsPresenter;
import com.nino.inagataMovie.favorites.FavoritesInteractor;
import com.nino.inagataMovie.favorites.FavoritesModule;
import com.nino.inagataMovie.favorites.FavoritesModule_ProvideFavouritesInteractorFactory;
import com.nino.inagataMovie.favorites.FavoritesStore;
import com.nino.inagataMovie.favorites.FavoritesStore_Factory;
import com.nino.inagataMovie.listing.ListingComponent;
import com.nino.inagataMovie.listing.ListingModule;
import com.nino.inagataMovie.listing.ListingModule_ProvideMovieListingInteractorFactory;
import com.nino.inagataMovie.listing.ListingModule_ProvideMovieListingPresenterFactory;
import com.nino.inagataMovie.listing.MoviesListingFragment;
import com.nino.inagataMovie.listing.MoviesListingFragment_MembersInjector;
import com.nino.inagataMovie.listing.MoviesListingInteractor;
import com.nino.inagataMovie.listing.MoviesListingPresenter;
import com.nino.inagataMovie.listing.sorting.SortingDialogFragment;
import com.nino.inagataMovie.listing.sorting.SortingDialogFragment_MembersInjector;
import com.nino.inagataMovie.listing.sorting.SortingDialogInteractor;
import com.nino.inagataMovie.listing.sorting.SortingDialogPresenter;
import com.nino.inagataMovie.listing.sorting.SortingModule;
import com.nino.inagataMovie.listing.sorting.SortingModule_ProvidePresenterFactory;
import com.nino.inagataMovie.listing.sorting.SortingModule_ProvidesSortingDialogInteractorFactory;
import com.nino.inagataMovie.listing.sorting.SortingOptionStore;
import com.nino.inagataMovie.network.NetworkModule;
import com.nino.inagataMovie.network.NetworkModule_ProvideOkHttpClientFactory;
import com.nino.inagataMovie.network.NetworkModule_RetrofitFactory;
import com.nino.inagataMovie.network.NetworkModule_TmdbWebServiceFactory;
import com.nino.inagataMovie.network.RequestInterceptor;
import com.nino.inagataMovie.network.RequestInterceptor_Factory;
import com.nino.inagataMovie.network.TmdbWebService;
import dagger.internal.DoubleCheck;
import dagger.internal.Preconditions;
import io.realm.Realm;
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
public final class DaggerAppComponent implements AppComponent {
  private Provider<RequestInterceptor> requestInterceptorProvider;

  private Provider<OkHttpClient> provideOkHttpClientProvider;

  private Provider<Retrofit> retrofitProvider;

  private Provider<TmdbWebService> tmdbWebServiceProvider;

  private Provider<Realm> provideRealmProvider;

  private Provider<FavoritesStore> favoritesStoreProvider;

  private Provider<FavoritesInteractor> provideFavouritesInteractorProvider;

  private Provider<Context> provideContextProvider;

  private DaggerAppComponent(AppModule appModuleParam, NetworkModule networkModuleParam,
      FavoritesModule favoritesModuleParam) {

    initialize(appModuleParam, networkModuleParam, favoritesModuleParam);
  }

  public static Builder builder() {
    return new Builder();
  }

  @SuppressWarnings("unchecked")
  private void initialize(final AppModule appModuleParam, final NetworkModule networkModuleParam,
      final FavoritesModule favoritesModuleParam) {
    this.requestInterceptorProvider = DoubleCheck.provider(RequestInterceptor_Factory.create());
    this.provideOkHttpClientProvider = DoubleCheck.provider(NetworkModule_ProvideOkHttpClientFactory.create(networkModuleParam, requestInterceptorProvider));
    this.retrofitProvider = DoubleCheck.provider(NetworkModule_RetrofitFactory.create(networkModuleParam, provideOkHttpClientProvider));
    this.tmdbWebServiceProvider = DoubleCheck.provider(NetworkModule_TmdbWebServiceFactory.create(networkModuleParam, retrofitProvider));
    this.provideRealmProvider = DoubleCheck.provider(AppModule_ProvideRealmFactory.create(appModuleParam));
    this.favoritesStoreProvider = DoubleCheck.provider(FavoritesStore_Factory.create(provideRealmProvider));
    this.provideFavouritesInteractorProvider = DoubleCheck.provider(FavoritesModule_ProvideFavouritesInteractorFactory.create(favoritesModuleParam, favoritesStoreProvider));
    this.provideContextProvider = DoubleCheck.provider(AppModule_ProvideContextFactory.create(appModuleParam));
  }

  @Override
  public DetailsComponent plus(DetailsModule detailsModule) {
    Preconditions.checkNotNull(detailsModule);
    return new DetailsComponentImpl(detailsModule);
  }

  @Override
  public ListingComponent plus(ListingModule listingModule) {
    Preconditions.checkNotNull(listingModule);
    return new ListingComponentImpl(listingModule);
  }

  public static final class Builder {
    private AppModule appModule;

    private NetworkModule networkModule;

    private FavoritesModule favoritesModule;

    private Builder() {
    }

    public Builder appModule(AppModule appModule) {
      this.appModule = Preconditions.checkNotNull(appModule);
      return this;
    }

    public Builder networkModule(NetworkModule networkModule) {
      this.networkModule = Preconditions.checkNotNull(networkModule);
      return this;
    }

    public Builder favoritesModule(FavoritesModule favoritesModule) {
      this.favoritesModule = Preconditions.checkNotNull(favoritesModule);
      return this;
    }

    public AppComponent build() {
      Preconditions.checkBuilderRequirement(appModule, AppModule.class);
      if (networkModule == null) {
        this.networkModule = new NetworkModule();
      }
      if (favoritesModule == null) {
        this.favoritesModule = new FavoritesModule();
      }
      return new DaggerAppComponent(appModule, networkModule, favoritesModule);
    }
  }

  private final class DetailsComponentImpl implements DetailsComponent {
    private Provider<MovieDetailsInteractor> provideInteractorProvider;

    private Provider<MovieDetailsPresenter> providePresenterProvider;

    private DetailsComponentImpl(DetailsModule detailsModuleParam) {

      initialize(detailsModuleParam);
    }

    @SuppressWarnings("unchecked")
    private void initialize(final DetailsModule detailsModuleParam) {
      this.provideInteractorProvider = DoubleCheck.provider(DetailsModule_ProvideInteractorFactory.create(detailsModuleParam, DaggerAppComponent.this.tmdbWebServiceProvider));
      this.providePresenterProvider = DoubleCheck.provider(DetailsModule_ProvidePresenterFactory.create(detailsModuleParam, provideInteractorProvider, DaggerAppComponent.this.provideFavouritesInteractorProvider));
    }

    @Override
    public void inject(MovieDetailsFragment target) {
      injectMovieDetailsFragment(target);}

    private MovieDetailsFragment injectMovieDetailsFragment(MovieDetailsFragment instance) {
      MovieDetailsFragment_MembersInjector.injectMovieDetailsPresenter(instance, providePresenterProvider.get());
      return instance;
    }
  }

  private final class ListingComponentImpl implements ListingComponent {
    private final ListingModule listingModule;

    private final SortingModule sortingModule;

    private ListingComponentImpl(ListingModule listingModuleParam) {
      this.listingModule = listingModuleParam;
      this.sortingModule = new SortingModule();
    }

    private SortingOptionStore getSortingOptionStore() {
      return new SortingOptionStore(DaggerAppComponent.this.provideContextProvider.get());}

    private MoviesListingInteractor getMoviesListingInteractor() {
      return ListingModule_ProvideMovieListingInteractorFactory.provideMovieListingInteractor(listingModule, DaggerAppComponent.this.provideFavouritesInteractorProvider.get(), DaggerAppComponent.this.tmdbWebServiceProvider.get(), getSortingOptionStore());}

    private MoviesListingPresenter getMoviesListingPresenter() {
      return ListingModule_ProvideMovieListingPresenterFactory.provideMovieListingPresenter(listingModule, getMoviesListingInteractor());}

    private SortingDialogInteractor getSortingDialogInteractor() {
      return SortingModule_ProvidesSortingDialogInteractorFactory.providesSortingDialogInteractor(sortingModule, getSortingOptionStore());}

    private SortingDialogPresenter getSortingDialogPresenter() {
      return SortingModule_ProvidePresenterFactory.providePresenter(sortingModule, getSortingDialogInteractor());}

    @Override
    public MoviesListingFragment inject(MoviesListingFragment fragment) {
      return injectMoviesListingFragment(fragment);}

    @Override
    public SortingDialogFragment inject(SortingDialogFragment fragment) {
      return injectSortingDialogFragment(fragment);}

    private MoviesListingFragment injectMoviesListingFragment(MoviesListingFragment instance) {
      MoviesListingFragment_MembersInjector.injectMoviesPresenter(instance, getMoviesListingPresenter());
      return instance;
    }

    private SortingDialogFragment injectSortingDialogFragment(SortingDialogFragment instance) {
      SortingDialogFragment_MembersInjector.injectSortingDialogPresenter(instance, getSortingDialogPresenter());
      return instance;
    }
  }
}
