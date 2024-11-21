public class RealFile implements FileSystemComponent{
    private String name;

    private void loadFromDisk() {
        System.out.println("Cargando " + name);
    }

    public RealFile(String name) {
        this.name = name;
        loadFromDisk();
    }

    @Override
    public void showDetails() {
        System.out.println("Archivo: " + name);
    }
}
