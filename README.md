# ShimmerButtonByHafeez

ShimmerButtonByHafeez is a custom Android library that provides a shimmering button with customizable attributes. It utilizes the Facebook Shimmer library to create a shimmer effect on buttons.

## Preview

![ShimmerButtonByHafeez Preview](https://github.com/DevHafeez/ShimmerButtonAndroid1/raw/master/preview.gif)


## Implementation

To use ShimmerButtonByHafeez in your Android project, follow these steps:

1. Add the JitPack repository to your root build.gradle file:

```groovy
allprojects {
    repositories {
        ...
        maven { url 'https://jitpack.io' }
    }
}
```
Add the dependency to your app build.gradle file:
Latest version: [![](https://jitpack.io/v/DevHafeez/ShimmerButtonAndroid1.svg)](https://jitpack.io/#DevHafeez/ShimmerButtonAndroid1)
```groovy
dependencies {
     implementation 'com.github.DevHafeez:ShimmerButtonAndroid1:TAG'
}
```
Replace YourUsername with your GitHub username and Tag with the version you want to use.

## Usage

To use ShimmerButtonByHafeez in your layout XML file, add the following code:

```xml
<com.hafeez.shimmer.ShimmerButtonByHafeez
    android:layout_width="match_parent"
    android:layout_height="wrap_content"
    android:text="Get Started"
    app:button_width="120dp"
    app:button_height="60dp"
    app:shimmer_bg_res="@drawable/blue_gradient_round_bg"
    app:shimmer_foreground_res="@drawable/white_round_bg"
    app:shimmer_speed="2000" />
```

blue_gradient_round_bg.xml

```xml
<?xml version="1.0" encoding="utf-8"?>
<shape xmlns:android="http://schemas.android.com/apk/res/android">
    <gradient
        android:endColor="#4945FF"
        android:startColor="#408CFF" />
    <corners android:radius="6dp" />
</shape>
```

white_round_bg

```xml
<?xml version="1.0" encoding="utf-8"?>
<shape xmlns:android="http://schemas.android.com/apk/res/android">
    <solid android:color="#AAFFFFFF" />
    <corners android:radius="6dp" />
</shape>
```
Customize the attributes button_width, button_height, shimmer_bg_res, shimmer_foreground_res, and shimmer_speed according to your requirements.

License

This library is licensed under the MIT License.

```groovy
Feel free to customize and expand upon this template as needed for your specific library. You can add more sections such as "Features", "Contributing", or "Acknowledgements" if desired. Additionally, you can include images or GIFs to showcase your library in action.
```




