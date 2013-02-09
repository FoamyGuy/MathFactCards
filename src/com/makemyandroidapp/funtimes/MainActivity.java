package com.makemyandroidapp.funtimes;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.view.Menu;
import android.view.View;


/*******************
 * 
 * @author Tim
 *
 * This is a fairly simple Activity. The only thing it does is create
 * an Adapter and set that adapter on our ViewPager
 *******************/
public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        /*****************
         * ViewPager is a special View that is part of the Android Support Library (provided by Google)
         * it is an area that the user can "swipe" to move along to the next page. You can find an example of this
         * inside the Google PlayStore application. 
         ******************/
        ViewPager mPager = (ViewPager)findViewById(R.id.pager);
        
        FunPagerAdapter mAdapter = new FunPagerAdapter();
        
        mPager.setAdapter(mAdapter);
        
    }



    
}
