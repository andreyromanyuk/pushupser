enableFeaturePreview("VERSION_CATALOGS")

rootProject.name = "Pushupser"
include(":androidApp")
include(":shared")

pluginManagement {
    repositories {
        google()
        gradlePluginPortal()
        mavenCentral()
    }
}

dependencyResolutionManagement {
    versionCatalogs {
        l
    }
}

