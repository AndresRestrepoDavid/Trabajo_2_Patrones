
public class Main {
    public static void main(String[] args) {

        // Patrón Composite
        Directory root = new Directory("root");
        Directory home = new Directory("home");
        Directory user = new Directory("user");
        File file1 = new File("Archivo1.txt");
        File file2 = new File("Archivo2.jpg");

        root.addComponent(home);
        home.addComponent(user);
        user.addComponent(file1);
        user.addComponent(file2);

        root.showDetails();

        // Patrón Proxy
        FileSystemComponent fileProxy = new FileProxy("Archivo3.txt");
        fileProxy.showDetails();
        fileProxy.showDetails();

        // Patrón Bridge
        FileType textFileType = new TextFile();
        FileType imageFileType = new ImageFile();

        FileAbstraction textFile = new FileRefinedAbstraction("documento.txt", textFileType);
        FileAbstraction imageFile = new FileRefinedAbstraction("foto.jpg", imageFileType);

        textFile.openFile();
        imageFile.openFile();
    }
}