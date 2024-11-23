package io.spektacle

import io.spektacle.manifest.parser.YamlManifestParser
import io.spektacle.manifest.parser.interfaces.ManifestParser


fun main() {

    val parser: ManifestParser = YamlManifestParser()
    val manifest = parser.parse()

    println(manifest)
    println("DONE!")
}