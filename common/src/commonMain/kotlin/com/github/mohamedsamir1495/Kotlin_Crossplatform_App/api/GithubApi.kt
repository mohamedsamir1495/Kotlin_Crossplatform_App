package com.github.mohamedsamir1495.Kotlin_Crossplatform_App.api

import io.ktor.client.*
import io.ktor.client.call.TypeInfo
import kotlinx.serialization.*
import kotlinx.serialization.json.*
import io.ktor.client.features.json.*
import io.ktor.client.features.json.serializer.*
import io.ktor.client.request.*
import io.ktor.client.response.*
import io.ktor.http.*
import io.ktor.http.content.OutgoingContent
import io.ktor.http.content.TextContent
import kotlinx.io.core.*
import kotlinx.serialization.KSerializer
import kotlinx.serialization.json.JSON
import com.github.mohamedsamir1495.Kotlin_Crossplatform_App.data.*
import com.github.mohamedsamir1495.Kotlin_Crossplatform_App.log.PlatformLogger
import com.github.mohamedsamir1495.Kotlin_Crossplatform_App.api.ExpectSuccess
import com.github.mohamedsamir1495.Kotlin_Crossplatform_App.data.Repository
import com.github.mohamedsamir1495.Kotlin_Crossplatform_App.data.UserJSON
import kotlin.reflect.KClass

class GithubApi(val logger: PlatformLogger) {

    val endPoint = "https://api.github.com/users/"

    private val client = HttpClient {
        install(JsonFeature) {
            serializer = JsonKotlinxSerializer().apply {
                setMapper<UserJSON>(UserJSON.serializer())
            }
        }
        install(ExpectSuccess)
    }

    suspend fun getUser(name: String): UserJSON = client.get {
        url {
            takeFrom(endPoint)
            path("users", name)
        }
    }

    suspend fun getUserRepos(name: String): List<Repository> = client.request<HttpResponse> {
        method = HttpMethod.Get
        url {
            takeFrom(endPoint)
            path("users", name, "repos")
        }
    }.use { response ->
        val json = response.readText()

        logger.log("JSON", json)
        val list = JSON.nonstrict.parse(Repository.serializer().list,json)

        logger.log("JSON", "deserialized !!!!")

        return@use list
    }
}