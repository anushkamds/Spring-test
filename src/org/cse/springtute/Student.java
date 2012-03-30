package org.cse.springtute;

public class Student {

	private String firstName;
	private String lastName;
	private long regNumber;
	private String address;

        public Student(){

        }
        public Student(long index,String firstName,String lastName,String address){
            regNumber=index;
            this.firstName=firstName;
            this.lastName=lastName;
            this.address=address;
        }

    public long getRegNumber() {
        return regNumber;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setRegNumber(long regNumber) {
        this.regNumber = regNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getAddress() {
        return address;
    }
    
}
