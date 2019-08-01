package com.mvparchiticture.ui.common.base.mvp.activity;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.ColorInt;
import android.support.annotation.DrawableRes;
import android.support.annotation.IdRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.StringRes;
import android.support.constraint.ConstraintLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentManager.BackStackEntry;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.app.AppCompatDelegate;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.FrameLayout;
import android.widget.ProgressBar;

import com.mvparchiticture.R;
import com.mvparchiticture.ui.common.base.mvp.fragment.BaseFragment;
import com.mvparchiticture.ui.common.base.mvp.presentation.Presentation;
import com.mvparchiticture.ui.common.base.mvp.presentation.PresentationManager;
import com.mvparchiticture.ui.common.base.mvp.presenter.BasePresenter;
import com.mvparchiticture.ui.common.base.mvp.presenter.lifecycle.PresenterProvider;
import com.mvparchiticture.ui.common.base.mvp.presenter.lifecycle.PresentersProvider;
import com.mvparchiticture.ui.common.base.mvp.view.BaseView;
import com.mvparchiticture.ui.common.base.util.LocaleManager;
import com.mvparchiticture.ui.common.widgets.fonts.FontButton;

import java.util.concurrent.TimeUnit;

import io.reactivex.disposables.CompositeDisposable;

@SuppressWarnings({"unchecked", "unused"})
public abstract class BaseActivity<P extends BasePresenter<V>, V extends BaseView> extends AppCompatActivity
        implements BaseView, Presentation {

    static {
        AppCompatDelegate.setCompatVectorFromResourcesEnabled(true);
    }

    @Nullable
    protected P presenter;
    protected PresentationManager manager;
    protected FrameLayout baseLayout;
    protected ProgressBar mProgressbar;
    protected ConstraintLayout mNoInternetConnection;
    protected FontButton mRetryButton;
    protected Toolbar mToolbar;

    @Override
    protected void attachBaseContext(Context newBase) {
        super.attachBaseContext(LocaleManager.setLocale(newBase));
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        manager = PresentationManager.Factory.create(this);
        super.onCreate(savedInstanceState);
        if (onInflateLayout() != View.NO_ID) {
            setContentView(R.layout.activity_base);
            baseLayout = findViewById(R.id.baseContainer);
            mProgressbar = findViewById(R.id.loading);
            mNoInternetConnection = findViewById(R.id.tvNoInternetConnection);
            mRetryButton=findViewById(R.id.btnRetry_activity);
            mToolbar=findViewById(R.id.toolbar);
            LayoutInflater.from(this).inflate(onInflateLayout(), baseLayout, true);
        }
        if (presenter != null) presenter.onViewAttached((V) this);
    }

    @Override
    protected void onDestroy() {
        if (presenter != null) presenter.onViewDetached();
        manager.onDetach();
        super.onDestroy();
    }

    @Override
    public void onBackPressed() {
        FragmentManager fragmentManager = getSupportFragmentManager();
        int backStackCount = fragmentManager.getBackStackEntryCount() - 1;
        if (backStackCount >= 0) {
            BackStackEntry backEntry = fragmentManager.getBackStackEntryAt(backStackCount);
            String str = backEntry.getName();

            Fragment fragment = fragmentManager.findFragmentByTag(str);

            if (fragment != null && fragment instanceof BaseFragment && !((BaseFragment) fragment).onBackPressed()) {
                return;
            } else {
                getSupportFragmentManager().popBackStackImmediate();
                return;
            }
        }
        super.onBackPressed();
    }

    public void setPresenter(@NonNull PresenterProvider.Factory factory,
                             Class<? extends BasePresenter<? extends BaseView>> clazz, boolean attach) {
        setPresenter((P) PresentersProvider.of(this, factory).get(clazz), attach);
    }

    public void setPresenter(@Nullable P presenter, boolean attach) {
        this.presenter = presenter;
        if (attach && presenter != null) presenter.onViewAttached((V) this);
    }

    @Override
    public void showError(@Nullable Object tag, @StringRes int title, String error) {

    }

  /*  @Override
    public void showError(@Nullable Object tag, @StringRes int errorRes, Object... formatArgs) {
        showError(tag, getString(errorRes, formatArgs));
    }*/

    @Override
    public void showError(@Nullable Object tag, @StringRes int errorRes) {
        showError(tag, getString(errorRes));
    }

    @Override
    public void showError(@Nullable Object tag, String error) {

    }

    @Override
    public void showProgress(@Nullable Object tag) {

    }

    @Override
    public void hideProgress(@Nullable Object tag) {

    }

    @Override
    public void redirectToLogin() {
//        OnBoardingActivity.Companion.route().clearBackStack()
//                .newTaskAndSingleTop()
//                .start(this);
//        finishAffinity();
    }

    //==============================================================================================
    // PresentationManagerImpl
    //==============================================================================================
    //region methods

    @Override
    public FragmentActivity getBaseActivity() {
        return this;
    }

    @Override
    public CompositeDisposable getOnDestroyDisposable() {
        return manager.getDetachDisposable();
    }

    @Override
    @Nullable
    public View getView() {
        return findViewById(android.R.id.content);
    }

    @Nullable
    public Toolbar onToolbarInit(@IdRes int toolbarId) {
        return manager.onToolbarInit(toolbarId, true);
    }

    @Nullable
    public Toolbar onToolbarInit(@IdRes int toolbarId, @DrawableRes int homeDrawable) {
        return manager.onToolbarInit(toolbarId, homeDrawable, true);
    }

    public void onToolbarNavigationClickListener(OnClickListener onClickListener) {
        manager.onToolbarNavigationClickListener(onClickListener);
    }

    public void onToolbarSetTitle(@StringRes int titleRes) {
        manager.onToolbarSetTitle(titleRes);
    }

    public void onToolbarSetTitle(CharSequence title) {
        manager.onToolbarSetTitle(title);
    }

    public void onToolbarSetIcon(@IdRes int toolbarId, @DrawableRes int drawable) {
        manager.onToolbarSetIcon(toolbarId, drawable);
    }


    public void setStatusBarColor(@ColorInt int color) {
        manager.setStatusBarColor(color);
    }

    public void setStatusBarColor(@ColorInt int color, long delay, TimeUnit timeUnit) {
        manager.setStatusBarColor(color, delay, timeUnit);
    }

    //endregion
}