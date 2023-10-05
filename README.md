# A library to make Android SDK compliant with the SOLID principles

## Motivation
After several years working with Android development, I have found that the Android SDK is not compliant with the SOLID principles. 
This is a problem because it makes the code difficult to maintain and test. 
This library tries to solve this problem by providing a set of classes that wrap the Android SDK and make it compliant with the SOLID principles.

## How to use it
As the library is just a wrapper around the Android SDK, you can use it in the same way you use the Android SDK.
The only think that changes is that you need to add the suffix `Solid` to the class name. e.g. `AppCompatSpinner` becomes `AppCompatSpinnerSolid`.

```kotlin

```

## How to install it
The library is available in Maven Central. You can add it to your project by adding the following dependency to your build.gradle file:
```groovy
```