package io.spektacle.manifest.entities

data class Manifest(
    val `package`: Package,
    val dependencies: List<Dependency>
)
