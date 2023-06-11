object Version {
    const val core = "1.8.0"
    const val appcompat = "1.3.1"
    const val material = "1.9.0"
    const val dagger = "2.44.2"
    const val hiltCompiler = "2.44.2"
    const val hiltComposeNavigation = "1.0.0"
    const val lifecycle_version = "2.2.0"
    const val coil = "1.3.2"
    const val coroutine = "1.3.9"
    const val retrofit = "2.9.0"
    const val retrofit_converter = "0.8.0"
    const val maps_utils = "2.3.0"
    const val location = "21.0.1"
    const val places = "3.1.0"
    const val room = "2.3.0"
    const val jetpack_navigation = "2.5.3"
    const val map_compose = "2.11.4"
    const val play_services_maps = "18.0.2"
}

object Deps {
    const val core = "androidx.core:core-ktx:${Version.core}"
    const val appcompat = "androidx.appcompat:appcompat:${Version.appcompat}"
    const val material = "com.google.android.material:material:${Version.material}"
}

object Dagger {
    const val dagger = "com.google.dagger:hilt-android:${Version.dagger}"
    const val kaptHiltCompiler = "com.google.dagger:hilt-compiler:${Version.hiltCompiler}"
    const val hiltComposeNavigation =
        "androidx.hilt:hilt-navigation-compose:${Version.hiltComposeNavigation}"
}

object Lifecycle {
    const val livedata = "androidx.lifecycle:lifecycle-livedata-ktx:${Version.lifecycle_version}"
    const val viewmodel = "androidx.lifecycle:lifecycle-viewmodel-ktx:${Version.lifecycle_version}"
    const val runtime = "androidx.lifecycle:lifecycle-runtime-ktx:${Version.lifecycle_version}"
    const val extensions = "androidx.lifecycle:lifecycle-extensions:${Version.lifecycle_version}"
}

object Coroutines {
    const val coroutine_core = "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Version.coroutine}"
    const val coroutine_android =
        "org.jetbrains.kotlinx:kotlinx-coroutines-android:${Version.coroutine}"
}

object Retrofit {
    const val retrofit2 = "com.squareup.retrofit2:retrofit:${Version.retrofit}"
    const val retrofit2_gson = "com.squareup.retrofit2:converter-gson:${Version.retrofit}"
    const val retrofit_converter =
        "com.jakewharton.retrofit:retrofit2-kotlinx-serialization-converter:${Version.retrofit_converter}"
}

object GoogleMaps {
    const val maps_utils = "com.google.maps.android:android-maps-utils:${Version.maps_utils}"
    const val services_location = "com.google.android.gms:play-services-location:${Version.location}"
    const val places = "com.google.android.libraries.places:places:${Version.places}"
    const val map_compose = "com.google.maps.android:maps-compose:${Version.map_compose}"
    const val googlePlaysServicesMap = "com.google.android.gms:play-services-maps:${Version.play_services_maps}"
}

object Coil {
    const val coil = "io.coil-kt:coil-compose:${Version.coil}"
}

object Room {
    const val room_ktx = "androidx.room:room-runtime:${Version.room}"
    const val kapt_room_compiler = "androidx.room:room-compiler:${Version.room}"
    const val room_runtime = "androidx.room:room-runtime:${Version.room}"
}

object Jetpack{
    const val navigation_compose = "androidx.navigation:navigation-compose:${Version.jetpack_navigation}"
}
 
