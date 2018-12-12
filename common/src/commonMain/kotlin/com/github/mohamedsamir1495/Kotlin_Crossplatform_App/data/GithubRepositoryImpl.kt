package com.github.mohamedsamir1495.Kotlin_Crossplatform_App.data

import com.github.mohamedsamir1495.Kotlin_Crossplatform_App.data.Repository
import com.github.mohamedsamir1495.Kotlin_Crossplatform_App.data.UserJSON
import com.github.mohamedsamir1495.Kotlin_Crossplatform_App.api.GithubApi
import io.ktor.client.call.*
import kotlinx.serialization.*
import kotlinx.serialization.json.*
import com.github.mohamedsamir1495.Kotlin_Crossplatform_App.*
import com.github.mohamedsamir1495.Kotlin_Crossplatform_App.api.*
import com.github.mohamedsamir1495.Kotlin_Crossplatform_App.data.*
import com.github.mohamedsamir1495.Kotlin_Crossplatform_App.log.PlatformLogger
import com.github.mohamedsamir1495.Kotlin_Crossplatform_App.presentation.GithubRepository
import com.github.mohamedsamir1495.Kotlin_Crossplatform_App.presentation.*
import com.github.mohamedsamir1495.Kotlin_Crossplatform_App.storage.*
import kotlin.properties.*
import kotlin.properties.Delegates.observable

class GithubRepositoryImpl(logger: PlatformLogger) : GithubRepository {

    private val api = GithubApi(logger)

    override suspend fun getUser(name: String): UserJSON? =
            api.getUser(name)

    //not working on iOS
    override suspend fun getUserRepos(userName: String): List<Repository>? =
            api.getUserRepos(userName)

    init {
    }
}