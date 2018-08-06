package com.riverflowdev.clanwarreminder

import jcrapi.Api
import jcrapi.model.ClanWar
import jcrapi.request.ClanWarRequest
import jcrapi.request.ProfileRequest
import java.util.*

class RoyalApi {

    private var api: Api? = null

    private fun getApi(): Api {
        return api ?: Api(Constants.API_URL, Constants.DEVELOPER_KEY)
    }

    fun getClanTagByUserTag(userTag: String): String {
        val profileRequest: ProfileRequest = ProfileRequest.builder(userTag)
                .keys(Arrays.asList("clan"))
                .build()
        return getApi().getProfile(profileRequest).clan.tag
    }

    fun getClanWarByClanTag(clanTag: String): ClanWar {

        val clanWarBuilder: ClanWarRequest = ClanWarRequest.builder(clanTag)
                .keys(Arrays.asList(Constants.KEY_STATE, Constants.KEY_COLLECTION_END_TIME, Constants.KEY_WAR_END_TIME, Constants.KEY_PARTICIPANTS))
                .build()
        return getApi().getClanWar(clanWarBuilder)
        /*var participants: List<ClanWarParticipant> = clanWar.participants
        println(participants)*/
    }
}