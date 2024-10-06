public class Visitor extends Person {
    private String visitorId;
    private String ticketType;
    private String notes; // New feature to add notes for visitors

    // Default constructor
    public Visitor() {
        this.setName(null);
        this.setAge(0);
        this.setGender(null);
        this.setVisitorId(null);
        this.setTicketType(null);
        this.setNotes(null); // Initialize notes to null
    }

    // Constructor with all parameters
    public Visitor(String name, int age, String gender, String visitorId, String ticketType, String notes) {
        this.setName(name);
        this.setAge(age);
        this.setGender(gender);
        this.setVisitorId(visitorId);
        this.setTicketType(ticketType);
        this.setNotes(notes); // Set notes when creating a new visitor
    }

    // Constructor without notes (notes initialized as null)
    public Visitor(String name, int age, String gender, String visitorId, String ticketType) {
        this.setName(name);
        this.setAge(age);
        this.setGender(gender);
        this.setVisitorId(visitorId);
        this.setTicketType(ticketType);
        this.setNotes(null); // Notes initialized as null if not provided
    }

    // Getter and setter for visitorId
    public String getVisitorId() {
        return visitorId;
    }

    public void setVisitorId(String visitorId) {
        this.visitorId = visitorId;
    }

    // Getter and setter for ticketType
    public String getTicketType() {
        return ticketType;
    }

    public void setTicketType(String ticketType) {
        this.ticketType = ticketType;
    }

    // Getter and setter for notes
    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes; // Set or update visitor notes
    }

    // Override Details method to include notes in the visitor's details
    @Override
    public String Details() {
        return "Visitor, name: " + getName() + ", age: " + getAge() + ", gender: " + getGender() + 
               ", NOTES: " + (notes != null ? notes : "No notes available");
    }
}
