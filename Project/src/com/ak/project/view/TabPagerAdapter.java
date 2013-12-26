package com.ak.project.view;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class TabPagerAdapter extends FragmentPagerAdapter {

	String id = "1";
	String type = "";
	BeerFragment bf = new BeerFragment();
	WineFragment wf = new WineFragment();
	StrongFragment stf = new StrongFragment();
	SoftFragment sof = new SoftFragment();

	public TabPagerAdapter(FragmentManager fm) {
		super(fm);
		
	}

	@Override
	public Fragment getItem(int index) {

		switch (index) {
		case 0:
			return bf;
		case 1:
			return wf;
		case 2:
			return stf;
		case 3:
			return sof;
		}

		return null;
	}

	@Override
	public int getCount() {
		// get item count - equal to number of tabs
		return 4;
	}

	public String getId() {
		return id;
	}

	public String getType() {
		return type;
	}

}
