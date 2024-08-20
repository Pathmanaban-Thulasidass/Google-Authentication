package com.example.googlesignin.presentation1.sigin_in

data class SignInResult(
    val data: UserData?,
    val errorMsg: String?
)

data class UserData(
    val userId: String?,
    val username: String?,
    val profilePictureUrl: String?
)
