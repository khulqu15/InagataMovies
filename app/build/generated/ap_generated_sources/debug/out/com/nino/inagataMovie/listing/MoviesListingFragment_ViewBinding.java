// Generated code from Butter Knife. Do not modify!
package com.nino.inagataMovie.listing;

import android.view.View;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.nino.inagataMovie.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class MoviesListingFragment_ViewBinding implements Unbinder {
  private MoviesListingFragment target;

  @UiThread
  public MoviesListingFragment_ViewBinding(MoviesListingFragment target, View source) {
    this.target = target;

    target.moviesListing = Utils.findRequiredViewAsType(source, R.id.movies_listing, "field 'moviesListing'", RecyclerView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    MoviesListingFragment target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.moviesListing = null;
  }
}
