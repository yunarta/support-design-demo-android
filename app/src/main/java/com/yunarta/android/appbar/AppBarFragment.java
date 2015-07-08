package com.yunarta.android.appbar;

import android.app.Fragment;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.yunarta.android.R;
import com.yunarta.android.adapter.ViewBindingAdapter;
import com.yunarta.android.databinding.CellSimpleOneLine;

/**
 * Created by yunarta on 8/7/15.
 */
public class AppBarFragment extends Fragment
{
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        int layout = getArguments().getInt("layout");
        ViewDataBinding binding = DataBindingUtil.inflate(inflater, layout, null, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState)
    {
        super.onViewCreated(view, savedInstanceState);

        CollapsingToolbarLayout collapsingToolbar = (CollapsingToolbarLayout) view.findViewById(R.id.collapsing_toolbar);
        if (collapsingToolbar != null)
        {
            collapsingToolbar.setTitle("Collapsing Toolbar");
        }

        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.list);
        recyclerView.setAdapter(new ViewBindingAdapter<CellSimpleOneLine>(R.layout.cell_simple_one_line)
        {
            @Override
            public void onBindViewHolder(ViewBindingHolder<CellSimpleOneLine> holder, int position)
            {
                holder.getBinding().setText("Row " + position);
            }

            @Override
            public int getItemCount()
            {
                return 20;
            }
        });
    }
}
