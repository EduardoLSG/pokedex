package com.pokedex.repository

import com.pokedex.data.remote.PokeApi
import com.pokedex.data.remote.responses.PokemonList
import com.pokedex.util.Resource
import dagger.hilt.android.scopes.ActivityScoped
import javax.inject.Inject


@ActivityScoped
class PokemonRepository @Inject constructor(
    private val api: PokeApi
) {

    suspend fun pokemonList(limit: Int, offset:Int) : Resource<PokemonList> {
        val response = try {
            api.getPokemonList(limit, offset)
        } catch(e: Exception) {
            return Resource.Error("Erro ao trazer os dados de pokemon")
        }
        return Resource.Success(response)
    }
}