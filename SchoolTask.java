public class SchoolTask extends Task {
    private String type; // e.g., "Homework", "Test", etc.

    public SchoolTask(String subject, String description, String type) {
        super(subject, description);
        this.type = type;
    }

    @Override
    public String toString() {
        return "[" + type + "] " + super.toString();
    }
}