// Generated code from Butter Knife. Do not modify!
package com.nino.inagataMovie.details;

import android.view.View;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import androidx.appcompat.widget.Toolbar;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.nino.inagataMovie.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class MovieDetailsFragment_ViewBinding implements Unbinder {
  private MovieDetailsFragment target;

  private View view7f080069;

  @UiThread
  public MovieDetailsFragment_ViewBinding(final MovieDetailsFragment target, View source) {
    this.target = target;

    View view;
    target.poster = Utils.findRequiredViewAsType(source, R.id.movie_poster, "field 'poster'", ImageView.class);
    target.collapsingToolbar = Utils.findRequiredViewAsType(source, R.id.collapsing_toolbar, "field 'collapsingToolbar'", CollapsingToolbarLayout.class);
    target.title = Utils.findRequiredViewAsType(source, R.id.movie_name, "field 'title'", TextView.class);
    target.releaseDate = Utils.findRequiredViewAsType(source, R.id.movie_year, "field 'releaseDate'", TextView.class);
    target.rating = Utils.findRequiredViewAsType(source, R.id.movie_rating, "field 'rating'", TextView.class);
    target.overview = Utils.findRequiredViewAsType(source, R.id.movie_description, "field 'overview'", TextView.class);
    target.label = Utils.findRequiredViewAsType(source, R.id.trailers_label, "field 'label'", TextView.class);
    target.trailers = Utils.findRequiredViewAsType(source, R.id.trailers, "field 'trailers'", LinearLayout.class);
    target.horizontalScrollView = Utils.findRequiredViewAsType(source, R.id.trailers_container, "field 'horizontalScrollView'", HorizontalScrollView.class);
    target.reviews = Utils.findRequiredViewAsType(source, R.id.reviews_label, "field 'reviews'", TextView.class);
    target.reviewsContainer = Utils.findRequiredViewAsType(source, R.id.reviews, "field 'reviewsContainer'", LinearLayout.class);
    view = Utils.findRequiredView(source, R.id.favorite, "field 'favorite' and method 'onClick'");
    target.favorite = Utils.castView(view, R.id.favorite, "field 'favorite'", FloatingActionButton.class);
    view7f080069 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
    target.toolbar = Utils.findOptionalViewAsType(source, R.id.toolbar, "field 'toolbar'", Toolbar.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    MovieDetailsFragment target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.poster = null;
    target.collapsingToolbar = null;
    target.title = null;
    target.releaseDate = null;
    target.rating = null;
    target.overview = null;
    target.label = null;
    target.trailers = null;
    target.horizontalScrollView = null;
    target.reviews = null;
    target.reviewsContainer = null;
    target.favorite = null;
    target.toolbar = null;

    view7f080069.setOnClickListener(null);
    view7f080069 = null;
  }
}
