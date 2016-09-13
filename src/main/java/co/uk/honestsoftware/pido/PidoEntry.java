package co.uk.honestsoftware.pido;


import org.joda.time.LocalDateTime;

/**
 * An item in a 'PIDO' list.
 */
public class PidoEntry {

    private final long id;
    private final String description;
    private LocalDateTime whenDue;
    private boolean isDone;

    PidoEntry(long id, String desc, LocalDateTime due) {
        this.id = id;
        this.description =desc;
        this.whenDue = due;
        this.isDone = false;
    }

    public long getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public long getWhenDue() {
        return whenDue.toDateTime().getMillis();
    }

    public void setWhenDue(LocalDateTime newDue) {
        this.whenDue = newDue;
    }

    public boolean isDone() {
        return isDone;
    }

    private void setDone() {
        this.isDone = true;
    }
}
