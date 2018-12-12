package com.github.mohamedsamir1495.Kotlin_Crossplatform_App.presentation

import com.github.mohamedsamir1495.Kotlin_Crossplatform_App.*
import com.github.mohamedsamir1495.Kotlin_Crossplatform_App.data.Repository
import com.github.mohamedsamir1495.Kotlin_Crossplatform_App.model.UserModel

interface GithubView : BaseView {
    var isLoading: Boolean

    fun displayUser(user: UserModel)
    fun displayRepos(repos: List<Repository>)
}
