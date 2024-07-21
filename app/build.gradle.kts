import org.jetbrains.kotlin.config.KotlinCompilerVersion
import java.io.FileInputStream
import java.util.Properties

plugins {
    id("com.android.application")
    id("com.apollographql.apollo3") version "3.2.1"
    id("kotlin-parcelize")
    id("androidx.room")
    id("com.google.devtools.ksp")
    kotlin("android")
    kotlin("kapt")
    kotlin("plugin.serialization") version "1.9.23"
}

room {
    schemaDirectory("$projectDir/schemas")
}

val keystoreProperties = Properties()
rootProject.file("keystore.properties").let {
    if (it.exists()) {
        keystoreProperties.load(FileInputStream(it))
    }
}

android {
    compileSdk = 34
    defaultConfig {
        applicationId = "com.ismartcoding.plainqq"
        minSdk = 28
        targetSdk = 34

        val abiFilterList = if (hasProperty("abiFilters")) property("abiFilters").toString().split(';') else listOf()
        val singleAbiNum =
            when (abiFilterList.takeIf { it.size == 1 }?.first()) {
                "armeabi-v7a" -> 2
                "arm64-v8a" -> 1
                else -> 0
            }

        val vCode = 328
        versionCode = vCode - singleAbiNum
        versionName = "1.3.5"

        ndk {
            //noinspection ChromeOsAbiSupport
            abiFilters += abiFilterList.ifEmpty {
                listOf("arm64-v8a")
            }
        }
    }

    bundle {
        language {
            enableSplit = false
        }
    }

    buildTypes {
        debug {
            applicationIdSuffix = ".debug"
            isShrinkResources = false
            isMinifyEnabled = false
            isDebuggable = true
            ndk {
                debugSymbolLevel = "SYMBOL_TABLE"
            }

            buildConfigField("String", "CHANNEL", "\"\"")
//            setProguardFiles(listOf(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro"))
        }
        release {
            isShrinkResources = true
            isMinifyEnabled = true
            ndk {
                debugSymbolLevel = "SYMBOL_TABLE"
            }

        }
    }

    flavorDimensions += "channel"
    productFlavors {
        create("github") {
            dimension = "channel"
            buildConfigField("String", "CHANNEL", "\"GITHUB\"")
        }
        create("china") {
            dimension = "channel"
            buildConfigField("String", "CHANNEL", "\"CHINA\"")
        }
        create("google") {
            dimension = "channel"
            buildConfigField("String", "CHANNEL", "\"GOOGLE\"")
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }

    buildFeatures {
        buildConfig = true
        viewBinding = true
        dataBinding = true
        compose = true
    }

    composeOptions {
        kotlinCompilerExtensionVersion = "1.5.12"
    }

    packaging {
        jniLibs {
            // useLegacyPackaging = true
            excludes += listOf("META-INF/*")
        }
        resources {
            excludes += listOf("META-INF/*")
        }
    }
    namespace = "com.ismartcoding.plain"

    apollo {
        packageName.set("com.ismartcoding.plain")
        mapScalar("Time", "java.util.Date")
    }

    kotlinOptions {
        jvmTarget = "17"
    }
}

dependencies {

    implementation(platform(libs.compose.bom))

    // https://github.com/google/accompanist/releases
    implementation(libs.compose.lifecycle.runtime)
    implementation(libs.compose.activity)
    implementation(libs.compose.runtime)
    implementation(libs.compose.ui)
    implementation(libs.compose.foundation)
    implementation(libs.compose.foundation.layout)
    implementation(libs.compose.material3)
    implementation(libs.compose.material.icons.extended)
    implementation(libs.accompanist.drawablepainter)
    // https://developer.android.com/jetpack/androidx/releases/navigation
    implementation(libs.compose.navigation)

//    releaseImplementation(platform(libs.firebase.bom))
//    releaseImplementation(libs.firebase.crashlytics.ktx)

    // Media3
    implementation(libs.media3.exoplayer)
    implementation(libs.media3.datasource)
    implementation(libs.media3.ui)
    implementation(libs.media3.session)
    implementation(libs.media3.cast)
    implementation(libs.media3.dash)
    implementation(libs.media3.hls)

    implementation(libs.apollo.runtime)
    implementation(libs.apollo.normalized.cache)
    implementation(libs.apollo.normalized.cache.sqlite)
    implementation(libs.apollo.adapters)

    implementation(libs.androidx.viewpager2)
    implementation(libs.androidx.preference.ktx)

    implementation(libs.androidx.core.splashscreen)
    implementation(libs.snake.yaml)

    // CameraX
    implementation(libs.camera.core)
    implementation(libs.camera.camera2)
    implementation(libs.camera.lifecycle)
    implementation(libs.camera.view)

    implementation(libs.ktor.server.core)
    implementation(libs.ktor.server.netty)
    implementation(libs.ktor.server.websockets)
    implementation(libs.ktor.server.compression)
    implementation(libs.ktor.server.content.negotiation)
    implementation(libs.ktor.network.tls.certificates)
    implementation(libs.ktor.serialization.kotlinx.json)
    implementation(libs.ktor.server.caching.headers)
    implementation(libs.ktor.server.cors)
    implementation(libs.ktor.server.forwarded.header)
    implementation(libs.ktor.server.partial.content)
    implementation(libs.ktor.server.auto.head.response)
    implementation(libs.ktor.server.conditional.headers)

    implementation(libs.kgraphql)
    implementation(libs.kgraphql.ktor)

    // https://developer.android.com/jetpack/androidx/releases/room
    implementation(libs.room.runtime)
    annotationProcessor(libs.room.compiler)
    ksp(libs.room.compiler)

    implementation(libs.openai.client)

    // coil: https://coil-kt.github.io/coil/changelog/
    implementation(libs.coil)
    implementation(libs.coil.video)
    implementation(libs.coil.svg)
    implementation(libs.coil.gif)
    implementation(libs.coil.compose)
    implementation(libs.coil.network.ktor)

    implementation(libs.zxing.core)
    implementation(libs.paging.runtime)

    implementation(libs.androidx.work.runtime.ktx)

    // https://developer.android.com/jetpack/androidx/releases/datastore
    implementation(libs.androidx.datastore.preferences)

    implementation(libs.zt.zip)
    implementation(project(":lib"))
    debugImplementation(libs.leakcanary.android)
    implementation(kotlin("stdlib", KotlinCompilerVersion.VERSION))
}
