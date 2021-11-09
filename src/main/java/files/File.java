package files;

public abstract class File {
    private String name;
    private String directory;
    private int size;

    public File(String name, String directory, int size) {
        this.name = name;
        this.directory = directory;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public String getDirectory() {
        return directory;
    }

    public int getSize() {
        return size;
    }
}
