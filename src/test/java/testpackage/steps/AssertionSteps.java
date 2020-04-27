package testpackage.steps;

import cucumber.api.java.After;
import net.thucydides.core.annotations.Shared;
import net.thucydides.core.steps.StepEventBus;
import org.junit.Assert;
import testpackage.errors.TestError;
import testpackage.pages.PacientLKPage;


import java.util.ArrayList;
import java.util.List;

public class AssertionSteps {

    PacientLKPage pacientLKPage;

    @Shared
    AssertionSteps assertionSteps;

    List<TestError> errors = new ArrayList<>();

    public List<TestError> getErrors() {
        return errors;
    }

    public void softAssertIsFalse(String message, Boolean condition) {
        try {
            Assert.assertFalse(message, condition);
        } catch (AssertionError e) {
            saveError(e);
        }
    }

    public void softAssertIsTrue(String message, Boolean condition) {
        try {
            Assert.assertTrue(message, condition);
        } catch (AssertionError e) {
            saveError(e);
        }
    }

    public void softAssertIsEquals(String message, Object expected, Object actual) {
        try {
            Assert.assertEquals(message, expected, actual);
        } catch (AssertionError e) {
            saveError(e);
        }
    }

    public void softAssertNotEquals(String message, Object unexpected, Object actual) {
        try {
            Assert.assertNotEquals(message, unexpected, actual);
        } catch (AssertionError e) {
            saveError(e);
        }
    }

    public void softAssertArrayEquals(String message, Object[] firstArray, Object[] secondArray) {
        try {
            Assert.assertArrayEquals(message, firstArray, secondArray);
        } catch (AssertionError e) {
            saveError(e);
        }
    }

    private void saveError(AssertionError e) {
        String stepName = StepEventBus.getEventBus().getCurrentStep().toString().replaceAll("^Optional\\[", "").replaceAll("]", "");
        TestError testError = new TestError(e, stepName);
        errors.add(testError);

        StepEventBus eventBus = StepEventBus.getEventBus();
        StringBuilder sb = new StringBuilder();
        if (!stepName.contains("=Assertion error=")) {
            sb.append(stepName + "\r\n\r\n");
            sb.append("=================Assertion error====================\r\n");
            sb.append(e.getMessage() + "\r\n");
            sb.append("===============================================\r\n");
        } else {
            sb.append(stepName.replaceAll("===============================================", "") + "\r\n\r\n");
            sb.append(e.getMessage() + "\r\n");
            sb.append("===============================================\r\n");
        }
        eventBus.updateCurrentStepTitle(sb.toString());
        eventBus.takeScreenshot();
        pacientLKPage.scrollToUp();
        eventBus.takeScreenshot();
        pacientLKPage.scrollToDown();
        eventBus.takeScreenshot();
        StepEventBus.overrideEventBusWith(eventBus);
    }

    @After
    public void checkAssertionList() {
        StringBuilder sb = new StringBuilder();
        if (assertionSteps.getErrors().size() > 0) {
            for (TestError error : assertionSteps.getErrors()) {
                sb.append("\t\t");
                sb.append("=========================================================").append("\t\t");
                sb.append(error.getStep().replaceAll("^Optional", "Шаг: "));
                sb.append("    ****    ");
                sb.append("\t\t\t\t\t\t\t\t\t\t\t\t");
                sb.append(error.getAssertionError().getMessage());
                sb.append("\t\t");
                sb.append("=========================================================").append("\t\t");
                sb.append("\t\t");
            }
            pacientLKPage.getDriver().quit();
            throw new AssertionError(sb.toString());
        }
    }
}
