import java.util.*;
import java.io.*;
public class LibriCalculator {
    private ArrayList<Libro> libri;
    Scanner in = new Scanner(System.in);
    private String autore;
    public void start() throws FileNotFoundException, IOException{
        getInput();
        descriviAttività();
        scriviFile();
    }
    public void descriviAttività(){
        System.out.println("Dico cosa fa il programma :)");
    }
    public void getInput() throws FileNotFoundException {
        System.out.println("Dimmi il nome del file: ");
        String fileName = in.nextLine();
        leggiFile(fileName);
        System.out.println("Dimmi il nome dell'autore: ");
        this.autore = in.nextLine();
    }
    public LibriCalculator() {
        this.libri = new ArrayList<>();
    }
    //
    public void leggiFile(String nomeFile) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File(nomeFile));
        while (scanner.hasNextLine()) {
            String linea = scanner.nextLine();
            String[] campi = linea.split(";");
            String titolo = campi[0];
            String autore = campi[1];
            int numPagine = Integer.parseInt(campi[2]);
            Libro libro = new Libro(titolo, autore, numPagine);
            libri.add(libro);
        }
        scanner.close();
    }
    public void scriviFile() throws IOException{
        FileWriter fileOut = new FileWriter("risultato.txt");
        ArrayList<Libro> libriOrdinati = stampaLibriPerNumPagine();
        fileOut.write("I tuoi libri sono: " + "\n");
        for (Libro libro : libri) {
             fileOut.write(libro.toString() + "\n");
        }
        fileOut.write("Il libro con il numero di pagine maggiore è: " + trovaLibroConNumPagineMaggiore().toString() + "\n");
        fileOut.write("I libri scritti dall'autore scelto sono: "+stampaLibriDiAutore(this.autore)+"\n");
        fileOut.write("I libri riordinati: " +"\n");
         for (Libro libro : libriOrdinati) {
            fileOut.write(libro.toString() + "\n");
        }
        fileOut.close();
    }
    //    
    public Libro trovaLibroConNumPagineMaggiore() {
        Libro libroConNumPagineMaggiore = null;
        int numPagineMax = -1;
        for (Libro libro : libri) {
            if (libro.getNumPagine() > numPagineMax) {
                numPagineMax = libro.getNumPagine();
                libroConNumPagineMaggiore = libro;
            }
        }
        return libroConNumPagineMaggiore;
    }
    public String stampaLibriDiAutore(String autore) {
        String out = "";
        for (Libro libro : libri) {
            if (libro.getAutore().equalsIgnoreCase(autore)) {
                out += libro.toString();
            }
        }
        return out;
    }
    public ArrayList<Libro> stampaLibriPerNumPagine() {
        for (int i = 0; i < libri.size() - 1; i++) {
            for (int j = 0; j < libri.size() - i - 1; j++) {
                if (libri.get(j).getNumPagine() > libri.get(j + 1).getNumPagine()) {
                    Libro temp = libri.get(j);
                    libri.set(j, libri.get(j + 1));
                    libri.set(j + 1, temp);
                }
            }
        }
        return libri;
    }
}
