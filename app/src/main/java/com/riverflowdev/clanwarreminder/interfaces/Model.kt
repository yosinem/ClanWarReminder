package com.riverflowdev.clanwarreminder.interfaces

interface Model {

    fun getClanTagByUserTag(userTag: String): String
    fun saveUserTagAndClanTag(userTag: String, clanTag: String)
    fun startTrackingClanWarParticipation()
}