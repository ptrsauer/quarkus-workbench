package de.ptrsauer.quickstart;

import io.quarkus.test.junit.NativeImageTest;

@NativeImageTest
class NativeGreetingResourceIT extends GreetingResourceTest {

    // Execute the same tests but in native mode.
}