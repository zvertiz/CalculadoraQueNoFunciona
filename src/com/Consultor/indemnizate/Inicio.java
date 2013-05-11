package com.Consultor.indemnizate;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.actionbarsherlock.app.SherlockFragment;

public class Inicio extends SherlockFragment {

@Override
public View onCreateView(LayoutInflater inf, ViewGroup grp, Bundle icicle) {
View v = inf.inflate(R.layout.inicio, grp, false);

return v;
}

@Override
public void onActivityCreated(Bundle savedInstanceState) {
super.onActivityCreated(savedInstanceState);

}

}