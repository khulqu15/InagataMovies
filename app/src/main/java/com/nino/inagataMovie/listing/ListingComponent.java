package com.nino.inagataMovie.listing;

import com.nino.inagataMovie.listing.sorting.SortingDialogFragment;
import com.nino.inagataMovie.listing.sorting.SortingModule;

import dagger.Subcomponent;

@ListingScope
@Subcomponent(modules = {ListingModule.class, SortingModule.class})
public interface ListingComponent {
    MoviesListingFragment inject(MoviesListingFragment fragment);

    SortingDialogFragment inject(SortingDialogFragment fragment);
}
