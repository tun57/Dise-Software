package com.example.nefs;

import java.util.Locale;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * A {@link FragmentPagerAdapter} that returns a fragment corresponding to one
 * of the sections/tabs/pages.
 */
public class SectionsPagerAdapter extends FragmentPagerAdapter {

	final protected static int TABS = 4;

	Context mContext;

	public SectionsPagerAdapter(Context context, FragmentManager fm) {
		super(fm);
		mContext = context;
	}

	@Override
	public Fragment getItem(int position) {
		// getItem is called to instantiate the fragment for the given page.
		// Return a PlaceholderFragment (defined as a static inner class below).

		switch (position) {

		case 0:
			return new EventsFragment();
		case 1:
			return new NewsFragment();
		case 2:
			return new SportsFragment();
		case 3:
			return new InfoFragment();

		}

		return null;

	}

	@Override
	public int getCount() {

		return TABS;
	}

	@Override
	public CharSequence getPageTitle(int position) {
		Locale l = Locale.getDefault();
		switch (position) {
		case 0:
			return mContext.getString(R.string.title_section1);
		case 1:
			return mContext.getString(R.string.title_section2);
		case 2:
			return mContext.getString(R.string.title_section3);
		case 3:
			return mContext.getString(R.string.title_section4);
		}
		return null;
	}

	public int getIcon(int position) {

		switch (position) {
		case 0:
			return R.drawable.ic_action_events;
		case 1:
			return R.drawable.ic_action_news;
		case 2:
			return R.drawable.ic_action_medal;
		case 3:
			return R.drawable.ic_action_more;
		}

		return 0;
	}
	


}