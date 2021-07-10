package com.juliane.github.domain


import com.juliane.github.data.model.Github
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path

interface GithubService {
    @GET("{githubInserido}")
    suspend fun buscarGithub(
        @Path("githubInserido") github: String
    ) : Response<Github>
}