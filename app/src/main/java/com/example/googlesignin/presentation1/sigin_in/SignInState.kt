package com.example.googlesignin.presentation1.sigin_in

data class SignInState (
    val isSignInSuccessful : Boolean = false,
    val signInError : String? = null
)