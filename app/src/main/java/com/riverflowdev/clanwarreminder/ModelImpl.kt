package com.riverflowdev.clanwarreminder

import com.riverflowdev.clanwarreminder.interfaces.Model

class ModelImpl : Model {

    override fun startTrackingClanWarParticipation() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun saveUserTagAndClanTag(userTag: String, clanTag: String) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getClanTagByUserTag(userTag: String): String {
        return RoyalApi().getClanTagByUserTag(userTag)
    }
}