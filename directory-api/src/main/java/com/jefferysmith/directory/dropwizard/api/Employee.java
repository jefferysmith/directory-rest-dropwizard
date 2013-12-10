package com.jefferysmith.directory.dropwizard.api;

public class Employee {

    private Long id;
    private String firstName;
    private String lastName;
    private String title;
    private String department;
    private String cellPhone;
    private String officePhone;
    private String email;
    private String city;
    private String pic;
    private String twitterId;
    private String blog;
    // manager id
    // manager name
    // reports (i.e. number of reports)

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getCellPhone() {
        return cellPhone;
    }

    public void setCellPhone(String cellPhone) {
        this.cellPhone = cellPhone;
    }

    public String getOfficePhone() {
        return officePhone;
    }

    public void setOfficePhone(String officePhone) {
        this.officePhone = officePhone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }

    public String getTwitterId() {
        return twitterId;
    }

    public void setTwitterId(String twitterId) {
        this.twitterId = twitterId;
    }

    public String getBlog() {
        return blog;
    }

    public void setBlog(String blog) {
        this.blog = blog;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Employee employee = (Employee) o;

        if (blog != null ? !blog.equals(employee.blog) : employee.blog != null) return false;
        if (cellPhone != null ? !cellPhone.equals(employee.cellPhone) : employee.cellPhone != null) return false;
        if (city != null ? !city.equals(employee.city) : employee.city != null) return false;
        if (department != null ? !department.equals(employee.department) : employee.department != null) return false;
        if (email != null ? !email.equals(employee.email) : employee.email != null) return false;
        if (!firstName.equals(employee.firstName)) return false;
        if (!id.equals(employee.id)) return false;
        if (!lastName.equals(employee.lastName)) return false;
        if (officePhone != null ? !officePhone.equals(employee.officePhone) : employee.officePhone != null)
            return false;
        if (pic != null ? !pic.equals(employee.pic) : employee.pic != null) return false;
        if (title != null ? !title.equals(employee.title) : employee.title != null) return false;
        if (twitterId != null ? !twitterId.equals(employee.twitterId) : employee.twitterId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id.hashCode();
        result = 31 * result + firstName.hashCode();
        result = 31 * result + lastName.hashCode();
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = 31 * result + (department != null ? department.hashCode() : 0);
        result = 31 * result + (cellPhone != null ? cellPhone.hashCode() : 0);
        result = 31 * result + (officePhone != null ? officePhone.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (city != null ? city.hashCode() : 0);
        result = 31 * result + (pic != null ? pic.hashCode() : 0);
        result = 31 * result + (twitterId != null ? twitterId.hashCode() : 0);
        result = 31 * result + (blog != null ? blog.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", title='" + title + '\'' +
                ", department='" + department + '\'' +
                ", cellPhone='" + cellPhone + '\'' +
                ", officePhone='" + officePhone + '\'' +
                ", email='" + email + '\'' +
                ", city='" + city + '\'' +
                ", pic='" + pic + '\'' +
                ", twitterId='" + twitterId + '\'' +
                ", blog='" + blog + '\'' +
                '}';
    }
}
