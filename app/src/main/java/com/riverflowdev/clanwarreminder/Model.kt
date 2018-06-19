package com.riverflowdev.clanwarreminder

interface Model {
    fun getClanTagByUserTag(): String
    fun saveUserTagAndClanTag(userTag: String, clanTag: String)
}