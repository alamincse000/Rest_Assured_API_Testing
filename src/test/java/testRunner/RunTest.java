package testRunner;

import io.qameta.allure.Allure;
import org.apache.commons.configuration.ConfigurationException;
import org.testng.annotations.Test;
import users.Users;


import java.io.IOException;

public class RunTest {
    Users users;

    @Test(priority = 4, description = "Calling login api enter valid credentials")
    public void callingLoginApi() throws ConfigurationException, IOException {
        users = new Users();
        users.callingLoginApi();
        Allure.description("After calling login api by valid credentials a token will be generate for authorization");

    }

    @Test(priority = 1, description = "Enter invalid email provide for login")
    public void incorrectEmail() throws IOException {
        users = new Users();
        users.incorrectEmail();
        Allure.description("will give 'user not found' message and status code 404 if incorrect email is provided");

    }

    @Test(priority = 2, description = "Enter incorrect password provide for login")
    public void incorrectPassword() throws IOException {
        users = new Users();
        users.incorrectPassword();
        Allure.description("will give 'wrong password and status code 401' if the provide incorrect password ");
    }

    @Test(priority = 3, description = "No password provided for login")
    public void blankPassword() throws IOException {
        users = new Users();
        users.blankPassword();
        Allure.description("will give 'message and status code 401' if the provide blank password");
    }

    @Test(priority = 8, description = "User list will be extracted by the giving proper authorization")
    public void getUserList() throws IOException {
        users = new Users();
        users.getUserList();
        Allure.description("if token & authorization is correct will give all user list and message & status code 200 ok  ");
    }

    @Test(priority = 6, description = "Can not get user list for incorrect authorization token")
    public void getUserListForIncorrectAuth() throws IOException {
        users = new Users();
        users.getUserListForIncorrectAuth();
        Allure.description("if provide incorrect authorization won't be able to show user list will be give status code 403 and status code 'Token expired'");
    }

    @Test(priority = 7, description = "Can not get user list incorrect authorization token")
    public void getUserListForBlankAuthorizationToken() throws IOException {
        users = new Users();
        users.getUserListForBlankAuthorizationToken();
        Allure.description("if no authorization will give status code 401 and message 'No token found' ");
    }

    @Test(priority = 10, description = "Created new user")
    public void createUser() throws ConfigurationException, IOException {
        users = new Users();
        users.createUser();
        Allure.description("if create new user will give status code 201 and provide message 'User created successfully' ");
    }

    @Test(priority = 9, description = "Already created user")
    public void alreadyCreatedUser() throws IOException {
        users = new Users();
        users.alreadyCreatedUser();
        Allure.description("if already created user will give status code 208 and given message 'user already exits' ");
    }

    @Test(priority = 13, description = "Find the users components")
    public void searchUser() throws IOException {
        users = new Users();
        users.searchUser();
        Allure.description("if found user id will be given status code & message 200 ok");
    }

    @Test(priority = 11, description = "Can not get user list,if invalid search id")
    public void searchUserInvalidId() throws IOException {
        users = new Users();
        users.searchUserInvalidId();
        Allure.description("Search user for invalid id should be give status code 401 user status null");
    }

    @Test(priority = 12, description = "Can not get user list because of invalid secret key")
    public void searchUserForInvalidSecretKey() throws IOException {
        users = new Users();
        users.searchUserForInvalidSecretKey();
        Allure.description("search for invalid secret key should give 401 as status code message should give 'auth validation failure! as error message' ");
    }

    @Test(priority = 13, description = "User is updated based on the stored id in the variable")
    public void userUpdate() throws IOException {
        users = new Users();
        users.updateUser();
        Allure.description("for user update will be give 200 as a status code and message 'ok' will be given");
    }

    @Test(priority = 14, description = "Updated user phone number by using patch method")
    public void updateUserPhoneNumber() throws IOException {
        users = new Users();
        users.updateUserPhoneNumber();
        Allure.description("if update user phone number by using patch method should give 200 as a status code and provide message 'Update successfully '");
    }

    @Test(priority = 15, description = "User is deleted")
    public void userDelete() throws IOException {
        users = new Users();
        users.userDelete();
        Allure.description("if the delete user id server should be give status code '200'and message provide 'deleted successfully'will be given ");
    }

    @Test(priority = 16, description = "User already deleted")
    public void userAlreadyDelete() throws IOException {
        users = new Users();
        users.userAlreadyDelete();
        Allure.description("for already deleted user id can not again delete will be give status code '404' return message 'result not found ' ");
    }

    @Test(priority = 17, description = "searching user delete")
    public void searchUserDelete() throws IOException {
        users = new Users();
        users.searchUserDelete();
        Allure.description("if the search user delete server should give status code 200 user will be null ");
    }

}
