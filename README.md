# Android Navigation Architecture Component

An example using the Android Navigation Architecture Component part of the Jetpack in Kotlin.

This app has 1 activity with 3 fragments where the workflow is managed by the Navigation. I also used the **safeargs** approach to pass data between destinations (fragments) *vs* the **Interface**, where the fragment communicates to the activity and then the activity can deliver messages to the fragments.

I also implement a simple **unit test** and **instrumented test** using JUnit and Espresso.

### Navigation workflow with instrumented test

<img src="screens/navigation_video.gif" width="500"/>

### Some links

[Navigation](https://developer.android.com/topic/libraries/architecture/navigation/navigation-implementing#top_of_page)

[Communication with Fragments using Interfaces](https://developer.android.com/training/basics/fragments/communicating#top_of_page)

[Unit Test](https://developer.android.com/training/testing/unit-testing/local-unit-tests#top_of_page)

[Instrumented Test](https://developer.android.com/training/testing/unit-testing/instrumented-unit-tests#top_of_page)

