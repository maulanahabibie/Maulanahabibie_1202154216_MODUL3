package maulanahabibie_1202154216_modul3.com.maulanahabibie_1202154216_modul3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

	private EditText eUser, ePassword;
	private Button eButton;


	//String yang berisikan username dan password
	private String username = "EAD";
	private String password = "MOBILE";


	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_login);
		Toast.makeText(this, "Selamat Datang!", Toast.LENGTH_LONG);
		//mengambil ID dari view
		eUser = (EditText) findViewById(R.id.username);
		ePassword = (EditText) findViewById(R.id.password);
		eButton = (Button) findViewById(R.id.buttonLogin);



	}

	//jika method dari valuLogin() bernilai true maka activity berpindah ke MainActivity
	public void login(View view) {
		if (valueLogin()) {
			Intent newAct = new Intent(this, MainActivity.class);
			startActivity(newAct);
		} else {
			Toast.makeText(this, "Username atau Password anda Salah!", Toast.LENGTH_SHORT).show();
		}
	}

	//method untuk mengecek apakah username password benar atau salah
	public boolean valueLogin() {
		boolean login;

		if (eUser.getText().toString().equals(username) && ePassword.getText().toString().equals(password)) {
			login = true;
		} else {
			login = false;
		}
		return login;
	}
}
