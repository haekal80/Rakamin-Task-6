package StepDef;

public class Env {
    String validUsername = "standard_user";
    String invalidUsername = "invalid_user";

    String validPassword = "secret_sauce";
    String url = "https://www.saucedemo.com/";

    public String getValidUsername() {
        return validUsername;
    }


    public String getValidPassword() {
        return validPassword;
    }


    public String getUrl() {
        return url;
    }


    public String getInvalidUsername() {
        return invalidUsername;
    }
}
