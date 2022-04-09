
plugins {
    id("com.android.application")
    kotlin("android")

    id("org.jetbrains.compose") version "1.2.0-alpha01-dev620"
}

android {
    compileSdk = 32
    defaultConfig {
        applicationId = "romanyuk.pushupser.android"
        minSdk = 26
        targetSdk = 32
        versionCode = 1
        versionName = "1.0"
    }
    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
        }
    }
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = "1.2.0-alpha06"
    }

    kotlinOptions {
        jvmTarget = "1.8"
    }
}

@Suppress("UnstableApiUsage")
dependencies {
    implementation(files("../gradle/libs.versions.toml"))

    implementation(project(":shared"))

    implementation(libs.ext.)
    implementation(compose.animation)
    implementation(compose.animationGraphics)

    implementation(compose.uiTooling)
    implementation(compose.ui)

    implementation(compose.foundation)
    implementation(compose.preview)
    implementation(compose.runtime)

    implementation(compose.material)
    implementation(compose.materialIconsExtended)

    implementation("androidx.activity:activity-ktx:1.4.0")
}