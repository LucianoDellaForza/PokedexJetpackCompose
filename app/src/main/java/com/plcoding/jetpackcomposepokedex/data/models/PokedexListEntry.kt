package com.plcoding.jetpackcomposepokedex.data.models

data class PokedexListEntry(
    val pokemonName: String,
    val imageUrl: String,
    val number: Int //number of pokemon used to display info about it
)