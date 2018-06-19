package com.riverflowdev.clanwarreminder

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity(), ViewMainActivity {

    private val userTag: EditText = findViewById(R.id.user_tag_edit_text)
    private val loginButton: Button = findViewById(R.id.login_button)

    private lateinit var presenter: Presenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        presenter = Presenter(this);
        println("yodd")

        loginButton.setOnClickListener { presenter.login(userTag.text.toString()) }
    }

    override fun onLogin() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun startTrackinClanWarParticipation() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}
