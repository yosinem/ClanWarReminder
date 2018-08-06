package com.riverflowdev.clanwarreminder.activities

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.riverflowdev.clanwarreminder.Presenter
import com.riverflowdev.clanwarreminder.R
import com.riverflowdev.clanwarreminder.interfaces.ViewMainActivity

class MainActivity : AppCompatActivity(), ViewMainActivity {


    private lateinit var userTag: EditText;
    private lateinit var loginButton: Button;

    private lateinit var presenter: Presenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        userTag = findViewById(R.id.user_tag_edit_text)
        loginButton = findViewById(R.id.login_button)
        presenter = Presenter(this);

        presenter.handleIncomingImage(intent)
        loginButton.setOnClickListener { presenter.login(userTag.text.toString()) }
    }

    override fun onLoginSuccess() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onLoginFailed(message: String?) {
        Toast.makeText(this, message, Toast.LENGTH_LONG).show()
    }
}
