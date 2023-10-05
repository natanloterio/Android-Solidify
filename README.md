# A library to make Android SDK compliant with the SOLID principles

## Motivation
After several years working with Android development, I have found that the Android SDK is not compliant with the SOLID principles. 
This is a problem because it makes the code difficult to maintain and test. 
This library tries to solve this problem by providing a set of classes that wrap the Android SDK and make it compliant with the SOLID principles.

## How to use it
As the library is just a wrapper around the Android SDK, you can use it in the same way you use the Android SDK.
The only think that changes is that you need to add the suffix `Solid` to the class name. e.g. `AppCompatSpinner` becomes `AppCompatSpinnerSolid`.

### Example

Here you have an example of how to use the Android SDK to add an item to a spinner.
You sometimes just want to do something when the user selects an item, but you are forced to implement the `onNothingSelected` method.
```kotlin
    viewBinding.spinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
    
        override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
            // You just want to do something when the user selects an item
        }
    
        override fun onNothingSelected(parent: AdapterView<*>?) {
            // But you shouldn't be forced to implement this method
        }
    }
```

With the library, you can use the `OnItemSelectedListenerSolid` class to avoid implementing the `onNothingSelected` method.
The library offers a modern way to implement the callback using a lambda.
```kotlin
    viewBinding.spinner.onItemSelected = { parent, _, position, _ ->
        // With Solidify, you can just implement the callbacks you need
    }
```

## How to install it
The library is available in Maven Central. You can add it to your project by adding the following dependency to your build.gradle file:
```groovy
```