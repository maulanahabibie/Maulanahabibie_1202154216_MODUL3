package maulanahabibie_1202154216_modul3.com.maulanahabibie_1202154216_modul3;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SplashActivity extends AppCompatActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_splash);

		//handle untuk memulai MainActivity
		new Handler().postDelayed(new Runnable() {
			@Override
			public void run() {
                /* Create an Intent that will start the Menu-Activity. */
				startActivity(new Intent(SplashActivity.this, LoginActivity.class));
				finish();
			}
		}, 3000);
	}
}
