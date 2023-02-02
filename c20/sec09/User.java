package c20.sec09;

import java.util.Objects;

public class User {

    private String userId;
    private String userName;
    private String userPassword;
    private int userAge;
    private String userEmail;


    public User(String userId, String userName, String userPassword, int userAge, String userEmail) {
        this.userId = userId;
        this.userName = userName;
        this.userPassword = userPassword;
        this.userAge = userAge;
        this.userEmail = userEmail;
    }

    public User() {

    }

    public String getUserId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public int getUserAge() {
        return userAge;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public void setUserAge(int userAge) {
        this.userAge = userAge;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return userAge == user.userAge && Objects.equals(userId, user.userId) && Objects.equals(userName, user.userName) && Objects.equals(userPassword, user.userPassword) && Objects.equals(userEmail, user.userEmail);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId, userName, userPassword, userAge, userEmail);
    }

    @Override
    public String toString() {
        return "User{" +
                "userId='" + userId + '\'' +
                ", userName='" + userName + '\'' +
                ", userPassword='" + userPassword + '\'' +
                ", userAge=" + userAge +
                ", userEmail='" + userEmail + '\'' +
                '}';
    }
}
