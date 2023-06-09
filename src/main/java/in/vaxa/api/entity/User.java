package in.vaxa.api.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

@Entity
@Table(name = "USERS")
public class User {
  @Id
  @GeneratedValue
  private int userId;
  @NotNull(message = "username shouldn't be null")
  private String name;
  @Email(message = "invalid email address")
  private String email;
  @Pattern(regexp = "^\\d{10}$", message = "invalid mobile number entered ")
  private String mobile;
  private String gender;
  @Min(18)
  @Max(60)
  private int age;
  @NotBlank
  private String nationality;

  public User() {
  }

  public User(int userId, String name, String email, String mobile, String gender, int age, String nationality) {
    this.userId = userId;
    this.name = name;
    this.email = email;
    this.mobile = mobile;
    this.gender = gender;
    this.age = age;
    this.nationality = nationality;
  }

  public int getUserId() {
    return userId;
  }

  public void setUserId(int userId) {
    this.userId = userId;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getMobile() {
    return mobile;
  }

  public void setMobile(String mobile) {
    this.mobile = mobile;
  }

  public String getGender() {
    return gender;
  }

  public void setGender(String gender) {
    this.gender = gender;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public String getNationality() {
    return nationality;
  }

  public void setNationality(String nationality) {
    this.nationality = nationality;
  }
}
