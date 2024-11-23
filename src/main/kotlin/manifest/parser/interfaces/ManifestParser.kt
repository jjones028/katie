package io.spektacle.manifest.parser.interfaces

import io.spektacle.manifest.entities.Manifest

interface ManifestParser {
    fun parse(): Manifest
}