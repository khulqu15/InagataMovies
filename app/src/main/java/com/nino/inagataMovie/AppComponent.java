package com.nino.inagataMovie;

import com.nino.inagataMovie.details.DetailsComponent;
import com.nino.inagataMovie.details.DetailsModule;
import com.nino.inagataMovie.favorites.FavoritesModule;
import com.nino.inagataMovie.listing.ListingComponent;
import com.nino.inagataMovie.listing.ListingModule;
import com.nino.inagataMovie.network.NetworkModule;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {
        AppModule.class,
        NetworkModule.class,
        FavoritesModule.class})
public interface AppComponent {
    DetailsComponent plus(DetailsModule detailsModule);

    ListingComponent plus(ListingModule listingModule);
}
