import java.util.*;
import java.io.*;
public class FilmCalculator {
    private ArrayList<Film> film;
    Scanner in = new Scanner(System.in);
    private String regista;
    public void start() throws FileNotFoundException, IOException{
        getInput();
        descriviAttività();
        scriviFile();
    }
    public void descriviAttività(){
        System.out.println("Dico cosa fa il programma");
    }
    public void getInput() throws FileNotFoundException {
        System.out.println("Dimmi il nome del file: ");
        String fileName = in.nextLine();
        leggiFile(fileName);
        System.out.println("Dimmi il nome del regista: ");
        this.regista = in.nextLine();
    }
    public FilmCalculator() {
        this.film = new ArrayList<>();
    }
    //
    public void leggiFile(String nomeFile) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File(nomeFile));
        while (scanner.hasNextLine()) {
            String linea = scanner.nextLine();
            String[] campi = linea.split(";");
            String titolo = campi[0];
            String regista = campi[1];
            int durata = Integer.parseInt(campi[2]);
            Film f = new Film(titolo, regista, durata);
            film.add(f);
        }
        scanner.close();
    }
    public void scriviFile() throws IOException{
        FileWriter fileOut = new FileWriter("risultato.txt");
        ArrayList<Film> filmOrdinati = stampaFilmPerDurata();
        fileOut.write("I tuoi film sono: " + "\n");
        for (Film f : film) {
             fileOut.write(f.toString() + "\n");
        }
        fileOut.write("Il film con durata maggiore è: " + trovaFilmConDurataMaggiore().toString() + "\n");
        fileOut.write("I film registati dal regista scelto sono: "+scegliRegista(this.regista)+"\n");
        fileOut.write("I film riordinati: " +"\n");
         for (Film f : filmOrdinati) {
            fileOut.write(f.toString() + "\n");
        }
        fileOut.close();
    }
    //    
    private String scegliRegista(String regista) {
        String out = "";
        for (Film film : film) {
            if (film.getRegista().equalsIgnoreCase(regista)) {
                out += film.toString();
            }
        }
        return out;
    }
    public Film trovaFilmConDurataMaggiore() {
        Film filmConDurataMaggiore = null;
        int durataMax = -1;
        for (Film f : film) {
            if (f.getDurata() > durataMax) {
                durataMax = f.getDurata();
                filmConDurataMaggiore = f;
            }
        }
        return filmConDurataMaggiore;
    }
    public ArrayList<Film> stampaFilmPerDurata() {
        ArrayList<Film> lis = new ArrayList<>(this.film);
        int n = lis.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (lis.get(j).getDurata() > lis.get(j + 1).getDurata()) {
                    Film temp = lis.get(j);
                    lis.set(j, lis.get(j + 1));
                    lis.set(j + 1, temp);
                }
            }
        }
        for (Film f : lis) {
            System.out.println(f);
        }
        return lis;
    }
}


