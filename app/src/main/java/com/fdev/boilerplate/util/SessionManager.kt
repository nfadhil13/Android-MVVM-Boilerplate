package com.fdev.boilerplate.util

import android.content.SharedPreferences
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers.Main
import kotlinx.coroutines.launch
import javax.inject.Inject
import javax.inject.Singleton


@Singleton
class SessionManager
@Inject
constructor(

){



//    private val _currentUser = MutableLiveData<User?>()
//
//    val currentUser : LiveData<User?>
//        get() = _currentUser
//
//    fun login(newUser : User){
//        setCurrentSiswa(newUser)
//    }
//
//    // lOG Out
//    fun logOut(){
//        firebaseAuth.signOut()
//        setCurrentSiswa(null)
//    }
//
//
//    private fun setCurrentSiswa(user: User?){
//        CoroutineScope(Main).launch{
//            if(_currentUser.value != user){
//                _currentUser.value = user
//            }
//        }
//    }

}