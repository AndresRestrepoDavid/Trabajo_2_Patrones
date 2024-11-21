public class FileProxy implements FileSystemComponent{
    private String name;
    private RealFile realFile;

    public FileProxy(String name) {
        this.name = name;
    }
    @Override
    public void showDetails() {
        if (realFile == null) {
            realFile = new RealFile(name);
        }
        realFile.showDetails();
    }
}
