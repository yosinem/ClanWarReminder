package com.riverflowdev.clanwarreminder

import android.content.Intent
import com.riverflowdev.clanwarreminder.interfaces.Model
import com.riverflowdev.clanwarreminder.interfaces.ViewMainActivity

class Presenter(val view: ViewMainActivity) {

    private val model: Model = ModelImpl()

    fun login(userTag: String) {
        try {
            UserTag(userTag).validate()
            val clanTag = model.getClanTagByUserTag(userTag)
            model.saveUserTagAndClanTag(userTag, clanTag)
            model.startTrackingClanWarParticipation()
            view.onLoginSuccess()
        } catch (e: IllegalUserTagException) {
            view.onLoginFailed(e.message)
        }
    }

    fun handleIncomingImage(intent: Intent) {
        val action = intent.action
        val type = intent.type

        if (Intent.ACTION_SEND == action && type != null) {
            if (type.startsWith("image/")) {

            }
        }
    }
}