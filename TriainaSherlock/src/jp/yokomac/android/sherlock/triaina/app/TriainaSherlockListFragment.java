package jp.yokomac.android.sherlock.triaina.app;

import android.os.Bundle;
import android.view.View;

import com.actionbarsherlock.app.SherlockListFragment;

import triaina.injector.TriainaInjector;
import triaina.injector.TriainaInjectorFactory;

public class TriainaSherlockListFragment extends SherlockListFragment {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        TriainaInjector injector = TriainaInjectorFactory.getInjector(getActivity());
        injector.injectMembersWithoutViews(this);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        TriainaInjector injector = TriainaInjectorFactory.getInjector(getActivity());
        injector.injectViewMembers(this);
    }
}