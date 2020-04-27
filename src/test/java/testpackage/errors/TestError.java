package testpackage.errors;

public class TestError {
    private AssertionError assertionError;
    private String step;

    public TestError(AssertionError assertionError, String step) {
        this.assertionError = assertionError;
        this.step = step;
    }

    public AssertionError getAssertionError() {
        return assertionError;
    }

    public String getStep() {
        return step;
    }
}