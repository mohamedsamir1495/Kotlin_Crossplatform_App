package com.github.mohamedsamir1495.Kotlin_Crossplatform_App.presentation

import com.github.mohamedsamir1495.Kotlin_Crossplatform_App.data.Repository
import com.github.mohamedsamir1495.Kotlin_Crossplatform_App.data.UserJSON
import com.github.mohamedsamir1495.Kotlin_Crossplatform_App.data.*

interface GithubRepository {
    suspend fun getUser(name: String): UserJSON?
    suspend fun getUserRepos(userName: String): List<Repository>?
}
