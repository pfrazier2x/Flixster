plugins {
    alias(libs.plugins.android.application)
}

android {
    namespace = "com.example.flixster"

    compileSdk {
        version = release(37)
    }

    defaultConfig {
        applicationId = "com.example.flixster"
        minSdk = 24
        targetSdk = 37
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            optimization {
                enable = false
            }
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
}

dependencies {
    implementation(libs.androidx.activity.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.androidx.constraintlayout)
    implementation(libs.androidx.core.ktx)
    implementation(libs.material)

    // RecyclerView - displays the movie list
    implementation("androidx.recyclerview:recyclerview:1.4.0")

    // Glide - loads movie poster images
    implementation("com.github.bumptech.glide:glide:4.16.0")

    // CodePath Async HTTP Client - gets movie data from TMDB
    implementation("com.codepath.libraries:asynchttpclient:2.2.0")

    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.espresso.core)
    androidTestImplementation(libs.androidx.junit)
}