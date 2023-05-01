package com.example.myapplication;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class bogi_detailFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        ViewGroup rootView = (ViewGroup) inflater.inflate(R.layout.fragment_bogi_detail, container, false);
        setHasOptionsMenu(true);
        Bundle bundle = getArguments();
        String name = bundle.getString("name");
        Toast.makeText(getActivity().getApplicationContext(), name, Toast.LENGTH_SHORT).show();
        TextView name1 = rootView.findViewById(R.id.departure);
        name1.setText(name);
        return rootView;
    }

    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        super.onCreateOptionsMenu(menu, inflater);
        inflater.inflate(R.menu.bogi_detail_menu, menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        String option = item.getTitle().toString();
        if (option.equals("Forward Page"))
            Toast.makeText(getActivity().getApplicationContext(), "forward", Toast.LENGTH_SHORT).show();
        if (option.equals("Back Page"))
            Toast.makeText(getActivity().getApplicationContext(), "back", Toast.LENGTH_SHORT).show();
        return true;
    }
}
