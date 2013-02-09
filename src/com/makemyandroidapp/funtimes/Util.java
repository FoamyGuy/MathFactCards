package com.makemyandroidapp.funtimes;

import android.util.Log;



/*******************
 * 
 * @author Tim
 *
 * I sometimes use a static class like this to help make logging easier.
 * The advantage is I can be sure I only have one log tag for my whole activity
 * and I can easily switch off all of the logging (if I want to) when I am ready to
 * deploy the application.
 *******************/
public class Util {
	public static String logTag = "FunTimes";
	public static boolean debugging = true;
	
	public static void Log(String s){
		if(debugging){
			Log.i(logTag, s);
		}
		
	}
}
