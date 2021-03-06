package dependency

object Kotlin {


    private const val kotlinVersion = "1.4.32"
    private const val coroutineVersion = "1.4.3"

    //Kotlin Standard Library
    const val stdlib = "org.jetbrains.kotlin:kotlin-stdlib:$kotlinVersion"

    //Kotlin Gradle Plugin
    const val gradlePlugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:$kotlinVersion"

    const val coroutine = "org.jetbrains.kotlinx:kotlinx-coroutines-android:$coroutineVersion"

    const val coroutinePlayservices = "org.jetbrains.kotlinx:kotlinx-coroutines-play-services:$coroutineVersion"




}