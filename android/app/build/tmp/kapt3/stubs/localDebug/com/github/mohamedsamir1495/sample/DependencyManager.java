package com.github.mohamedsamir1495.sample;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u0015\u001a\u00020\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0005\u001a\u00020\u00068FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\u000b\u001a\u00020\f8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000f\u0010\n\u001a\u0004\b\r\u0010\u000eR\u001b\u0010\u0010\u001a\u00020\u00118FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0014\u0010\n\u001a\u0004\b\u0012\u0010\u0013\u00a8\u0006\u0017"}, d2 = {"Lcom/github/mohamedsamir1495/sample/DependencyManager;", "", "application", "Landroid/app/Application;", "(Landroid/app/Application;)V", "coroutineContext", "Lkotlinx/coroutines/MainCoroutineDispatcher;", "getCoroutineContext", "()Lkotlinx/coroutines/MainCoroutineDispatcher;", "coroutineContext$delegate", "Lkotlin/Lazy;", "githubRepository", "Lcom/github/mohamedsamir1495/Kotlin_Crossplatform_App/presentation/GithubRepository;", "getGithubRepository", "()Lcom/github/mohamedsamir1495/Kotlin_Crossplatform_App/presentation/GithubRepository;", "githubRepository$delegate", "logger", "Lcom/github/mohamedsamir1495/Kotlin_Crossplatform_App/log/PlatformLogger;", "getLogger", "()Lcom/github/mohamedsamir1495/Kotlin_Crossplatform_App/log/PlatformLogger;", "logger$delegate", "githubPresenter", "Lcom/github/mohamedsamir1495/Kotlin_Crossplatform_App/presentation/GithubPresenter;", "app_localDebug"})
public final class DependencyManager {
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy githubRepository$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy coroutineContext$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy logger$delegate = null;
    private final android.app.Application application = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.github.mohamedsamir1495.Kotlin_Crossplatform_App.presentation.GithubRepository getGithubRepository() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.MainCoroutineDispatcher getCoroutineContext() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.github.mohamedsamir1495.Kotlin_Crossplatform_App.log.PlatformLogger getLogger() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.github.mohamedsamir1495.Kotlin_Crossplatform_App.presentation.GithubPresenter githubPresenter() {
        return null;
    }
    
    public DependencyManager(@org.jetbrains.annotations.NotNull()
    android.app.Application application) {
        super();
    }
}