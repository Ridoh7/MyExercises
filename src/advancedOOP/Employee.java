package advancedOOP;

public class Employee {
    private String firstName;
    private String lastName;
    private String bvn;
    private String gender;
    private Date birthDate;
    private Date hireDate;
    private Date weddingDate;

    public Employee(String firstName, String lastName, String bvn, String gender, Date birthDate, Date hireDate, Date weddingDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.bvn = bvn;
        this.gender = gender;
        this.birthDate = birthDate;
        this.hireDate = hireDate;
        this.weddingDate = weddingDate;
    }
    private boolean validateBVN(String bvn){
        System.out.println(ErrorMessages.bvnLengthError);
//        if (bvn.length()==11){
//            return true;
//        }
//        return false;
        return bvn.length()==11;
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

    public String getBvn() {
        return bvn;
    }

    public void setBvn(String bvn) {
        this.bvn = bvn;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public Date getHireDate() {
        return hireDate;
    }

    public void setHireDate(Date hireDate) {
        this.hireDate = hireDate;
    }

    public Date getWeddingDate() {
        return weddingDate;
    }

    public void setWeddingDate(Date weddingDate) {
        this.weddingDate = weddingDate;
    }
    public void displayEmployeeInfo(){
            System.out.printf("""
                    Firstname: %s
                    Lastname: %s
                    Bvn: %s
                    Gender: %s
                    BirthDate: %s
                    HireDate: %s
                    WeddingDate: %s
                    
                    """, getFirstName(), getLastName(), getBvn(), getGender(), getBirthDate().toString(),
                    getHireDate().toString(), getWeddingDate());
        }
}

