package com.myblog.intern.request;

public class UserProfileRequest {
    private String firstName;
    private String lastName;
    private String email;
    private Integer birthDate;
    private Integer birthMonth;
    private Integer birthYear;
    private String street;
    private String state;
    private String country;
    private Integer zipCode;
    private String contact;
    private String profilePic;
    private String userName;
    private String role;
    public UserProfileRequest(){}
    public UserProfileRequest(String firstName, String lastName, String email, Integer birthDate, Integer birthMonth, Integer birthYear, String street, String state, String country, Integer zipCode, String contact, String profilePic, String userName, String role) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.birthDate = birthDate;
        this.birthMonth = birthMonth;
        this.birthYear = birthYear;
        this.street = street;
        this.state = state;
        this.country = country;
        this.zipCode = zipCode;
        this.contact = contact;
        this.profilePic = profilePic;
        this.userName = userName;
        this.role = role;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public Integer getBirthDate() {
        return birthDate;
    }

    public Integer getBirthMonth() {
        return birthMonth;
    }

    public Integer getBirthYear() {
        return birthYear;
    }

    public String getStreet() {
        return street;
    }

    public String getState() {
        return state;
    }

    public String getCountry() {
        return country;
    }

    public Integer getZipCode() {
        return zipCode;
    }

    public String getContact() {
        return contact;
    }

    public String getProfilePic() {
        return profilePic;
    }

    public String getUserName() {
        return userName;
    }

    public String getRole() {
        return role;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setBirthDate(Integer birthDate) {
        this.birthDate = birthDate;
    }

    public void setBirthMonth(Integer birthMonth) {
        this.birthMonth = birthMonth;
    }

    public void setBirthYear(Integer birthYear) {
        this.birthYear = birthYear;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setZipCode(Integer zipCode) {
        this.zipCode = zipCode;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public void setProfilePic(String profilePic) {
        this.profilePic = profilePic;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
