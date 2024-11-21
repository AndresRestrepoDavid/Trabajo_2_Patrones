public abstract class FileAbstraction {
    protected FileType fileType;

    public FileAbstraction(FileType fileType){
        this.fileType = fileType;
    }

    public abstract void openFile();
}
