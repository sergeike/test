package be.lombaer.test;

/**
 * Created by sergelombaerts on 16/10/15.
 */
public class Pojo {
    String aString;

    public Pojo(String aString) {
        this.aString = aString;
    }

    public String getaString() {
        return aString;
    }

    public void setaString(String aString) {
        this.aString = aString;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Pojo pojo = (Pojo) o;

        return aString.equals(pojo.aString);

    }

    @Override
    public int hashCode() {
        return aString.hashCode();
    }
}
