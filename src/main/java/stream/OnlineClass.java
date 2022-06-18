package stream;

import optional.Progress;

public class OnlineClass {

    private int id;
    private String name;
    private boolean closed;

    private Progress progress;

    public Progress getProgress() {
        return progress;
    }

    public void setProgress(Progress progress) {
        this.progress = progress;
    }

    public OnlineClass(int id, String name, boolean closed) {
        this.id = id;
        this.name = name;
        this.closed = closed;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isClosed() {
        return closed;
    }

    public void setClosed(boolean closed) {
        this.closed = closed;
    }
}
