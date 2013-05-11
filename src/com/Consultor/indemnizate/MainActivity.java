package com.Consultor.indemnizate;

import java.util.ArrayList;
import java.util.List;

import com.actionbarsherlock.app.SherlockFragmentActivity;
import com.actionbarsherlock.view.Menu;
import com.viewpagerindicator.TitlePageIndicator;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.widget.Toast;

public class MainActivity extends SherlockFragmentActivity {
private ViewPager mPager;
private TitlePageIndicator mIndicator;
private MainPagerAdapter mAdapter;
private List<Fragment> mFragments;

private static final String FRAGMENT1 = Inicio.class.getName();
private static final String FRAGMENT2 = Indemnizacion.class.getName();
private static final String FRAGMENT3 = Inicio.class.getName();

@Override
public void onCreate(Bundle savedInstanceState) {
super.onCreate(savedInstanceState);
setContentView(R.layout.layoutbase);

// add fragments
mFragments = new ArrayList<Fragment>();
mFragments.add(Fragment.instantiate(this, FRAGMENT1));
mFragments.add(Fragment.instantiate(this, FRAGMENT2));
mFragments.add(Fragment.instantiate(this, FRAGMENT3));

// adapter
mAdapter = new MainPagerAdapter(getSupportFragmentManager(), mFragments);

// pager
mPager = (ViewPager) findViewById(R.id.view_pager);
mPager.setAdapter(mAdapter);

// indicator
mIndicator = (TitlePageIndicator) findViewById(R.id.title_indicator);
mIndicator.setViewPager(mPager);

//We set this on the indicator, NOT the pager
mIndicator.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
    @Override
    public void onPageSelected(int position) {


    	switch(position) {
	    case 0:
	    	Toast.makeText(MainActivity.this, "Inicio", Toast.LENGTH_SHORT).show();
	        break;
	    case 1:
	    	Toast.makeText(MainActivity.this, "Indemnizacion", Toast.LENGTH_SHORT).show();
	    	break;
	    case 2:
	    	Toast.makeText(MainActivity.this, "Prima", Toast.LENGTH_SHORT).show();
	    	break;
	    default:
	    	Toast.makeText(MainActivity.this, "Changed to page ", Toast.LENGTH_SHORT).show();
		}        
    }

    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
    }

    @Override
    public void onPageScrollStateChanged(int state) {
    }
});
}


@Override
public boolean onCreateOptionsMenu(Menu menu) {
return true;
}

}