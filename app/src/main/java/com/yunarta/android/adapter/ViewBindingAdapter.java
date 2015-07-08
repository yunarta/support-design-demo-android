package com.yunarta.android.adapter;

import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

/**
 * Created by yunarta on 9/7/15.
 */
public abstract class ViewBindingAdapter<T extends ViewDataBinding> extends RecyclerView.Adapter<ViewBindingAdapter.ViewBindingHolder<T>>
{
    private int layoutId;

    public ViewBindingAdapter(int layoutId)
    {
        this.layoutId = layoutId;
    }

    @Override
    public ViewBindingHolder<T> onCreateViewHolder(ViewGroup parent, int viewType)
    {
        return onCreateViewBindingHolder(parent, viewType);
    }

    @NonNull
    private ViewBindingHolder<T> onCreateViewBindingHolder(ViewGroup parent, int viewType)
    {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());

        T binding = DataBindingUtil.inflate(inflater, layoutId, null, false);
        return new ViewBindingHolder<>(binding);
    }

    public static class ViewBindingHolder<T extends ViewDataBinding> extends RecyclerView.ViewHolder
    {
        T mBinding;

        public ViewBindingHolder(T binding)
        {
            super(binding.getRoot());
            mBinding = binding;
        }

        public T getBinding()
        {
            return mBinding;
        }
    }
}

