package dependency

object Androidx {



    private const val coreKtxVersion = "1.3.2"
    const val   coreKtx = "androidx.core:core-ktx:$coreKtxVersion"

    private const val appCompatVersion = "1.2.0"
    const val appCompat = "androidx.appcompat:appcompat:$appCompatVersion"

    private const val constraintLayoutVersion = "2.0.4"
    const val constraintLayout = "androidx.constraintlayout:constraintlayout:$constraintLayoutVersion"

    private const val lifecycleVersion = "2.3.1"

    // ViewModel
    const val viewModel = "androidx.lifecycle:lifecycle-viewmodel-ktx:$lifecycleVersion"
    // LiveData
    const val liveData =  "androidx.lifecycle:lifecycle-livedata-ktx:$lifecycleVersion"


    //Fragment-KTX
    private const val fragmentKtxVersion = "1.3.2"
    const val fragmentKtx = "androidx.fragment:fragment-ktx:$fragmentKtxVersion"

    //Part of navigation component
    private const val navVersion = "2.3.5"
    const val navigationFragmentKtx = "androidx.navigation:navigation-fragment-ktx:$navVersion"
    const val navigatioUIKtx = "androidx.navigation:navigation-ui-ktx:$navVersion"

}