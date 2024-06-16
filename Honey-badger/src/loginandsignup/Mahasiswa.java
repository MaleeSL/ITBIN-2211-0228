package loginandsignup;

public class Mahasiswa {
    private String name;
    private String nrp;
    private Nilai total;

    public Mahasiswa(Nilai total) {
        this.total = total;
    }

    public String getName() {
        return name;
    }

    public String getNrp() {
        return nrp;
    }

    public Nilai getTotal() {
        return total;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNrp(String nrp) {
        this.nrp = nrp;
    }

    public void setTotal(Nilai total) {
        this.total = total;
    }
}

