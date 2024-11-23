package io.spektacle.manifest.parser

import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory
import com.fasterxml.jackson.module.kotlin.registerKotlinModule
import io.spektacle.manifest.entities.Manifest
import io.spektacle.manifest.parser.interfaces.ManifestParser
import kotlin.io.path.Path

class YamlManifestParser: ManifestParser {
    override fun parse(): Manifest {
        val mapper = ObjectMapper(YAMLFactory()).registerKotlinModule()
        return mapper.readValue(Path("manifest.yaml").toFile(), Manifest::class.java)
    }
}