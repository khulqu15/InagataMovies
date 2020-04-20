package com.nino.inagataMovie;

import android.app.Application;
import android.os.StrictMode;

import com.nino.inagataMovie.details.DetailsComponent;
import com.nino.inagataMovie.details.DetailsModule;
import com.nino.inagataMovie.favorites.FavoritesModule;
import com.nino.inagataMovie.listing.ListingComponent;
import com.nino.inagataMovie.listing.ListingModule;
import com.nino.inagataMovie.network.NetworkModule;

import io.realm.Realm;

public class BaseApplication extends Application {
    private AppComponent appComponent;
    private DetailsComponent detailsComponent;
    private ListingComponent listingComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        StrictMode.enableDefaults();
        initRealm();
        appComponent = createAppComponent();
    }

    private AppComponent createAppComponent() {
        return DaggerAppComponent.builder()
                .appModule(new AppModule(this))
                .networkModule(new NetworkModule())
                .favoritesModule(new FavoritesModule())
                .build();
    }

    private void initRealm() {
        Realm.init(this);
    }

    public DetailsComponent createDetailsComponent() {
        detailsComponent = appComponent.plus(new DetailsModule());
        return detailsComponent;
    }

    public void releaseDetailsComponent() {
        detailsComponent = null;
    }

    public ListingComponent createListingComponent() {
        listingComponent = appComponent.plus(new ListingModule());
        return listingComponent;
    }

    public void releaseListingComponent() {
        listingComponent = null;
    }

    public ListingComponent getListingComponent() {
        return listingComponent;
    }
}
