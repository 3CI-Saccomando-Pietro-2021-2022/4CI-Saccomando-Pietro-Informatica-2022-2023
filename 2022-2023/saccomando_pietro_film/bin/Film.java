public class Film {
    private String titolo;
    private String regista;
    private int durata;
    
    public Film(String titolo, String regista, int durata) {
        this.titolo = titolo;
        this.regista = regista;
        this.durata = durata;
    }

    public Film() {
        this.titolo = "anonimo";
        this.regista = "anonimo";
        this.durata = 0;
    }

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        if(titolo!=null){
            this.titolo = titolo;
        }
    }

    public String getRegista() {
        return this.regista;
    }

    public void setRegista(String regista) {
        if(regista!=null){
            this.regista = regista;
        }
    }

    public int getDurata() {
        return durata;
    }

    public void setDurata(int durata) {
        if(durata<0){
            this.durata = durata;
        }
    }

    public String toString() {
        return this.titolo + "; " + this.regista + "; " + this.durata ;
    }


}

