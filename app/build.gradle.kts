plugins {
    id("com.android.application")
    id("kotlin-android")
    id("kotlin-parcelize")
    id("kotlin-kapt")
}

android {
    compileSdkVersion(30)
    buildToolsVersion = "30.0.3"
    defaultConfig {
        applicationId = "com.keyflare.weather"
        minSdkVersion(26)
        targetSdkVersion(30)
        versionCode = 1
        versionName = "1.0"
    }
    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
}

dependencies {
    // Kotlin
    implementation("org.jetbrains.kotlin:kotlin-stdlib:$kotlinVersion")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:$coroutinesVersion")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-android:$coroutinesVersion")

    // AndroidX
    implementation("androidx.core:core-ktx:${AndroidXVersions.core}")
    implementation("androidx.appcompat:appcompat:${AndroidXVersions.appcompat}")
    implementation("androidx.constraintlayout:constraintlayout:${AndroidXVersions.constrained}")
    implementation("androidx.fragment:fragment-ktx:${AndroidXVersions.fragment}")
    implementation("androidx.legacy:legacy-support-v4:${AndroidXVersions.legacySupport}")
    implementation("androidx.lifecycle:lifecycle-livedata-ktx:${AndroidXVersions.lifecycle}")
    implementation("androidx.lifecycle:lifecycle-viewmodel-ktx:${AndroidXVersions.lifecycle}")

    // Koin
    implementation("org.koin:koin-android:$koinVersion")
    implementation("org.koin:koin-android-viewmodel:$koinVersion")

    // Others
    implementation("com.google.android.material:material:$materialVersion")
    implementation("com.jakewharton.timber:timber:$timberVersion")
}