package com.riverflowdev.clanwarreminder

class Presenter(val view: ViewMainActivity) {

    private val model: Model = ModelImpl()

    fun login(userTag: String) {
        val isUserTagValid: Boolean = validateUserTag(userTag)
        if (isUserTagValid) {
            val clanTag = model.getClanTagByUserTag()
            model.saveUserTagAndClanTag(userTag, clanTag)
            view.onLogin()
            view.startTrackinClanWarParticipation()
        }
    }

    private fun validateUserTag(userTag: String): Boolean {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}