package blues;

import java.time.LocalDateTime;

public class DirectoryBluePrint {



    private String path;
    private String name;
    private String parent;
    private String root;
    private String backUpPath;


    private boolean exists;
    private boolean isMultiType;
    private boolean isSynced;
    private boolean isBackedUp;

    private LocalDateTime lastSorted;
    private LocalDateTime nextSync;

    private Long size;

    private int numFile;

    public DirectoryBluePrint() {
    }

    public DirectoryBluePrint(String path) {
        this.path = path;
    }

    public DirectoryBluePrint(String path, String name, String parent, String root, boolean exists) {
        this.path = path;
        this.name = name;
        this.parent = parent;
        this.root = root;
        this.exists = exists;
    }

    public DirectoryBluePrint(String path, String name) {
        this.path = path;
        this.name = name;
    }


    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getParent() {
        return parent;
    }

    public void setParent(String parent) {
        this.parent = parent;
    }

    public String getRoot() {
        return root;
    }

    public void setRoot(String root) {
        this.root = root;
    }

    public String getBackUpPath() {
        return backUpPath;
    }

    public void setBackUpPath(String backUpPath) {
        this.backUpPath = backUpPath;
    }

    public boolean isExists() {
        return exists;
    }

    public void setExists(boolean exists) {
        this.exists = exists;
    }

    public boolean isMultiType() {
        return isMultiType;
    }

    public void setMultiType(boolean multiType) {
        isMultiType = multiType;
    }

    public boolean isSynced() {
        return isSynced;
    }

    public void setSynced(boolean synced) {
        isSynced = synced;
    }

    public boolean isBackedUp() {
        return isBackedUp;
    }

    public void setBackedUp(boolean backedUp) {
        isBackedUp = backedUp;
    }

    public LocalDateTime getLastSorted() {
        return lastSorted;
    }

    public void setLastSorted(LocalDateTime lastSorted) {
        this.lastSorted = lastSorted;
    }

    public LocalDateTime getNextSync() {
        return nextSync;
    }

    public void setNextSync(LocalDateTime nextSync) {
        this.nextSync = nextSync;
    }

    public Long getSize() {
        return size;
    }

    public void setSize(Long size) {
        this.size = size;
    }

    public int getNumFile() {
        return numFile;
    }

    public void setNumFile(int numFile) {
        this.numFile = numFile;
    }

    @Override
    public String toString() {
        return "DirectoryBluePrint{" +
                "path='" + path + '\'' +
                ", name='" + name + '\'' +
                ", parent='" + parent + '\'' +
                ", root='" + root + '\'' +
                ", backUpPath='" + backUpPath + '\'' +
                ", exists=" + exists +
                ", isMultiType=" + isMultiType +
                ", isSynced=" + isSynced +
                ", isBackedUp=" + isBackedUp +
                ", lastSorted=" + lastSorted +
                ", nextSync=" + nextSync +
                ", size=" + size +
                ", numFile=" + numFile +
                '}';
    }
}
