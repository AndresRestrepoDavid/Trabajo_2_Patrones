public class FileRefinedAbstraction extends FileAbstraction{
    private String name;
    public FileRefinedAbstraction(String name, FileType fileType) {
        super(fileType);
        this.name = name;
    }

    @Override
    public void openFile() {
        System.out.println("Archivo: " + name);
        fileType.open();
    }
}
