# Country-Picker
A customizable country picker component for Android applications.

## Features
- Displays a list of countries.
- Allows selection of a country with its flag.
- Supports custom default country.
- Easy to integrate into any Android project.

## Table of Contents
1. [Installation](#installation)
2. [Usage](#usage)
    - [XML Layout](#xml-layout)
    - [Programmatically](#programmatically)
3. [Customization](#customization)
4. [Contributing](#contributing)
5. [License](#license)

## Installation

### Step 1: Add the dependency
To include the `Country-Picker` in your Android project, you can use **JitPack**. Follow the steps below:

1. Add the JitPack repository to your root `build.gradle` file:

    ```gradle
    allprojects {
        repositories {
            google()
            mavenCentral()
            maven { url 'https://jitpack.io' }
        }
    }
    ```

2. Add the dependency to your module-level `build.gradle` file:

    ```gradle
    dependencies {
        implementation 'com.github.hidirektor:Country-Picker:Tag'
    }
    ```

   Replace `Tag` with the version or commit hash you want to use.

### Step 2: Sync the project
Sync your Gradle files to download the library.

## Usage

### XML Layout

You can add the `CountryPicker` component directly in your XML layout file:

```xml
<me.t3sl4.countrypicker.CountryPicker
    android:id="@+id/countryPicker"
    android:layout_width="match_parent"
    android:layout_height="wrap_content"
    android:spinnerMode="dropdown"
    app:defaultCountryCode="US" />
```

### Programmatically

You can also initialize CountryPicker programmatically in your Java or Kotlin code:

```Java
CountryPicker countryPicker = new CountryPicker(context);
countryPicker.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        Country selectedCountry = countryPicker.getSelectedCountry();
        // Do something with the selected country
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {
        // Handle when no country is selected
    }
});
```

### Default Country

You can set a default country that will be pre-selected when the CountryPicker is initialized. This can be done either via XML:

```
app:defaultCountryCode="TR"
```

```
countryPicker.setSelection(countryPicker.getDefaultCountryPosition("TR"));
```