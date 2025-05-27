public class Task {
    protected String subject;
    protected String description;

    public Task(String subject, String description) {
        this.subject = subject;
        this.description = description;
    }

    public String getSubject() {
        return subject;
    }

    public String getDescription() {
        return description;
    }

    public String toString() {
        return subject + " | " + description;
    }
}