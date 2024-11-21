public class TextFile implements FileType{
    @Override
    public void open() {
        System.out.println("Abriendo el archivo de tipo texto");
    }
}
