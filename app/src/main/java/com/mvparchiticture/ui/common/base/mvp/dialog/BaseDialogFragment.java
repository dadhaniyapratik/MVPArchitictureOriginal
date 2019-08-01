package com.mvparchiticture.ui.common.base.mvp.dialog;

import android.app.Dialog;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.annotation.ColorInt;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.StringRes;
import android.support.constraint.ConstraintLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.util.Log;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ProgressBar;

import com.mvparchiticture.R;
import com.mvparchiticture.ui.common.base.dialog.DialogProvider;
import com.mvparchiticture.ui.common.base.listeners.NetworkListener;
import com.mvparchiticture.ui.common.base.mvp.presentation.Presentation;
import com.mvparchiticture.ui.common.base.mvp.presentation.PresentationManager;
import com.mvparchiticture.ui.common.base.mvp.presenter.BasePresenter;
import com.mvparchiticture.ui.common.base.mvp.presenter.lifecycle.PresenterProvider;
import com.mvparchiticture.ui.common.base.mvp.presenter.lifecycle.PresentersProvider;
import com.mvparchiticture.ui.common.base.mvp.view.BaseView;
import com.mvparchiticture.util.Constants;

import java.util.concurrent.TimeUnit;

import fr.tvbarthel.lib.blurdialogfragment.SupportBlurDialogFragment;
import io.reactivex.disposables.CompositeDisposable;

@SuppressWarnings({"unchecked", "unused"})
public abstract class BaseDialogFragment<P extends BasePresenter<V>, V extends BaseView> extends SupportBlurDialogFragment
        implements BaseView, Presentation {

    public static final int REQ_CODE = 343;
    private static final String TAG = "BaseDialogFragment";
    private DialogProvider dialogProvider = null;
    @Nullable
    protected P presenter;
    protected PresentationManager manager;
    /*protected FrameLayout baseLayout;
    protected ProgressBar mProgressbar;
    protected ConstraintLayout mNoInternetConnection;*/

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        setStyle(BaseDialogFragment.STYLE_NO_TITLE, R.style.DialogStyle);
        manager = PresentationManager.Factory.create(this);
        dialogProvider = new DialogProvider();
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
     /*   View view = inflater.inflate(R.layout.fragment_base_dialog, container, false);
        baseLayout = view.findViewById(R.id.dialogFragmentBaseContainer);
        mProgressbar = view.findViewById(R.id.dialogFragmentLoading);
        mNoInternetConnection = view.findViewById(R.id.tvdialogFragmentNoInternetConnection);
        if (onInflateLayout() != View.NO_ID) {
            //baseLayout.addView(LayoutInflater.from(getContext()).inflate(onInflateLayout(),container,false));
            inflater.inflate(onInflateLayout(), baseLayout, true);
        }
        return view;*/
        return manager.inflateLayout(inflater, container);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {

        super.onViewCreated(view, savedInstanceState);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Window window = getDialog().getWindow();
        onBaseDialogAnim(window);
        onBaseDialogBackground(window);
        onBaseDialogGravity(window);
        onBaseDialogSize(window);
        if (presenter != null) presenter.onViewAttached((V) this);
    }

    @Override
    public void onDestroyView() {
        if (presenter != null) presenter.onViewDetached();
        manager.onDetach();
        super.onDestroyView();
    }

    public void setPresenter(@NonNull PresenterProvider.Factory factory,
                             Class<? extends BasePresenter<? extends BaseView>> clazz, boolean attach) {
        setPresenter((P) PresentersProvider.of(this, factory).get(clazz), attach);
    }

    public void setPresenter(@Nullable P presenter, boolean attach) {
        this.presenter = presenter;
        if (attach && presenter != null) presenter.onViewAttached((V) this);
    }

    public boolean isShowing() {
        return getDialog() != null && getDialog().isShowing();
    }

    /*@Override
    public void showError(@Nullable Object tag, int title, String error) {
        dialogProvider.showError(this, title, error);
    }*/

    /*  @Override
      public void showError(@Nullable Object tag, @StringRes int errorRes, Object... formatArgs) {
          showError(tag, getString(errorRes, formatArgs));
      }
  */
    @Override
    public void showError(@Nullable Object tag, @StringRes int errorRes) {
        showError(tag, getString(errorRes));
    }


    @Override
    public void showError(@Nullable Object tag, String error) {
       // dialogProvider.showError(this, error);
    }


    @Override
    public Presentation getViewPresentation() {
        return this;
    }

    @Override
    public void showUnAuthorized(String message) {
        if (presenter != null)
            presenter.onUserUnauthorized(message);
    }

    @Override
    public void redirectToLogin() {
        getActivity().finishAffinity();
      /*  LoginActivity.Companion.route().clearBackStack()
                .newTaskAndSingleTop()
                .start(this);
        getActivity().finishAffinity();
        startActivity(new Intent(getActivity(), LoginActivity.class));*/
    }

    @Override
    public void showNetworkError(@Nullable Object tag, int title, int description, NetworkListener networkListener) {

    }

    /**
     * @return Check implemented class and return them. If fragment was started from another
     * fragment {@link #getTargetFragment()} or {@link #getParentFragment()},
     * then used {@link #getParentFragment()} , else {@link #getActivity()}
     */
    @Nullable
    public <T> T getRootClass(Class<T> clazz) {
        if (getTargetFragment() != null && clazz.isInstance(getTargetFragment())) {
            return clazz.cast(getTargetFragment());
        } else if (getParentFragment() != null && clazz.isInstance(getParentFragment())) {
            return clazz.cast(getParentFragment());
        } else if (getActivity() != null && clazz.isInstance(getActivity())) {
            return clazz.cast(getActivity());
        }
        return null;
    }

    //==============================================================================================
    // Show dialog methods
    //==============================================================================================
    //region methods

    public void show(FragmentManager manager) {
        show(manager, this.getClass().getName());
    }

    public void show(FragmentActivity activity) {
        show(activity.getSupportFragmentManager(), this.getClass().getName());
    }

    public void show(FragmentActivity activity, String tag) {
        show(activity.getSupportFragmentManager(), tag);
    }

    public void show(Fragment fragment) {
        show(fragment, this.getClass().getName());
    }

    public void show(Fragment fragment, String tag) {
        show(fragment, tag, REQ_CODE);
    }


    public void show(Fragment fragment, String tag, int reqCode) {
        show(fragment.getFragmentManager(), tag);
        setTargetFragment(fragment, reqCode);
    }

    @Override
    public void show(@Nullable FragmentManager manager, String tag) {
        if (manager == null) {
            Log.e(TAG, "show: Fragment Manager is null!!!");
            return;
        }
        FragmentTransaction transactionFragment = manager.beginTransaction();
        transactionFragment.add(this, tag);
        transactionFragment.commitAllowingStateLoss();
    }

    //endregion

    //==============================================================================================
    // Create Dialog methods
    //==============================================================================================
    //region methods

    @NonNull
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        Dialog dialog = super.onCreateDialog(savedInstanceState);
        onBaseDialogRequestFeature(dialog.getWindow());
        return dialog;
    }

    /**
     * Example: <p>{@code window.getAttributes().windowAnimations = R.style.DialogAnimationUpDown;}</p>
     *
     * @param window Current window
     */
    public void onBaseDialogAnim(Window window) {
        // Not implemented
    }

    /**
     * Example <p>{@code window.setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));} </p>
     *
     * @param window Current window
     */
    public void onBaseDialogBackground(Window window) {
        window.setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
    }

    /**
     * Example <p>{@code window.setGravity(Gravity.CENTER)} </p>
     *
     * @param window Current window
     */
    public void onBaseDialogGravity(Window window) {
        window.setGravity(Gravity.CENTER);
    }

    /**
     * Example <p>{@code window.setLayout(WindowManager.LayoutParams.WRAP_CONTENT, WindowManager.LayoutParams.WRAP_CONTENT)} </p>
     *
     * @param window Current window
     */
    public void onBaseDialogSize(Window window) {
        window.setLayout(WindowManager.LayoutParams.WRAP_CONTENT, WindowManager.LayoutParams.WRAP_CONTENT);
    }

    /**
     * Example <p>{@code window.requestFeature(Window.FEATURE_NO_TITLE)} </p>
     *
     * @param window Current window
     */
    public void onBaseDialogRequestFeature(Window window) {
        window.requestFeature(Window.FEATURE_NO_TITLE);
    }

    //endregion

    //==============================================================================================
    // PresentationManagerImpl
    //==============================================================================================
    //region methods

    @Override
    public FragmentActivity getBaseActivity() {
        return getActivity();
    }

    @Override
    public CompositeDisposable getOnDestroyDisposable() {
        return manager.getDetachDisposable();
    }

    @Override
    public FragmentManager getSupportFragmentManager() {
        return getActivity().getSupportFragmentManager();
    }

    public void setStatusBarColor(@ColorInt int color) {
        manager.setStatusBarColor(color);
    }

    public void setStatusBarColor(@ColorInt int color, long delay, TimeUnit timeUnit) {
        manager.setStatusBarColor(color, delay, timeUnit);
    }
    //endregion

    @Override
    protected float getDownScaleFactor() {
        // Allow to customize the down scale factor.
        return 5.0f;
    }

    @Override
    protected int getBlurRadius() {
        // Allow to customize the blur radius factor.
        return 7;
    }

    @Override
    protected boolean isActionBarBlurred() {
        // Enable or disable the blur effect on the action bar.
        // Disabled by default.
        return true;
    }

    @Override
    protected boolean isDimmingEnable() {
        // Enable or disable the dimming effect.
        // Disabled by default.
        return true;
    }

    @Override
    protected boolean isRenderScriptEnable() {
        // Enable or disable the use of RenderScript for blurring effect
        // Disabled by default.
        return true;
    }

    @Override
    protected boolean isDebugEnable() {
        // Enable or disable debug mode.
        // False by default.
        return false;
    }
}
