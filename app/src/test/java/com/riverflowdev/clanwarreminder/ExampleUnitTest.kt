package com.riverflowdev.clanwarreminder

import org.junit.Assert.assertEquals
import org.junit.Test

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
        val userTag = UserTag("123")
        userTag.validate()
        assertEquals(4, 2 + 2)
        //val clanTag = RoyalApi().getClanTagByUserTag("P2GC9ROQ")
        //val clanWar = RoyalApi().getClanWarByClanTag(clanTag)
        //val clanWar1 = RoyalApi().getClanWarByClanTag(clanTag)

    }
}
