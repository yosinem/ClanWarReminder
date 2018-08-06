package com.riverflowdev.clanwarreminder

class UserTag(private var userTag: String) {

    fun validate() {
        isTagEmpty()
        if (!isStartWithHashTag()) addHashTag()
        if (!isContainsLowercase()) convertToUpperCase()
        isContainIllegalNumbers()
        isContainIllegalChars()
    }

    private fun isTagEmpty() {
        if (userTag.isBlank()) {
            throw IllegalUserTagException("Please enter your user tag")
        }
    }

    private fun isContainsLowercase(): Boolean {
        return userTag.contains(".*[a-z].*".toRegex())
    }

    private fun convertToUpperCase() {
        userTag.toUpperCase()
    }

    private fun isContainIllegalChars() {
        userTag.contains("\"CGJLPQRUVY+\"".toRegex())
    }

    private fun isContainIllegalNumbers() {
        if (isContainNumbers() && isNumbersIllegal()) {
            throw IllegalUserTagException("Tags may only contain the numbers 0289")
        }
    }

    private fun isNumbersIllegal(): Boolean {
        var isNumbersIllegal = !userTag.contains("^([^0289]*)\$".toRegex())
        return isNumbersIllegal
    }

    private fun isContainNumbers(): Boolean {
        val isContainNumbers = userTag.contains(".*\\d+.*".toRegex())
        return isContainNumbers
    }

    private fun addHashTag() {
        userTag = "#$userTag"
    }

    private fun isStartWithHashTag(): Boolean {
        return userTag.startsWith("#")
    }
}