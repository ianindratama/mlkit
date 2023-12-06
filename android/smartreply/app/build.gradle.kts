plugins {
    id("com.android.application")
    id("kotlin-android")
    id("kotlin-parcelize")
}

android {
    namespace = "com.google.mlkit.samples.nl.smartreply"
    compileSdk = 34
    defaultConfig {
        applicationId = "com.google.mlkit.samples.nl.smartreply"
        minSdk = 21
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"
        vectorDrawables.useSupportLibrary = true
        multiDexEnabled = true
        setProperty("archivesBaseName", "nl-smartreply")
    }
    buildTypes {
        named("release") {
            isMinifyEnabled = false
            setProguardFiles(listOf(getDefaultProguardFile("proguard-android.txt"), "proguard-rules.pro"))
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
    kotlinOptions {
        jvmTarget = "17"
    }
}

dependencies {
    implementation(project(":internal:chooserx"))
    implementation(kotlin("stdlib"))

    implementation("androidx.media:media:1.2.1")
    implementation("com.google.android.material:material:1.2.1")
    implementation("androidx.constraintlayout:constraintlayout:2.0.4")
    implementation("androidx.recyclerview:recyclerview:1.1.0")
    implementation("androidx.lifecycle:lifecycle-extensions:2.2.0")

    // Use this dependency to bundle the model with your app
    // implementation("com.google.mlkit:smart-reply:17.0.1")

    // Use this dependency to use the dynamically downloaded model in Google Play Services
    implementation ("com.google.android.gms:play-services-mlkit-smart-reply:16.0.0-beta1")

    implementation("com.google.guava:guava:27.0.1-android")
}