package org.jsoup;

import org.junit.Test;
import java.io.IOException;

import static org.junit.Assert.*;

public class UncheckedIOExceptionTest {

    @Test
    public void testConstructorAndIoException_NormalCase() {
        // Arrange
        IOException originalIoException = new IOException("Connection reset");
        
        // Act
        UncheckedIOException uncheckedException = new UncheckedIOException(originalIoException);
        IOException result = uncheckedException.ioException();
        
        // Assert
        assertNotNull("The UncheckedIOException should not be null", uncheckedException);
        assertNotNull("The underlying IOException should not be null", result);
        assertSame("The returned IOException must be the exact same instance", originalIoException, result);
        assertEquals("The exception message should match", "Connection reset", result.getMessage());
    }

    @Test
    public void testConstructorAndIoException_NullCause() {
        // Arrange & Act: Edge case where cause is null
        UncheckedIOException uncheckedException = new UncheckedIOException(null);
        IOException result = uncheckedException.ioException();
        
        // Assert
        assertNotNull("The UncheckedIOException should be instantiated even with null cause", uncheckedException);
        assertNull("getCause() and ioException() should return null when initialized with null", result);
    }

    @Test
    public void testInheritanceAndCauseHandling() {
        // Arrange
        IOException originalIoException = new IOException("File not found");
        UncheckedIOException uncheckedException = new UncheckedIOException(originalIoException);

        // Act & Assert: ตรวจสอบความสัมพันธ์ผ่าน RuntimeException (getCause)
        assertTrue("UncheckedIOException must be an instance of RuntimeException", uncheckedException instanceof RuntimeException);
        assertSame("getCause() should return the original IOException", originalIoException, uncheckedException.getCause());
    }
}