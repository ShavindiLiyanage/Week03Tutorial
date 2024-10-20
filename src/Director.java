public class Director {
    private String name;
    private String surname;
    private int numDirectedMovie;
    private Date Dob;

    public Director(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public void setDob(Date DoB) {
        this.Dob = DoB;
    }

    public void setNumDirectedMovie(int nMovie) {
        this.numDirectedMovie = nMovie;
    }

    public int getNumDirectedMovie() {
        return numDirectedMovie;
    }

    public Date getDob(){
        return Dob;
    }


}
