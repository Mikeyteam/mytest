package ru.mai.springmvc.actions;

/**
 * Created by IntelliJ IDEA.
 * User: Eugene
 * Date: 04.12.2010
 * Time: 11:57:27
 * To change this template use File | Settings | File Templates.
 */
public class LoginForm {

    private String login;
    private String password;
    private Department department;
    private Boolean success;

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }
}
