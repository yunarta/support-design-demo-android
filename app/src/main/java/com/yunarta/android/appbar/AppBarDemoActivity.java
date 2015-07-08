package com.yunarta.android.appbar;

import android.app.FragmentManager;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;

import com.yunarta.android.R;

/**
 * Created by yunarta on 8/7/15.
 */
public class AppBarDemoActivity extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        DataBindingUtil.setContentView(this, R.layout.activity_appbar);

        if (savedInstanceState == null)
        {
            Bundle args = new Bundle();
            args.putInt("layout", R.layout.fragment_appbar_one);

            AppBarFragment fragment = new AppBarFragment();
            fragment.setArguments(args);

            FragmentManager manager = getFragmentManager();
            manager.beginTransaction().replace(R.id.fragment_container, fragment).commit();
        }

        NavigationView navigator = (NavigationView) findViewById(R.id.navigation);
        navigator.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener()
        {
            @Override
            public boolean onNavigationItemSelected(MenuItem item)
            {
                DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer);
                drawer.closeDrawers();

                switch (item.getItemId())
                {
                    case R.id.menu1:
                    {
                        Bundle args = new Bundle();
                        args.putInt("layout", R.layout.fragment_appbar_one);

                        AppBarFragment fragment = new AppBarFragment();
                        fragment.setArguments(args);

                        FragmentManager manager = getFragmentManager();
                        manager.beginTransaction().replace(R.id.fragment_container, fragment).commit();
                        break;
                    }

                    case R.id.menu2:
                    {
                        Bundle args = new Bundle();
                        args.putInt("layout", R.layout.fragment_appbar_two);

                        AppBarFragment fragment = new AppBarFragment();
                        fragment.setArguments(args);

                        FragmentManager manager = getFragmentManager();
                        manager.beginTransaction().replace(R.id.fragment_container, fragment).commit();
                        break;
                    }

                    case R.id.menu3:
                    {
                        Bundle args = new Bundle();
                        args.putInt("layout", R.layout.fragment_appbar_three);

                        AppBarFragment fragment = new AppBarFragment();
                        fragment.setArguments(args);

                        FragmentManager manager = getFragmentManager();
                        manager.beginTransaction().replace(R.id.fragment_container, fragment).commit();
                        break;
                    }

                    case R.id.menu4:
                    {
                        Bundle args = new Bundle();
                        args.putInt("layout", R.layout.fragment_appbar_four);

                        AppBarFragment fragment = new AppBarFragment();
                        fragment.setArguments(args);

                        FragmentManager manager = getFragmentManager();
                        manager.beginTransaction().replace(R.id.fragment_container, fragment).commit();
                        break;
                    }

                    case R.id.menu5:
                    {
                        Bundle args = new Bundle();
                        args.putInt("layout", R.layout.fragment_appbar_five);

                        AppBarFragment fragment = new AppBarFragment();
                        fragment.setArguments(args);

                        FragmentManager manager = getFragmentManager();
                        manager.beginTransaction().replace(R.id.fragment_container, fragment).commit();
                        break;
                    }

                    case R.id.menu6:
                    {
                        Bundle args = new Bundle();
                        args.putInt("layout", R.layout.fragment_appbar_six);

                        AppBarFragment fragment = new AppBarFragment();
                        fragment.setArguments(args);

                        FragmentManager manager = getFragmentManager();
                        manager.beginTransaction().replace(R.id.fragment_container, fragment).commit();
                        break;
                    }
                }
                return false;
            }
        });
    }
}
