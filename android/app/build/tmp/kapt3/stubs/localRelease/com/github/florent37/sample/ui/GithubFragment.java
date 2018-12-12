package com.github.florent37.sample.ui;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0003\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0016\u0010\u0012\u001a\u00020\u00132\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015H\u0016J\u0010\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J,\u0010\u001a\u001a\n \u001c*\u0004\u0018\u00010\u001b0\u001b2\u0006\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 2\b\u0010!\u001a\u0004\u0018\u00010\"H\u0016J\b\u0010#\u001a\u00020\u0013H\u0016J\u001a\u0010$\u001a\u00020\u00132\u0006\u0010%\u001a\u00020\u001b2\b\u0010!\u001a\u0004\u0018\u00010\"H\u0016J\u0010\u0010&\u001a\u00020\u00132\u0006\u0010\'\u001a\u00020(H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R$\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0007@VX\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001b\u0010\f\u001a\u00020\r8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000f\u00a8\u0006)"}, d2 = {"Lcom/github/florent37/sample/ui/GithubFragment;", "Landroid/support/v4/app/Fragment;", "Lcom/github/florent37/kotlinnative/presentation/GithubView;", "()V", "adapter", "Lcom/github/florent37/sample/ui/GithubAdapter;", "value", "", "isLoading", "()Z", "setLoading", "(Z)V", "presenter", "Lcom/github/florent37/kotlinnative/presentation/GithubPresenter;", "getPresenter", "()Lcom/github/florent37/kotlinnative/presentation/GithubPresenter;", "presenter$delegate", "Lkotlin/Lazy;", "displayRepos", "", "repos", "", "Lcom/github/florent37/kotlinnative/data/Repository;", "displayUser", "user", "Lcom/github/florent37/kotlinnative/model/UserModel;", "onCreateView", "Landroid/view/View;", "kotlin.jvm.PlatformType", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onViewCreated", "view", "showError", "error", "", "app_localRelease"})
public final class GithubFragment extends android.support.v4.app.Fragment implements com.github.florent37.kotlinnative.presentation.GithubView {
    private final kotlin.Lazy presenter$delegate = null;
    private com.github.florent37.sample.ui.GithubAdapter adapter;
    private boolean isLoading;
    private java.util.HashMap _$_findViewCache;
    
    private final com.github.florent37.kotlinnative.presentation.GithubPresenter getPresenter() {
        return null;
    }
    
    @java.lang.Override()
    public boolean isLoading() {
        return false;
    }
    
    @java.lang.Override()
    public void setLoading(boolean value) {
    }
    
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onDestroy() {
    }
    
    @java.lang.Override()
    public void displayUser(@org.jetbrains.annotations.NotNull()
    com.github.florent37.kotlinnative.model.UserModel user) {
    }
    
    @java.lang.Override()
    public void displayRepos(@org.jetbrains.annotations.NotNull()
    java.util.List<com.github.florent37.kotlinnative.data.Repository> repos) {
    }
    
    @java.lang.Override()
    public void showError(@org.jetbrains.annotations.NotNull()
    java.lang.Throwable error) {
    }
    
    public GithubFragment() {
        super();
    }
}