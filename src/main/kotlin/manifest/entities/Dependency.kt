package io.spektacle.manifest.entities

data class Dependency(
    val name: String,
    val group: String,
    val version: String
)