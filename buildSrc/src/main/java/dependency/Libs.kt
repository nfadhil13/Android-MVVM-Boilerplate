package dependency

object Libs {


    object Hilt{
        private const val version = "2.35.1"
        private const val viewmodelVersion = "1.0.0-alpha01"

        const val gradlePlugin = "com.google.dagger:hilt-android-gradle-plugin:$version"
        const val hiltAndroid = "com.google.dagger:hilt-android:$version"
        const val compiler = "com.google.dagger:hilt-android-compiler:$version"
        const val viewModel = "androidx.hilt:hilt-lifecycle-viewmodel:$viewmodelVersion"

    }

    object Google {
        private const val materialVersion  = "1.2.1"
        const val material = "com.google.android.material:material:$materialVersion"
    }

    object Gradle {
        private const val version = "4.2.0"
        const val buildGradle = "com.android.tools.build:gradle:$version"
    }

}