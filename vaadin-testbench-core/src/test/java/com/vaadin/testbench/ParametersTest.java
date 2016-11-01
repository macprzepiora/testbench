package com.vaadin.testbench;

import org.junit.Assert;
import org.junit.Test;

public class ParametersTest {

    @Test
    public void testDefaultValues() {
        Assert.assertEquals(2, Parameters.getMaxScreenshotRetries());
        Assert.assertEquals(0.01,
                Parameters.getScreenshotComparisonTolerance(),
                0.0);
        Assert.assertEquals(500, Parameters.getScreenshotRetryDelay());
        Assert.assertEquals(50, Parameters.getTestsInParallel());
        Assert.assertEquals(20, Parameters.getTestSuitesInParallel());
        Assert.assertEquals("error-screenshots",
                Parameters.getScreenshotErrorDirectory());
        Assert.assertEquals("reference-screenshots",
                Parameters.getScreenshotReferenceDirectory());
        Assert.assertEquals(false, Parameters.isDebug());
        Assert.assertEquals(false,
                Parameters.isScreenshotComparisonCursorDetection());
    }
}
