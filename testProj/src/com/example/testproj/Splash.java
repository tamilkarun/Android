package com.example.testproj;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;

public class Splash extends Activity{
	MediaPlayer ourSong;
	@Override
	protected void onCreate(Bundle splashState) {
		// TODO Auto-generated method stub
		super.onCreate(splashState);
		setContentView(R.layout.splash);
		ourSong = MediaPlayer.create(Splash.this,R.raw.splash_sound);
		ourSong.start();
		Thread timer = new Thread(){
			public void run(){
				try{
					sleep(4000);
				}catch(InterruptedException e) {
					e.printStackTrace();//meant for debugging
				}finally{
					Intent opentestProj = new Intent("com.example.testproj.MENU");
					startActivity(opentestProj);
				}
			}
		};
		timer.start();
	}

	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
		ourSong.release();
		finish();//this destroys splash activity
	}

}
