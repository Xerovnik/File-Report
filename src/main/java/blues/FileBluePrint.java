package blues;

import java.nio.file.attribute.FileTime;
import java.util.Date;

public class FileBluePrint {


    private String name;
    private String fileType;
    private String location;

    private FileTime created;
    private FileTime modified;
    private FileTime accessed;

    private Long size;
    private Long sod; //sod = Size On Disk

    private boolean isReadOnly;
    private boolean isHidden;
    private boolean isBlocked;

    public FileBluePrint() {
    }

    public FileBluePrint(String name, String fileType, String location, FileTime created, FileTime modified, FileTime accessed, Long size, Long sod, boolean isReadOnly, boolean isHidden, boolean isBlocked) {
        this.name = name;
        this.fileType = fileType;
        this.location = location;
        this.created = created;
        this.modified = modified;
        this.accessed = accessed;
        this.size = size;
        this.sod = sod;
        this.isReadOnly = isReadOnly;
        this.isHidden = isHidden;
        this.isBlocked = isBlocked;
    }

    public FileBluePrint(String name, String location) {
        this.name = name;
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFileType() {
        return fileType;
    }

    public void setFileType(String fileType) {
        this.fileType = fileType;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public FileTime getCreated() {
        return created;
    }

    public void setCreated(FileTime created) {
        this.created = created;
    }

    public FileTime getModified() {
        return modified;
    }

    public void setModified(FileTime modified) {
        this.modified = modified;
    }

    public FileTime getAccessed() {
        return accessed;
    }

    public void setAccessed(FileTime accessed) {
        this.accessed = accessed;
    }

    public Long getSize() {
        return size;
    }

    public void setSize(Long size) {
        this.size = size;
    }

    public Long getSod() {
        return sod;
    }

    public void setSod(Long sod) {
        this.sod = sod;
    }

    public boolean isReadOnly() {
        return isReadOnly;
    }

    public void setReadOnly(boolean readOnly) {
        isReadOnly = readOnly;
    }

    public boolean isHidden() {
        return isHidden;
    }

    public void setHidden(boolean hidden) {
        isHidden = hidden;
    }

    public boolean isBlocked() {
        return isBlocked;
    }

    public void setBlocked(boolean blocked) {
        isBlocked = blocked;
    }

    @Override
    public String toString() {
        return "FileBluePrint{" +
                "name='" + name + '\'' +
                ", fileType='" + fileType + '\'' +
                ", location='" + location + '\'' +
                ", created=" + created +
                ", modified=" + modified +
                ", accessed=" + accessed +
                ", size=" + size +
                ", sod=" + sod +
                ", isReadOnly=" + isReadOnly +
                ", isHidden=" + isHidden +
                ", isBlocked=" + isBlocked +
                '}';
    }
}
