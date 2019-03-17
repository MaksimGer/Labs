package com.Netcracker.Author;

public class Author {
    private String name;
    private String email;
    private char gender;

    public Author(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }
    public String getEmail() {
        return email;
    }
    public char getGender() {
        return gender;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public boolean equals(Object obj){
        if (this == obj){
            return true;
        }

        if(!(obj instanceof Author)){
            return false;
        }

        Author author = (Author) obj;
        return this.email.equals(author.email) &&
                this.name.equals(author.name) &&
                this.gender == author.gender;
    }

    @Override
    public int hashCode(){
        int hashCode = 23;

        hashCode = 31 * hashCode + name.hashCode();
        hashCode = 31 * hashCode + email.hashCode();
        hashCode = 31 * hashCode + (int)gender;

        return hashCode;
    }

    @Override
    public String toString() {
        return "Author[name = " + name + ", email = " + email +
                ", gender = " + gender + "]";
    }
}
